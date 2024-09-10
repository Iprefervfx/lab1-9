package org.example

// Обычный класс с дополнительными методами
class Car(var name: String, val speed: Int) {
    fun isEqual(other: Car): Boolean {
        return this.name == other.name && this.speed == other.speed
    }
}

// Класс данных с возможностью изменения значений
data class Vehicle(val name: String, val speed: Int) {
    fun copyWithNewName(newName: String): Vehicle {
        return this.copy(name = newName)
    }
}

fun main() {
    // Работа с обычным классом Car
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)

    println("Сравнение car1 и car2 по значению: ${car1.isEqual(car2)}") // Сравнение по содержимому
    println("Сравнение car1 и car2 по ссылке: ${car1 === car2}") // Сравнение по ссылке

    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car2: ${car2.hashCode()}")

    val car3 = car1
    println("Сравнение car1 и car3 по значению: ${car1.isEqual(car3)}") // true, так как car3 это ссылка на car1
    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car3: ${car3.hashCode()}")

    car3.name = "Belaz"
    println("car1.name после изменения car3: ${car1.name}") // Изменение car3 влияет на car1
    println("car3.name: ${car3.name}")

    // Работа с классом данных Vehicle
    val vehicle1 = Vehicle("Ural", 100)
    val vehicle2 = Vehicle("Ural", 100)

    println("Сравнение vehicle1 и vehicle2 по значению: ${vehicle1 == vehicle2}") // Сравнение по содержимому
    println("Сравнение vehicle1 и vehicle2 по ссылке: ${vehicle1 === vehicle2}") // Сравнение по ссылке

    println("hashCode vehicle1: ${vehicle1.hashCode()}")
    println("hashCode vehicle2: ${vehicle2.hashCode()}")

    // Пример создания копии с измененным полем через собственный метод
    val vehicle3 = vehicle1.copyWithNewName("ZIL")
    println("vehicle1: $vehicle1")
    println("vehicle3: $vehicle3")
}