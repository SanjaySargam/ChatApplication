package com.internshala.chatapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyRecyclerView
import com.internshala.chatapplication.data.Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messagesView=findViewById<EpoxyRecyclerView>(R.id.messagesView)
        val controller = Controller()
        messagesView.setController(controller)
        controller.allMessages = Data.messages
    }
}