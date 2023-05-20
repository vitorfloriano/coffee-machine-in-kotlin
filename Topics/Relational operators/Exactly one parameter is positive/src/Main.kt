fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()
    var checkNums = num1 > 0 && num2 <= 0 && num3 <= 0 || num1 <= 0 && num2 > 0 && num3 <= 0 || num1 <= 0 && num2 <= 0 && num3 > 0
    print(checkNums)
}