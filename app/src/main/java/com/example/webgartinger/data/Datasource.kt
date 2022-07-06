package com.example.webgartinger.data

import com.example.webgartinger.R
import com.example.webgartinger.data.model.WateringCan

class Datasource () {

    fun loadGießen(): List<WateringCan> {
        return listOf(
            WateringCan(
                R.drawable.can1,
                "Rekrut Känchen",
                0.99,
                false
            ),
            WateringCan(
                R.drawable.can2,
                "Veteran Känchen",
                1.99,
                false
            ),
            WateringCan(
                R.drawable.can3,
                "Cerry Lady",
                69.99,
                true
            ),
            WateringCan(
                R.drawable.can4,
                "Kupfer Gießer",
                99.99,
                false
            ),
            WateringCan(
                R.drawable.can5,
                "Cay Gießkänchen",
                9.99,
                true
            ),
            WateringCan(
                R.drawable.can6,
                "Gold Digga",
                1999.99,
                false
            )
        )
    }
}