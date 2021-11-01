package queue

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val q: Queue<Int> = LinkedList()

    while (true) {
        println("현재 데이터 수: ${q.size}/${q.count()}")
        print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: ")
        val menu = sc.nextInt()
        if (menu == 0)
            break

        var x: Int
        when (menu) {
            1 -> {
                print("데이터: ")
                x = sc.nextInt()
                q.add(x)
            }
            2 -> {
                x = q.first()
                q.remove(x)
                println("디큐한 데이터: $x")
            }
            3 -> {
                x = q.peek()
                println("피크한 데이터: $x")
            }
            4 -> {
                println(q.toString())
            }
        }
    }
}