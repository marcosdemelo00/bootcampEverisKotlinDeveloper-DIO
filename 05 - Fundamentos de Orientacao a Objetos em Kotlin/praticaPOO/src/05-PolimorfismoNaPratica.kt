interface Veiculo {                         //-> Declaração infterface, não possui construtor
    val nome: String
    val cor: String
    val rodas:Int

    fun movimento()
}

class Carro(): Veiculo {                    //-> Subclasse que implementa uma interface precisa sobrecrever todos os membros
    override val nome = "Relampago McQueen"
    override val cor = "Vermelho"
    override val rodas = 4

    override fun movimento() = println("Acelera com tudo maluco! Usa as $rodas rodas!!")
}

class Roliman(): Veiculo {
    override val nome = "Carrinho do Marquinhos"
    override val cor = "Marrom madeira"
    override val rodas = 4

    override fun movimento() = println("Tacale pau nesse $nome!!")
}

fun main() {
    val carro = Carro()
    val roliman = Roliman()

    println("${carro.nome}: movimento...")
    carro.movimento()
    println("\n${roliman.nome}: movimento...")
    roliman.movimento()
}