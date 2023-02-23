package NullSafety

class nullables {

    //nullable arrays
    val myArray: Array<String?> = arrayOf("New Zealand", "Paris", null)
    var myString: String? = null
    var z: Any? = Any()

    fun checkNull(){
        println("is not null")
    }
}

class confirmNullValue{
    var value:nullables? = nullables()
}

fun main(args:Array<String>){
    var nullChecker: confirmNullValue? = confirmNullValue()

    //using safe calls to access properties and functions in an instance that is nullable
    //safe call chain
    nullChecker?.value?.checkNull()

    var checkArray = nullables()
    for (item in checkArray.myArray){
        item?.let {
            println(it)
        }
    }

}