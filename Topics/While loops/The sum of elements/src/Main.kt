fun main() {
    var sum = 0
    var num = readln()!!.toInt()
    while (num != 0) {
        sum += num
        num = readln()!!.toInt()
    }
    println(sum)
}