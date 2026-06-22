package com.example.directionprogramm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ManagerHistoryMenuActivity : AppCompatActivity() {

    private lateinit var backButton: ImageButton
    private lateinit var myHistoryCard: LinearLayout
    private lateinit var carWashHistoryCard: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_history_menu)

        backButton = findViewById(R.id.backButtonManagerHistoryMenu)
        myHistoryCard = findViewById(R.id.myHistoryCard)
        carWashHistoryCard = findViewById(R.id.carWashHistoryCard)

        backButton.setOnClickListener {
            finish()
        }

        myHistoryCard.setOnClickListener {
            startActivity(Intent(this, ManagerOrderHistoryActivity::class.java))
        }

        carWashHistoryCard.setOnClickListener {
            startActivity(Intent(this, ManagerCarWashOrdersDistrictsActivity::class.java))
        }
    }
}
