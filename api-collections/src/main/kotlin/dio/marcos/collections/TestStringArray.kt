package dio.marcos.collections

fun main() {
    var i = 1
    val names = Array<String>(5, {i -> ""})                     //-> Instanciando uma Array de Strings
    names[0] = "Robson"                                         //-> Acossiando valores às posições do Array
    names[1] = "Clotildes"
    names[2] = "Juca"
    names[3] = "Dolores"
    names[4] = "Severino"

    for(name in names) {
        print(name + " - ")
    }
    println("\n---------------------------")

    names.sort()
    for(index in names.indices) {
        print(names[index] + " - ")
    }
    println("\n---------------------------")

    val numbers = Array(7, { i -> i })
    numbers.forEach {
        print("" + it + " - ")
    }
    println("\n---------------------------")

    val LastNames = arrayOf("Silva", "Sousa", "Oliveira", "Lima", "Pereira")
    LastNames.forEach() {
        print(it + " - ")
    }
}