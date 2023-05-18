package machine

import kotlin.system.exitProcess

fun recipe() {
    println("Write how many cups of coffee you will need:")
    val cups = readLine()!!.toInt()
    println("For $cups cups of coffee you will need:")
    println("${cups * 200} ml of water")
    println("${cups * 50} ml of milk")
    println("${cups * 15} g of coffee beans")
}

fun checkResources() {
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

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun machineOptions() {
    println("Write action (buy, fill, take, remaining, exit)")
    val action = readLine()!!
    when (action) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
        "remaining" -> machineStatus()
        "exit" -> exitProcess(0)
    }
}
fun buy() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    val coffee = readLine()!!
    when (coffee) {
        "1" -> {
            if (water < 250) {
                println("Sorry, not enough water!")
                machineOptions()
            } else if (beans < 16) {
                println("Sorry, not enough coffee beans!")
                machineOptions()
            } else if (cups < 1) {
                println("Sorry, not enough disposable cups!")
                machineOptions()
            } else {
                println("I have enough resources, making you a coffee!")
            }
            water -= 250
            beans -= 16
            cups -= 1
            money += 4
        }
        "2" -> {
            if (water < 350) {
                println("Sorry, not enough water!")
                machineOptions()
            } else if (milk < 75) {
                println("Sorry, not enough milk!")
                machineOptions()
            } else if (beans < 20) {
                println("Sorry, not enough coffee beans!")
                machineOptions()
            } else if (cups < 1) {
                println("Sorry, not enough disposable cups!")
                machineOptions()
            } else {
                println("I have enough resources, making you a coffee!")
            }
            water -= 350
            milk -= 75
            beans -= 20
            cups -= 1
            money += 7
        }
        "3" -> {
            if (water < 200) {
                println("Sorry, not enough water!")
                machineOptions()
            } else if (milk < 100) {
                println("Sorry, not enough milk!")
                machineOptions()
            } else if (beans < 12) {
                println("Sorry, not enough coffee beans!")
                machineOptions()
            } else if (cups < 1) {
                println("Sorry, not enough disposable cups!")
                machineOptions()
            } else {
                println("I have enough resources, making you a coffee!")
            }
            water -= 200
            milk -= 100
            beans -= 12
            cups -= 1
            money += 6
        }
        "back" -> machineOptions()
    }
    machineOptions()
}

fun fill() {
    println("Write how many ml of water do you want to add:")
    water += readLine()!!.toInt()
    println("Write how many ml of milk do you want to add:")
    milk += readLine()!!.toInt()
    println("Write how many grams of coffee beans do you want to add:")
    beans += readLine()!!.toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += readLine()!!.toInt()
    machineOptions()
}

fun take() {
    println("I gave you $$money")
    money = 0
    machineOptions()
}
fun machineStatus() {
    println("The coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")
    machineOptions()
}

fun main() {
    machineOptions()
}