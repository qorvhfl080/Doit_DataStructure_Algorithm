package basic.data_structure.array

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)
    val rand = Random()

    println("키의 최댓값을 구합니다.")
    print("사람 수: ")
    val num = sc.nextInt()

    val arr = Array<Int>(num) { 0 }
    for (i in 0 until arr.size) {
        arr[i] = 100 + rand.nextInt(90)
    }

    println(arr.contentToString())
    println("최댓값은 ${maxOf(arr)}")

}

fun maxOf(arr: Array<Int>): Int {
    var max: Int = arr[0]
    for (i in arr) {
        if (max < i)
            max = i
    }
    return max
}