package Collections

fun main(args:Array<String>){
    usableMethods()

}

fun usableMethods(){
    var nullableArray : Array<String?> = arrayOfNulls(4)

//    Lists

    var myRecipe = listOf("Bread", "Eggs", "Black pepper")

    println(myRecipe.get(2))

    println(myRecipe.indexOf("Eggs"))

    var myChangeableRecipe = mutableListOf("Potatoes", "Garlic", "Carrots")
    myChangeableRecipe.add("Onions")

    if (myChangeableRecipe.contains("Garlic")){
        myChangeableRecipe.remove("Garlic")
        myChangeableRecipe.add("Beef")
        myChangeableRecipe.removeAt(1)
        println(myChangeableRecipe)
    }
}

