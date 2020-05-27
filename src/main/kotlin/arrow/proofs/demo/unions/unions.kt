package consumer.arrow.proofs.demo.unions

import arrow.Union2
import arrow.Union3
import arrow.Union4
import arrow.Union7

data class UserName(val name: String)
data class Password(val hash: String)

fun help(id: Union2<UserName, Password>): String? {
    val userName: UserName? = id
    val password: Password? = id
    return userName?.name ?: password?.hash
}

fun main(args: Array<String>) {
    val userName = UserName("userName")
    val password = Password("password")
    println(help(userName))
    println(help(password))
}

fun f(): Union2<String, Union2<Int, Double>> = "null"
fun g(): Union3<String, Int, Double>? = 2.0
fun h(): Union4<String, Int, Double, Long> = 2L
fun union3(): Union3<String, Union2<Int, Double>?, Union2<Int, Double>?>? = 3
fun union7(): Union7<String, Int, Double, Int, Char, Boolean, Long>? = null
