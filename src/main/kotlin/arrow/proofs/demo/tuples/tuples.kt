package consumer.arrow.proofs.demo.tuples

import arrow.tuples.Tuple2
import arrow.tuples.Tuple3
import arrow.tuples.Tuple4
import arrow.tuples.tupleOf

val tuple2: Tuple2<Int, Int> = tupleOf(4, 7)
val tuple3: Tuple3<Int, Int, String> = tupleOf(4, 7, "47Degrees")
val tuple4: Tuple4<Int, Int, String, Double> = tupleOf(4, 7, "47Degrees", 5.0)

fun getSumAverage(numbers: List<Int>): Tuple2<Int, Double> {
    val sum: Int = numbers.sum()
    val average: Double = sum.toDouble() / numbers.size
    return tupleOf(sum, average)
}

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 30, 45, 13)
    val sumAverageTuple2: Tuple2<Int, Double> = getSumAverage(numbers)
    //Prints "Sum, average is: 91, 18.2".
    println("Sum, average is: ${sumAverageTuple2.value[0]}, ${sumAverageTuple2.value[1]}")
}