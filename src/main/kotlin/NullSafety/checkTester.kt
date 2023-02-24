package NullSafety

class checkTester (var catName:String? = ""){
    fun Meow(){
        println("Meow!")}
}

class Wolf(val name:String?){
    fun eat(){
        println("I eat meat!")
    }
}

fun wolfDiary():Wolf?{
    return Wolf("Jaguar")
}

fun main(args:Array<String>){
    val myCats = arrayOf(
        checkTester("Rosie"),
       null,
        checkTester("Misty")
    )

    for (cat in myCats){
        cat?.let{
            print("${it.catName}:")
            it.Meow()
        }

    }

    //holds the return value of the wolf diary function
    // this function returns an instance of the Wolf class

    //Implementation 1:
    //var myWolf = wolfDiary()
    //myWolf?.eat()

    //Implementation 2:

    wolfDiary()?.let {
        it.eat()
    }


    //ELvis operator

    wolfDiary()?.let { it.eat() } ?: -1
    //==========================================================================****
    //USING THROW IN EXCEPTION HANDLING AS AN EXPRESSION

    var newWolfDiary = wolfDiary()?.name ?: throw IllegalArgumentException()

    //Not null assertion operator
    //var water = null
    //var z = water!!

}