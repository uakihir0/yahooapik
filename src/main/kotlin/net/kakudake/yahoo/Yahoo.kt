package net.kakudake.yahoo

import net.kakudake.yahoo.api.TextAnalysis
import net.kakudake.yahoo.service.YahooService

interface Yahoo : TextAnalysis {

    companion object {
        fun withAppId(appId: String): Yahoo {
            return YahooService(appId)
        }
    }
}