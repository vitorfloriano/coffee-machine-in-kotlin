fun main() {
    val sequenceOfNumbers = mutableListOf<Int>()
    while (true) {
        val input = readLine()
        if (input == null) break
        sequenceOfNumbers.add(input.toInt())
    }
    val maxNumber = sequenceOfNumbers.maxOrNull()!!
    val maxNumberIndex = sequenceOfNumbers.indexOf(maxNumber) + 1
    print("$maxNumber $maxNumberIndex")
}
