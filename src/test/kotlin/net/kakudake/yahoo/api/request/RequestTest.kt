package net.kakudake.yahoo.api.request

import org.junit.jupiter.api.Test

class RequestTest {

    @Test
    fun toMapTest() {

        println(
            CorrectionSupportRequest(
                appId = "appId",
                sentence = "sentence",
                filterGroup = "filterGroup",
                noFilter = "noFilter",
            ).toMap()
        )
    }
}