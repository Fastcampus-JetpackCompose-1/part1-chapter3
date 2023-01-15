package kr.co.fastcampus.part4.chapter3_8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.part4.chapter3_8.ui.theme.ColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnTheme {
                ColumnEx()
            }
        }
    }
}

@Composable
fun ColumnEx() {
    Column(modifier = Modifier.size(100.dp)) {
        Text(text = "첫 번째")
        Text(text = "두 번째")
        Text(text = "세 번째")
    }

    // 스텝 1: horizontalAlignment를 Column에 적용해봅시다.

    // 스텝 2: Column에 verticalArrangement를 지정해봅시다.
    // SpaceAround, SpaceEvenly, SpaceBetween도 해봅시다.

    // 스텝 3: Text에 Modifier.align을 사용해 봅시다.
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColumnTheme {
        ColumnEx()
    }
}