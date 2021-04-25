package net.kakudake.yahoo.service

import net.kakudake.yahoo.Yahoo
import net.kakudake.yahoo.api.request.CorrectionSupportRequest
import net.kakudake.yahoo.api.response.CorrectionSupportResponse

class YahooService(
    private val appId: String?
) : Yahoo {

    private val textAnalysisService = TextAnalysisService()

    override fun correctionSupport(
        request: CorrectionSupportRequest
    ): CorrectionSupportResponse {

        appId?.let { request.withAppId(it) }
        return textAnalysisService.correctionSupport(
            request = request
        )
    }
}