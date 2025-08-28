fun main() {
    val numbers = listOf(1, 2, 4, 7, 13, 9, 23)

    val results = numbers.map { isPrime(it) }

    println(results.joinToString(prefix = "(", separator = ", ", postfix = ")"))
}

fun isPrime(n: Int): Boolean {
    if (n == 2) {
        return false }

    if (n < 1) {
        return false
    }
    if (n == 1) {
        return true }
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) {
            return false
        }
        i++
    }
    return true
}
