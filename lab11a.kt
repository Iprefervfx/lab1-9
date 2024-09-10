package org.example

fun main() {
    print("Введите целое число:")
    val value = readln()
    val firstDigit = value[0].digitToInt()
    val lastDigit = value[value.length - 1].digitToInt()
    val total = firstDigit + lastDigit
    println("Результат сложения: $total")
}