package consumer.arrow.proofs.demo.unions

import arrow.Union2
import arrow.first
import arrow.second

object Success
object Error
object Other



/**
 * Unions can accept values implicitly in any of the types they present
 */
val implicit1: Union2<Success, Error> = Success
val implicit2: Union2<Success, Error> = Error

/**
 * Unions can accept values implicitly in any of the types they present
 */
val explicit1: Union2<Success, Error> = Success.first()
val explicit2: Union2<Success, Error> = Error.second()

/**
 * Types outside of the union won't compile
 */
//val nope: Union3<Success, ServerFailure, Unauthorized> = 1

/**
 * Unions are commutative
 */
val com1: Union2<Error, Success> = Success
val com2: Union2<Success, Error> = com1

//TODO fix exaustiveness in union types
val patternMatching: Any = when (com1) {
    is Error -> Unit
    is Success -> Unit
    else -> com1
}
