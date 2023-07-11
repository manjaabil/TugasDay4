package com.example.tablayoutviewpager


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayoutviewpager.databinding.ItemProfileABinding

class RVAAdapter(private val profiles: List<AProfiles>) : RecyclerView.Adapter<RVAAdapter.ViewHolder>() {
    var senddata : ((AProfiles) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProfileABinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val profile = profiles[position]
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }

    inner class ViewHolder(private val binding: ItemProfileABinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(profile: AProfiles) {
            binding.ivProfileA.setImageResource(profile.imgprofile)
            binding.tvNameA.text = profile.name
            binding.tvEmailA.text = profile.email
            binding.tvJurusanA.text = profile.jurusan
            binding.tvSemesterA.text = "Semester " + profile.semester

            binding.layoutUserA.setOnClickListener{
                senddata?.invoke(profile)
            }

        }
    }
}
