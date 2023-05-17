import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun birthdayCakeCandles(candles: Array<Int>): Int {
    var maxNum = candles[0]
    var maxNumCount = 0

    for ( i in candles.indices){
        if(candles[i] > maxNum ){
            maxNumCount = 0
            maxNum = candles[i]
        }
        if(candles[i] == maxNum){
            maxNumCount++
        }
    }

    return maxNumCount

}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
