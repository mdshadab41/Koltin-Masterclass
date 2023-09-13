


//val pi = 3.14
//fun main() {
//
//}



//}
//class Circle1(var radius: Double) {
//    //val diameter = radius * 2
//
//    fun circumference(): Double {
//        fun diameter() = radius *2
//        val result = pi * diameter()
//        return result
//    }
//}
//    fun createCircles(radii: List<Double>): List<Circle1> {
//        return radii.map { radius ->
//            Circle1(radius)
//        }
//    }
    //DECLARATION SCOPES
//    class Circle(val radius: Double){
//        val circumference = pi * diameter()
//        fun diameter() = radius * 2
//
//
//}



//NESTED SCOPE AND VISIBILITY
//val pi = 3.14
//
//fun main(){
//    val radii = listOf(1.0,2.0,3.0)
//
//    class Circle(
//        val radius:Double
//    ){
//        fun circumference(): Double{
//            val multiplier = 2.0
//            val diameter = radius*multiplier
//            return multiplier*pi*radius
//        }
//        val area = pi * radius*radius
//    }
//    val area = radii.map {
//        Circle(it).area
//    }
//}

//--------------------SCOPE FUNCTIONS--------------------------------

//fun main(){
////    address.street1 = "9801 Maple Ave"
////    address.street2 = "Apartment 255"
////    address.city = "Rocksteady"
////    address.state = "IN"
////    address.postalCode = "12345"
////    with(address) {
////        street1 = "9801 Maple Ave"
////        street2 = "Apartment 255"
////        city = "Rocksteady"
////        state = "IN"
////        postalCode = "12345"
////    }
////
//
//}
//fun main(){
//    //2.run() -> EExtension Function
//    address.run{
//        street1 = "9801 Maple Ave"
//        street2 = "Apartement 255"
//        city = "Rocksteady"
//        state = "IN"
//        postalCode = "12345"
//    }
//}

//3. let()
//
//val title = "The Robots from Planet x3"
//val newTitle = title
//    .removePrefix("The ")
//    .let { it}
//    .uppercase()

//4. also()
//val title = "The Robots from Planet x3"
//val newTitle = title
//    .removePrefix("The ")
//    .let { println(it)}
//    .singleQuoted()
//    .uppercase()

//5.apply()
val title = "The Robots from Planet x3"
val newTitle = title
    .removePrefix("The ")
    .apply{ println(this)}
    //.singleQuoted()
    .uppercase()

