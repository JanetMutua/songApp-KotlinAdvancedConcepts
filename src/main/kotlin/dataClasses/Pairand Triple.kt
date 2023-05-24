package dataClasses

fun main(args:Array<String>){
    //pair
    val myPair = Pair(56, "January")
    val secondPair = 23 to "December"

    //triple
    val myTriple = Triple(1, 12, 2023)
    println(myTriple.first)
    println(myTriple.second)
    println(myTriple.third)

    //destructuring
    val (date, month) = myPair
    val (date2, month2) = secondPair
}