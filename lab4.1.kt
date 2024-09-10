package org.example

class NumberArray(private val array: IntArray) {

    fun sumOfPositiveElements(): Int {
        var sum = 0
        for (number in array) {
            if (number > 0) sum += number
        }
        return sum
    }

    fun productOfElements(): Long {
        var product: Long = 1
        for (number in array) {
            product *= number.toLong()
        }
        return product
    }

    fun averageOfElements(): Double {
        var sum = 0
        for (number in array) {
            sum += number
        }
        return if (array.isNotEmpty()) sum.toDouble() / array.size else 0.0
    }
}

fun main() {
    val numberArray = NumberArray(intArrayOf(3, -5, 2, 8, -1, 5))

    println("Сумма положительных элементов: ${numberArray.sumOfPositiveElements()}")
    println("Произведение элементов: ${numberArray.productOfElements()}")
    println("Среднее арифметическое: ${numberArray.averageOfElements()}")
}