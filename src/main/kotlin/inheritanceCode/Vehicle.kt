package inheritanceCode

class Vehicle : Roamable{
    override fun roam() {
        println("The engine is roaring like this: $roamName")
    }

    //override var roamName = "Grrrrrrr!"
}


fun main(args: Array<String>){
    //polymorphism
    val listRoamables = arrayOf(Vehicle(), Hippo("twenty", "Hippo"), lionKing("sixteen", "Lion")
    )

    for(item in listRoamables){
        println(item.roam())

        if (item is Animal){
            item.eat()
        }

        var animalType = if (item is Animal)"is Animal" else "is not animal"
        println(animalType)


        var noiseSounds = when (item){
            is Hippo -> println(item.makeNoise())
            is lionKing -> println(item.makeNoise())
            else -> println(item.roam())
        }

        println(noiseSounds)
    }


}