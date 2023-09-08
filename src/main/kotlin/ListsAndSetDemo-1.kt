fun main(){

//    var booksToRead = listOf<String>(
//        "Tea with Agatha",
//        "Mystery on First Avenue",
//        "The Ravine of sorrows",
//        "Among the Aliens",
//        "The Kingsford Manor Mystery"
//    )
//
//    booksToRead = booksToRead + "Beyond the Expanse"
//    booksToRead = booksToRead - "Among the Aliens"
//    println(booksToRead)

    val booksToRead: MutableList<String> = mutableListOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery"
    )
//
//    booksToRead.add("Beyond the Expanse")
//    booksToRead.remove("Among the Aliens")
// val firstBook = booksToRead[0]
//    println(booksToRead[0])
//    println(booksToRead[1])
//    println(booksToRead[2])
//    println(booksToRead[3])
//    println(booksToRead[4])

//    booksToRead.forEach { element ->
//        println(element)
//    }
//    booksToRead.forEach { println(it) }
//
//    val sortableTitle = "The kingsford Manor Mystery".removePrefix("The")
//     println(sortableTitle)

//    val sortableTitles: MutableList = mutableListOf()
//    booksToRead.forEach { title ->
//        sortableTitles.
//    }
    val sortableTitles = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
        .filter { title -> title.contains("Mystery") }
    println(sortableTitles)

}