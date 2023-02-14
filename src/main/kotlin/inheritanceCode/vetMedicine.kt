package inheritanceCode

class Vet{
    fun giveMedicine(animal: Animal){

        //using polymorphism
        //inherits the methods and properties of the Animal supertype
        println("${animal.makeNoise()}")
    }
}

fun main(args: Array<String>){
    val med1 = Vet()
    med1.giveMedicine(lionKing("two", "Bambi"))
    med1.giveMedicine(Hippo("twelve", "Baki"))
}