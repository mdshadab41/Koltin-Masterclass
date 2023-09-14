
abstract class Animal{

    abstract val animalType: String
   abstract fun makeSound()

}

abstract class WildAnimal: Animal()


open class DomesticAnimal(override val animalType: String): Animal(){
    override fun makeSound() {
        println("Make DomesticAnimal sound")

    }
}


class Tiger(override val animalType: String): WildAnimal(){
    override fun makeSound() {
        println("${this.animalType} Make roaring sound")

    }
}

class Cat(override val animalType: String): DomesticAnimal(animalType){
    override fun makeSound() {
        println("Make Cat sound")

    }

}

class Dog111(override val animalType: String): DomesticAnimal(animalType){
    override fun makeSound() {
        println("Make bark sound")

    }
}


fun main(){

    val animal:Animal = Tiger("Tiger")
    animal.makeSound()

}