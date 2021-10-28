package search.linear

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("요솟수: ")
    val num = sc.nextInt()
    val x = IntArray(num)

    for (i in 0 until num) {
        print("x[$i]: ")
        x[i] = sc.nextInt()
    }

    print("검색할 값: ")
    val ky = sc.nextInt()

    val idx = seqSearch(x, num, ky)

    if (idx == -1)
        println("그 값의 요소가 없습니다.")
    else
        println("${ky}는 x[$idx]에 있습니다.")

}

fun seqSearch(a: IntArray, n: Int, key: Int): Int {
    var i = 0
    while (true) {
        if (i == n)
            return -1
        if (a[i] == key)
            return i
        i++
    }
}