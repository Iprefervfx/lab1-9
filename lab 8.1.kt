package org.example

fun calculate(number1: Double, number2: Double, operator: String?): Any {
    return when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> if (number2 != 0.0) number1 / number2 else "Ошибка: деление на ноль"
        else -> "Ошибка: неверный оператор"
    }
}

fun main() {
    print("Введите первое число: ")
    val number1 = readLine()?.toDoubleOrNull() ?: return println("Ошибка: неверный ввод первого числа")

    print("Введите второе число: ")
    val number2 = readLine()?.toDoubleOrNull() ?: return println("Ошибка: неверный ввод второго числа")

    print("Введите оператор (+, -, * или /): ")
    val operator = readLine()

    val result = calculate(number1, number2, operator)

    println("Результат: $result")
}