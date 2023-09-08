fun main(){

    val smallCircle = Circle(5.2)

    val radiusOfSmallCircle = smallCircle.radius
    //val piFromSmallCircle = smallCircle.pi

    val circumferenceOfSmallCircle: Double = smallCircle.circumferenc()
    val areaOfSmallCircle = smallCircle.area()
    val diameterOfSmallCircle = smallCircle.diameter()
}

class Circle(var radius: Double){
   private val pi: Double = 3.14

    fun circumferenc() = 2 * pi * radius
    fun area() = pi * radius * radius
    fun diameter() = 2 * radius
}