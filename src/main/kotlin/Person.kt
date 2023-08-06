class Person {

    var firstName: String? = null
    var lastName: String? = null

   constructor() {
       println("This is primary constructor")
    }

    constructor(sampleParameter: Int): this(){
       println("This is Secondary parameter")
   }

    constructor(sampleParameter: String): this(10){
        println("This is terniary parameter")
    }

    init {
        println("This is first init block")
    }
    init {
        println("This is second init block")
    }
    init {
        println("This is  third block")
    }



}

