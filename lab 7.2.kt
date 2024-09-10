package org.example

// Класс для представления точки с координатами
class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "Координаты точки: ($x, $y)"
    }
}

// Перечисление команд для управления перемещением
enum class Command {
    UP, DOWN, LEFT, RIGHT
}

// Класс, отвечающий за перемещение точки
class PointMover {
    fun execute(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                point.y++
                println("Перемещаемся вверх: Y увеличено на 1")
            }
            Command.DOWN -> {
                point.y--
                println("Перемещаемся вниз: Y уменьшено на 1")
            }
            Command.LEFT -> {
                point.x--
                println("Перемещаемся влево: X уменьшено на 1")
            }
            Command.RIGHT -> {
                point.x++
                println("Перемещаемся вправо: X увеличено на 1")
            }
        }
        println(point)
    }
}

// Класс для управления черепахой
class Turtle(private val mover: PointMover) {
    fun move(point: Point, command: Command) {
        mover.execute(point, command)
    }
}

fun main() {
    val point = Point(0, 0)
    val pointMover = PointMover()
    val turtle = Turtle(pointMover)

    println("Исходные координаты: $point")

    turtle.move(point, Command.UP)
    turtle.move(point, Command.RIGHT)
    turtle.move(point, Command.DOWN)
    turtle.move(point, Command.LEFT)
}