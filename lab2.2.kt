package org.example

fun main() {
    val array = arrayOf(1, 7, 5, 2, 6, 4, 8, 5, 9)

    // Используя цикл for
    println("Используя цикл for:")
    for (index in 1 until array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
    }

    // Используя цикл while
    println("\nИспользуя цикл while:")
    var index = 1
    while (index < array.size - 1) {
        if (array[index] > array[index - 1] && array[index] > array[index + 1]) {
            println(array[index])
        }
        index++
    }

    // Используя функцию filter и map
    println("\nИспользуя функцию filter и map:")
    val localMaxima = array.indices
        .filter { index ->
            index > 0 && index < array.size - 1 &&
            array[index] > array[index - 1] && array[index] > array[index + 1]
        }
        .map { index -> array[index] }

    localMaxima.forEach { println(it) }
}