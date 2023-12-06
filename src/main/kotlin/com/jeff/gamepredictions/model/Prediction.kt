package com.jeff.gamepredictions.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("predictions")
data class Prediction(@Id val id: ObjectId = ObjectId(), val week: Int, val picks: List<Pick>)
