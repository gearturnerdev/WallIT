package dev.gearturner.wallit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.gearturner.wallit.navigation.WallItNavigation
import dev.gearturner.wallit.ui.theme.WALLitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent { // start app with ViewModel and the main WallItNavigation composable
            val viewModel: WallItViewModel = viewModel()
            App { WallItNavigation(viewModel) }
        }
    }
}

@Composable
fun App(content: @Composable () -> Unit) {
    WALLitTheme {
        content()
    }
}