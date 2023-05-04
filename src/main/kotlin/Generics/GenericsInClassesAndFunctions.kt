package Generics

class myBox<T>{
    var myItem: T? = null

    fun put(myItem: T?){
        this.myItem = myItem
    }

    fun retrieve(): T?{
        return myItem
    }

    fun isEmpty(): Boolean{
        return myItem == null
    }
}


fun main(args: Array<String>) {
    var instanceOne = myBox<String>()
    instanceOne.put("Lavender")
    instanceOne.isEmpty()

    //using scope functions in code
    val hasName = instanceOne.let {
        it.myItem == "Rose"
    }

    val hasItem = instanceOne.run {
        this.myItem != null
    }

    if (hasName == true) {
        println("This is so cool!!")
    } else if (hasItem == true){
        println("We loaded anyway!")
    }else {
        println("Nada!")
    }



}
