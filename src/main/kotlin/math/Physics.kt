package org.example.math

object Physics {
    fun calculateForceVector(
        point1: Vector2f,
        point2: Vector2f,
        mass1: Float,
        mass2: Float
        ): Vector2f {
        val diff = point2 - point1
        val length = LinearAlgebra.norm(diff)
        return diff * ((Constants.G * mass1 * mass2) / length * length * length)
    }
}