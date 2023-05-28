@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonGreen(
    onClick: (String) -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    colors: ButtonColors,
) {
    Button(
        onClick = { onClick },
        modifier = modifier,
        colors = ButtonDefaults.textButtonColors(
            containerColor = Color(hex = 0xFF00CF6C).copy(alpha = 0.6f),
            contentColor = Color.White
        )
    ) {
        Text(text)
    }
}

//@Composable
//fun ColorChangingButton() {
//    var buttonColor by remember { mutableStateOf(Color(hex = 0xFF800080)) }
//
//    Button(
//        onClick = { buttonColor = buttonColor.copy(alpha = 0.5f) },
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//            .background(buttonColor),
//        contentColor = Color.White
//    ) {
//        Text("Button")
//    }
//}
//
