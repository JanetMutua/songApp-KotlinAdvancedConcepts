package dataClasses

data class Recipe(val title:String, val isVegetarian:Boolean){
    fun checkStatus(){
        println("Is $title a vegetarian meal? $isVegetarian")
    }
}


fun main(args : Array<String>){
    val food1 = Recipe("Chicken tikka", false)
    val food2 = Recipe("Chicken tikka", false)
    val food3 = food1.copy(isVegetarian = true)
    val food4 = food1

    println("food1 hashcode is: ${food1.hashCode()} and food2 hashcode is: ${food2.hashCode()}")
    println(" food 3 hashcode is ${food3.hashCode()}")
    println(" food 4 hashcode is ${food4.hashCode()} and food1 is ${food1.hashCode()}")
    println(" food 1 tostring is: ${food1.toString()}")
    println("food1 === food2? = ${food1 === food2}")
    println("food4 === food1? = ${food4 === food1}")
    println("food1 == food2? = ${food1 == food2}")

    //destructuring
    println(food1.component1())

    //destructuring in turns
    val (title, vegetarian) = food3
    println("$title = $vegetarian")


}