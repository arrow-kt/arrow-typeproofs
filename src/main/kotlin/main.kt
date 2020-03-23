package consumer

val aaaaaa = "@aaaaaa"

fun main(args: Array<String>) {
    TwitterHandle("@eeee")
    // TwitterHandle("@twitter")
    // TwitterHandle("@admin")

    //val willNotCompile = TwitterHandle(aaaaaa)
    val result: TwitterHandle? = aaaaaa
    println(result)
}
