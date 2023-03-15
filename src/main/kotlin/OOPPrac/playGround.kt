package OOPPrac

fun main(args:Array<String>){
    nullableTypes()
}


fun nullableTypes(){

    var myChar: Char? = "abfq".lastOrNull()
    println(myChar)

//    using the sure operator if we are certain that an object is not null

    var myActual: Char = "abc".lastOrNull()!!
    println(myActual)
}