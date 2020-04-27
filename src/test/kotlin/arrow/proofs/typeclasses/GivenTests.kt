package arrow.proofs.typeclasses

import arrow.Given
import org.junit.Test

class GivenTest {

    fun <A> given(evidence: @Given A = arrow.given): A =
        evidence
    @Given val x = "yes!"

    @Test
    fun `coherent polymorphic identity`() {
        val result = given<String>()
        assert(result == "yes!")
    }
}