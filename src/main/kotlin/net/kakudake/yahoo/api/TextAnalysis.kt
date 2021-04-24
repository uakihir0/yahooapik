package net.kakudake.yahoo.api

import net.kakudake.yahoo.api.request.CorrectionSupportRequest
import net.kakudake.yahoo.api.response.CorrectionSupportResponse

interface TextAnalysis {

    /**
     * 校正支援 API
     * https://developer.yahoo.co.jp/webapi/jlp/kousei/v1/kousei.html
     */
    fun correctionSupport(
        request: CorrectionSupportRequest
    ): CorrectionSupportResponse
}