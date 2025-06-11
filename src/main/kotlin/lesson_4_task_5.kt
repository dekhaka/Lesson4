fun main() {
    println("Есть ли повреждения корпус? (true/false)")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков провизии:")
    val foodBoxes = readln().toInt()

    println("Благоприятная ли сегодня погода? (true/false)")
    val isWeatherGood = readln().toBoolean()

    val canSail = (!hasDamage && crew in 55..70 && foodBoxes > 50) || (hasDamage && crew == 70 && isWeatherGood && foodBoxes >= 50)

    println("Может ли корабль отправиться в плавание? $canSail")

}