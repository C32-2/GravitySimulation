package org.example.simulation

import org.example.math.Vector2f

class PhysicalObject(
    var position: Vector2f,
    var velocity: Vector2f,
    val mass: Float,
    val children: ArrayList<PhysicalObject>
) {
    init {
        require(mass > 0.0f)
    }

    fun addChild(physicalObject: PhysicalObject) {
        children.add(physicalObject)
    }

    fun removeChild(physicalObject: PhysicalObject) {
        children.remove(physicalObject)
    }
}