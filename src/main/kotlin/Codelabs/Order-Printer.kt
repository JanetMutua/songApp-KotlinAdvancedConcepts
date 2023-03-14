package Codelabs

fun main(args: Array<String>){
    implementPrinter()
}

open class MenuItem(val foodName:String, val foodPrice:Int){

}

class ChickenTenders(vararg var cookingIntensity: String): MenuItem("Chicken Tenders", 12){

    override fun toString(): String {

        if (cookingIntensity.isEmpty()){
            return "$foodName Chef's Special"
        }else {
            return "$foodName: " + cookingIntensity.joinToString()
        }
    }
}

class VegetableSoup(vararg var toppings:String):MenuItem("Veggie-Soup", 5){
    override fun toString(): String {

        if (toppings.isEmpty()){
            return "$foodName Chef's Special"
        } else{
            return "$foodName with: " + toppings.joinToString()
        }

    }
}

class BeefBrisket: MenuItem("Beef Brisket", 49){
    override fun toString(): String {
        return foodName
    }
}

class ClientOrders(var orderNo: Int){
    var orderItems = mutableListOf<MenuItem>()

    fun addFoodItem(foodItem:MenuItem): ClientOrders{
        orderItems.add(foodItem)
        return this
    }

    fun addManyFoodItems(foodItems: List<MenuItem>):ClientOrders{
        orderItems.addAll(foodItems)
        return this
    }

    fun printOrders(){

        println("Order No: #$orderNo")
        var totalPrice = 0
        for (order in orderItems){
            println("$order costs ${order.foodPrice}")
            totalPrice += order.foodPrice
        }

        println("Your order costs $totalPrice")
    }
}

fun implementPrinter(){

    var TotalOrderList = mutableListOf<ClientOrders>()

//    chaining
    TotalOrderList.add(ClientOrders(1).addFoodItem(BeefBrisket()))

    TotalOrderList.add(ClientOrders(2).addFoodItem(ChickenTenders("Medium Rare", "Crisp baked")).addFoodItem(BeefBrisket()).addFoodItem(VegetableSoup()))

    for (orderItem in TotalOrderList){
        orderItem.printOrders()
        println()
    }
}