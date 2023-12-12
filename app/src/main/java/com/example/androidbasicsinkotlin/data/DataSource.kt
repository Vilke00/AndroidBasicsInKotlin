package com.example.androidbasicsinkotlin.data

import com.example.androidbasicsinkotlin.model.Workout

object DataSource {

    val workouts: List<Workout> = listOf(
        Workout(
            "Bench press",
            "Dumbbell",
            "Chest",
            "Push",
            "Overhand"
        ),
        Workout(
            "Squat",
            "Barbell",
            "Quads",
            "Push",
            "Overhand"
        ),
        Workout(
            "Curls",
            "Barbell",
            "Biceps",
            "Pull",
            "Underhand"
        )
    )
}
