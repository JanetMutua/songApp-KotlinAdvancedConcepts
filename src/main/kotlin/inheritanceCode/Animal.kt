package inheritanceCode

abstract class Animal( var noTeeth:String, var name:String){
    abstract val image: String
    abstract val food : String
    abstract var habitat : String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    abstract fun roam()

    fun sleep(){
        println("Sleeping")
    }
}