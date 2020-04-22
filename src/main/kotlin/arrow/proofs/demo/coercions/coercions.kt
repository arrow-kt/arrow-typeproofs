package prelude

import consumer.TwitterHandle
import consumer.twitterHandle
import consumer.handle

/** Still need to check why the first line marker shows up here 📝
 * Some test cases for coercions
 */
// applicableInspection(so it can be changed to be explicit) - highlighting used: Information (so won't be displayed)
// line marker with proof that validates the coercion
val implicit: TwitterHandle? = "@danieeehh" // KtProperty
val implicit2: String = TwitterHandle("@aballano")

// applicableInspection(so it can be changed to be implicit) - highlighting used: Warning
// line marker with proof that validates the coercion
val explicit: TwitterHandle? = "@danieeehh".twitterHandle() // KtDotQualifiedExpression
val explicit2: String = TwitterHandle("@aballano").handle()

fun print(s: String, i: Int, s2: TwitterHandle?) = println(s)

fun implicitExplicitCoercions() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh") // KtValueArgument

fun implicitExplicitCoercions2() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh") // KtValueArgument

fun implicitExplicitCoercions3() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh".twitterHandle()) // KtValueArgument

fun implicitExplicitCoercions4() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh".twitterHandle()) // KtValueArgument


val implicitExplicit: String? = "@danieeehh".twitterHandle()?.handle() // do we need to handle this case ⁉️⁉️⁉️

val twitterHandleValid: TwitterHandle? = "@admin" // should be highlighted with error because predicate not matching ⁉️⁉️⁉️
