// Implement your functions here
fun subtractTwoNumbers(a: Long, b: Long): Long {
    print(a - b)
    return a - b
}

fun sumTwoNumbers(a: Long, b: Long): Long {
    print(a + b)
    return a + b
}

fun divideTwoNumbers(a: Long, b: Long): Long {
    if (b == 0L) {
        print("Division by 0!")
        return 0
    } else {
        print(a / b)
        return a / b
    }
}

fun multiplyTwoNumbers(a: Long, b: Long): Long {
    print(a * b)
    return a * b
}
