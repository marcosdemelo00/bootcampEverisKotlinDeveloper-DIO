package dio.marcos.collections

fun main() {
    val rockvaldo = Employee("Rockvaldo", 5600.0, "PJ")               //-> Criação dos objetos
    val maricota = Employee("Maricota", 4000.0, "CLT")
    val dantas = Employee("Dantas", 4200.0, "CLT")

    val employees = listOf(rockvaldo, maricota, dantas)         //-> Criação de uma lista com os valores da data class

    employees.forEach{
        println(it)
    }

    println("-------------------------")
    println(employees.find { it.name == "Maricota" })           //-> Localizando um valor por um dos parâmetros

    println("-------------------------")
    employees
        .sortedBy { it.salary }                                 //-> Ordenando do menor para o maior
        .forEach { println(it) }

    println("-------------------------")
    employees
        .sortedByDescending { it.salary }                       //-> Ordenando do maior para o menor
        .forEach { println(it) }

    println("-------------------------")
    employees
        .groupBy { it.jobType }                                 //-> Separando em grupo os valores por determinada característica
        .forEach { println(it) }

    //employees.add("Neusa", 5000.0, "CLT")                       -> erro: Unresolved reference: add | Lista imutável
}