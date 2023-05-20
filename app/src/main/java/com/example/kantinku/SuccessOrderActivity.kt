package com.example.kantinku

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import com.example.kantinku.models.RestaurentModel
import kotlinx.android.synthetic.main.activity_success_order.*

class SuccessOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_order)

        val restaurantModel: RestaurentModel? = intent.getParcelableExtra("RestaurantModel")
        val actionbar: ActionBar? = supportActionBar
        val buttonDone: Button = findViewById( R.id.buttonDone)
        actionbar?.setTitle(restaurantModel?.name)
        actionbar?.setSubtitle(restaurantModel?.address)
        actionbar?.setDisplayHomeAsUpEnabled(false)

//        buttonDone.setOnClickListener {
//            setResult(RESULT_OK)
//            finish()
//        }
        buttonDone.setOnClickListener {
            setResult(RESULT_OK)
            (Uri.parse("https://api.whatsapp.com/send?phone=&text="))
            finish()
        }
    }
}