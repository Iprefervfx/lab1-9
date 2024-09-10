package org.example

fun main() {
    var sumOfNumbers = 0
    var totalCount = 0
    var inputNumber: String?

    do {
        print("Введите число: ")
        inputNumber = readlnOrNull()

        inputNumber?.let { value ->
            val number = value.toInt()
            if (number != 0) {
                sumOfNumbers += number
                totalCount++
            }
        }
    } while (inputNumber?.toIntOrNull() != 0)

    println("Всего чисел: $totalCount")
    println("Сумма: $sumOfNumbers")

    if (totalCount > 0) {
        val averageResult = sumOfNumbers / totalCount.toDouble()
        println("Среднее арифметическое: $averageResult")
    } else {
        println("Числа не введены, среднее не вычисляется.")
    }
}