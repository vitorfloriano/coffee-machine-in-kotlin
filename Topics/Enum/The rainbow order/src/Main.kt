enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {
    val color = readln()
    // put your code here
    val colorName = Rainbow.valueOf(color.toUpperCase())
    println(colorName.ordinal + 1)
}