package xyz.teamgravity.manual_dependency_injection.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import xyz.teamgravity.manual_dependency_injection.core.extension.viewModelFactory
import xyz.teamgravity.manual_dependency_injection.injection.app.App
import xyz.teamgravity.manual_dependency_injection.presentation.screen.MainScreen
import xyz.teamgravity.manual_dependency_injection.presentation.theme.ManualdependencyinjectionTheme
import xyz.teamgravity.manual_dependency_injection.presentation.viewmodel.MainViewModel

class Main : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManualdependencyinjectionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(
                        viewmodel = viewModel(
                            factory = viewModelFactory {
                                MainViewModel(App.MODULE.authRepository)
                            }
                        )
                    )
                }
            }
        }
    }
}