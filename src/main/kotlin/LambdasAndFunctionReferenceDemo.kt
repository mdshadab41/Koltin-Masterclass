fun main(){

//    val total = calculateTotalWithFiveDollorDiscount(20.0)
//    println("$%.2f".format(total))

    //val discountedPrice = discountFiveDollors(20.0)

//    val applyDiscount = :: discountFiveDollors
//    val discountedPrice = applyDiscount(20.0)

//    var applyDiscount = :: discountFiveDollors
//    applyDiscount = :: discountTenPercent




    val withFiveDollorsOff = calculateTotal(20.0, {price -> price - 5.0})
    val withTenPercentOff = calculateTotal(20.0, {price -> price * 0.9})
    val fullPrice = calculateTotal(20.0, {price -> price})

    val applyDiscount: (Double) -> Double = {it - 5.0}

    fun  printSubtotal(applyDiscount: (Double) -> Double){
        val result = applyDiscount(20.0)
        val formatted = "$%.2f".format(result)
        println("A $20.00 haircut will cost you $ formatted before tax.")
    }

    printSubtotal { price -> price - 5.0 }
    printSubtotal { price -> price * 0.9 }





}
val taxMultiplier = 1.09
//fun calculateTotalWithFiveDollorDiscount(initialPrice:Double): Double{
//    val priceAfterDiscount = initialPrice - 5.0
//    val total = priceAfterDiscount*taxMultiplier
//
//    return total
//}
//fun calculateTotalWithTenPercentDiscount(initialPrice:Double): Double{
//    val priceAfterDiscount = initialPrice *0.9
//    val total = priceAfterDiscount*taxMultiplier
//
//    return total
//}

fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double
): Double {
    val priceAfterDiscount = applyDiscount(initialPrice)
    val total = priceAfterDiscount * taxMultiplier

    return total
}

fun discountFiveDollors(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9

fun noDiscount(price: Double): Double = price




//fun menuItemDescription(name: String, price: Double): String =
//    "A $name costs $price before discounts and tax."
//
//val describeMenuItem: (String, Double) -> String = :: menuItemDescription

fun discountForCoupanCode(coupanCode: String): (Double) -> Double = when(coupanCode){
    "FIVE_BUCKS" -> {price -> price - 5.0}
    "TAKE_10" -> {price -> price * 0.9}
    else -> {price -> price}
}