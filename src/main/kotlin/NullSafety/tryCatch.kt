package NullSafety

class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun main() {
    try {
        someFunction()
        println("Will not be printed")
    } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
    }
}