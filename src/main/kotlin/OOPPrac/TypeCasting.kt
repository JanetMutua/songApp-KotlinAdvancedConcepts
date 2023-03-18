package OOPPrac

fun main(args:Array<String>){

    typeCaSting()

    mySmartCast(8)
    mySmartCast("Jamie")
    mySmartCast(null)
}


fun typeCaSting(){
    val myByte: Byte = 10

//    var myInt = (Int) myByte
//    -> the above won't work since Kotlin does not allow automatic type casting

//    Instead we explicitly convert one type to another using in built functions
    val myInt : Int  = myByte.toInt()
    println(myInt)

//    .toIntOrNull()

    val myString = "A1456"
    val myIntValue: Int? = myString.toIntOrNull()

    println(myIntValue)
}


fun mySmartCast(any: Any?){

    if (any is Int){
        var i = any +5
        println("My Integer is $i")
    } else if (any is String){
        var myStringVal = "Hello" + any
        println("$myStringVal")
    } else if (any == null){
        println("My value is null")
    }

//    Using when

    when(any){
        is String -> println("It's a String")
        is Int -> println(any)
        else -> println("Probably Nothing to worry about!")
    }
//*********************************************************************************************
//    Unsafe casting using the as operator
//    Using the as? operator

    val myString  : String? = any as? String

    println(myString)
}