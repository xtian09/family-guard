package com.njdc.abb.familyguard.model.entity.data

data class Devices(
    var DeviceID: String,
    var DeviceName: String? = null,
    var DeviceUID: String? = null,
    var IsOnline: String? = null
)