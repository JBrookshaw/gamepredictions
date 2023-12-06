package com.jeff.gamepredictions.repo

import com.jeff.gamepredictions.model.Prediction
import org.springframework.data.mongodb.repository.MongoRepository

interface PredictionsRepository : MongoRepository<Prediction, String> {
}