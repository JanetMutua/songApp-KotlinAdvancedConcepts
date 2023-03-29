package Collections

import kotlin.reflect.typeOf

fun main(args:Array<String>){
    val myFriends = setOf("Cynthia", "John", "Loise", "Cynthia")
    println(myFriends)

    similarityCheck()
    mutableSetFunc()
}

data class Furniture(val type:String, val material:String)
fun similarityCheck(){
    val x = Furniture("Chair", "wood")
    val y = Furniture("Chair", "wood")
    val z = x

    println(x.hashCode())
    println(y.hashCode())
    println(z.hashCode())
    println("${y === x}")
    println("${y == x}")
    println("${y === z}")
    println("${z===x}")
}

fun mutableSetFunc(){
    val ySet = mutableSetOf("Loise", "Crisi", "John", "James")
//    copying to a different set
    val xSet = ySet.toSet()
    println("mutable set section")
    ySet.add("Karey")
//    copying to a list
    val myNewList = ySet.toMutableList()
    myNewList.add("Loise")
    println("my list is : $myNewList")

    if (myNewList.size > myNewList.toSet().size){
        println("Check for duplicates")
    }
    println(ySet)
    println(xSet)

    val myNewArray = ySet.toTypedArray()
    println(myNewArray)
}