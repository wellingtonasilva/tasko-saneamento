package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao.registro

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.auth.AuthException
import com.amplifyframework.auth.AuthUserAttributeKey
import com.amplifyframework.auth.options.AuthSignUpOptions
import com.amplifyframework.auth.result.AuthSignUpResult
import com.amplifyframework.core.Amplify
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class UsuarioRegistrarViewModel : ViewModel() {

    private val _authException = MutableLiveData<AuthException>()
    val authException: LiveData<AuthException>
        get() = _authException

    private val _authSignUpResult = MutableLiveData<AuthSignUpResult>()
    val authSignUpResult: LiveData<AuthSignUpResult>
        get() = _authSignUpResult

    fun registrarUsuario(usuario: String, senha: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val options = AuthSignUpOptions.builder()
                    .userAttribute(AuthUserAttributeKey.email(), usuario)
                    .build()
                try {
                    val result = Amplify.Auth.signUp(usuario, senha, options,
                        { success -> onSignUpSuccess(success)},
                        {error -> onSignUpError(error)}
                    )
                    Log.i("AuthQuickStart", "Result: $result")
                } catch (error: AuthException) {
                    Log.e("AuthQuickStart", "Sign up failed", error)
                }
            }
        }
    }

    private fun onSignUpSuccess(success: AuthSignUpResult) {
        _authSignUpResult.postValue(success)
    }

    private fun onSignUpError(error: AuthException) {
        _authException.postValue(error)
    }
}