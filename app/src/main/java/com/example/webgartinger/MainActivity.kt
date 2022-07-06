package com.example.webgartinger

import com.example.webgartinger.data.Datasource
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.example.webgartinger.adapter.GieAdapter
import com.example.webgartinger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val gies = Datasource().loadGießen()

        binding.gieRecycler.adapter = GieAdapter(this, gies)

        binding.gieRecycler.setHasFixedSize(true)

        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.gieRecycler)
    }
}
