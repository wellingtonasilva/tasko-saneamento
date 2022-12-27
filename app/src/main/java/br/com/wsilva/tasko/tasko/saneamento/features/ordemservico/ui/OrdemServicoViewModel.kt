package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.usecase.OrdemServicoUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class OrdemServicoViewModel @Inject constructor(
    private val ordemServicoUseCases: OrdemServicoUseCases
) : ViewModel() {

    private val _ordemServico = MutableLiveData<List<OrdemServico>>()
    val ordemServico: LiveData<List<OrdemServico>>
        get() = _ordemServico

//    init {
//        val ordemServico = OrdemServico(
//            id = UUID.randomUUID().toString(),
//            idOrdemServico = 1,
//            agenteExterno = "Agente Externo",
//            bairro = "Bairro",
//            dataCancelamento = "17/12/1977",
//            dataEncerramentoOS = "10/12/2022",
//            numeroOS = 1010
//        )
//        viewModelScope.launch(Dispatchers.IO) {
//            ordemServicoUseCases.addOrdemServicoUseCase(ordemServico)
//        }
//    }

    fun getAllOrdemServico() {
        viewModelScope.launch {
            _ordemServico.postValue(ordemServicoUseCases.getAllOrdemServicoUseCase())
        }
    }
}