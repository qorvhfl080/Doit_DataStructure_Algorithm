package basic.algorithm.loop

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var n: Int
    println("왼쪽 아래가 직각인 이등변 삼각형 출력")

    do {
        print("몇 단 삼각형? : ")
        n = sc.nextInt()
    } while (n <= 0)

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

}