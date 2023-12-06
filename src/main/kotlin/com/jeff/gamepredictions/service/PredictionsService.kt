package com.jeff.gamepredictions.service

import com.jeff.gamepredictions.model.Prediction
import com.jeff.gamepredictions.repo.PredictionsRepository
import org.springframework.stereotype.Service

@Service
class PredictionsService(val repo: PredictionsRepository) {

    fun getPredictions() : List<Prediction> {
        return repo.findAll()
    }
}