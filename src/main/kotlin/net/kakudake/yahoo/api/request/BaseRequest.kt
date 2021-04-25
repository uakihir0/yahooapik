package net.kakudake.yahoo.api.request

import net.kakudake.yahoo.domain.annotation.AppId
import net.kakudake.yahoo.domain.annotation.Param
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.hasAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaGetter
import kotlin.reflect.jvm.javaSetter

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

    fun withAppId(appId: String) {
        this::class
            .memberProperties
            .forEach { prop ->
                if (prop.hasAnnotation<AppId>()) {
                    val obj = prop.javaGetter?.invoke(this)

                    // 既存の指定がない場合
                    if (obj == null) {
                        (prop as? KMutableProperty1)?.let { p ->
                            p.isAccessible = true
                            p.javaSetter?.invoke(this, appId)
                        }
                    }
                }
            }
    }
}