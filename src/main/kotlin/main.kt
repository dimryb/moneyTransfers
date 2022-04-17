const val ruble = 100

fun main() {
    val amount = 495112
    val commission = calcCommission(amount)
    println("Amount: ${rubleToString(amount)}, commission: ${rubleToString(commission)}")
}

fun calcCommission(amount: Int): Int {
    val minCommission = 35 * ruble
    val commissionShare = 0.0075
    return if (amount * commissionShare < minCommission)
        minCommission else (amount * commissionShare).toInt()
}

fun rubleToString(amount: Int): String {
    return String.format("%d.%02d₽", amount / ruble, amount % ruble)
}