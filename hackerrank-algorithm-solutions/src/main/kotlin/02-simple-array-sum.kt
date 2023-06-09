import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// sum array items
// my solution is with recursive function
fun sumArrayItemsRecursive(arr: Array<Int>, index:Int = 0):Int{

    if(index == arr.size){
        return 0
    }
    return arr[index] + sumArrayItemsRecursive(arr, index + 1)

}

fun simpleArraySum(ar: Array<Int>): Int {

    return sumArrayItemsRecursive(ar)

}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
