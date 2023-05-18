import kotlin.io.*
import kotlin.text.*

fun timeConversion(s: String): String {

    val isPm = s.substring(8) == "PM"
    val hours = s.substring(0,2).toInt()

    var convertedHours = if(isPm){
        if(hours == 12){
            hours.toString()
        } else {
            (hours + 12).toString()
        }
    } else  {
        if(hours == 12){
            "00"
        } else {
            s.substring(0,2)
        }
    }

    return "$convertedHours${s.substring(2,8)}"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
