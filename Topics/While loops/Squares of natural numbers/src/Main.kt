fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var i = 1
    var square = 1
    while (square <= n) {
        println(square)
        i++
        square = i * i
    }
}