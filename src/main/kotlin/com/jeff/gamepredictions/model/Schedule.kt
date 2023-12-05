package com.jeff.gamepredictions.model

data class Schedule(val leagues: List<Leauge>, val season: Season, val week: Week, val events: List<Event>)
