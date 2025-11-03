package com.example.hw_1ibrakhimgroup

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw_1ibrakhimgroup.databinding.ItemSerialBinding

class SerialAdapter(val Seriallist: ArrayList<SerialModel>):
    RecyclerView.Adapter<SerialAdapter.SerialViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SerialViewHolder {
        return SerialViewHolder(ItemSerialBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(
        holder: SerialViewHolder,
        position: Int
    ) {
        holder.onBind(Seriallist[position])
    }

    override fun getItemCount(): Int = Seriallist.size

    class SerialViewHolder(private val binding: ItemSerialBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(serialModel: SerialModel){
            binding.tvName.text = serialModel.name
            binding.tvDate.text = serialModel.date
            binding.tvEpisode.text = serialModel.episode
            Glide.with(binding.imgSerial).load(serialModel.img).into(binding.imgSerial);

        }
    }
}