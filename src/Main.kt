class TimeConverter(private var minutes: Int, private var seconds: Int) {

    //информацияй об объекте метод
    fun info(): String {
        return "Минуты: $minutes, Секунды: $seconds"
    }

    // вычисления общего количества секунд
    fun totalSeconds(): Int {
        return minutes * 60 + seconds
    }
}

fun main() {
  
    println("Введите количество минут:")
    val minutes = readLine()?.toIntOrNull() ?: 0

    println("Введите количество секунд:")
    val seconds = readLine()?.toIntOrNull() ?: 0

    // Создание объекта
    val timeConverter = TimeConverter(minutes, seconds)

    
    println(timeConverter.info())


    val total = timeConverter.totalSeconds()
    println("Общее количество секунд: $total")
}
