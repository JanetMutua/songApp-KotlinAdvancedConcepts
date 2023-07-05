package CourseraCodelabs

//companion object extensions
fun MyClass.Companion.printValue(){println(name)}

//generic extension functions
fun <T> MutableList<T>.printItems(indexPosition:Int){
    println(this[indexPosition])
}



//=====================================================================================
fun main(args:Array<String>){
    MyClass.printValue()
    val classOne = MyClass()
    classOne.faceValue.printItems(0)
}


//=====================================================================================
class MyClass{

    val faceValue: MutableList<String> = mutableListOf("Properties", "Crypto", "Savings")
    companion object{
        val name = "Myclass"
    }
}

