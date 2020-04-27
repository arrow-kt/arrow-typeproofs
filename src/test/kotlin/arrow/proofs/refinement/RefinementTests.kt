package arrow.proofs.refinement

import arrow.Coercion
import arrow.Refined
import org.junit.Test

class RefinementTests{
    @Test
    fun `NonEmptyArray should not be empty`() {
        val x: NonEmptyArray = NonEmptyArray(emptyArray())
    }
}