package org.example

import org.example.math.LinearAlgebra
import org.example.math.Physics
import org.example.math.Vector2f
import org.example.simulation.PhysicalObject

fun main() {
    var object1 = PhysicalObject(
        position = Vector2f(0f, 0f),
        velocity = Vector2f(1.4f, 1.2f),
        mass = 3.0f,
    )
    var object2 = PhysicalObject(
        position = Vector2f(24f, 56f),
        velocity = Vector2f(1.4f, 1.2f),
        mass = 5.6f,
    )

    object2.addChild(object1)

    val forceVector = Physics.calculateForceVector(
        point1 = object1.position,
        point2 = object2.position,
        mass1 = object1.mass,
        mass2 = object2.mass
    )

    println("Расстояние: ${LinearAlgebra.distance(object1.position, object2.position)} метров")
    println("Вектор силы (${forceVector.x}, ${forceVector.y}) ньютон")

    val 
}