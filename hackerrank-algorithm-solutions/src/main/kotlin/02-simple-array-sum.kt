import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// sum array items 
// my solution is with recursive function
fun sumArrayItemsRecursive(arr: Array<Int>, sizeArr:Int):Int{

    if(sizeArr == 0){
        return arr[sizeArr]
    }else {
        return arr[sizeArr] + sumArrayItemsRecursive(arr, sizeArr -1)
    }
}

fun simpleArraySum(ar: Array<Int>): Int {

    return sumArrayItemsRecursive(ar, ar.size - 1)

}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
