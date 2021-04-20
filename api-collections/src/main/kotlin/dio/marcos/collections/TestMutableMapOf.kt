package dio.marcos.collections

fun main() {
    val kleyton = Employee("Kleyton", 1000.0, "CLT")
    val buriti = Employee("Buriti", 2100.0, "CLT")
    val vargas = Employee("Vargas", 2000.0, "CLT")

    val rep = Repository<Employee>()

    rep.create(kleyton.name, kleyton)                           //-> Adiciona elementos no mutableMapOf na classe Repository
    rep.create(buriti.name, buriti)
    rep.create(vargas.name, vargas)

    println(rep.findById(buriti.name))
    println("-------------------------------")
    rep.findAll().forEach { worker -> println(worker) }
    println("-------------------------------")
    rep.remove(kleyton.name)
    println(rep.findAll())
}