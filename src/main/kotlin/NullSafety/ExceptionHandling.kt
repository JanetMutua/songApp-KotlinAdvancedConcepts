package NullSafety

import java.lang.NumberFormatException
import kotlin.IllegalArgumentException

fun main(args:Array<String>){
    myFunction("bee")

    try {
        setWorkRate(115)
    }catch (e: IllegalArgumentException){
        println(e.message)

    }

    tryAsExpression("ABC")

}


fun myFunction(str:String){
    try {
        var x = str.toInt()
        println("Transaction successful!")
    }catch (e : NumberFormatException){
        println("Bummer!")
    }finally {
        println("Try again tomorrow!")
    }

}


fun setWorkRate(rates:Int){
    if (rates !in 0..100){
        throw IllegalArgumentException("Percentage not in range 0..100. Your input is $rates")
    }

}

fun tryAsExpression(entry:String){
    //finally block does not affect the return value
    var myEntry = try { entry.toString()} catch (e:NumberFormatException){null}

    println(myEntry)
}

fun fail(): Nothing{
    throw IllegalAccessError()
}