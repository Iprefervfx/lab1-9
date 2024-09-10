package org.example

fun square(n: Double) = n * n

fun discriminant(a: Double, b: Double, c: Double) =
    square(b) - 4 * a * c

fun numberOfRoots(a: Double, b: Double, c: Double): Int {
    return when (val d = discriminant(a, b, c)) {
        in Double.POSITIVE_INFINITY..Double.MAX_VALUE -> 2
        0.0 -> 1
        else -> 0
    }
}

fun computeRoots(a: Double, b: Double, c: Double) {
    when (val d = discriminant(a, b, c)) {
        in Double.POSITIVE_INFINITY..Double.MAX_VALUE -> {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("У уравнения два корня: x1 = $x1, x2 = $x2")
        }
        0.0 -> {
            val x = -b / (2 * a)
            println("У уравнения один корень: x = $x")
        }
        else -> println("У уравнения нет корней")
    }
}

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0

    val rootsCount = numberOfRoots(a, b, c)
    println("У уравнения $a*x^2 + $b*x + $c = 0 $rootsCount корня(ей)")

    computeRoots(a, b, c)
}