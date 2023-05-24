package inheritanceCode

abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice() {
        abstractMethod() // You can use abstract methods inside the class, because it is assumed they
        // will be overridden in the child class.
        abstractMethod()
    }
}

class SomeRegularClass : SomeAbstractClass() {
    override fun abstractMethod() {
        println("Calling abstract method")
    }
}

fun main() {
    val regular = SomeRegularClass()
    regular.abstractMethod() // Calling abstract method
    regular.callAbstractTwice()
    // Calling abstract method
    // Calling abstract method
}