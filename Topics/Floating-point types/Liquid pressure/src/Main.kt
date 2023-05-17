const val GRAVITY = 9.8
fun main() {
    // write your code here
    val density = readLine()!!.toDouble()
    val height = readLine()!!.toDouble()
    val pressure = GRAVITY * density * height
    println(pressure)
}