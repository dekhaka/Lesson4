fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val season: String ="Зима"

    val goodLegumes: Boolean =
        isSunny && isTentOpen && humidity == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? : $goodLegumes")


}