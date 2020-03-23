package consumer

import arrowx.StringMonoid.combine
import arrowx.StringMonoid.empty

val x = "1".combine("2") + empty()
val y: String = x
