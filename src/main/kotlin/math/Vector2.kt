package org.example.math

class Vector2<T>(var x: T, var y: T) {
    fun perform(other: Vector2<T>, op: (T, T) -> T): Vector2<T> {
        return Vector2(op(x, other.x), op(y, other.y))
    }

    fun performMutable(other: Vector2<T>, op: (T, T) -> T): Unit {
        x = op(x, other.x)
        y = op(y, other.y)
    }
}

typealias Vector2f = Vector2<Float>
typealias Vector2d = Vector2<Double>
typealias Vector2i = Vector2<Int>