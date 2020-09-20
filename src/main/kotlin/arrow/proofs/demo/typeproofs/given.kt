package test

import arrow.Given
import arrow.given

//providers
@Given
internal val y: Int = 47

@Given
fun givenFun(): Unit = TODO()

@Given
object givenObject

@Given
class GivenClass()

//injections
fun exampleFun1(
    text: @Given String,
    notGiven: Int,
    int47: @Given Int
): Unit = TODO()

fun exampleFun2(
    text: String = given(),
    notGiven: Int,
    int47: Int = given()
): String = given<String>() + given<Int>()

fun exampleFun3(
    text: String
): String = given<String>()

fun newFun4(
    text: @Given String = given()
): String = text

fun main(args: Array<String>) {
    println(newFun4())
}