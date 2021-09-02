package com.pedrosaez.ejemplomvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.pedrosaez.ejemplomvvm.databinding.ActivityMainBinding
import com.pedrosaez.ejemplomvvm.ui.viewmodel.FrasesViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val frasesViewModel : FrasesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // observer, al cambiar el livedata frasesViewModel asigna los datos a los tv
        frasesViewModel.fraseModel.observe(this, Observer {
            binding.tvFrase.text = it.frase
            binding.tvAutor.text = it.autor

        })

        //cada vez que se pulse sobre el constraintLayout se llamará al método fraseRandom del viewModel
        //y cambiará el valor del livedata 
        binding.viewContainer.setOnClickListener {

            frasesViewModel.fraseRandom()
        }


    }
}