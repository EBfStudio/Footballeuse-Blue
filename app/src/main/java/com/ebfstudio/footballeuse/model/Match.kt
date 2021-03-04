package com.ebfstudio.footballeuse.model

/**
 * Created by Vince on 21/09/2020
 */
data class Match(
        val teamHome: Team,
        val teamAway: Team,
        val scoreHome: Int,
        val scoreAway: Int,
        val stadium: String,
        val competition: Competition
)
