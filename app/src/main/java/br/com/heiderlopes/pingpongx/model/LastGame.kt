package br.com.heiderlopes.pingpongx.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LastGame(
    val player1Name: String,
    val player2Name: String,
    val player1Score: Int,
    val player2Score: Int
) : Parcelable