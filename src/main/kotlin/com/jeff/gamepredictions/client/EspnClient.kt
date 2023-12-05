package com.jeff.gamepredictions.client

import com.jeff.gamepredictions.model.Schedule
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Component
class EspnClient {
    private val restTemplate = RestTemplate()

    val url = "https://site.api.espn.com/apis/site/v2/sports/football/nfl/scoreboard"

    fun getSchedule() : Schedule {
        return restTemplate.getForObject(url)
    }
}