package com.example.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     DisplayCards()
                }
            }
        }
    }
}


@Composable
fun DisplayCards(){
    val cards= listOf<CardInfo>(
        CardInfo("1234 4567 5678 1230","John Smith", R.drawable.mastercard,R.drawable.card1),
        CardInfo("3456 4567 3456 7890","Amit Json", R.drawable.visa,R.drawable.card2),
        CardInfo("1234 4567 5678 2345","Peter Smith", R.drawable.mastercard,R.drawable.card3),
        CardInfo("4567 4567 5678 7890","Arun Kumar", R.drawable.visa,R.drawable.card4),
    )
    
    LazyColumn(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.spacedBy(16.dp)){
        items(cards){
            CreditCard(cardInfo =it)
        }
    }
}