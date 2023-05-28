@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tanitama

import CornerTextField
import CornerTextFieldPassword
import SectionText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tanitama.ui.theme.TanitamaTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TanitamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SignIn()
                }
            }
        }
    }
}

@Composable
fun SignIn() {
    val usernameState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo Tanitama",
                modifier = Modifier
                    .size(150.dp),
                contentScale = ContentScale.Fit
            )
            SectionText(stringResource(R.string.title_activity_sign_in))
            CornerTextField(
                value = usernameState.value, // display state
                onValueChange = { usernameState.value = it },
                placeholder = "Username",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 8.dp, end = 20.dp, bottom = 8.dp),
                cornerRadius = 19.dp,
                backgroundColor = Color.White.copy(alpha = 0.9f),
                borderColor = Color.Gray,
                textColor = Color.Gray
            )
            CornerTextFieldPassword(
                value = passwordState.value, // display state
                onValueChange = { passwordState.value = it },
                placeholder = "Password",
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 8.dp, end = 20.dp, bottom = 8.dp),
                cornerRadius = 19.dp,
                backgroundColor = Color.White.copy(alpha = 0.9f),
                borderColor = Color.Gray,
                textColor = Color.Black
            )
            Button(
                onClick = { /* Handle SignIn Button Click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 8.dp, end = 20.dp, bottom = 8.dp),
            ) {
                Text("SIGN IN")
            }
//            ButtonWithText("SIGN UP", Modifier.align(Alignment.BottomCenter))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    TanitamaTheme {
        SignIn()
    }
}