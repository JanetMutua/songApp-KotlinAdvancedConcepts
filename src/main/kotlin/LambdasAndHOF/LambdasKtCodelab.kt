package LambdasAndHOF

fun main(args:Array<String>){

    //lambdaInAction()

    higherOrderFunctionPrac()
}


fun higherOrderFunctionPrac(){

    val peopleNames = listOf("Fred", "Loise", "Andie", "Carlos")

    println(peopleNames.sortedWith{str1:String, str2:String -> str1.length - str2.length})


}







fun lambdaInAction(){

    var tripleValue: (Int) -> Int = {a -> a * 6}

    var herNameEntity : (String, String) -> List<String> = {
        firstName, secondName -> listOf(firstName, secondName)
    }
//  using the "it" in a function with one parameter

    var dateFinder: (Int)-> Int = {it * 4}

    //using function pointers
    var wordMagnifier : (String)-> String = String::uppercase

//   =============== printing section==================================

    println(tripleValue(7))
    println(herNameEntity("Janelle", "Monae"))
    println(dateFinder(56))
    println(wordMagnifier("lola"))
}