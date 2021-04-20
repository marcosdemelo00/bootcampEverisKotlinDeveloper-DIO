package dio.marcos.collections

fun main() {
    val salary = DoubleArray(3)                                 //-> instanciando um Array de Doubles
    salary[0] = 20347.00
    salary[1] = 33000.50
    salary[2] = 18987.65

    for(wage in salary) {
        println("R$ $wage")
    }
    println("------------------------------")

    salary.sort()
    salary.forEachIndexed {index, wage ->                       //-> lambda for iterando pelos índices
        salary[index] = wage * 1.1
        println(String.format("R$ %.2f", salary[index]))
    }
    println("------------------------------")

    val fees = doubleArrayOf(0.125, 0.050, 1.0, 0.020)          //-> Array de doubles diretamente
    fees.sort()
    fees.forEach() { fee ->
        println("%.3f".format(fee) + "%")
    }
}