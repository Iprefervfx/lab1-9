package org.example

fun main() {
    val numbers = arrayOf(3, 7, 2, 8, 1, 5)

    // Использование цикла for
    val (productFor, minFor, maxFor) = numbers.fold(Triple(1, numbers[0], numbers[0])) { acc, num ->
        Triple(acc.first * num, minOf(acc.second, num), maxOf(acc.third, num))
    }
    println("Используя for (произведение, минимальное, максимальное): $productFor, $minFor, $maxFor")

    // Использование цикла while
    val (productWhile, minWhile, maxWhile) = calculateWhileUsingFold(numbers)
    println("Используя while (произведение, минимальное, максимальное): $productWhile, $minWhile, $maxWhile")

    // Использование функции reduce
    val productReduce = numbers.reduce { acc, num -> acc * num }
    val minReduce = numbers.minOrNull()
    val maxReduce = numbers.maxOrNull()
    println("Используя reduce (произведение, минимальное, максимальное): $productReduce, $minReduce, $maxReduce")

    // Использование оператора forEach
    val (productForEach, minForEach, maxForEach) = numbers.fold(Triple(1, numbers[0], numbers[0])) { acc, num ->
        Triple(acc.first * num, minOf(acc.second, num), maxOf(acc.third, num))
    }
    println("Используя forEach (произведение, минимальное, максимальное): $productForEach, $minForEach, $maxForEach")
}

// Функция для расчета произведения, минимального и максимального значения с помощью цикла while и fold
fun calculateWhileUsingFold(array: Array<Int>): Triple<Int, Int, Int> {
    var index = 0
    val initial = Triple(1, array[0], array[0])
    val result = array.fold(initial) { acc, num ->
        Triple(acc.first * num, minOf(acc.second, num), maxOf(acc.third, num))
    }
    return result
}