package net.kakudake.yahoo.service

import net.kakudake.yahoo.api.Endpoints.CorrectionSupport
import net.kakudake.yahoo.api.TextAnalysis
import net.kakudake.yahoo.api.request.CorrectionSupportRequest
import net.kakudake.yahoo.api.response.CorrectionSupportResponse
import net.kakudake.yahoo.util.HttpRequest.post
import net.kakudake.yahoo.util.XmlMapper

class TextAnalysisService : TextAnalysis {

    /**
     * {@inheritDoc}
     */
    override fun correctionSupport(
        request: CorrectionSupportRequest
    ): CorrectionSupportResponse {

        return XmlMapper.decode(
            post(CorrectionSupport, request)
        )
    }
}