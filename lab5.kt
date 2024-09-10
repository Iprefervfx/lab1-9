package org.example

open class Vehicle(open var speed: Int = 0, open var name: String = "")

fun Vehicle.startAction(action: Vehicle.() -> Unit) {
    this.action()
}

fun Vehicle.stopAction(action: Vehicle.() -> Unit) {
    this.action()
}

class Boat(override var speed: Int, override var name: String) : Vehicle(speed, name)

class Airplane(override var speed: Int, override var name: String) : Vehicle(speed, name)

class Tank(override var speed: Int, override var name: String) : Vehicle(speed, name)

fun Boat.start() {
    startAction {
        println("Лодка $name начала движение по воде со скоростью $speed узлов")
    }
}

fun Boat.stop() {
    stopAction {
        println("Лодка $name причалила")
    }
}

fun Airplane.start() {
    startAction {
        println("Самолет $name взлетел со скоростью $speed км/ч")
    }
}

fun Airplane.stop() {
    stopAction {
        println("Самолет $name приземлился")
    }
}

fun Tank.start() {
    startAction {
        println("Танк $name начал движение по земле со скоростью $speed км/ч")
    }
}

fun Tank.stop() {
    stopAction {
        println("Танк $name остановился")
    }
}

fun main() {
    val boat = Boat(50, "ТК-50")
    boat.start()
    boat.stop()

    val airplane = Airplane(900, "Boeing 747")
    airplane.start()
    airplane.stop()

    val tank = Tank(40, "КВ-2")
    tank.start()
    tank.stop()
}
