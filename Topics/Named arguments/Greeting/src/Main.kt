fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}
// do not change lines above        

fun greetNeo() = greetUser(
    name = "Anderson",
    admin = false,
    smith = false,
    honorific = "Mr.",
    greet = "Hello"
)