package br.senai.sp.jandira.login.components

import android.util.Log
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CaixaDeTexto(
    label: String,
    valor: String,
    aoMudar: () -> Unit
) {
    OutlinedTextField(
        value = valor,
        onValueChange = {
                        aoMudar()
        },
        label = {
            Text(text = label)
        }
    )
}

@Preview
@Composable
fun CaixaDeTextoPreview() {
//    CaixaDeTexto("Teste", "")
}