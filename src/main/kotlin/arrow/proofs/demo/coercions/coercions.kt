package prelude

import arrow.Coercion
import consumer.TwitterHandle
import consumer.handle
import consumer.twitterHandle

/**
 * Some test cases for coercions
 */
// applicableInspection(so it can be changed to be explicit) - highlighting used: Information (so won't be displayed)
// line marker with proof that validates the coercion
val implicit: TwitterHandle? = "@danieeehh"
val implicit2: String = TwitterHandle("@aballano")

// applicableInspection(so it can be changed to be implicit) - highlighting used: Warning
// line marker with proof that validates the coercion
val explicit: TwitterHandle? = "@danieeehh".twitterHandle()
val explicit2: String = TwitterHandle("@aballano").handle()

fun print(s: String, i: Int, s2: TwitterHandle?) = println(s)

fun implicitExplicitCoercions() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh")

fun implicitExplicitCoercions2() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh".twitterHandle())

fun namedFunction() = print(i = 1, s2 = "@danieeehh", s = TwitterHandle("@aballano"))

fun destructure() = Pair<String, TwitterHandle?>(TwitterHandle("@aballano"), "@danieeehh")
fun exampleDestructuring() {
    val (s: String, s2: TwitterHandle?) = destructure()
}

val implicitExplicit: String? = "@danieeehh".twitterHandle()?.handle() // do we need to handle this case ⁉️⁉️⁉️


@Coercion
fun String.toInteger(): Int? = this.toInt()

@Coercion
fun Int.toText(): String = this

val coercion: String? = "23".toInteger()?.toText() // do we need to handle this case ⁉️⁉️⁉️
// val coercion: String? = "23"?.toText() This is invalid after applying the fix
