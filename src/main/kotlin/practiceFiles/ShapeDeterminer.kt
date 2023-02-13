package practiceFiles
class shapeDeerminer(var width:Int, var length:Int){
    //var itemWidth = width

    val isSquare:Boolean
        get() = width == length

    val area: Int
        get() = width * length
}

fun main (args: Array<String>){
    var rectangleDimensions = arrayOf(shapeDeerminer(1,1), shapeDeerminer(1, 1),
        shapeDeerminer(1, 1), shapeDeerminer(1, 1))

    for (rectangle in 0..3){
        rectangleDimensions[rectangle].width = (rectangle +1)*3
        rectangleDimensions[rectangle].length = rectangle + 5

        println("Rectange $rectangle has an area of ${rectangleDimensions[rectangle].area}")
        println("It is ${if (rectangleDimensions[rectangle].isSquare) "" else "not"} a square")
    }


}