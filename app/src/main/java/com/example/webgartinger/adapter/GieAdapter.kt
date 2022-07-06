package com.example.webgartinger.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.webgartinger.data.model.WateringCan
import com.example.webgartinger.databinding.GieLayoutBinding
import com.example.webgartinger.R

class GieAdapter(
    val context: Context,
    val dataset: List<WateringCan>
) : RecyclerView.Adapter<GieAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: GieLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = GieLayoutBinding.inflate(LayoutInflater.from(context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.binding.gieImage.setImageResource(item.pictureResource)
        holder.binding.gieNameText.text = item.title
        holder.binding.giePriceText.text = "€${item.price}"

        if (item.specialOffer) {
            holder.binding.gieSaleText.visibility = View.VISIBLE
            holder.binding.giePriceText.setTextColor(ContextCompat.getColor(context, androidx.appcompat.R.color.abc_decor_view_status_guard))
            holder.binding.giePriceText.textSize = 36F
        } else {
            holder.binding.gieSaleText.visibility = View.GONE
            holder.binding.giePriceText.setTextColor(
                ContextCompat.getColor(
                    context,
                    androidx.appcompat.R.color.material_blue_grey_800
                )
            )
            holder.binding.giePriceText.textSize = 24F
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}