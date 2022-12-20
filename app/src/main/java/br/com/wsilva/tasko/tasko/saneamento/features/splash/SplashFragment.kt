package br.com.wsilva.tasko.tasko.saneamento.features.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R
import br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.AutenticacaoViewModel

class SplashFragment : Fragment() {

    private lateinit var viewModel: AutenticacaoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        viewModel = ViewModelProvider(this).get(AutenticacaoViewModel::class.java)
        viewModel.authSession.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                if (it.isSignedIn) {
                    findNavController().navigate(R.id.action_splashFragment_to_ordemServicoListagemFragment)
                } else {
                    findNavController().navigate(R.id.action_splashFragment_to_usuarioLoginFragment)
                }
            }
        })

        return view
    }

    override fun onResume() {
        super.onResume()
        viewModel.checkAutenticacao()
    }
}