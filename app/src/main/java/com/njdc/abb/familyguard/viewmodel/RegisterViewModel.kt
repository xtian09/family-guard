package com.njdc.abb.familyguard.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.njdc.abb.familyguard.util.Constants
import com.njdc.abb.familyguard.util.get
import com.njdc.abb.familyguard.util.init
import javax.inject.Inject

class RegisterViewModel @Inject constructor() : ViewModel() {

    val username = MutableLiveData<String>().init("")
    val password = MutableLiveData<String>().init("")
    val phone = MutableLiveData<String>().init("")

    fun checkPattern(): String {
        if (!Constants.userPattern.matcher(username.get()).matches()) {
            return "请填写8-16位字符用户名！"
        }
        if (!Constants.pwdPattern.matcher(password.get()).matches()) {
            return "请填写6-16位字符密码！"
        }
        if (!Constants.phonePattern.matcher(phone.get()).matches()) {
            return "请填写11位手机号码！"
        }
        return "success"
    }

}