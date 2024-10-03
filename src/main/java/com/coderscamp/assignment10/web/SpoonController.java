package com.coderscamp.assignment10.web;

import com.coderscamp.assignment10.dto.DayResponse;
import com.coderscamp.assignment10.dto.WeekResponse;
import com.coderscamp.assignment10.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpoonController {

    private MealService mealService;

    @Autowired
    public SpoonController (MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam(required = false) Integer targetCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions){
        WeekResponse weekResponse = mealService.getWeekMeals(targetCalories, diet, exclusions);
        return ResponseEntity.ok(weekResponse);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(@RequestParam(required = false) Integer targetCalories,@RequestParam(required = false) String diet,@RequestParam(required = false) String exclusions){
        DayResponse dayResponse = mealService.getDayMeals(targetCalories, diet, exclusions);
        return ResponseEntity.ok(dayResponse);
    }
}
