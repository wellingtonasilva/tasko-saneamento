package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.confirmacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.com.wsilva.tasko.tasko.saneamento.R

class RegistroConfirmacaoFragment : Fragment() {

    private lateinit var viewModel: RegistroConfirmacaoViewModel
    private lateinit var edtUsuario: EditText
    private lateinit var edtCodigoVerificacao: EditText
    private lateinit var btnConfirmarRegistro: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registrar_confirmacao, container, false)
        edtUsuario = view.findViewById(R.id.edt_usuario)
        edtCodigoVerificacao = view.findViewById(R.id.edt_codigo_verificacao)
        btnConfirmarRegistro = view.findViewById(R.id.btn_confirmar_registro)
        btnConfirmarRegistro.setOnClickListener {
            viewModel.confirmarRegistro(edtUsuario.text.toString(),
                edtCodigoVerificacao.text.toString())
        }

        arguments?.getString("usuario").let {
            edtUsuario.setText(it)
        }

        viewModel = ViewModelProvider(this).get(RegistroConfirmacaoViewModel::class.java)
        viewModel.authSignUpResult.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isSignUpComplete) {
                    findNavController().navigate(R.id.action_registroConfirmacaoFragment_to_homeFragment)
                }
            }
        })

        return view
    }
}