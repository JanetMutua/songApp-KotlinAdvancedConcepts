package LambdasAndHOF

fun main (args:Array<String>){

   tryLambdaTricks()

    definingLambdaType()
}


fun definingLambdaType(){

//    remove the Int declaration on the actual parameter x
//    since the type has already been inferred.

    val add: (Int, Int) -> Int = {x, y -> x+y}
    val greeting: ()-> String = {"Hi baby!"}
//    using Unit as the return type

    val greetings : ()-> Unit = { println("Hi Anna!")}
    val x = {"Pow!"}
    println("Declaring Lambda types explicitly")
    println(add(3, 6))
    println(greeting())
    greetings()
    println(x())
}







fun tryLambdaTricks(){
    val myLambda = {x:Int -> x + 5}

//    executing a lambda by explicitly invoking it!!

    val resultHolder = myLambda.invoke(8)

//    shortcut way of invoking a lambda

    val result = myLambda(8)
    println(resultHolder)
    println("This is my shortcut $result")
}
