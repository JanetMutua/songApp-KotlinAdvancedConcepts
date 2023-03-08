package Generics


// --Behind the hood code for an MutableList
//interface MutableList<E> :List<E>, MutableCollection<E>{
 //   fun add(index:Int, element:E):Unit
//}

//==================================================================
//Generic types use cases

// ===============1. Create an instance of a generified class

val duckList: MutableList<String> = mutableListOf("Jan", "Loise")

// ===============2. Create a function that takes a generic type

fun myHouse(furnitureList:MutableList<String>){}

// ===============3. Create a function that returns a generic type

fun myHouse(furniture:String): MutableList<String>{
    return mutableListOf(furniture)
}