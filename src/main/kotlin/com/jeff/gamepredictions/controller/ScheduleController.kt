package com.jeff.gamepredictions.controller

import com.jeff.gamepredictions.model.Schedule
import com.jeff.gamepredictions.service.ScheduleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScheduleController(val scheduleService: ScheduleService) {

    @GetMapping("/schedule")
    fun getMessage(): Schedule {
        return scheduleService.getSchedule()
    }
}