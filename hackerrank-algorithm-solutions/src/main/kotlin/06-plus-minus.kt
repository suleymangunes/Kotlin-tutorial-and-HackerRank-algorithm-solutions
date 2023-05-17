import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun plusMinus(arr: Array<Int>): Unit {
    var arrSize = arr.size.toDouble()
    val pCount = arr.count { it > 0 }
    val nCount = arr.count { it < 0 }
    val zCount = arr.count { it == 0 }

    val pRatio = pCount.toDouble() / arrSize
    val nRatio = nCount.toDouble() / arrSize
    val zRatio = zCount.toDouble() / arrSize

    println("%.6f".format(pRatio))
    println("%.6f".format(nRatio))
    println("%.6f".format(zRatio))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
