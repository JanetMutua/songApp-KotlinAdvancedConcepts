package CourseraCodelabs

data class Students(var id:Int, var name:String, var grade: Double){
}

var students = listOf<Students>(
    Students(1234,"Jane" ,20.0),
    Students(5642, "Joe", 45.5),
    Students(6782, "Cameroon", 25.7),
    Students(6712, "Liam", 34.5),
    Students(9012, "Laban", 43.1)
)

fun main(args:Array<String>) {
    //step 2
    println("Please search using Id:")
    val id = readln().toInt()
    println(findStudentById(id))
    println("Please search using Name:")
    val name = readln()
    println(findStudentsByName(name) ?: "Student not found")

    val myList = listOf(23, 45)
    println(myList + 23)

}

fun findStudentById(id: Int): Students {
    return students.find { it.id == id }!!
}

fun findStudentsByName(name: String): Students?{
    return students.find { it.name.lowercase() == name.lowercase() }

}

