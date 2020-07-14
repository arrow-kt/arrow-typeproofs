package consumer.arrow.proofs.demo.tuples

import arrow.Union2
import arrow.tuples.Tuple2
import arrow.tuples.Tuple3
import arrow.tuples.Tuple4
import arrow.tuples.tupleOf

val tuple2: Tuple2<Int, Int> = tupleOf(4, 7)
val tuple3: Tuple3<Int, Int, String> = tupleOf(4, 7, "47Degrees")
val tuple4: Tuple4<Int, Int, String, Double> = tupleOf(4, 7, "47Degrees", 5.0)

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 30, 45, 13)
    val sumAverageTuple2: Tuple2<Int, Double> = getSumAverage(numbers)
    //Prints "Sum, average is: 91, 18.2".
    println("Sum, average is: ${sumAverageTuple2.value[0]}, ${sumAverageTuple2.value[1]}")
}

private fun getSumAverage(numbers: List<Int>): Tuple2<Int, Double> {
    val sum: Int = numbers.sum()
    val average: Double = sum.toDouble() / numbers.size
    return tupleOf(sum, average)
}

//val tuple6: Tuple6<Int, Int, String, Char, String, Double> =
//    tupleOf(47, 47, "Degrees", '4', "7Degrees", 3.0)

//val tuple7: Tuple7<Int, Int, String, Char, String, Double, Long> =
//    tupleOf(47, 47, "Degrees", '4', "7Degrees", 3.0, 47L)

// FIXME: https://github.com/arrow-kt/arrow-meta/issues/710
//val issueTupleUnion: Tuple2<Int, Union2<String, Int>> = tupleOf(47, 47)
//val unionTuple: Union2<Int, Tuple2<String, Int>> = tupleOf("47", 47)
val unionTuple2: Union2<Int, Tuple2<String, Int>> = 47