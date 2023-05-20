fun main() {
    var sequenceLength = 0
    while (true) {
        val number = readLine()!!.toInt()
        if (number == 0) {
            break
        }
        sequenceLength++
    }
    println(sequenceLength)
}