package Codelabs

fun main(args: Array<String>){
    implementation()
}
open class FoodOrder(val name: String, val price:Int){

}

class Vegetables(vararg val toppings:String): FoodOrder("Vegetables", 12){
    override fun toString(): String {

        if (toppings.isEmpty()){
            return "$name Chef's choice"
        }else{
            return name + " made of: " + toppings.joinToString()
        }

    }
}

class ChickenBreast: FoodOrder("Chicken", 210){

//    overriding a toString() method to return a meaningful result
    override fun toString(): String {
        return name

    }
}

class Orders(val orderNo:Int){
    private val orderItems = mutableListOf<FoodOrder>()

    fun addItem(foodItem:FoodOrder):Orders{
        orderItems.add(foodItem)
        return this
    }

    fun addAllItems(listFoodItems:List<FoodOrder>):Orders{
        orderItems.addAll(listFoodItems)
        return this
    }

    fun printResult(){
        println("Order #$orderNo")
        var total = 0
        for (item in orderItems){
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total : $$total")
    }
}

fun implementation(){
    val ordersList = mutableListOf<Orders>()

//    chaining{Builder pattern}
    ordersList.add(
        Orders(1).addItem(ChickenBreast())
    )

//    chaining{Builder pattern}
    val myOrder2 = Orders(2).addItem(Vegetables("broccoli", "mayoinaisse", "spinach", "nuts"))
    ordersList.add(myOrder2)

//    chaining{Builder pattern}
    val myOrder3 = Orders(3).addItem(ChickenBreast()).addItem(Vegetables("Curry", "Kales"))
    ordersList.add(myOrder3)

    for (order in ordersList){
        println(order.printResult())
        println()
    }

}



