package net.kakudake.yahoo.api.request

import net.kakudake.yahoo.domain.annotation.Param
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaGetter

open class BaseRequest {

    fun toMap(): Map<String, String> {

        return this::class
            .memberProperties
            .mapNotNull { prop ->
                prop.findAnnotation<Param>()?.let { an ->
                    prop.javaGetter?.invoke(this)?.let { v ->
                        (an.value to (v as String))
                    }
                }
            }.toMap()
    }
}