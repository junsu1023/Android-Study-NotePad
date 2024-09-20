package com.example.notepad.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notepad.ui.theme.black
import com.example.notepad.ui.theme.gold
import com.example.notepad.ui.theme.kaki
import com.example.notepad.ui.theme.transparent

@Composable
fun NotePadWriteScreen(
    clickBackButton: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(kaki)
    ) {
        WriteTitleBar(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.07f)
        )

        DivideLine()

        WriteContentLayout(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.93f)
        )
    }
}

@Composable
private fun WriteTitleBar(modifier: Modifier) {
    Column(
        modifier = modifier
            .background(gold)
            .padding(
                horizontal = 10.dp
            ),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.padding(end = 20.dp),
        ) {
            CustomTextField()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CustomTextField() {
    val titleText = remember { mutableStateOf("asd") }
    val interactionSource = remember { MutableInteractionSource() }

    BasicTextField(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f),
        value = titleText.value,
        onValueChange = { titleText.value = it },
        singleLine = true,
        textStyle = TextStyle(
            color = black,
            fontSize = 30.sp,
        )
    ) {
        TextFieldDefaults.DecorationBox(
            value = titleText.value,
            innerTextField = {
                Text(text = "hint")
            },
            enabled = true,
            singleLine = true,
            visualTransformation = VisualTransformation.None,
            contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
                start = 10.dp
            ),
            interactionSource = interactionSource,
        )
    }
}

@Composable
private fun WriteContentLayout(modifier: Modifier) {
    var contentText = remember { mutableStateOf("") }
    BasicTextField(
        modifier = modifier
            .background(transparent),
        value  = contentText.value,
        onValueChange = { contentText.value = it }
    )
}