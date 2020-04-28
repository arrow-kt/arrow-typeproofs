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
    print(TwitterHandle("@aballano"), 1, "@danieeehh")

fun namedFunction() = print(i = 1, s2 = "@danieeehh", s = TwitterHandle("@aballano"))

fun destructure() = Pair<String, TwitterHandle?>(TwitterHandle("@aballano"), "@danieeehh")
fun exampleDestructuring() {
    val (s: String, s2: TwitterHandle?) = destructure()
}

val implicitExplicit: String? = "@danieeehh".twitterHandle()?.handle() // do we need to handle this case ⁉️
val implicitExplicit2: TwitterHandle? = "@danieeehh".twitterHandle()?.handle()?.twitterHandle()

@Coercion
fun String.toInteger(): Int? = this.toInt()

@Coercion
fun Int.toText(): String = this

val d47: String = "47"

val toInteger: Int? = d47.toInteger()
val coercion: String? = toInteger?.toText()

val coercion2: String? = "47".toInteger()?.toText() // do we need to handle this case ⁉️
// val coercion2: String? = "47"?.toText() This is invalid after applying the fix
// val coercion2: String? = "47".toText()

val coercion3: String? = d47.toInteger()?.toText()
// val coercion3: String? = d47?.toText()
// val coercion3: String? = d47.toText()

val coercion4: Int? = "47".toInteger()?.toText()?.toInteger()
