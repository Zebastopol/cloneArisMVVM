package com.example.clonearismvvm.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
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

        citaViewModel.onCreate()

        citaViewModel.citaModel.observe(this, Observer { citaActual ->
            binding.tvCita.text = citaActual.cita
            binding.tvAutor.text = citaActual.autor
        })
        citaViewModel.siCarga.observe(this, Observer {
            binding.progres.isVisible = it

        })
        binding.viewContainer.setOnClickListener { citaViewModel.randomCita() }
    }
}