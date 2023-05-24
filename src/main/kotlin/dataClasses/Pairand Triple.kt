package dataClasses

fun main(args:Array<String>){
    pairAndTriple()
    orderMeals()
}

//enum classes concepts
enum class menuItems(val servingsize: Int){
    CHICKEN(3),
    RAMEN(7),
    SEAFOODBOIL(4),
    FRIEDRICE(2),
    BROCOLLI(3)
}

fun getServingSize(menuItem: menuItems){
    println("$menuItem of ${menuItem.servingsize} servings")
}

fun orderMeals(){
    val order1 = getServingSize(menuItems.CHICKEN)
    val order2 = getServingSize(menuItems.SEAFOODBOIL)

}



// pair and triple concepts
fun pairAndTriple(){
    //pair
    val myPair = Pair(56, "January")
    val secondPair = 23 to "December"

    //triple
    val myTriple = Triple(1, 12, 2023)
    println(myTriple.first)
    println(myTriple.second)
    println(myTriple.third)

    //destructuring
    val (date, month) = myPair
    val (date2, month2) = secondPair
}