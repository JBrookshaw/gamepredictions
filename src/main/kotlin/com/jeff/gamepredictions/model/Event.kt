package com.jeff.gamepredictions.model

import java.util.*

data class Event(val id: String, val uid: String, val date: Date, val name: String, val shortName: String, val competitions: List<Competition> )
