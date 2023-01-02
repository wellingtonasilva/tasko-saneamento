package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui.listagem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.saneamento.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OrdemServicoListagemFragment : Fragment() {

    lateinit var viewModel: OrdemServicoViewModel
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ordem_servico_listagem, container, false)

        viewModel = ViewModelProvider(this).get(OrdemServicoViewModel::class.java)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)

        viewModel.ordemServico.observe(viewLifecycleOwner, Observer {
            recyclerView.adapter = OrdemServicoListagemItemAdapter(it)
        })

        return view
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAllOrdemServico()
    }
}