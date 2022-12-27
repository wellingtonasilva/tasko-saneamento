package br.com.wsilva.tasko.tasko.saneamento.features.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.wsilva.tasko.tasko.saneamento.R

class HomeFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)

        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        viewModel.homeItems.observe(viewLifecycleOwner) { homeItems ->
            recyclerView.adapter = HomeItemAdapter(homeItems) { homeItem ->
                when (homeItem.id) {
                    1 -> findNavController().navigate(R.id.action_homeFragment_to_ordemServicoListagemFragment)
                }
            }
        }

        return view
    }
}