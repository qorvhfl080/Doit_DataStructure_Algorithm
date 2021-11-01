package stack

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val s = Stack<Int>()

    while (true) {
        println("현재 데이터수: ${s.size}/${s.capacity()}")
        print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료: ")
        val menu = sc.nextInt()
        if (menu == 0)
            break

        var x: Int
        when (menu) {
            1 -> {
                print("데이터: ")
                x = sc.nextInt()
                s.push(x)
            }
            2 -> {
                x = s.pop()
                println("팝한 데이터: $x")
            }
            3 -> {
                x = s.peek()
                println("피크한 데이터: $x")
            }
            4 -> println(s.toString())
        }
    }
    sc.close()
}