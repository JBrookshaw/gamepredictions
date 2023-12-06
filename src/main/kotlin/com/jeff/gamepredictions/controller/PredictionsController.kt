package com.jeff.gamepredictions.controller

import com.jeff.gamepredictions.model.Prediction
import com.jeff.gamepredictions.service.PredictionsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PredictionsController(val service: PredictionsService) {
    @GetMapping("/predictions")
    fun getPredictions(): List<Prediction> {
        return service.getPredictions()
    }
}