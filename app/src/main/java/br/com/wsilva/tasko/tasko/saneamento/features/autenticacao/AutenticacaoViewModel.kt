package br.com.wsilva.tasko.tasko.saneamento.features.autenticacao

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amplifyframework.auth.AuthException
import com.amplifyframework.auth.AuthSession
import com.amplifyframework.auth.result.AuthSignUpResult
import com.amplifyframework.core.Amplify
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AutenticacaoViewModel : ViewModel() {

    private val _authSession = MutableLiveData<AuthSession>()
    val authSession: LiveData<AuthSession>
        get() = _authSession

    private val _authException = MutableLiveData<AuthException>()
    val authException: LiveData<AuthException>
        get() = _authException

    fun checkAutenticacao() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val session = Amplify.Auth.fetchAuthSession(
                    { success -> onFetchAuthSessionSuccess(success)},
                    { error -> onFetchAuthSessiononError(error)}
                )
            } catch (error: AuthException) {
                Log.e("AmplifyQuickstart", "Failed to fetch auth session", error)
            }
        }
    }

    private fun onFetchAuthSessionSuccess(success: AuthSession) {
        _authSession.postValue(success)
    }

    private fun onFetchAuthSessiononError(error: AuthException) {
        _authException.postValue(error)
    }
}