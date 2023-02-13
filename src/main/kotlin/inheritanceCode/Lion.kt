package inheritanceCode

class lionKing( noTeeth:String, nameType:String): Animal(noTeeth, nameType){
    override val image = "myImage"
    override val food = "meat"

    init {
        habitat = "forest"
    }

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


