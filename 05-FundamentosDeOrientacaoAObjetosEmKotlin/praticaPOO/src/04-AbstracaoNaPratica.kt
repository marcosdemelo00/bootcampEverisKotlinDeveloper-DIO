open class InfoMoradia(                         //-> open permite que a classe seja extendida
    open val andares: Int,                      //-> open permite que a variável 'val' seja acessada
    var endereco: String,                       //-> 'var' não necessita de open
    cor: String,
    tamanho: Int                                //-> atribudos da classe abstrata que precisa ser implementada
): CaractMoradia(cor, tamanho){
    override fun calculoValor():String {               //-> Método da classe abstrata sendo implementado
        return "A Moradia custa ${tamanho * 1000}"
    }
}

abstract class CaractMoradia(                   //-> declaração de classe abstrata
    val cor: String,
    val tamanho: Int
) {
    abstract fun calculoValor():String                 //-> declaração de método abstrato
}

class TipoMoradia(
    val tipo: String,                            //-> herdada
    endereco: String,
    val comodos: Int,
    override val andares: Int,
    cor: String,
    tamanho: Int
):InfoMoradia(andares, endereco, cor, tamanho){
    override fun toString(): String = """
        $tipo de cor $cor na $endereco
        possiu $comodos cômodos e $andares andares e $tamanho m²
        ${calculoValor()} 
    """.trimIndent()
}

fun main() {
    val casa = TipoMoradia("Casa", "rua dos bobos", 6, 2, "Amarela", 256)
    println("${casa.tipo} de cor ${casa.cor}")
    println(casa.endereco)
    casa.calculoValor()                         //-> Utilização do método abstrato implementado e herdade da superclasse InfoMoradia()

    //val caracteristica = CaractMoradia("amarela", 2) -> erro: Cannot create an instance of an abstract class
    println("-".repeat(40))
    println(casa.toString())
}