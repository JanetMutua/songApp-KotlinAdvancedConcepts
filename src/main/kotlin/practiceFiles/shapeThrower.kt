package practiceFiles
class shapeDimensionFinder(var length:Int, var width:Int){

    //using getters instead of a function
    //getters use val setters use var

    val isSquare: Boolean
        get() = length == width

    val area: Int
        get() = length * width

}

fun main (args: Array<String>){
    var shapeDimensions = arrayOf(shapeDimensionFinder(1, 1), shapeDimensionFinder(1, 1),
    shapeDimensionFinder(1, 1), shapeDimensionFinder(1, 1))

    for ( shapeIndex in 0..3){
        shapeDimensions[shapeIndex].width = (shapeIndex + 1) * 3
        shapeDimensions[shapeIndex].length = shapeIndex + 5

        println("The area of shape $shapeIndex is ${shapeDimensions[shapeIndex].area}")
        println("The figure is ${if (shapeDimensions[shapeIndex].isSquare) "" else "Not"} a square")
    }

}