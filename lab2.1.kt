package org.example

fun main() {
    print("Введите количество простых чисел: ")
    val requiredCount = readLine()?.toIntOrNull() ?: return

    var foundCount = 0
    var candidateNumber = 2

    while (foundCount < requiredCount) {
        var isPrime = true

        if (candidateNumber > 2 && candidateNumber % 2 == 0) {
            isPrime = false
        } else {
            for (i in 2 until candidateNumber) {
                if (candidateNumber % i == 0) {
                    isPrime = false
                    break
                }
            }
        }

        if (isPrime) {
            foundCount++
            println("${foundCount}-ое простое число: $candidateNumber")
        }
        candidateNumber++
    }
}