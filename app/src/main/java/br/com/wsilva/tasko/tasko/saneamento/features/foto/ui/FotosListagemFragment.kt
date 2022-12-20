package br.com.wsilva.tasko.tasko.saneamento.features.foto.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.wsilva.tasko.tasko.saneamento.R

class FotosListagemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fotos_listagem, container, false)
        return view
    }
}