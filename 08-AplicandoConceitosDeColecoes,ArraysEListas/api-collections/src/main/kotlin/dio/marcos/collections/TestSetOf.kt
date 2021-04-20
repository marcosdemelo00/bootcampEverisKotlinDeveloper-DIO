package dio.marcos.collections

fun main() {
    val maria = Employee("Maria", 4000.0, "CLT")
    val iglessias = Employee("Iglessias", 1800.0, "CLT")
    val vandicson = Employee("Vandicson", 2100.0, "PJ")

    val workers1 = setOf(maria, iglessias)
    val workers2 = setOf(vandicson)

    val workersUnion = workers1.union(workers2)

    workersUnion.forEach { println(it) }

    println("------------------------------")
    val workers3 = setOf(maria)
    var workersSubtract = workers3.subtract(workers1)           //-> Subtraimos o que tem no conjunto 3 pelos valores contidos no conjunto 1
    workersSubtract.forEach { println(it) }                     //-> Retorna conjunto vazio
    println("------------------------------")
    workersSubtract = workers1.subtract(workers3)               //-> Subtraimos o que tem no conjunto 1 pelos valores contidos no conjunto 3
    workersSubtract.forEach { println(it) }

    println("------------------------------")
    var workersIntersect = workers3.intersect(workers1)         //-> Retorna valores comuns entre os 2 conjuntos
    workersIntersect.forEach { println(it)}
    println("------------------------------")
    workersIntersect = workers3.intersect(workers2)
    workersIntersect.forEach { println(it)}
}
