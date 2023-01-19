package kr.co.fastcampus.part4.chapter3_14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.part4.chapter3_14.ui.theme.TextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier.padding(16.dp)) {
        // 스텝 1: TextField를 Text위에 만듭니다.
        // value와 onValueChanged는 비워둡시다.

        // 스텝 2: Text에 Android 대신 TextField 입력을
        // 출력하게 합시다. mutableStateOf("") 필드를
        // 하나 만듭시다.

        // 스텝 3: TextField에 label을 추가합시다.
        // 내용에는 `Text("Name")`을 채워봅시다.

        // 스텝 4: TextField와 Text 사이에 Spacer를 넣어 8.dp
        // 간격을 줍시다.

        // 스텝 5: TextField를 OutlinedTextField로 변경해봅시다.

        Text(text = "Hello Android")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldTheme {
        Greeting()
    }
}