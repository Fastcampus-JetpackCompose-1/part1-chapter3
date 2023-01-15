package kr.co.fastcampus.part4.chapter3_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.part4.chapter3_3.ui.theme.ButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonTheme {
                ButtonExample(onButtonClicked = {})
            }
        }
    }
}

@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
    Button(onClick = {}) {
        Text(text = "Send")
    }

    // 스탭 1: Button을 클릭했을 때 Toast를 출력하게 만들어봅시다.

    // 스탭 2: Icon을 Text 앞에 추가시켜봅시다.
    // imageVector에는 Icons.Filled.Send를 넣고
    // contentDescription에는 null을 넣어봅시다.

    // 스탭 3: 아이콘과 텍스트 사이에 Spacer를 넣어봅시다.
    // modifier에 Modifier.size를 넣고 사이즈를
    // ButtonDefaults.IconSpacing을 지정합시다.

    // 스탭 4: enabled를 false로 바꾸어봅시다.

    // 스탭 5: border에 BorderStroke를 설정합시다.

    // 스탭 6: shape를 CircleShape로 지정합시다.

    // 스탭 7: contentPadding에 PaddingValues를 설정합시다.
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ButtonTheme {
        ButtonExample(onButtonClicked = {})
    }
}