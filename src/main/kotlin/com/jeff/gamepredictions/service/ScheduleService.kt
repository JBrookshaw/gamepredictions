package com.jeff.gamepredictions.service

import com.jeff.gamepredictions.client.EspnClient
import com.jeff.gamepredictions.model.Schedule
import org.springframework.stereotype.Service

@Service
class ScheduleService(val espnClient: EspnClient) {

    fun getSchedule() : Schedule {
        return espnClient.getSchedule()
    }
}