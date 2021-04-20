package dio.marcos.collections

fun main() {
    val values = intArrayOf(
        45, 12, 93, 38, 28
    )                 //-> Criando um Array sem precisar declarar a capacidade na intanciação

    values.forEach(){
        println(it)
    }
    println("------------------------------\nOrdenando os valores:")
    values.sort()
    for (index in values.indices) {
        print(index + 1)
        print("º índice : ")
        println(values[index])
    }
}