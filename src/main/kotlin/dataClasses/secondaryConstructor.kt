package dataClasses

class secondaryConstructor (val size: Int, val isValid:Boolean){

    //defining a secondary constructor by prefixing it with a constructor keyword

    constructor(is_valid:Boolean) : this(0, is_valid){
        //implementation done if the secondary constructor is called
    }
}

fun main(args: Array<String>){
    val testOne = secondaryConstructor(false)
}