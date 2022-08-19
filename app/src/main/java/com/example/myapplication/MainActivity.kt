package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // this sets what xml frontend will use

        // getting access to the button in XML
        binding.btnStart.setOnClickListener {
            Log.i("CLICKED", "yes")


            // get access to the input value
            val username = binding.etUsername.text
            binding.etUsername.error = "Username is required"

            // check is input value is empty
            if(username.toString() == ""){
                // need to fire a toast
                val toast = Toast.makeText(this, "Name is required to continue", Toast.LENGTH_LONG)
                toast.show()
            } else {
                // navigate to next activity


                // intent , need to set context and then the new activity
                val intent = Intent(this, QuestionActivity:: class.java)

                // passing data
                intent.putExtra("Username", username.toString())



                startActivity(intent)
                finish() // stopping us from going back to the home screen: user should not be
                // able to go back after entering their name



            }

        }
    }


}