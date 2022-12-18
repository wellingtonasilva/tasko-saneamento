package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.desconectar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R


class DesconectarUsuarioSucessoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signout_sucesso, container, false)
        view.findViewById<Button>(R.id.btn_ok).setOnClickListener {
            findNavController().popBackStack(R.id.desconectarUsuarioSucessoFragment, true)
            findNavController().navigate(R.id.usuarioLoginFragment)
        }

        return view
    }
}