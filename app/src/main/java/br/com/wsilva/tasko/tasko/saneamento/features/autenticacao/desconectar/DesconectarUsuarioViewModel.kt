package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.desconectar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.auth.result.AuthSignOutResult
import com.amplifyframework.core.Amplify
import kotlinx.coroutines.launch

class DesconectarUsuarioViewModel : ViewModel() {

    private val _authSignOutResult = MutableLiveData<AuthSignOutResult>()
    val authSignOutResult: LiveData<AuthSignOutResult>
        get() = _authSignOutResult

    fun desconectar() {
        viewModelScope.launch {
            val signOutResult = Amplify.Auth.signOut {
                _authSignOutResult.postValue(it)
            }
        }
    }
}