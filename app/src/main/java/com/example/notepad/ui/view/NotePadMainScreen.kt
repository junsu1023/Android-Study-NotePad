package com.example.notepad.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notepad.R
import com.example.notepad.ui.theme.black
import com.example.notepad.ui.theme.kaki

@Composable
fun NotePadMainScreen(
    clickAddButton: () -> Unit,
    clickNotePadItem: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(kaki)
    ) {
        TopBar(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.07f),
            clickAddButton = clickAddButton
        )

        DivideLine()

        NotePadList(clickNotePadItem)
    }
}

@Composable
fun TopBar(
    modifier: Modifier,
    clickAddButton: () -> Unit
) {
    Row(
        modifier = modifier.padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.wrapContentSize(),
            text = stringResource(id = R.string.main_title),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = Modifier.wrapContentSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.add),
                contentDescription = null,
                modifier = Modifier.clickable(
                    onClick = clickAddButton
                )
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.trashcan),
                contentDescription = null
            )
        }
    }
}

@Composable
fun DivideLine() {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(black)
    )
}

@Composable
private fun NotePadList(
    clickNotePadItem: () -> Unit
) {
    /* TODO */
}