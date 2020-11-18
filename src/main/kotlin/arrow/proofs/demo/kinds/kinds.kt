package consumer
import arrow.*
import arrowx.Kind
import arrowx.Kinded

/*interface Functor<F> {
    interface Ops<F, A> {
        val value: Kind<F, A>
        fun <B> fmap(f: (A) -> B): Kind<F, B>
    }
}

object `List(_)`
typealias ListOf<A> = Kind<`List(_)`, A>

@Coercion
fun <A> List<A>.unfix(): ListOf<A> =
    Kinded(this)

@Coercion
fun <A> ListOf<A>.fix(): List<A> =
    (this as Kinded).value as List<A>

class ListFunctor<A>(override val value: ListOf<A>) : Functor.Ops<`List(_)`, A> {
    override fun <B> fmap(f: (A) -> B): ListOf<B> =
        value.fix().map(f)
}

@Extension
fun <A> List<A>.functor(): Functor.Ops<`List(_)`, A> =
    ListFunctor(unfix())


val kindsResult: List<Int> = listOf(1, 2, 3).fmap { it }*/
