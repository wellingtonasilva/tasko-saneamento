package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui.listagem

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.usecase.OrdemServicoUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class OrdemServicoViewModel @Inject constructor(
    private val ordemServicoUseCases: OrdemServicoUseCases
) : ViewModel() {

    private val _ordemServico = MutableLiveData<List<OrdemServico>>()
    val ordemServico: LiveData<List<OrdemServico>>
        get() = _ordemServico

    fun getAllOrdemServico() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _ordemServico.postValue(ordemServicoUseCases.getAllOrdemServicoUseCase())
            }
        }
    }
}