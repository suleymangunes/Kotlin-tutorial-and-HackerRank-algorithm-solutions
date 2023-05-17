import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// find max and min sum for 4 items in 5 items array
fun miniMaxSum(arr: Array<Int>): Unit {
    var sumArray = Array<Long>(5) { 0 }

    for (i in arr.indices){
        var total:Long = 0
        for (j in 0 until arr.size ){
            if(i != j){
                total = total + arr[j]
            }
        }
        sumArray[i] = total
    }

    // min and max value in array with array methods
    // var minSum = sumArray.min()
    // var maxSum = sumArray.max()

    var maxSum = sumArray[0]
    var minSum = sumArray[0]
    for (i in 0 until sumArray.size){
        if(maxSum < sumArray[i]){
            maxSum = sumArray[i]
        }
        if (minSum > sumArray[i]){
            minSum = sumArray[i]
        }
    }

    print("$minSum $maxSum")

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
