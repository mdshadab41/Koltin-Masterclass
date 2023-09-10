fun main(){

      fun String.singleQuoted() = "$this"
//
//   val title = "The Robots from Planet X3"

    //val quotedTitle = title.singleQuoted()
    //val loudTitle = title.uppercase()
    //singleQuoted(title.removePrefix("The ")).uppercase()

//    val newTitle = title
//        .removePrefix("The ")
//        .singleQuoted()
//        .uppercase()
//
//    println(newTitle)

//    val fido = Dog()
//    fido.play()

    val title: String? = null
    val newTitle = title?.singleQuoted()


}
//class Dog {
//    fun speak() {
//        println("BARK!")
//    }
//    fun play(){
//        speak()
//    }
//}