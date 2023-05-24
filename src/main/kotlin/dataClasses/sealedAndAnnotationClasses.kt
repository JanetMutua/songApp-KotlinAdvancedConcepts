package dataClasses

fun main(args:Array<String>){
    println(checkEmployees(Manager("John")))

}


// example of a sealed class
sealed class Results

class Success : Results()
class Failure : Results()


//example 2 of a sealed class

sealed class Roles
class Manager(val name:String): Roles()
class CEO: Roles()
class Technician(val name:String):Roles()

//creating an annotation class
// cool example of an annotation:
//@Throws(ArithmeticException::class)
annotation class IncompleteFunction(val message:String)

@IncompleteFunction("This should be completed later")
fun checkEmployees(role:Roles):String{
    return when (role) {
        is CEO -> "The Boss"
        is Manager -> "Manager is ${role.name}"
        is Technician -> "Technician is ${role.name}"
    }


}