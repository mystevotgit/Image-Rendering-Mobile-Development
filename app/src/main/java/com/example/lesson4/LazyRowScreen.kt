package com.example.lesson4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lesson4.data.Datasource

@Composable
fun LazyRowScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyRow(
            modifier = modifier.padding(innerPadding)
        ) {
            items(Datasource.loadData()) { item ->
                Card {
                    Image(
                        painter = painterResource(id = item.image),
                        contentDescription = stringResource(id = item.title),
                        modifier = modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentScale =ContentScale.Crop
                    )
                    Text(
                        text = stringResource(id = item.title),
                    )
                }
                Spacer(modifier = modifier.padding(5.dp))
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun LazyRowScreenPreview(modifier: Modifier = Modifier) {
    LazyRowScreen()
}