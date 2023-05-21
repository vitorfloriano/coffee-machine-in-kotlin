fun f1(x: Double): Double = (x * x) + 1
fun f2(x: Double): Double = 1 / (x * x)
fun f3(x: Double): Double = (x * x) - 1
fun f(x: Double): Double {
    return when {
        x <= 0 -> f1(x)
        0 < x && x < 1 -> f2(x)
        x >= 1 -> f3(x)
        else -> 0.0
    }
}
