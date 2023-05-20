fun main() {
    val numCups = readLine()!!.toInt()
    val isWeekend = readLine().toBoolean()
    val successfulParty = if (isWeekend) {
        numCups in 15..25
    } else {
        numCups in 10..20
    }
    println(successfulParty)
}
