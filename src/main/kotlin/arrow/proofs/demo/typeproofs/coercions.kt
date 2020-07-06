package prelude

import arrow.Coercion
import consumer.TwitterHandle
import consumer.handle
import consumer.twitterHandle

/**
 * Some test cases for coercions
 */
// applicableInspection(so it can be changed to be explicit) - highlighting used: Information (so won't be displayed)
val implicit: TwitterHandle? = "@danieeehh"
val implicit2: String = TwitterHandle("@aballano")

// applicableInspection(so it can be changed to be implicit) - highlighting used: Warning
val explicit: TwitterHandle? = "@danieeehh".twitterHandle()
val explicit2: String = TwitterHandle("@aballano").handle()

fun print(s: String, i: Int, s2: TwitterHandle?) = println(s)

fun implicitExplicitCoercions() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh")

fun implicitExplicitCoercions2() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh")

fun namedFunction() = print(i = 1, s = TwitterHandle("@aballano").handle(), s2 = "@danieeehh")

fun destructure() = Pair<String, TwitterHandle?>(TwitterHandle("@aballano").handle(), "@danieeehh")
fun exampleDestructuring() {
    val (s: String, s2: TwitterHandle?) = destructure()
}

val implicitExplicit: String? = "@danieeehh".twitterHandle()?.handle() // do we need to handle this case ⁉️
val implicitExplicit2: TwitterHandle? = "@danieeehh".twitterHandle()?.handle()?.twitterHandle()

fun main(args: Array<String>) {
    println(explicit)
    println(explicit2)
}
