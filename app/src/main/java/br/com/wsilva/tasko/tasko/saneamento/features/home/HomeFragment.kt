package br.com.wsilva.tasko.tasko.saneamento.features.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R
import br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.desconectar.DesconectarUsuarioViewModel

class HomeFragment : Fragment() {

    private lateinit var viewModel: DesconectarUsuarioViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        viewModel = ViewModelProvider(this).get(DesconectarUsuarioViewModel::class.java)

        view.findViewById<Button>(R.id.btn_sign_out).setOnClickListener {
            viewModel.desconectar()
        }

        viewModel.authSignOutResult.observe(viewLifecycleOwner, Observer {
            it?.also {
                findNavController().popBackStack(R.id.homeFragment, true)
                findNavController().navigate(R.id.desconectarUsuarioSucessoFragment)
            }
        })

        return view
    }
}