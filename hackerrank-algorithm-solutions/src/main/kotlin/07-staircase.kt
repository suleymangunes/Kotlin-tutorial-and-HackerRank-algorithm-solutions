import kotlin.io.*
import kotlin.text.*

fun staircase(n: Int): Unit {

    for (i in 1..n){
        val spaces = n - i
        val hashes = i

        repeat(spaces) {
            print(" ")
        }

        repeat(hashes) {
            print("#")
        }

        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
