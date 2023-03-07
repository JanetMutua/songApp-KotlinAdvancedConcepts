package Collections

fun main(args:Array<String>){

    //makeMaps()
    designMutableMap()


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


fun designMutableMap(){

    val recipe1  = Recipes("Chicken")
    val recipe2 = Recipes("Pork-ribs")
    val recipe3 = Recipes("Fish-fillet")
    val recipe4 = Recipes("Beef")
    val recipe5 = Recipes("Mutton")

    val recipe6 = Recipes("Kiwi beans")
    val recipe7 = Recipes("Carrots")
    val recipe8 = Recipes("Bacon")

    val sideMap = mapOf(
        "recipe_6" to recipe6,
        "recipe_7" to recipe7,
        "recipe_8" to recipe8
    )

    val myFoodMutableMap = mutableMapOf(
        "recipe_1" to recipe1,
        "recipe_2" to recipe2,
        "recipe_3" to recipe3
    )

    myFoodMutableMap.put("recipe_4", recipe4 )
//    Adding a key/value pair similar to one in the Mutable map; the value gets replaced
    myFoodMutableMap.put("recipe_3", recipe5 )
//    putAll()

    myFoodMutableMap.putAll(sideMap)

    println(myFoodMutableMap.getValue("recipe_3"))

    println(myFoodMutableMap.toString())

//    Deleting entries in a map


    println(myFoodMutableMap.remove("recipe_3", recipe5))
    println(myFoodMutableMap.toString())


//    copying in Maps and Mutable maps

    //read only version

    val newFoodMap = myFoodMutableMap.toMap()

    //copying into a list

    val newFoodList = myFoodMutableMap.toList()

    println(newFoodList)

//    Using entries to make sets

    val newEntriesSet = myFoodMutableMap.entries

    val newKeySet = myFoodMutableMap.keys
    val newValueSet = myFoodMutableMap.values

    println("Entries: $newEntriesSet, Keys: $newKeySet, Values: $newValueSet")

//    copies values into a Set
    val checkSet = myFoodMutableMap.values.toSet()
    println(checkSet)

    if (newValueSet.size > myFoodMutableMap.values.toSet().size){
        println("Has duplicates")
    }else{
        println("Has no duplicates")
    }



}