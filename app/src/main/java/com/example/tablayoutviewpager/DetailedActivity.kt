package com.example.tablayoutviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayoutviewpager.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDisplay()

    }

    private fun setDisplay() {
        val profile = intent.getParcelableExtra<AProfiles>("profile")
        if (profile != null){
            binding.imageViewDetailed.setImageResource(profile.imgprofile)
            binding.textviewDetailedName.text = profile.name
            binding.textviewDetailedJurusan.text = profile.jurusan
            binding.textviewDetailedEmail.text = profile.email
            binding.textviewDetailedSemester.text = "Semester " + profile.semester

    }
}
}