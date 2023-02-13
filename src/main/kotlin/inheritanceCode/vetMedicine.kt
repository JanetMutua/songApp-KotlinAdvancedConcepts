package inheritanceCode

class Vet{
    fun giveMedicine(animal: Animal){
        println("${animal.makeNoise()}")
    }
}

fun main(args: Array<String>){
    val med1 = Vet()
    med1.giveMedicine(lionKing("two", "Bambi"))
    med1.giveMedicine(Hippo("twelve", "Baki"))
}