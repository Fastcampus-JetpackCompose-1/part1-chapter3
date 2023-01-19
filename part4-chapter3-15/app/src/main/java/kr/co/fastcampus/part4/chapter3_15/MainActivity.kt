package kr.co.fastcampus.part4.chapter3_15

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.part4.chapter3_15.ui.theme.TopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBarTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TopBarEx("Android")
                }
            }
        }
    }
}

@Composable
fun TopBarEx(name: String) {
    Column {
        // 스텝 1: TopAppBar를 만들고 title 항목을 채워봅시다.

        // 스텝 2: navigationIcon 파라미터를 채워봅시다.
        // IconButton을 만들고 자식으로 Icon을 넣읍시다.
        // 아이콘은 Icons.Filled.ArrowBack을 채웁시다.
        // onClick은 비워둡시다.

        // 스텝 3: actions를 추가해봅시다.
        // Icons.Filled의 여러 아이콘을 이용해봅시다.

        // 스텝 4: TopAppBar content 파라미터 버전을 만들어봅시다.

        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TopAppBarTheme {
        TopBarEx("Android")
    }
}