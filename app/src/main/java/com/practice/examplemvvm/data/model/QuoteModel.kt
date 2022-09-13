package com.practice.examplemvvm.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel (@SerializedName("quote") var quote:String,@SerializedName("author") val author:String)