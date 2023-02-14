package inheritanceCode

class lionKing( noTeeth:String, nameType:String): Animal(noTeeth, nameType){
    override val image = "myImage"
    override val food = "meat"
    //abstract classes have to be overridden hence we use don't use an initializer block here although it is a var
    override var habitat = "forest"


    //overriding a property defined using var using an initializer block
    //init {
    //    habitat = "forest"
    //}

    override fun makeNoise() {
        println("Roars!")
    }

    override fun eat(){
        println("Meat")
    }

    final override fun roam() {
        println("Run")
    }


}


fun main(args: Array<String>){
    var lion1 = lionKing("Twenty", "Bosco")

    println("This is a ${lion1.name} and he is this hungry ${lion1.hunger}.")
    println("He ${lion1.makeNoise()} and eats ${lion1.eat()}")
}


