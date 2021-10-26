package basic.algorithm.loop

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("1부터 n까지의 합")
    print("n의 값: ")
    val n = sc.nextInt()

    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    println("1부터 ${n}까지의 합: $sum")
}