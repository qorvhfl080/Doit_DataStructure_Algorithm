package basic.algorithm.loop

import java.util.*

fun main() {

    for (i in 1..9) {
        for (j in 1..9) {
            System.out.printf("%3d", i * j)
        }
        println()
    }

}