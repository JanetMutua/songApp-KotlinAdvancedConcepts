package inheritanceCode

class Hippo(var teethCount:String, var animalName:String): Animal(teethCount, animalName){

    //overriding the superclass-properties
    //overrriding properties defined using val

    
    override val image = "Jpg"
    override val food = "Grass"

    //overriding a property defined using var
    init {
        habitat = "water"
    }

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