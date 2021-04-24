package net.kakudake.yahoo.api.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

@JsonRootName("ResultSet")
data class CorrectionSupportResponse(

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("Result")
    val result: List<Result>,
) {

    data class Result(

        @JsonProperty("StartPos")
        val startPos: Long,
        @JsonProperty("Length")
        val length: Long,
        @JsonProperty("Surface")
        val surface: String,
        @JsonProperty("ShitekiWord")
        val shitekiWord: String,
        @JsonProperty("ShitekiInfo")
        val shitekiInfo: String,
    )
}

