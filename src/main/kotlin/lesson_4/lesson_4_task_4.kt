fun main() {
    val day = 5

    val isUpperBodyDay = day % 2 !=0

    val arms = isUpperBodyDay
    val abs = isUpperBodyDay
    val legs = !isUpperBodyDay
    val back = !isUpperBodyDay

    println(
        """
            Упражнение для рук:     $arms
            Упражнение для ног:     $legs
            Упражнение для спины:   $back
            Упражнение для пресса:  $abs
            """.trimIndent()
    )

}