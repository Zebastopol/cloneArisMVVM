package com.example.clonearismvvm.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.clonearismvvm.databinding.ActivityMainBinding
import com.example.clonearismvvm.ui.viewmodel.CitaViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val citaViewModel : CitaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        citaViewModel.citaModel.observe(this, Observer { citaActual ->
            binding.tvCita.text = citaActual.cita
            binding.tvAutor.text = citaActual.autor
        })
        binding.viewContainer.setOnClickListener { citaViewModel.randomCita() }
    }
}