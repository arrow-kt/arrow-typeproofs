// TODO: It doesn't support a composite package
package singlepackage

import org.junit.Test

class GivenTest {

    // Arrow Meta Compiler Plugin is just applied during production code compilation (src/main/kotlin).
    // Following best practices, tests just check the production code without including it.

    @Test
    fun `coherent polymorphic identity`() {
        assert(result == "yes!")
    }
}