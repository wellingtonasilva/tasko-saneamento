package br.com.wsilva.tasko.tasko.saneamento.features.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.wsilva.tasko.tasko.core.domain.model.home.HomeItem
import br.com.wsilva.tasko.tasko.saneamento.R

class HomeViewModel : ViewModel() {

    private var _homeItems = MutableLiveData<List<HomeItem>>()
    val homeItems: LiveData<List<HomeItem>>
        get() = _homeItems

    init {
        _homeItems.postValue(listOf(
            HomeItem(1, "Ordem de Serviço", "Listagem de Ordens de Serviços", R.drawable.ic_baseline_home),
            HomeItem(5,"Ocorrências", "Ocorrências de Campo", R.drawable.ic_baseline_warning),
            HomeItem(10, "Fotos", "Fotos capturados durante o serviço", R.drawable.ic_baseline_photo_album),
            HomeItem(15, "Checklist", "....", R.drawable.ic_baseline_car_crash),
            HomeItem(20, "Irregularidades", "Irregularidades encontradas em campo", R.drawable.ic_baseline_fingerprint),
            HomeItem(25, "Configurações", "Configurações da Aplicação", R.drawable.ic_baseline_app_settings_alt),
            HomeItem(30, "Sair", "Encerrar aplicação", R.drawable.ic_baseline_exit_to_app),
        ))
    }
}