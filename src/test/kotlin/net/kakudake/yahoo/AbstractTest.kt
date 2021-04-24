package net.kakudake.yahoo

import com.fasterxml.jackson.databind.ObjectMapper

abstract class AbstractTest {

    private val writer = ObjectMapper().writerWithDefaultPrettyPrinter()

    val ClientID = System.getProperty("ID") ?: ""
    val Secret = System.getProperty("SECRET") ?: ""

    fun showln(any: Any?) {
        println(writer.writeValueAsString(any))
    }
}