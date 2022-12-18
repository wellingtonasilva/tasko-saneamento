package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.confirmacao

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.auth.AuthException
import com.amplifyframework.auth.result.AuthSignUpResult
import com.amplifyframework.core.Amplify
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RegistroConfirmacaoViewModel : ViewModel() {

    private val _authSignUpResult = MutableLiveData<AuthSignUpResult>()
    val authSignUpResult: LiveData<AuthSignUpResult>
        get() = _authSignUpResult
    private val _authException = MutableLiveData<AuthException>()
    val authException: LiveData<AuthException>
        get() = _authException

    fun confirmarRegistro(usuario: String, codigo: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val result = Amplify.Auth.confirmSignUp(usuario, codigo,
                        {success -> onConfirmSignUpSuccess(success)},
                        {error -> onConfirmSignUpError(error)}
                    )
                } catch (error: AuthException) {
                    Log.e("AuthQuickstart", "Failed to confirm signup", error)
                }
            }
        }
    }

    private fun onConfirmSignUpSuccess(success: AuthSignUpResult) {
        _authSignUpResult.postValue(success)
    }

    private fun onConfirmSignUpError(error: AuthException) {
        _authException.postValue(error)
    }
}