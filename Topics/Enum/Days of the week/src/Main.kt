enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    val days = DaysOfTheWeek.values() // Get all the enum instances

    for (day in days) {
        println(day.name) // Print the name of each enum instance on a new line
    }
}
