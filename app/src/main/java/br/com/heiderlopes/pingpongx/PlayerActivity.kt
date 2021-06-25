package br.com.heiderlopes.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.heiderlopes.pingpongx.databinding.ActivityPlayerBinding


class PlayerActivity : AppCompatActivity() {

    private val TAG = "PINGPONGX"


    private lateinit var binding: ActivityPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(TAG, "onCreate")

        binding = ActivityPlayerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btStart.setOnClickListener {
            nextScreen()
        }
    }

    private fun nextScreen() {
        val nextScreenIntent = Intent(this, MainActivity::class.java)
        nextScreenIntent.putExtra(MainActivity.KEY_EXTRA_PLAYER1, binding.etPlayer1.text.toString())
        nextScreenIntent.putExtra(MainActivity.KEY_EXTRA_PLAYER2, binding.etPlayer2.text.toString())
        startActivity(nextScreenIntent)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }
}