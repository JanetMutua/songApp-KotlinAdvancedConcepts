package inheritanceCode

open class Animal( var noTeeth:String, var name:String){
    open val image = ""
    open val food = ""
    open var habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("Making noise")
    }

    open fun eat(){
        println("Eating")
    }

    open fun roam(){
        println("Roaming")
    }

    fun sleep(){
        println("Sleeping")
    }
}