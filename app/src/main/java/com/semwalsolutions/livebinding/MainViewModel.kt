package com.semwalsolutions.livebinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val liveData = MutableLiveData("Hard Work Pays Off")

    fun updateLiveData(){
        liveData.value = "Knowledge is Power"
    }

}