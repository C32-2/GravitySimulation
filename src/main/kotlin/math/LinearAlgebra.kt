package org.example.math

import kotlin.math.sqrt

object LinearAlgebra {
    fun norm(v: Vector2f): Float {
        return sqrt(v.x * v.x + v.y * v.y)
    }

    fun distance(v1: Vector2f, v2: Vector2f): Float {
        val diff = v2.perform(v1) { a, b -> b - a }
        return LinearAlgebra.norm(diff)
    }
}