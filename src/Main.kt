class TimeConverter(private var minutes: Int, private var seconds: Int) {

    // Метод для формирования строки с информацией об объекте
    fun info(): String {
        return "Минуты: $minutes, Секунды: $seconds"
    }

    // Метод для вычисления общего количества секунд
    fun totalSeconds(): Int {
        return minutes * 60 + seconds
    }
}

fun main() {
    // Ввод значений полей
    println("Введите количество минут:")
    val minutes = readLine()?.toIntOrNull() ?: 0

    println("Введите количество секунд:")
    val seconds = readLine()?.toIntOrNull() ?: 0

    // Создание объекта
    val timeConverter = TimeConverter(minutes, seconds)

    // Вывод информации об объекте
    println(timeConverter.info())

    // Вычисление общего количества секунд
    val total = timeConverter.totalSeconds()
    println("Общее количество секунд: $total")
}