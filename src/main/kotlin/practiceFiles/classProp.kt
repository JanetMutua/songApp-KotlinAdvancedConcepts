package practiceFiles

import kotlin.math.roundToInt

class Dog(weightValue: Int, breed:String, val fur:String, dogName:String){
    //works if you need to assign a simple value to it
    var breedType = breed.toUpperCase()
    init {
        println("this is an initializer block")
    }
    //cannot be used on properties of primitive types
    lateinit var age: String

   var weight = weightValue
       set(value) {
           if (value > 1)field = value
       }
    val weightInKgs :Int
        get() = (weight / 2.2).roundToInt()



    fun dogType(){
        println("My dog is a $breedType with $fur fur and weighs $weight and $weightInKgs in Kgs. He is $age years old.")
    }

    init {
        //initializing the variable name from the assigned property dogName
        var name = dogName
        println("This is the second initializer block with value $breedType and $dogName")
    }
}

fun main(args: Array<String>){
    var myDog = Dog(23, "Golden retriever", "straight", "Milwaukee")
    myDog.age = "three"
    //used a setter to restrict changes that are unethical
    myDog.weight = 0
    myDog.dogType()
}