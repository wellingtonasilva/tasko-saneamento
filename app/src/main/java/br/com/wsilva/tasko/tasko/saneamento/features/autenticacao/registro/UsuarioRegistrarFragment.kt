package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.registro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R
import com.google.android.material.snackbar.Snackbar

class UsuarioRegistrarFragment : Fragment() {

    private lateinit var viewModel: UsuarioRegistrarViewModel
    private lateinit var btnRegistrar: Button
    private lateinit var edtusuario: EditText
    private lateinit var edtSenha: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registrar, container, false)

        viewModel = ViewModelProvider(this).get(UsuarioRegistrarViewModel::class.java)
        edtusuario = view.findViewById(R.id.edt_usuario)
        edtSenha = view.findViewById(R.id.edt_senha)
        btnRegistrar = view.findViewById(R.id.btn_registrar)
        btnRegistrar.setOnClickListener {
            viewModel.registrarUsuario(edtusuario.text.toString(), edtSenha.text.toString())
        }

        viewModel.authSignUpResult.observe(viewLifecycleOwner, Observer {
            it?.also {
                findNavController().navigate(R.id.action_usuarioRegistrarFragment_to_registroConfirmacaoFragment,
                    bundleOf(edtusuario.text.toString() to "usuario")
                )
            }
        })
        viewModel.authException.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                Snackbar.make(view.findViewById(R.id.content),
                    "Erro ao tentar registrar o usuário", Snackbar.LENGTH_SHORT).show()
            }
        })

        return view
    }
}