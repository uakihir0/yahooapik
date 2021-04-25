package net.kakudake.yahoo.api.request

import net.kakudake.yahoo.domain.annotation.AppId
import net.kakudake.yahoo.domain.annotation.Param

class CorrectionSupportRequest(

    @AppId
    @Param("appid")
    var appId: String? = null,
    @Param("sentence")
    val sentence: String,
    @Param("filter_group")
    val filterGroup: String? = null,
    @Param("no_filter")
    val noFilter: String? = null,

    ) : BaseRequest()