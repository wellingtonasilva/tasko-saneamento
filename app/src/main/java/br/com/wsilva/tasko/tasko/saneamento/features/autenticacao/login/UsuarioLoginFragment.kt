package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R
import com.google.android.material.snackbar.Snackbar

class UsuarioLoginFragment : Fragment() {

    private lateinit var viewModel: UsuarioLoginViewModel
    private lateinit var edtUsuario: EditText
    private lateinit var edtSenha: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        viewModel = ViewModelProvider(this).get(UsuarioLoginViewModel::class.java)

        edtUsuario = view.findViewById(R.id.edt_usuario)
        edtSenha = view.findViewById(R.id.edt_senha)
        view.findViewById<TextView>(R.id.tvw_registrar).setOnClickListener {
            findNavController().navigate(R.id.action_usuarioLoginFragment_to_usuarioRegistrarFragment)
        }
        view.findViewById<TextView>(R.id.btn_login).setOnClickListener {
            viewModel.login(edtUsuario.text.toString(), edtSenha.text.toString())
        }

        viewModel.authSignInResult.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                if (it.isSignedIn) {
                    findNavController().navigate(R.id.action_usuarioLoginFragment_to_homeFragment)
                }
            }
        })

        viewModel.authException.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                Snackbar.make(view.findViewById(R.id.content), it.message.toString(), Snackbar.LENGTH_LONG).show()
            }
        })

        return view
    }
}