package br.com.wsilva.tasko.tasko.saneamento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui.listagem.OrdemServicoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var viewModel: OrdemServicoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(OrdemServicoViewModel::class.java)
        viewModel.ordemServico.observe(this, Observer {
            it.forEach {
                Log.d("#### ", it.numeroOS.toString())
            }
        })
    }
}