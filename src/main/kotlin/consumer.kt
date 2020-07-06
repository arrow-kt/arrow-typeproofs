package consumer

import arrow.Coercion
import arrow.Refined
import arrow.Refinement

@Refinement
inline class TwitterHandle(val handle: String) {
    companion object : Refined<String, TwitterHandle> {
        override val target = ::TwitterHandle
        override val validate: String.() -> Map<String, Boolean> = {
            mapOf(
                "Should start with '@'" to startsWith("@"),
                "Should have length <= 16" to (length <= 16),
                "Should have length > 2" to (length > 2),
                "Should not contain the word 'twitter'" to !contains("twitter"),
                "Should not contain the word 'admin'" to !contains("admin")
            )
        }
    }
}

/**
 * ```kotlin
 * val x: String = "some kdoc info"
 * ```
 * @see [twitterHandle]
 * @return [TwitterHandle]
 */
@Coercion
fun String.twitterHandle(): TwitterHandle? =
    TwitterHandle.from(this)

@Coercion
fun TwitterHandle.handle(): String =
    handle
