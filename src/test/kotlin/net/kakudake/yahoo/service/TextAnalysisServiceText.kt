package net.kakudake.yahoo.service

import net.kakudake.yahoo.AbstractTest
import net.kakudake.yahoo.api.request.CorrectionSupportRequest
import org.junit.jupiter.api.Test

class TextAnalysisServiceText : AbstractTest() {
    private val service = TextAnalysisService()

    @Test
    fun testCorrectionSupport() {

        showln(
            service.correctionSupport(
                CorrectionSupportRequest(
                    appId = ClientID,
                    sentence = "遙か彼方に小形飛行機が見える",
                )
            )
        )
    }
}