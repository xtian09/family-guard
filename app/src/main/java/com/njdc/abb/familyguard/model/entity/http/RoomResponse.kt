package com.njdc.abb.familyguard.model.entity.http

import com.njdc.abb.familyguard.model.entity.data.Homes
import com.njdc.abb.familyguard.model.entity.data.NoOwner

data class RoomResponse(
    var Homes: List<Homes>? = null,
    var NoOwner: NoOwner? = null
)