fun main() {
    var n = readLine()!!.toInt()
    var i = 1
    while (i <= n) {
        var j = 1
        while (j <= i) {
            print(i)
            j++
        }
        i++
    }
}