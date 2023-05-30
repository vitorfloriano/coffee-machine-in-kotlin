class CoffeeMachine {
    private var water = 400
    private var milk = 540
    private var beans = 120
    private var cups = 9
    private var money = 550

    fun processInput(input: String) {
        when {
            input == "buy" -> buy()
            input == "fill" -> fill()
            input == "take" -> take()
            input == "remaining" -> printState()
            input == "exit" -> return
            else -> processBuyInput(input)
        }
    }

    private fun processBuyInput(input: String) {
        when (input) {
            "1" -> makeCoffee(250, 0, 16, 4)
            "2" -> makeCoffee(350, 75, 20, 7)
            "3" -> makeCoffee(200, 100, 12, 6)
            else -> println("Invalid input!")
        }
    }

    private fun makeCoffee(waterNeeded: Int, milkNeeded: Int, beansNeeded: Int, cost: Int) {
        when {
            water < waterNeeded -> println("Sorry, not enough water!")
            milk < milkNeeded -> println("Sorry, not enough milk!")
            beans < beansNeeded -> println("Sorry, not enough coffee beans!")
            cups < 1 -> println("Sorry, not enough disposable cups!")
            else -> {
                println("I have enough resources, making you a coffee!")
                water -= waterNeeded
                milk -= milkNeeded
                beans -= beansNeeded
                cups -= 1
                money += cost
            }
        }
    }

    private fun fill() {
        println("Write how many ml of water you want to add:")
        water += readLine()!!.toInt()
        println("Write how many ml of milk you want to add:")
        milk += readLine()!!.toInt()
        println("Write how many grams of coffee beans you want to add:")
        beans += readLine()!!.toInt()
        println("Write how many disposable cups you want to add:")
        cups += readLine()!!.toInt()
    }

    private fun take() {
        println("I gave you $$money")
        money = 0
    }

    private fun printState() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$beans g of coffee beans")
        println("$cups disposable cups")
        println("$$money of money")
    }

    private fun buy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        val coffee = readLine()!!
        when (coffee) {
            "1" -> {
                if (water < 250) {
                    println("Sorry, not enough water!")
                    return
                } else if (beans < 16) {
                    println("Sorry, not enough coffee beans!")
                    return
                } else if (cups < 1) {
                    println("Sorry, not enough disposable cups!")
                    return
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
                    return
                } else if (milk < 75) {
                    println("Sorry, not enough milk!")
                    return
                } else if (beans < 20) {
                    println("Sorry, not enough coffee beans!")
                    return
                } else if (cups < 1) {
                    println("Sorry, not enough disposable cups!")
                    return
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
                    return
                } else if (milk < 100) {
                    println("Sorry, not enough milk!")
                    return
                } else if (beans < 12) {
                    println("Sorry, not enough coffee beans!")
                    return
                } else if (cups < 1) {
                    println("Sorry, not enough disposable cups!")
                    return
                } else {
                    println("I have enough resources, making you a coffee!")
                }
                water -= 200
                milk -= 100
                beans -= 12
                cups -= 1
                money += 6
            }
            "back" -> return
            else -> println("Invalid input!")
        }
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readLine()!!
        coffeeMachine.processInput(action)
        if (action == "exit") {
            break
        }
        println()
    }
}
