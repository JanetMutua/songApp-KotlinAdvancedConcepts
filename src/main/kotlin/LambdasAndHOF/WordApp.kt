package LambdasAndHOF

fun main(args:Array<String>){

    var wordAppOne = MyWordApp(
        listOf(
            "apples", "apricots", "animals","bees", "blueberry", "banshee", "bontana",
            "crew", "caramel", "connoiseur", "dandellions", "dog", "drew", "dumbell",
            "estate", "escrow", "envision"
        ))

    wordAppOne.randomizePicker()

}

class MyWordApp(private val letterList:List<String>) {

    fun randomizePicker() {

        val letterFinder = listOf<String>("a", "b", "c", "d","e")
        val randomLetter = letterFinder.random()

        val pickedList = letterList.filter {
            it.startsWith(randomLetter, ignoreCase = true)}
            .shuffled()
            .take(2)
            .sorted()

        println(pickedList)

    }

}