package com.dev.recyclerviewwithswipeleftaction

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.recyclerviewwithswipeleftaction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(binding.root)

        setListener()

        binding.recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = AdapterAddedDeliveryAddressList(this)

        val swipeHelper:SwipeHelper = object :SwipeHelper(this@MainActivity,binding.recyclerView){
            override fun instantiateUnderlayButton(
                viewHolder: RecyclerView.ViewHolder?,
                underlayButtons: MutableList<UnderlayButton>?
            ) {
                underlayButtons?.add(UnderlayButton(
                    "Delete",
                    0,
                    Color.parseColor("#FF3C30"),
                    object : UnderlayButtonClickListener {
                        override fun onClick(pos: Int) {
                            Toast.makeText(this@MainActivity,"Item Delete",Toast.LENGTH_SHORT).show()
                        }
                    }
                ))
                underlayButtons?.add(UnderlayButton(
                    "Edit",
                    0,
                    Color.parseColor("#C7C7CB"),
                    object : UnderlayButtonClickListener {
                        override fun onClick(pos: Int) {
                            Toast.makeText(this@MainActivity,"Item Edit",Toast.LENGTH_SHORT).show()
                        }
                    }
                ))
            }

        }
    }

    private fun setListener() {
        binding.ivClose.setOnClickListener {
            Toast.makeText(this,"Test",Toast.LENGTH_SHORT).show()
        }
    }
}