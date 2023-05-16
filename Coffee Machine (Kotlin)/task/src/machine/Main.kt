package machine

fun recipe() {
    println("Write how many cups of coffee you will need:")
    val cups = readLine()!!.toInt()
    println("For $cups cups of coffee you will need:")
    println("${cups * 200} ml of water")
    println("${cups * 50} ml of milk")
    println("${cups * 15} g of coffee beans")
}

fun main() {
    println("Write how many ml of water the coffee machine has:")
    val water = readLine()!!.toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = readLine()!!.toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val beans = readLine()!!.toInt()
    println("Write how many cups of coffee you will need:")
    val cups = readLine()!!.toInt()
    if (water / 200 < cups || milk / 50 < cups || beans / 15 < cups) {
        println("No, I can make only ${minOf(water / 200, milk / 50, beans / 15)} cups of coffee")
    } else if (water / 200 == cups && milk / 50 == cups && beans / 15 == cups) {
        println("Yes, I can make that amount of coffee")
    } else {
        println("Yes, I can make that amount of coffee (and even ${minOf(water / 200, milk / 50, beans / 15) - cups} more than that)")
    }
}