// TODO: It doesn't support a composite package
package singlepackage

import arrow.*
import org.junit.Test

fun <A> given(evidence: @Given A = arrow.given): A = evidence
@Given val x = "yes!"
val result = given<String>()

class GivenTest {

    @Test
    fun `coherent polymorphic identity`() {
        assert(result == "yes!")
    }
}