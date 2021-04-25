package net.kakudake.yahoo

import net.kakudake.yahoo.api.request.CorrectionSupportRequest
import org.junit.jupiter.api.Test

class YahooTest : AbstractTest() {

    @Test
    fun yahooApiTest() {
        
        showln(
            Yahoo.withAppId(appId = ClientID)
                .correctionSupport(
                    CorrectionSupportRequest(
                        sentence = "遙か彼方に小形飛行機が見える"
                    )
                )
        )
    }
}