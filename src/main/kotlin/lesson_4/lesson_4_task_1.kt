fun main() {

    val allTable = 13
    val bookedToday = 13
    val bookedTommorow = 9

    val freeTableToday = bookedToday < allTable
    val freeTableTommorow = bookedTommorow < allTable

    println("[Доступность столиков на сегодня: $freeTableToday], \n [Доступность столиков на завтра: $freeTableTommorow]")
}