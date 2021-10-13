package edu.temple.selectionactivity

import android.content.res.Resources

    fun photoList(resources: Resources): List<Images> {
        return listOf(
            Images(
                id = 0,
                title = resources.getStringArray(R.array.food_descriptions)[0],
                resourceId = R.drawable.burger
            ),
            Images(
                id = 1,
                title = resources.getStringArray(R.array.food_descriptions)[1],
                resourceId = R.drawable.ham
            ),
            Images(
                id = 2,
                title = resources.getStringArray(R.array.food_descriptions)[2],
                resourceId = R.drawable.icecream
            ),
            Images(
                id = 3,
                title = resources.getStringArray(R.array.food_descriptions)[3],
                resourceId = R.drawable.nigiri
            ),
            Images(
                id = 4,
                title = resources.getStringArray(R.array.food_descriptions)[4],
                resourceId = R.drawable.pancake
            ),
            Images(
                id = 5,
                title = resources.getStringArray(R.array.food_descriptions)[5],
                resourceId = R.drawable.pizza
            ),
            Images(
                id = 6,
                title = resources.getStringArray(R.array.food_descriptions)[6],
                resourceId = R.drawable.ramen
            ),
            Images(
                id = 7,
                title = resources.getStringArray(R.array.food_descriptions)[7],
                resourceId = R.drawable.ribs
            ),
            Images(
                id = 8,
                title = resources.getStringArray(R.array.food_descriptions)[8],
                resourceId = R.drawable.sauce
            ),
            Images(
                id = 9,
                title = resources.getStringArray(R.array.food_descriptions)[9],
                resourceId = R.drawable.skewer
            ),
            Images(
                id = 10,
                title = resources.getStringArray(R.array.food_descriptions)[10],
                resourceId = R.drawable.sushi
            ),
            Images(
                id = 11,
                title = resources.getStringArray(R.array.food_descriptions)[11],
                resourceId = R.drawable.taco
            )

            )
    }