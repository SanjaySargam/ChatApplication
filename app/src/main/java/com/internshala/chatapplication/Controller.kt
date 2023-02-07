package com.internshala.chatapplication

import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.TypedEpoxyController
import com.internshala.chatapplication.data.Data
import com.internshala.chatapplication.data.Message
import com.internshala.chatapplication.databinding.ViewHolderMessageItemBinding
import com.internshala.chatapplication.epoxy.ViewBindingKotlinModel

class Controller: EpoxyController() {
    var allMessages: List<Message> = emptyList()
        set(value) {
            field = value
            requestModelBuild()
        }

    override fun buildModels() {



        allMessages.forEach {
            messageItem {
                id(it.id)
                message(it)
            }
        }


    }
}