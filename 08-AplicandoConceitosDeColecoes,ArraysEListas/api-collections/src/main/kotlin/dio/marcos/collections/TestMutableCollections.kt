package dio.marcos.collections

fun main() {
    val primilson = Employee("Primilson", 15000.0, "PJ")
    val bastana = Employee("Bastana", 17000.0, "CLT")
    val melguibson = Employee("Melguibson", 25000.0, "PJ")

    println("------------ LIST --------------")
    val workers = mutableListOf(primilson, bastana)
    workers.forEach { println(it) }
    println("--------------------------------")

    workers.add(melguibson)                                     //-> Adiciona valor na lista
    workers.forEach { println(it) }
    println("--------------------------------")
    workers.remove(primilson)                                   //-> Remove valor da lista
    workers.forEach { println(it) }

    println("------------- SET --------------")
    val workersSet = mutableSetOf(primilson)

    workersSet.add(Employee("Baroncio", 14000.0, "CLT"))
    workersSet.add(bastana)
    workersSet.forEach { println(it) }
    println("--------------------------------")
    workersSet.remove(workersSet.find { it.name == "Baroncio" })
    workersSet.remove(bastana)
    workersSet.forEach { println(it) }
}