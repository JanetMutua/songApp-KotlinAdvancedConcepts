package inheritanceCode

class Hippo(var teethCount:String, var animalName:String): Animal(teethCount, animalName){

    //overriding the superclass-properties
    //overrriding properties defined using val

    
    override val image = "Jpg"
    override val food = "Grass"

    //abstract classes have to be overridden hence we use don't use an initializer block here although it is a var
    override var habitat = "water"


    //overriding a property defined using var using an initializer block
    //init {
    //   habitat = "water"
    //}

    override fun makeNoise() {
        println("Grunt!!")
    }

    override fun eat() {
        println("Grass")
    }

    final override fun roam() {
        println("Swim")
    }

}