package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.saneamento.R

class OrdemServicoListagemItemAdapter(private val list: List<OrdemServico>) : RecyclerView.Adapter<OrdemServicoListagemItemAdapter.ViewHolder>() {

    class ViewHolder(internalView: View) : RecyclerView.ViewHolder(internalView) {
        val container = internalView.findViewById<ConstraintLayout>(R.id.content)
        val tipoServico: TextView = internalView.findViewById(R.id.tvw_tipo_servico)
        val logradouro: TextView = internalView.findViewById(R.id.tvw_logradouro)
        val dataGeracao: TextView = internalView.findViewById(R.id.tvw_data_geracao)

        fun bind(ordemServico: OrdemServico) {
            tipoServico.text = ordemServico.descricaoTipoServico
            logradouro.text = ordemServico.logradouro
            dataGeracao.text = ordemServico.dataGeracaoOS
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_ordem_servico_listagem_item,
            parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}