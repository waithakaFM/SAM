package rsk.kts

import rsk.java.Created
import rsk.java.User

fun main(args: Array<String>) {
    var user = User("Franko")
    var count = 0

//    used SAM constructor to create eventListener
    var eventListener = Created { println("User $it has been created: ${++count} times") }

//    from a kotlin lambda into java anonymous object
    user.create { println("User $it has been created: ${++count} times") }

//    reusing the object -> from count value we see each time we call it, it creates a new instance
    user.create { println("User $it has been created: ${++count} times") }

//    add my event listener
    user.create(eventListener)

}