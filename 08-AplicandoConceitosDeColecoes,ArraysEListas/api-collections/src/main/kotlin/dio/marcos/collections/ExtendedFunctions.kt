package dio.marcos.collections

import java.math.BigDecimal

fun Array<BigDecimal>.sum() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.sum() / this.size.toBigDecimal()