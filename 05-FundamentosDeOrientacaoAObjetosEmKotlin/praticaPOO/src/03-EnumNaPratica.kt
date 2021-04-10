
enum class MoradiaTipo(val descricao: String) {   //-> definindo um enum | mod val/var possibilitam get/set
    CASA ("Mora numa casa"),
    APARTAMENTO ("Mora num apartamento"),
    CHIQUEIRO ("É o porco é?"),
    GALINHEIRO ("Oxi, é uma galinha, ctz..."),
    CASTELO ("Só quer ser a princesinha"),
    MANSÃO ("Boa garoto negócio é gerar renda");

    companion object{
        fun printDescricao() = MoradiaTipo
    }
}

fun main() {
    println(MoradiaTipo.values())                 //-> Retorna a lista com os objetos do enum

    println("=".repeat(30))
    MoradiaTipo.values().forEach {
        println("${it.name} = ${it}")             //-> it como valor automatico da iteração | .name reorna nome do objeto
    }

    println("=".repeat(30))
    MoradiaTipo.values().forEach { elemento ->    //-> "elemento" definido como valor da iteração, no lugar do it
        println(">> ${elemento.name} = ${elemento.descricao}") //-> .descricao para retornar o valor da descrição do objeto
    }

    println("=".repeat(30))
    val casa = MoradiaTipo.CASA                   //-> aloca um objeto do enum em uma variável
    println("$casa = ${casa.descricao}")

}