package prelude

import arrow.Extension

interface Repository<A> {
    val entity: A
    fun save(): Unit =
        println("saved $entity")
}

data class User(val name: String)

class UserRepository(override val entity: User) : Repository<User>

@Extension
//@Coercion
fun User.repository(): Repository<User> =
    UserRepository(this)

fun savedUser() = User("Jane").save()

fun main(args: Array<String>) {
    println(savedUser())
    //val repo: Repository<User> = User("TestUser")
    //println(repo.save())
}