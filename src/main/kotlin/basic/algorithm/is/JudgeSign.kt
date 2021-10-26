package basic.algorithm.`is`

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("정수를 입력하세요: ")
    val n = sc.nextInt()

    if (n > 0)
        println("양수")
    else if (n < 0)
        println("음수")
    else
        println("0")

}