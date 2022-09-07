package com.practice.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.practice.examplemvvm.model.QuoteModel
import com.practice.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel (){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}