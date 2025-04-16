package dev.gearturner.wallit.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.gearturner.wallit.ui.theme.WALLitTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen() {
    var useAltColor by remember { mutableStateOf(false) }

    val accentColor = if (useAltColor) Color(0xFF1976D2) else Color(0xFF64B5F6)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background) // light blue background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { useAltColor = !useAltColor },
                colors = ButtonDefaults.buttonColors(containerColor = accentColor)
            ) {
                Text("Toggle Accent Color")
            }
        }

        Text(
            text = "More coming soon...",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            fontSize = 14.sp,
            color = Color.DarkGray
        )
    }
}