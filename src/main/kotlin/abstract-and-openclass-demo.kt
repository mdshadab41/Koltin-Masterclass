fun main(){

//    val myCar = Car()
//    myCar.accelerate()
    val clunker = Clunker(0.25)
    clunker.accelerate()

    val car = SimpleCar(1.2)
    car.accelerate()

    val myCar = Car()

}

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0 ; private set

    //protected abstract fun makeEngineSound()
    protected open fun makeEngineSound() = println("Vrrrr.....")


    fun accelerate(){
        speed += acceleration
        makeEngineSound()
    }
}

class Clunker(acceleration: Double): Car(acceleration){
    override fun makeEngineSound() {
        println("putt-putt-putt")
       // speed = 9999.0

    }


}

class SimpleCar(acceleration: Double): Car(acceleration)

class MuscleCar: Car(5.0){
    override fun makeEngineSound() = when{
        speed < 10.0 -> println("Vrooooom")
        speed < 20.0 -> println("Vrooooooooom")
        else         -> println("Vrooooooooooooooooooom!")

    }
}