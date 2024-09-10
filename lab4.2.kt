package org.example

class NumberArray(private val array: IntArray) {

    val sum: Int
        get() {
            var total = 0
            for (num in array) {
                total += num
            }
            return total
        }

    fun doubleEvens(): IntArray {
        val result = IntArray(array.size)
        for (i in array.indices) {
            result[i] = if (array[i] % 2 == 0) array[i] * 2 else array[i]
        }
        return result
    }

    fun tripleOdds(): IntArray {
        val result = IntArray(array.size)
        for (i in array.indices) {
            result[i] = if (array[i] % 2 != 0) array[i] * 3 else array[i]
        }
        return result
    }

    fun maxElement(): Int {
        var max = array[0]
        for (num in array) {
            if (num > max) max = num
        }
        return max
    }

    fun minElement(): Int {
        var min = array[0]
        for (num in array) {
            if (num < min) min = num
        }
        return min
    }
}

fun main() {
    val numbers = intArrayOf(2, 4, 3, 8, 5, 7, 6)
    val array = NumberArray(numbers)

    println("Исходный массив: ${numbers.contentToString()}")
    println("Удвоенные четные элементы: ${array.doubleEvens().contentToString()}")
    println("Утроенные нечетные элементы: ${array.tripleOdds().contentToString()}")
    println("Максимальный элемент в массиве: ${array.maxElement()}")
    println("Минимальный элемент в массиве: ${array.minElement()}")
    println("Сумма элементов массива: ${array.sum}")
}