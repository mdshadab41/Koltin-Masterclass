//enum class
fun main(){

//    val nameOfSchnauzer: String = "Shadow"
//
//    val breedOfSchnauzer: String = "Mini"
//
//    if (breedOfSchnauzer == "Miniature"){
//        // ... do something
//    }

  //  val breed: SchnauzerBreed = SchnauzerBreed()//it gives error

    //val breed: SchnauzerBreed = SchnauzerBreed.GIANT
    //val breed: SchnauzerBreed = SchnauzerBreed.MINI //Error

//    fun describe(breed: SchnauzerBreed) = when(breed){
//        SchnauzerBreed.MINIATURE -> "Small"
//        SchnauzerBreed.STANDARD -> "Medium"
//        //SchnauzerBreed.GIANT -> "Large"
//        else                    -> "Unknown"
//    }

    fun describe(breed: SchnauzerBreed){
        println(breed.name)
        println(breed.height)
    }
    println(describe(SchnauzerBreed.STANDARD))
//    println(SchnauzerBreed.MINIATURE.height)
//    println(SchnauzerBreed.STANDARD.family)
//    println(SchnauzerBreed.STANDARD.isShortetThan(40))
}

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33), //enum constants
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"

    fun isShortetThan(centimeters: Int) = height < centimeters
}



