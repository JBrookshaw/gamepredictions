package com.jeff.gamepredictions.client

import com.jeff.gamepredictions.model.Competition
import com.jeff.gamepredictions.model.Competitor
import com.jeff.gamepredictions.model.Event
import com.jeff.gamepredictions.model.Leauge
import com.jeff.gamepredictions.model.Schedule
import com.jeff.gamepredictions.model.Season
import com.jeff.gamepredictions.model.Team
import com.jeff.gamepredictions.model.Week
import org.springframework.web.client.RestTemplate
import spock.lang.Specification

class EspnClientTest extends Specification {
    def leauge = new Leauge("nfl", new Season(2023))
    def week = new Week(1)
    def competition = new Competition([new Competitor(new Team("Packers", new URI("http://web.com").toURL()), "home", "10")])
    def Event = new Event("id", "id", new Date(2023,1,1), "eventName", "shortName", [competition])
    Schedule schedule = new Schedule([leauge], new Season(2023), week, [event])

    RestTemplate restTemplate = Mock(RestTemplate.class)
    EspnClient client = new EspnClient(restTemplate)

    def "test getSchedule returns a schedule"() {
        given:
        restTemplate.getForObject("https://site.api.espn.com/apis/site/v2/sports/football/nfl/scoreboard", Schedule.class) >> schedule
        when:
        def result = client.getSchedule()
        then:
        assert result == schedule
    }
}