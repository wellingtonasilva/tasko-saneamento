package br.com.wsilva.tasko.tasko.saneamento

import android.app.Application
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.auth.AuthException
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin
import com.amplifyframework.core.Amplify
import com.amplifyframework.core.Consumer
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@HiltAndroidApp
class AAplication : Application() {

    override fun onCreate() {
        super.onCreate()
        try {
            // Add this line, to include the Auth plugin.
            Amplify.addPlugin(AWSCognitoAuthPlugin())
            Amplify.configure(applicationContext)
            Log.i("###", "Initialized Amplify")
        } catch (error: AmplifyException) {
            Log.e("###", "Could not initialize Amplify", error)
        }

//        try {
//            val session = Amplify.Auth.fetchAuthSession({ success ->
//                Log.i("AmplifyQuickstart", "### Auth session = $success.session")
//            }, {
//                Log.i("AmplifyQuickstart", "### Not loggin")
//            })
//
//        } catch (error: AuthException) {
//            Log.e("AmplifyQuickstart", "Failed to fetch auth session", error)
//        }
    }
}