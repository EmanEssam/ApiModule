package com.example.networkmodule.data.remote

import com.google.gson.annotations.SerializedName
import com.example.networkmodule.config.CommonConstant


class APIResponse<E> {

    @SerializedName(CommonConstant.RESPONSE_CODE)
    var responseCode: Int = 0

    @SerializedName(CommonConstant.RESPONSE_MESSAGE)
    var responseMessage: String? = null

    @SerializedName(CommonConstant.DATA)
    var data: E? = null
}
