package com.example.tablayoutviewpager

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tablayoutviewpager.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val profiles = listOf(
            BProfiles(R.drawable.fauzia, "Fauzia", "fauzia@gmail.com", "Sistem Komputer", "8"),
            BProfiles(R.drawable.rahma, "Rahma", "rahma@gmail.com", "Matematika", "6"),
            BProfiles(R.drawable.lia, "Lia", "lia@gmail.com", "Fisika", "10"),
            BProfiles(R.drawable.anisa, "Anisa", "anisa@gmail.com", "Informatika", "4"),
            BProfiles(R.drawable.niswa, "Niswa", "niswa@gmail.com", "Teknik Mesin", "4"),
            BProfiles(R.drawable.fauzia, "Fauzia", "fauzia@gmail.com", "Sistem Komputer", "8"),
            BProfiles(R.drawable.rahma, "Rahma", "rahma@gmail.com", "Matematika", "6"),
            BProfiles(R.drawable.lia, "Lia", "lia@gmail.com", "Fisika", "10"),
            BProfiles(R.drawable.anisa, "Anisa", "anisa@gmail.com", "Informatika", "4"),
            BProfiles(R.drawable.niswa, "Niswa", "niswa@gmail.com", "Teknik Mesin", "4"),
        )

        val adapter = RVBAdapter(profiles)
        binding.rvProfileB.layoutManager = LinearLayoutManager(requireContext())
        binding.rvProfileB.adapter = adapter

        adapter.senddata = {
            val intent = Intent(requireContext(), DetailedActivity::class.java)
            intent.putExtra("profile", it)
            startActivity(intent)
        }
    }
}