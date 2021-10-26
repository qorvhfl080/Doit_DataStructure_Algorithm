package basic.algorithm.`is`

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("세 정수의 최대값을 구합니다.")
    print("a의 값: ")
    val a = sc.nextInt()
    print("b의 값: ")
    val b = sc.nextInt()
    print("c의 값: ")
    val c = sc.nextInt()

    var max = a
    if (b > max)
        max = b
    if (c > max)
        max = c

    println("최대값: $max")
}