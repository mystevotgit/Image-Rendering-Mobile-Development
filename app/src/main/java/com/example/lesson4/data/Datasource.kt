package com.example.lesson4.data


import com.example.lesson4.R
import com.example.lesson4.model.Item

object Datasource {
    fun loadData(): List<Item> {
        return listOf<Item>(
            Item(
                title = R.string.rainbow,
                image = R.drawable.rainbow
            ),
            Item(
                title = R.string.sustainable_living,
                image = R.drawable.sustainable_living_center
            ),
            Item(
                title = R.string.compro_admission_team,
                image = R.drawable.compro_admission_team
            ),
            Item(
                title = R.string.compro_professional,
                image = R.drawable.compro_professionals
            ),
            Item(
                title = R.string.faculty_student,
                image = R.drawable.faculty_student
            ),
            Item(
                title = R.string.friends,
                image = R.drawable.friends
            ),
            Item(
                title = R.string.miu_campus,
                image = R.drawable.miu_campus
            )
        )
    }
}
