package br.com.wsilva.tasko.tasko.saneamento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui.OrdemServicoViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
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

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.nav_view)
            .setupWithNavController(navController)
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.ordemServicoListagemFragment, R.id.fotosListagemFragment, R.id.ocorrenciasListagemFragment
//            )
//        )

//        findViewById<Button>(R.id.button).setOnClickListener {
//            viewModel.getAllOrdemServico()
//        }
    }
}