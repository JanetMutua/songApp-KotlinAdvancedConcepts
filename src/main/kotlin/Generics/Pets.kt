package Generics


//defining the Pet hierarchy

abstract class Pet(val name:String)

class Cats(name:String) : Pet(name)

class Dogs(name: String): Pet(name)

class Fish(name:String): Pet(name)


// Defining the contest class

class Contest<T: Pet>{
    fun addSCore(){}

    fun getWinners(){}
}