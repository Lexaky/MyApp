package com.example.myapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.remember
import com.example.myapp.R

@Composable
fun HomeScreen(onNavigateToDetails: () -> Unit) {
    var count by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = stringResource(R.string.greet),
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(text = stringResource(R.string.role),
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(text = stringResource(R.string.telegram),
            modifier = Modifier.padding(bottom = 16.dp),
            style = MaterialTheme.typography.bodyLarge
        )

        Button(onClick = { count++ }) {
            Text(text = "Тапов: $count")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onNavigateToDetails) {
            Text(text = stringResource(R.string.details))
        }
    }
}