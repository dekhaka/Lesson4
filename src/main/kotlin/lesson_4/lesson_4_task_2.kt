fun main() {

    val weightLimitMin = 35
    val weightLimitMax = 100
    val volumeLimitMax = 100

    val weightOne = 20
    val volumeOne = 80
    val averageOne = weightOne > weightLimitMin && weightOne <= weightLimitMax && volumeOne < volumeLimitMax

    val weightTwo = 50
    val volumeTwo = 100
    val averageTwo = weightTwo > weightLimitMin && weightTwo <= weightLimitMax && volumeTwo < volumeLimitMax

    println("Груз с весом $weightOne кг и объемом $volumeOne л соответствует категории 'Average':$averageOne")
    println("Груз с весом $weightTwo кг и объемом $volumeTwo л соответствует категории 'Average':$averageTwo")

}