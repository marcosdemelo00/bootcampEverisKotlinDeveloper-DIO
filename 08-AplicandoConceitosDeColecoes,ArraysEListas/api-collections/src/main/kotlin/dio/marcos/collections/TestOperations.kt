package dio.marcos.collections

fun main() {
    val salary = doubleArrayOf(10000.0, 15000.0, 25000.0, 20000.0, 30000.0)

    for (wage in salary) {
        println(wage)
    }
    println("----------------------------------")

    println("Highest salary: $ ${salary.maxOrNull()}")          //-> Retorna maior valor do array
    println("Lowest salary: $ ${salary.minOrNull()}")           //-> Retorna menor valor do array
    println("Avarage salary: $ ${salary.average()}")            //-> Retorna média dos valores do array
    println("----------------------------------")
    val salaryBigger20000 = salary.filter { it > 20000 }        //-> Aplica um filtro no array e aloca em outra variável
    println("Salaries bigger than $ 20000.0:")
    salaryBigger20000.forEach {
        println(it)
    }
    println("----------------------------------")
    println(salary.count { it in 9000.0..22000.0 })             //-> Conta quantos valores estão dentro de uma condição
    println("----------------------------------")
    println(salary.find { it == 20000.0 })                      //-> Procura um valor dentro do array
    println(salary.find { it == 19000.0 })                      //-> Se valor não for encontrado retorna null
    println("----------------------------------")
    println(salary.any { it == 10000.0 })                       //-> Procura e Valida se condição é verdadeira
    println(salary.any { it == 1400.0 })
}