fun main() {
    var max = 0
    while (true) {
        val number = readLine()!!.toInt()
        if (number == 0) {
            break
        }
        if (number > max) {
            max = number
        }
    }
    println(max)
}