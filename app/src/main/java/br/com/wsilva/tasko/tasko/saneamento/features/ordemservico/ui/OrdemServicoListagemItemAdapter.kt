package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.saneamento.R

class OrdemServicoListagemItemAdapter(private val list: List<OrdemServico>) : RecyclerView.Adapter<OrdemServicoListagemItemAdapter.ViewHolder>() {

    class ViewHolder(internalView: View) : RecyclerView.ViewHolder(internalView) {
        val container = internalView.findViewById<ConstraintLayout>(R.id.content)

        fun bind(ordemServico: OrdemServico) {

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