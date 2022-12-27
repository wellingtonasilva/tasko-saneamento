package br.com.wsilva.tasko.tasko.saneamento.features.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.core.domain.model.home.HomeItem
import br.com.wsilva.tasko.tasko.saneamento.R

class HomeItemAdapter(private val items: List<HomeItem>, private val onItemClick: (homeItem: HomeItem) -> Unit) : RecyclerView.Adapter<HomeItemAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val content = itemView.findViewById<View>(R.id.content)
        val title = itemView.findViewById<TextView>(R.id.tvw_title)
        val subtitle = itemView.findViewById<TextView>(R.id.tvw_subtitle)
        val icon = itemView.findViewById<ImageView>(R.id.img_icon)

        fun bind(homeItem: HomeItem, onItemClick: (homeItem: HomeItem) -> Unit) {
            content.setOnClickListener {
                onItemClick(homeItem)
            }
            title.text = homeItem.title
            subtitle.text = homeItem.subtitle
            icon.setImageDrawable(AppCompatResources.getDrawable(itemView.context, homeItem.drawable))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], onItemClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}