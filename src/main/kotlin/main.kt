fun main() {
    val amount = 495112
    val commission = calcCommission(amount)
    println("Amount: ${amount/100}.${amount%100}₽, commission: ${commission/100}.${commission%100}₽")
}

fun calcCommission(amount: Int): Int{
    val minCommissionKopecks = 3500
    val commissionShare = 0.0075
    return if (amount * commissionShare < minCommissionKopecks)
        minCommissionKopecks else (amount * commissionShare).toInt()
}