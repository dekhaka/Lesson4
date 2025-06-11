fun main() {
    val day = 5 // можно менять для проверки

    val isUpperBodyDay = day % 2 != 0

    val arms = isUpperBodyDay
    val abs = isUpperBodyDay
    val legs = !isUpperBodyDay
    val back = !isUpperBodyDay

    println(
        """
        Упражнения для рук:       $arms
        Упражнения для ног:       $legs
        Упражнения для спины:     $back
        Упражнения для пресса:    $abs
        """.trimIndent()
    )
}