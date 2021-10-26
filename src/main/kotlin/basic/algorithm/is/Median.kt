package basic.algorithm.`is`

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("세 정수의 중앙값을 구합니다.")
    print("a의 값: ")
    val a = sc.nextInt()
    print("b의 값: ")
    val b = sc.nextInt()
    print("c의 값: ")
    val c = sc.nextInt()

    val med = med3(a, b, c)
    println("중앙값: $med")
}

fun med3(a: Int, b: Int, c: Int): Int {
    if (a >= b)
        if (b >= c)
            return b
        else if (a <= c)
            return a
        else
            return c
    else if (a > c)
        return a
    else if (b > c)
        return c
    else
        return b
}