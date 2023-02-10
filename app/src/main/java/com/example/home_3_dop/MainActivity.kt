package com.example.home_3_dop

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var info1: TextView
    private lateinit var info2: TextView
    private lateinit var btnSave: Button
    private lateinit var etName: EditText
    private lateinit var etMiddle: EditText
    private lateinit var etID: EditText
    private lateinit var etNumberPhone: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        info1 = findViewById(R.id.info_1)
        info2 = findViewById(R.id.info_2)
        btnSave = findViewById(R.id.btn_save)
        etName = findViewById(R.id.et_name)
        etMiddle = findViewById(R.id.et_middle)
        etID = findViewById(R.id.et_id)
        etNumberPhone = findViewById(R.id.et_number_phone)
        setonClickListener()
    }

    private fun setonClickListener() {
        btnSave.setOnClickListener {
            JustSingleton.name = etName.text.toString()
            JustSingleton.middle = etMiddle.text.toString()
            JustSingleton.id = etID.text.toString()
            JustSingleton.numberTelephone = etNumberPhone.text.toString()
            val account = Account
                    .name(JustSingleton.name.toString())
                    .middle(JustSingleton.middle.toString())
                    .getID(JustSingleton.id.toString())
                    .numberPhone(JustSingleton.numberTelephone.toString())
                    .build()
            info1.text = account.info()
            info2.text = account.info2()
        }
    }
}