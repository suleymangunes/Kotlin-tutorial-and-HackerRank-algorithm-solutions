import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gradingStudents(grades: Array<Int>): Array<Int> {

    val roundedGrades = mutableListOf<Int>()
    for (grade in grades) {
        if (grade >= 38) {
            val nextMultipleOf5 = (grade / 5 + 1) * 5
            if (nextMultipleOf5 - grade < 3) {
                roundedGrades.add(nextMultipleOf5)
            } else {
                roundedGrades.add(grade)
            }
        } else {
            roundedGrades.add(grade)
        }
    }
    return roundedGrades.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
