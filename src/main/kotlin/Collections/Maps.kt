package Collections

fun main(args:Array<String>){

    makeMaps()
}

data class Recipes(val ingredient1:String){

}
fun makeMaps(){
    val r1  = Recipes("Chicken")
    val r2 = Recipes("Pork-ribs")
    val r3 = Recipes("Fish-fillet")


    val myFoodMap = mapOf(
        "recipe_one" to r1,
        "recipe_two" to r2,
        "recipe_three" to r3
    )

    println("My map contains recipe_one : ${myFoodMap.containsKey("recipe_one")}")
    println("My map contains Chicken : ${myFoodMap.containsValue(r1)}")

//    get and getValue

    println("Find chicken: ${myFoodMap.getValue("recipe_one")}")
    println("Find fish fillet: ${myFoodMap.get("recipe_three")}")

    for (recipe in myFoodMap){
        println("I am making ${recipe.key}")
    }

    for ((key, value) in myFoodMap){
        println("This $key holds $value")
    }
}