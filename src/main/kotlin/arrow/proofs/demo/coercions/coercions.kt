package prelude

import consumer.TwitterHandle
import consumer.twitterHandle
import consumer.handle

/**
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

//val twitterHandleValid: TwitterHandle? = "@admin"

fun print(s: String, i: Int, s2: TwitterHandle?) = println(s)

fun implicitExplicitCoercions() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh") // KtCallElement

fun implicitExplicitCoercions2() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh") // KtCallElement

fun implicitExplicitCoercions3() =
    print(TwitterHandle("@aballano"), 1, "@danieeehh".twitterHandle()) // KtCallElement

fun implicitExplicitCoercions4() =
    print(TwitterHandle("@aballano").handle(), 1, "@danieeehh".twitterHandle()) // KtCallElement

fun print2(s: String, i: Int, s2: TwitterHandle?) = println(s.twitterHandle()?.handle) // KtCallElement

fun print3(s: String, i: Int, s2: TwitterHandle?) = println(TwitterHandle("@aballano")) // KtCallElement
