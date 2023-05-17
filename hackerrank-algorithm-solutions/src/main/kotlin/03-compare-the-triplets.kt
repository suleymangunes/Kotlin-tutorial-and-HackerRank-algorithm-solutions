import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// compare two arrays items
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var result = Array(2) { 0 }

    for (i in 0.rangeTo(a.size - 1)){
        if(a[i] > b[i]){
            result[0] = result[0] + 1
        } else if(a[i] < b[i]){
            result[1] = result[1] + 1
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
