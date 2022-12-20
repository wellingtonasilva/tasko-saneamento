package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.saneamento.R
import java.util.*

class OrdemServicoListagemFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: OrdemServicoListagemItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ordem_servico_listagem, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        adapter = OrdemServicoListagemItemAdapter(getList())
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        recyclerView.adapter = adapter

        return view
    }

    private fun getList(): List<OrdemServico> {
        return listOf(
            OrdemServico(
                id = UUID.randomUUID().toString(),
                idOrdemServico = 1,
                agenteExterno = "Agente Externo",
                bairro = "Bairro",
                dataCancelamento = "17/12/1977",
                dataEncerramentoOS = "10/12/2022",
                numeroOS = 1010
            ),

            OrdemServico(
                id = UUID.randomUUID().toString(),
                idOrdemServico = 1,
                agenteExterno = "Agente Externo",
                bairro = "Bairro",
                dataCancelamento = "17/12/1977",
                dataEncerramentoOS = "10/12/2022",
                numeroOS = 1010
            ),

            OrdemServico(
                id = UUID.randomUUID().toString(),
                idOrdemServico = 1,
                agenteExterno = "Agente Externo",
                bairro = "Bairro",
                dataCancelamento = "17/12/1977",
                dataEncerramentoOS = "10/12/2022",
                numeroOS = 1010
            ),
        )
    }
}