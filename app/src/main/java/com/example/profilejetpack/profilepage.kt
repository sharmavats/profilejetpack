package com.example.profilejetpack

import android.icu.text.CaseMap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Profilepage(){
    Column(
        Modifier
            .background(color = Color.Gray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {     // allows ui elements to allign vertically
    Image(painter = painterResource(id = R.drawable.kotlin),
        contentDescription = "kotlin image",
        Modifier
            .size(200.dp)
            .clip(CircleShape)
            .border(
                width = 2.dp,
                color = Color.Red,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop //to crop the image so that it will adjust perfectly

        )

    
        Text(text = "Kotlin language ",
        Modifier.background(color = Color.White))
        Text(text = "For Native Applications",
        Modifier.background(color = Color.White))


        Row(horizontalArrangement = Arrangement.SpaceEvenly,modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
            profilestats(count = "150", title ="Follower" )
            profilestats(count = "10", title ="Following" )

            /*Column(
                Modifier
                    .background(color = Color.Gray)) {
                Text(text = "Followers",fontWeight = FontWeight.Bold)
                Text(text = "150")

            }
            Column(
                Modifier
                    .background(color = Color.Gray)) {
                Text(text = "Following ",fontWeight = FontWeight.Bold)
                Text(text = "10")

            }
            Column(
                Modifier
                    .background(color = Color.Gray) ){
                Text(text = "RelaseYear",fontWeight = FontWeight.Bold)
                Text(text = "2015")

            }
             */
        }
    }
}

@Composable
fun profilestats(count:String,title:String) {
    Column(
        Modifier
            .background(color = Color.Gray)
    ) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)
    }
}
@Preview(showBackground = true)
@Composable
fun Profilepagepreview(){
    Profilepage()
}