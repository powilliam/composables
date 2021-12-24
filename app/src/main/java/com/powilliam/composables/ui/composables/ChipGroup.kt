package com.powilliam.composables.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout

@Composable
fun ChipGroup(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }

        layout(constraints.maxWidth, constraints.maxHeight) {
            var xPosition = 0
            var yPosition = 0

            placeables.forEach { placeable ->
                placeable.placeRelative(x = xPosition, y = yPosition)

                val canBePlacedOnTheSameLime =
                    xPosition + (placeable.measuredWidth * 2) + 16 >= constraints.maxWidth

                if (canBePlacedOnTheSameLime) {
                    xPosition = 0
                    yPosition += placeable.measuredHeight + 16
                } else {
                    xPosition += placeable.measuredWidth + 16
                }
            }
        }
    }
}