package com.coderscamp.assignment10.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscamp.assignment10.dto.DayResponse;
import com.coderscamp.assignment10.dto.WeekResponse;

@RestController
public class MealService {


    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(Integer targetCalories, String diet, String exclusions){
        RestTemplate rt = new RestTemplate();

        if(targetCalories == null && diet == null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet == null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("targetCalories", targetCalories)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet != null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("diet", diet)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet == null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet != null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("diet", diet)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet != null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("diet", diet)
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet == null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
            System.out.println(uri);
            return response;
        }



        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "week")
                .queryParam("targetCalories", targetCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .build()
                .toUri();
        ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
        System.out.println(uri);
        return response;

    }



    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(Integer targetCalories, String diet, String exclusions){
        RestTemplate rt = new RestTemplate();

        if(targetCalories == null && diet == null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet == null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("targetCalories", targetCalories)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet != null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("diet", diet)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories != null && diet == null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("targetCalories", targetCalories)
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet != null && exclusions == null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("diet", diet)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet != null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("diet", diet)
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }
        if(targetCalories == null && diet == null && exclusions != null) {
            URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                    .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                    .queryParam("exclude", exclusions)
                    .build()
                    .toUri();
            ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
            System.out.println(uri);
            return response;
        }



        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("apiKey", "07b2d9d7873d4fbd97f6052179ffe8a0").queryParam("timeFrame", "day")
                .queryParam("targetCalories", targetCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .build()
                .toUri();
        ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
        System.out.println(uri);
        return response;

    }
}