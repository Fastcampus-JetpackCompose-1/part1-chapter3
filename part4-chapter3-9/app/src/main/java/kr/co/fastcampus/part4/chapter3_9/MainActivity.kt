package kr.co.fastcampus.part4.chapter3_9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.part4.chapter3_9.ui.theme.BoxWithConstraintsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxWithConstraintsTheme {
                Outer()
            }
        }
    }
}

@Composable
fun Outer() {
    // 스텝 4: Column에 width를 지정해서 제한해 봅시다.
    Column {
        // 스텝 2: Inner의 인자로 Modifier.widthIn(min = 100.dp)를
        // 전달해봅시다. heightIn도 전달해봅시다. 각각 인자의 max값도
        // 전달해봅시다.
        Inner()
    }
}

// 스텝 1: Inner 인자로 modifier를 전달해봅시다. 기본 값을 Modifier로 지정합시다.
// 파라미터로 받은 modifier를 BoxWithConstrains에 전달합시다.
@Composable
private fun Inner() {
    BoxWithConstraints {
        // 스텝 3: maxHeight 값이 150dp가 넘을 때만 추가로 텍스트를 출력해봅시다.
        Text("maxW:$maxWidth maxH:$maxHeight minW: $minWidth minH:$minHeight")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BoxWithConstraintsTheme {
        Outer()
    }
}