package CourseraCodelabs

fun main(args:Array<String>){
    val listOfAccounts: List<BankTypes> = listOf(Debit(), Credit(), Checking())
    welcomeScreen(listOfAccounts)
}

//Step 1: creating the welcome screen
fun welcomeScreen(listOfAC: List<BankTypes> ){
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    var account = ""
    var userChoice = 0

    while (account == ""){
        println("Choose and option (1, 2 or 3)")
        val userInput = readln().toInt()

        when (userInput){
            1 -> account = "debit"
            2 -> account = "credit"
            3 -> account = "checking"
            else -> continue
        }
    }
    println("You have created a $account account type")

}

//setting up bank types
sealed class BankTypes

class Debit: BankTypes(){

    override fun toString(): String {
        return "Debit Account"
    }
}
class Credit: BankTypes(){

    override fun toString(): String {
        return "Credit Account"
    }
}
class Checking: BankTypes(){

    override fun toString(): String {
        return "Checking Account"
    }
}