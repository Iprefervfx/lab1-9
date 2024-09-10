package org.example
import kotlin.math.PI
import kotlin.math.sqrt

abstract class Figure {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

    companion object {
        fun createSquare(side: Double): Figure = Square(side)
        fun createCircle(radius: Double): Figure = Circle(radius)
        fun createTriangle(side1: Double, side2: Double, side3: Double): Figure = Triangle(side1, side2, side3)
    }
}

class Square(private val side: Double) : Figure() {
    override fun calculateArea(): Double = side * side
    override fun calculatePerimeter(): Double = 4 * side
}

class Circle(private val radius: Double) : Figure() {
    override fun calculateArea(): Double = PI * radius * radius
    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Triangle(private val side1: Double, private val side2: Double, private val side3: Double) : Figure() {
    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    override fun calculatePerimeter(): Double = side1 + side2 + side3
}

fun main() {
    val square = Figure.createSquare(5.0)
    println("Площадь квадрата: ${square.calculateArea()}")
    println("Периметр квадрата: ${square.calculatePerimeter()}")

    val circle = Figure.createCircle(3.0)
    println("Площадь круга: ${circle.calculateArea()}")
    println("Длина окружности: ${circle.calculatePerimeter()}")

    val triangle = Figure.createTriangle(3.0, 4.0, 5.0)
    println("Площадь треугольника: ${triangle.calculateArea()}")
    println("Периметр треугольника: ${triangle.calculatePerimeter()}")
}