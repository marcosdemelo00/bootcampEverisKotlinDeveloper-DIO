package dio.marcos.collections

fun main() {
    val values = IntArray(5)                                     //-> Criando um Array de inteiros

    values[0] = 123
    values[1] = 654
    values[2] = 357
    values[3] = 963
    values[4] = 12

    for(value in values) {                                      //-> Iterando o Array
        println(value)
    }
    println("-------------------------")

    values.forEach{ it ->                                       //-> Iterando o Array
        println(it)
    }
    println("-------------------------")

    for (index in values.indices) {                             //-> Iterando os índices do Array
        print(index.toString() + " : ")
        println(values[index])
    }
    println("-------------------------")

    values.sort()                                               //-> Ordenando os valores no Array
    for (index in values.indices) {
        print((index + 1).toString() + "º : ")
        println(values[index])
    }
}
