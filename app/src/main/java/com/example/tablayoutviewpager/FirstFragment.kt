package com.example.tablayoutviewpager

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutviewpager.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val profiles = listOf(
            AProfiles(R.drawable.manja, "Manja", "manja@gmail.com", "Sistem Komputer", "8"),
            AProfiles(R.drawable.fafa, "Fafa", "manja@gmail.com", "Matematika", "6"),
            AProfiles(R.drawable.irawan, "Irawan", "irawan@gmail.com", "Fisika", "10"),
            AProfiles(R.drawable.rizki, "Rizki", "rizki@gmail.com", "Informatika", "4"),
            AProfiles(R.drawable.abil, "Abil", "abil@gmail.com", "Teknik Mesin", "4"),
            AProfiles(R.drawable.manja, "Manja", "manja@gmail.com", "Sistem Komputer", "8"),
            AProfiles(R.drawable.fafa, "Fafa", "manja@gmail.com", "Matematika", "6"),
            AProfiles(R.drawable.irawan, "Irawan", "irawan@gmail.com", "Fisika", "10"),
            AProfiles(R.drawable.rizki, "Rizki", "rizki@gmail.com", "Informatika", "4"),
            AProfiles(R.drawable.abil, "Abil", "abil@gmail.com", "Teknik Mesin", "4"),
        )

        val adapter = RVAAdapter(profiles)
        binding.rvProfileA.layoutManager = LinearLayoutManager(requireContext())
        binding.rvProfileA.adapter = adapter

        adapter.senddata = {
            val intent = Intent(requireContext(), DetailedActivity::class.java)
            intent.putExtra("profile", it)
            startActivity(intent)
        }
    }
}
