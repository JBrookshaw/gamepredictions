package com.jeff.gamepredictions.model

data class Schedule(val leagues: List<League>, val season: Season, val week: Week, val events: List<Event>)
