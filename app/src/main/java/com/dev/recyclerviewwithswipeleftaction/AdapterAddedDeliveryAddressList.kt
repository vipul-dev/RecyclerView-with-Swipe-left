package com.dev.recyclerviewwithswipeleftaction

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.dev.recyclerviewwithswipeleftaction.databinding.ItemAddressListBinding

class AdapterAddedDeliveryAddressList(
    private val context: Context,
) : Adapter<AdapterAddedDeliveryAddressList.AddedDeliveryAddressViewHolder>() {

    class AddedDeliveryAddressViewHolder(itemAddressListBinding: ItemAddressListBinding) :
        ViewHolder(itemAddressListBinding.root) {
        val binding = itemAddressListBinding
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = AddedDeliveryAddressViewHolder(
        ItemAddressListBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
    )

    override fun getItemCount() = 20

    override fun onBindViewHolder(holder: AddedDeliveryAddressViewHolder, position: Int) {

        holder.binding.tvAddType.text = "Office ${position + 1}"

    }
}