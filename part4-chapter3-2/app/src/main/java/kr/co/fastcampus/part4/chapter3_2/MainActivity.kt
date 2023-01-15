package kr.co.fastcampus.part4.chapter3_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.co.fastcampus.part4.chapter3_2.ui.theme.TextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextTheme {
                Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //    Text(text = "Hello $name")

    // 스텝 1: 색상을 지정하기 위해 color 파라미터에 Color.Red를 전달해봅시다.
//    Text(
//        text = "Hello $name",
//        color = Color.Red
//    )

    // 스텝 2: Color 객체를 이용해서 해쉬값으로 색상을 전달해봅시다. (ARGB 순)
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944)
//    )

    // 스텝 3: fontSize 파라미터에 30.sp를 전달해봅니다.
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp
//    )

    // 스텝 4: fontWeight에 FontWeight.Bold를 전달해봅시다.
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold
//    )

    // 스텝 5: fontFamily에 FontFamily.Cursive를 전달해봅시다.
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive
//    )

    // 스텝 6: letterSpacing에 2.sp를 지정해봅시다.
//    Text(
//        text = "Hello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp
//    )

    // 스텝 7: maxLines를 2로 지정하고 문자열을 더 추가해봅시다.
//    Text(
//        text = "Hello $name\nHello $name\nHello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp,
//        maxLines = 2
//    )

    // 스텝 8: textDecoration에 TextDecoration.Underline을 추가합시다.
//    Text(
//        text = "Hello $name\nHello $name\nHello $name",
//        color = Color(0xffff9944),
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        fontFamily = FontFamily.Cursive,
//        letterSpacing = 2.sp,
//        maxLines = 2,
//        textDecoration = TextDecoration.Underline
//    )

    // 스텝 9: textAlign을 TextAlign.Center로 지정합니다.
    // modifier = Modifier.width(200.dp)나
    // modifier = Modifier.size(200.dp)를 설정해서 충분히 넓혀둡니다.
    Text(
        text = "Hello $name\nHello $name\nHello $name",
        color = Color(0xffff9944),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 2.sp,
        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Center,
        modifier = Modifier.width(200.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextTheme {
        Greeting("Android")
    }
}