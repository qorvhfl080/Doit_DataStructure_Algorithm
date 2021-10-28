package search.linear

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("요솟수: ")
    val num = sc.nextInt()
    val x = IntArray(num+1)

    for (i in 0 until num) {
        print("x[$i]: ")
        x[i] = sc.nextInt()
    }

    print("검색할 값: ")
    val ky = sc.nextInt()

    val idx = seqSearchSen(x, ky)

    if (idx == -1)
        println("그 값의 요소가 없습니다.")
    else
        println("${ky}는 x[$idx]에 있습니다.")

}

fun seqSearchSen(a: IntArray, key: Int): Int {
    var i = 0

    a[a.size - 1] = key

    while (true) {
        if (a[i] == key)
            break
        i++
    }
    return if (i == a.size) -1 else i
}