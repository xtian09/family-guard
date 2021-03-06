package com.njdc.abb.familyguard.model.entity.http

open class BaseResponse<T>(
    var Method: String?,
    var Status: String?,
    var ErrorCode: String?,
    var Message: String?,
    var Data: T?
) {

    fun isSuccess(): Boolean = Status == "0"
}