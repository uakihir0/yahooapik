package net.kakudake.yahoo.util

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

object XmlMapper {

    val mapper = XmlMapper().registerKotlinModule()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    /** Decode */
    inline fun <reified T> decode(xml: String): T = mapper.readValue(xml)
}