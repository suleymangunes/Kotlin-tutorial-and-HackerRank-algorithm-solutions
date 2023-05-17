import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// sum two long num
fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}

fun main(){
    var string = "asdfula asf 2 2 sdf 1"
    var nums = "0123456789"

    for (i in 0.rangeTo(string.length - 1)){
        for (j in nums){
            if(string[i] == j){
                println("index : $i, sayi: $i")
            }
        }
    }
}
