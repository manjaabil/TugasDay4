package com.example.tablayoutviewpager


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutviewpager.databinding.ItemProfileBBinding

class RVBAdapter(private val profiles: List<BProfiles>) : RecyclerView.Adapter<RVBAdapter.ViewHolder>() {
    var senddata : ((BProfiles) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProfileBBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val profile = profiles[position]
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }

    inner class ViewHolder(private val binding: ItemProfileBBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(profile: BProfiles) {
            binding.ivProfileB.setImageResource(profile.imgprofile)
            binding.tvNameB.text = profile.name
            binding.tvEmailB.text = profile.email
            binding.tvJurusanB.text = profile.jurusan
            binding.tvSemesterB.text = "Semester " + profile.semester

            binding.layoutUserB.setOnClickListener{
                senddata?.invoke(profile)
            }

        }
    }
}
