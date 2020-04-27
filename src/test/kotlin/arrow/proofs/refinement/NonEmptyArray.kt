package arrow.proofs.refinement

import arrow.Coercion
import arrow.Refined

inline class NonEmptyArray(val value: Array<Int>) {
    companion object : Refined<Array<Int>, NonEmptyArray> {
        override val target: (Array<Int>) -> NonEmptyArray = ::NonEmptyArray
        override val validate: Array<Int>.() -> Map<String, Boolean> = {
            mapOf(
                "Should not be empty" to isNotEmpty()
            )
        }
    }
}

@Coercion
fun Array<Int>.nonEmpty(): NonEmptyArray? =
    NonEmptyArray.from(this)