package cn.nekocode.baseframework.sample.data.exception

/**
 * Created by nekocode on 1/13/16.
 */
class ResponseException(var status: String, var code: Int, var msg: String) : Exception()