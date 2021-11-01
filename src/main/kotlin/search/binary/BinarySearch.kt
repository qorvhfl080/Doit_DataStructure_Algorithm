package search.binary

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("요솟수: ")
    val num = sc.nextInt()
    val x = IntArray(num)

    println("오름차순으로 입력하세요")

    print("x[0]: ")
    x[0] = sc.nextInt()

    for (i in 1 until num) {
        do {
            print("x[$i]: ")
            x[i] = sc.nextInt()
        } while (x[i] < x[i - 1])
    }

    print("검색할 값: ")
    val ky = sc.nextInt()

    val idx = binSearch(x, num, ky)

    if (idx == -1)
        println("그 값의 요소가 없습니다.")
    else
        println("${ky}은 x[$idx]에 있습니다.")

}

fun binSearch(a: IntArray, n: Int, key: Int): Int {

    var pl = 0
    var pr = n - 1
    var pc: Int
    do {
        pc = (pl + pr) / 2
        if (a[pc] == key)
            return pc
        else if (a[pc] < key)
            pl = pc + 1
        else
            pr = pc - 1
    } while (pl <= pr)

    return -1
}