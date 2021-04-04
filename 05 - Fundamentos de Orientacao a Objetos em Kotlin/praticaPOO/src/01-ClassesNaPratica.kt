class Pessoa (                            //-> Construtor primário de uma classe com parâmetros
    val name: String,
    val cpf: String
        ) {                               //-> Implementando uma classe
        init { println("Init Block")}
    }
fun main() {
    val marcos = Pessoa("Marcos Lourenco", "123.456.789-10")

    println(marcos.name)
    println(marcos.cpf)
}