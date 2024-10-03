package com.coderscamp.assignment10.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscamp.assignment10.dto.DayResponse;
import com.coderscamp.assignment10.dto.WeekResponse;

@Service
public class MealService {

    private static final String API_BASE_URL = "https://api.spoonacular.com/mealplanner/generate";
    private static final String API_KEY = "b6fd72200c3744a9aae6fb6eb7e0725b";

    public WeekResponse getWeekMeals (Integer targetCalories, String diet, String exclusions ) {
        URI uri = UriComponentsBuilder.fromHttpUrl(API_BASE_URL)
                .queryParam("timeFrame", "week")
                .queryParam("targetCalories", targetCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", API_KEY)
                .build()
                .toUri();

        RestTemplate rt = new RestTemplate();
        WeekResponse response = rt.getForObject(uri, WeekResponse.class);
        return response;

    }

    public DayResponse getDayMeals (Integer targetCalories, String diet, String exclusions) {
        URI uri = UriComponentsBuilder.fromHttpUrl(API_BASE_URL)
                .queryParam("timeFrame", "day")
                .queryParam("targetCalories", targetCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", API_KEY)
                .build()
                .toUri();

        RestTemplate rt = new RestTemplate();
        DayResponse response = rt.getForObject(uri, DayResponse.class);
        return response;
    }
}