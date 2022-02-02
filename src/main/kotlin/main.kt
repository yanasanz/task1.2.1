import kotlin.math.roundToInt

fun main() {
    val amount = 500000
    val minAmount = 10000
    val feePercent = 0.0075
    val minFee = 3500
    val fee = if (amount >= 466667) (amount * feePercent).roundToInt() else minFee
    if (amount < minAmount) {
        println("Сумма перевода не может быть меньше 100 руб.")
    } else {
        println(
            "Вы переводите ${toRubles(amount)} руб. ${toKopecks(amount)} коп., комиссия составит ${toRubles(fee)} руб. ${toKopecks(fee)} коп.")
    }
}

fun toRubles (amount: Int): Int {
    return amount / 100
}

fun toKopecks (amount: Int): Int {
    return amount % 100
}