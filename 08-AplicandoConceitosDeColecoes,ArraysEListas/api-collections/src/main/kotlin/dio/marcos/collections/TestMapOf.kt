package dio.marcos.collections

fun main() {
    val pair: Pair<String, Int> = Pair("Cleuza", 54)            //-> Criando um par de variáveis
    val map1 = mapOf(pair)                                      //-> Instanciando um mapa

    map1.forEach { (k, v) -> println("Key: $k - Value: $v") }

    val map2 = mapOf(                                           //-> Instanciando um mapa com os parâmetros inclusos
        "Valentina" to 9,
        "Enzo" to 10
    )

    map2.forEach { (k, v) -> println("Key: $k - Value: $v") }
}