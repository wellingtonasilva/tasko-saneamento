package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.auth.AuthException
import com.amplifyframework.auth.result.AuthSignInResult
import com.amplifyframework.core.Amplify
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UsuarioLoginViewModel : ViewModel() {

    private val _authSignInResult = MutableLiveData<AuthSignInResult>()
    val authSignInResult: LiveData<AuthSignInResult>
        get() = _authSignInResult

    private val _authException = MutableLiveData<AuthException>()
    val authException: LiveData<AuthException>
        get() = _authException

    fun login(usuario: String, senha: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                try {
                    val result = Amplify.Auth.signIn(usuario, senha,
                        {success -> onSignInSuccess(success)},
                        {error -> onSignInError(error)}
                    )
                } catch (error: AuthException) {
                    Log.e("AuthQuickstart", "Sign in failed", error)
                }
            }
        }
    }

    private fun onSignInSuccess(success: AuthSignInResult) {
        _authSignInResult.postValue(success)
    }

    private fun onSignInError(error: AuthException) {
        _authException.postValue(error)
    }
}