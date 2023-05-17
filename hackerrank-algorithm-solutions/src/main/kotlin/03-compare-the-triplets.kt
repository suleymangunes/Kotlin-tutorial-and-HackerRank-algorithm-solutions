import kotlin.io.*
import kotlin.text.*

// compare two arrays items
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var result = Array(2) { 0 }

    for (i in a.indices){
        when {
            a[i] > b[i] -> result[0]++
            a[i] < b[i] -> result[1]++
        }
    }

    return result
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
