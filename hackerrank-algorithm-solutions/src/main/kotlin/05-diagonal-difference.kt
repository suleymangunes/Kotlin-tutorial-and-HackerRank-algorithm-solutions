import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*
import kotlin.math.abs

// diagonal difference square matrix
fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var arrSize:Int = arr.size
    var ltorDiognal:Int = 0
    var rtolDiognal:Int = 0

    for ( i in 0 until arrSize){
        ltorDiognal += arr[i][i]
        rtolDiognal += arr[i][arr.size - i - 1]
    }

    return abs(ltorDiognal - rtolDiognal)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
