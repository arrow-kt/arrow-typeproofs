package arrow.proofs.refinement

import org.junit.Test

class RefinementTests{
    @Test
    fun `NonEmptyArray should not be empty`() {
        val x: NonEmptyArray = NonEmptyArray(emptyArray())
    }
}