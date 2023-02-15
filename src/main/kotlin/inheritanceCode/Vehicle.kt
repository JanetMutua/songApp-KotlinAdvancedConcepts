package inheritanceCode

class Vehicle : Roamable{
    override fun roam() {
        println("The engine is roaring like this: $roamName")
    }

    //override var roamName = "Grrrrrrr!"
}


fun main(args: Array<String>){
    val car1 = Vehicle()
    println(car1.roam())
}