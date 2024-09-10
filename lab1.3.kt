package org.example

fun main() {
    val hiddenNumber = (0..10).random()
    var correctGuess = false

    while (!correctGuess) {
        print("Угадайте число (от 0 до 10): ")
        val inputGuess = readlnOrNull()

        inputGuess?.toIntOrNull()?.let { guess ->
            if (guess < hiddenNumber) {
                println("Недостаточно")
            } else if (guess > hiddenNumber) {
                println("Слишком много")
            } else {
                println("Правильно! Вы угадали число.")
                correctGuess = true
            }
        } ?: println("Введите правильное число!")
    }
}