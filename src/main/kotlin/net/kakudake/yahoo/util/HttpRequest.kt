package net.kakudake.yahoo.util

import net.kakudake.yahoo.api.request.BaseRequest
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import java.nio.charset.Charset

object HttpRequest {

    /**
     * POST
     */
    fun post(
        url: String,
        request: BaseRequest,
    ): String {
        return post(url, request.toMap())
    }

    /**
     * POST
     */
    fun post(
        url: String,
        params: Map<String, String>
    ): String {

        val client = OkHttpClient()
        val builder = FormBody.Builder()
        params.forEach { builder.add(it.key, it.value) }

        val request = Request.Builder().url(url)
            .post(builder.build()).build()
        return client.newCall(request)
            .execute().body!!.byteString()
            .string(Charset.forName("utf-8"))
    }
}