package com.example.compose_playground

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true, )
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is a sample text")
        Text(text = stringResource(R.string.label_text_from_resource))
        Text(
            text = "Text color is red",
            color = Color.Red
        )
        Text(
            text = "Text color is purple and from color resource",
            color = Color(R.color.purple_700)
        )
        Text("This text size is 16", fontSize = 16.sp)
        Text("This text is italic", fontStyle = FontStyle.Italic)
        Text("This text is bold", fontWeight = FontWeight.Bold)
        CenterText()
        Text(
            text = "Text with Shadow",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Red,
                    offset = Offset(5f, 5f),
                    blurRadius = 5f
                )
            )
        )
        Text(
            text = "Text with Underline",
            style = TextStyle(
                color = Color.Black,
                fontSize = 24.sp,
                textDecoration = TextDecoration.Underline
            )
        )
        Text(
            text = "Text with Strike",
            style = TextStyle(
                color = Color.Blue,
                fontSize = 24.sp,
                textDecoration = TextDecoration.LineThrough
            )
        )
        Text(
            text = "Heading 3",
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "Heading 4",
            style = MaterialTheme.typography.h4
        )
        Text(
            text = "Heading 5",
            style = MaterialTheme.typography.h5
        )
        Text("Text with serif font ", fontFamily = FontFamily.Serif)
        Text("Text with sans serif", fontFamily = FontFamily.SansSerif)
        MultipleStylesInText()
        Text(
            text = "Hello Compose ".repeat(50),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CenterText() {
    Text(
        text = "Text with background color",
        textAlign = TextAlign.Center,
        style = TextStyle(background = Color.Yellow)
    )
}

@Composable
fun MultipleStylesInText() {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Blue)) {
                append("H")
            }
            append("ello ")

            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                append("W")
            }
            append("orld")
        }
    )
}