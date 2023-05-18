import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

    // solution 1
    var appleCount = 0
    var orangeCount = 0

    for (i in apples){
        if (a + i in s..t){
            appleCount++
        }
    }

    for (i in oranges){
        if (b + i in s..t){
            orangeCount++
        }
    }

    println(appleCount)
    println(orangeCount)

    // solution 2
    // val appleCount = apples.count { a + it in s..t }
    // val orangeCount = oranges.count { b + it in s..t }

    // println(appleCount)
    // println(orangeCount)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
