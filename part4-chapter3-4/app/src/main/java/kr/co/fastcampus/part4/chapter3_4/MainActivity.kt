package kr.co.fastcampus.part4.chapter3_4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.part4.chapter3_4.ui.theme.ModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifierTheme {
                ModifierEx()
            }
        }
    }
}

@Composable
fun ModifierEx() {
    Button(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }

    // 스텝 1: modifier에 Modifier.fillMaxSize()를 사용해봅시다.

    // 스텝 2: fillMaxSize대신 Modifier.height를 설정해봅시다.

    // 스텝 3: modifier에 height와 width를 같이 설정해봅시다.

    // 스텝 4: size에 width와 height를 인자로 넣을 수도 있습니다.

    // 스텝 5: background를 설정해봅시다. (버튼에서는 되지 않음.)
    // Button에 되지 않으면 Text나 Icon에 지정해봅시다.

    // 스탭 6: colors 파라미터에 ButtonDefaults.buttonColors를
    // 넣어보세요. backgroundColor와 contentColor 프로퍼티를
    // 설정하세요.

    // 스텝 7: Button의 modifier에 padding을 추가해봅시다.

    // 스탭 8: Button에 enabled를 false로 설정하고, Text의
    // modifier에 clickable을 넣어봅시다.

    // 스탭 9: Text의 modifier에 offset를 설정하고 x 파라미터를
    // 설정합니다.
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModifierTheme {
        ModifierEx()
    }
}