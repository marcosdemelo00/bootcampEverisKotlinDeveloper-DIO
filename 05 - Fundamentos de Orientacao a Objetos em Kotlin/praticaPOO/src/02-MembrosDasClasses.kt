class Morador {
    val name:String                  //-> Uma propriedade da classe
    var cpf:String = "123.456.789-10"
    private set                           //-> Modificador privado apenas no setter do atributo/proriedade cpf

    inner class Endereço {                //-> Implementando uma classe interna
        var rua: String = "Rua dos bobos"
        var num: Int = 0
    }

    constructor() {                        //-> Construtor secundário
        name = "Marcos Lourenco"
    }
    constructor(name: String, cpf:String) {//-> Outro Contrutor secundário
        this.name = name
        this.cpf = cpf                     //-> Por estar dentro da classe consegue modificar o atributo private
    }

    fun pessoaInfo() = "$name e $cpf"     //-> Um método ou função da classe
}

fun main() {
    var marcos = Morador()
    //marcos.cpf = "123"                    -> erro: Cannot assign to 'cpf': the setter is private in 'Morador'

    println("Nome: " + marcos.name)
    println("CPF: " +marcos.cpf)
    println(marcos.pessoaInfo())

    println("\nEndereço:")
    print(marcos.Endereço().rua)
    println(", nº: " + marcos.Endereço().num)

    var melo = Morador("Marcos de Melo", "987.654.321-00")

    println("Nome: " + melo.name)
    println(melo.pessoaInfo())
}