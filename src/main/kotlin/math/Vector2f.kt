package org.example.math

import kotlin.math.sqrt

//Custom Vector2f

class Vector2f(var x: Float, var y: Float) {
    operator fun plus(other: Vector2f): Vector2f {
        return Vector2f(x + other.x, y + other.y)
    }

    operator fun minus(other: Vector2f): Vector2f {
        return Vector2f(x - other.x, y - other.x)
    }

    operator fun div(scalar: Float): Vector2f {
        return Vector2f(x / scalar, y / scalar)
    }

    operator fun times(scalar: Float): Vector2f {
        return Vector2f(x * scalar, y * scalar)
    }

    fun length(): Float {
        return sqrt(x * x + y * y)
    }

    fun normalize(): Vector2f {
        val length = length()
        return Vector2f(x / length, y / length)
    }

    companion object {
        fun distance(point1: Vector2f, point2: Vector2f): Float {
            val dx = point2.x - point1.x
            val dy = point2.y - point1.y
            return sqrt(dx * dx + dy * dy)
        }

        fun dot(point1: Vector2f, point2: Vector2f): Float {
            return point1.x * point2.x + point1.y * point2.x
        }
    }
}