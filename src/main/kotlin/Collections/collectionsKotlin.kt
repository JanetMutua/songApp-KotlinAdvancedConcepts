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

//        sorting and reversing

        myChangeableRecipe.sort()
        println(myChangeableRecipe)

        myChangeableRecipe.reverse()
        println(myChangeableRecipe)

        myChangeableRecipe.shuffle()
        println(myChangeableRecipe)

        myChangeableRecipe.addAll(myRecipe)
        println(myChangeableRecipe)

        myChangeableRecipe.removeAll(myRecipe)
        println(myChangeableRecipe)

        myChangeableRecipe.addAll(myRecipe)
        myChangeableRecipe.retainAll(myRecipe)
        println(myChangeableRecipe)

//        copying a list: Both mutable and simple lists
//        returns a list hence its not mutable

        val kitchenNosa = myChangeableRecipe.toList()

        val sortdKind = myChangeableRecipe.sorted()
        val shuffledKind = myChangeableRecipe.shuffled()
        val newMutableList = myChangeableRecipe.toMutableList()

        newMutableList.set(newMutableList.indexOf("Bread"), "Bacon")

        println(sortdKind)
        println(shuffledKind)
        println(newMutableList)
    }

}

