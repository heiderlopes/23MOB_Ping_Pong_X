package br.com.heiderlopes.pingpongx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.pingpongx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private var playerOneScore = 0
    private var playerTwoScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        if(savedInstanceState != null) {
            playerOneScore = savedInstanceState.getInt("PLAYER_ONE_SCORE", 0)
            playerTwoScore = savedInstanceState.getInt("PLAYER_TWO_SCORE", 0)
            setUpPlayerOneScore()
            setUpPlayerTwoScore()
        }

        setUpPlayers()

        setUpListeners()

    }

    private fun setUpPlayerOneScore() {
        binding.tvPlayerOneScore.text = playerOneScore.toString()
    }

    private fun setUpPlayerTwoScore() {
        binding.tvPlayerTwoScore.text = playerTwoScore.toString()
    }

    private fun setUpListeners() {
        binding.btPlayerOneScore.setOnClickListener {
            playerOneScore++
            setUpPlayerOneScore()
        }

        binding.btPlayerTwoScore.setOnClickListener {
            playerTwoScore++
            setUpPlayerTwoScore()
        }
    }

    private fun setUpPlayers() {
        binding.tvPlayerOneName.text = intent.getStringExtra(KEY_EXTRA_PLAYER1)
        binding.tvPlayerTwoName.text = intent.getStringExtra(KEY_EXTRA_PLAYER2)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("PLAYER_ONE_SCORE", playerOneScore)
        outState.putInt("PLAYER_TWO_SCORE", playerTwoScore)
    }

    companion object {
        val KEY_EXTRA_PLAYER1 = "KEY_EXTRA_PLAYER1"
        val KEY_EXTRA_PLAYER2 = "KEY_EXTRA_PLAYER2"
    }
}