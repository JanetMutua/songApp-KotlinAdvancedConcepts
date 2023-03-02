package Collections

import kotlin.reflect.typeOf

fun main(args:Array<String>){
    val myFriends = setOf("Cynthia", "John", "Loise", "Cynthia")
    println(myFriends)

    similarityCheck()
}

fun similarityCheck(){
    val x = "Chair"
    val y = "Chair"
    val z = x

    println(x.hashCode())
    println(y.hashCode())
    println(z.hashCode())
    println("$y === $x")
    println("$y === $z")
}