package com.example.profilejetpack

import android.nfc.Tag
import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.profilejetpack.ui.theme.ProfilejetpackTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : ComponentActivity() {
    val TAG:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {//also a composable
            ProfilejetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Profilepage()
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProfilejetpackTheme {
        Profilepage()
    }
}


private suspend fun execute(){
    val parentJob=GlobalScope.launch(Dispatchers.Main) {
        Log.d(TAG,"Parent-$coroutineContext")
        val childjob=GlobalScope.launch{//child coroutine inherit the parent context
            Log.d(TAG,"child-$coroutineContext")
        }
    }
}





















