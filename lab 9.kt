package org.example

fun main() {
    val numbers = listOf(-3, 5, -8, 10, -4, 7, 2, -1)
    
    // Фильтрация отрицательных чисел
    println("Отрицательные числа: ${numbers.filter { it < 0 }}")

    // Изменение знаков положительных чисел
    val modifiedNumbers = numbers.map { if (it > 0) -it else it }
    println("Список с измененными знаками: $modifiedNumbers")

    // Возведение чисел в квадрат
    println("Список квадратов: ${numbers.map { it * it }}")

    // Формирование строки с суммой чисел
    val newNumbers = (1..7).toList()
    val sumString = newNumbers.joinToString(separator = "+", prefix = "=", postfix = "=")
    println(sumString)

    // Фильтрация телефонной книги по коду страны
    val phoneBook = mapOf(
        "Alice" to "+8923456789", 
        "Snake" to "+11223344", 
        "Elena" to "+844556677", 
        "Semyon" to "+899996677", 
        "Hisao" to "+2020282737"
    )
    val countryCode = "+8"
    val filteredPhoneBook = phoneBook.filterValues { it.startsWith(countryCode) }
    println(filteredPhoneBook)
    // Преобразование числа в строку
    println("Введите число от 0 до 100:")
    val inputNumber = readLine()?.toIntOrNull() ?: 0
    val numberInWords = when (inputNumber) {
        in 0..19 -> arrayOf(
            "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", 
            "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", 
            "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", 
            "девятнадцать")[inputNumber]
        in 20..99 -> {
            val tens = arrayOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", 
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто")[inputNumber / 10]
            val ones = arrayOf("", "один", "два", "три", "четыре", "пять", "шесть", 
                "семь", "восемь", "девять")[inputNumber % 10]
            "$tens $ones".trim()
        }
        100 -> "сто"
        else -> "число вне диапазона"
    }
    println(numberInWords)

    // Преобразование времени в секунды
    val time = "01:20:12"
    val (h, m, s) = time.split(":").map { it.toInt() }
    val secondsSinceMidnight = h * 3600 + m * 60 + s
    println("Прошло $secondsSinceMidnight секунд с начала дня")
}