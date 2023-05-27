class Application(val name: String) {
    fun run(firstVar: String, secondVar: String, thirdVar: String) : Unit {
        println(this.name)
        println(firstVar)
        println(secondVar)
        println(thirdVar)
    }
}