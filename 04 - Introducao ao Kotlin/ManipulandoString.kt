// FUNÇÃO PRINCIPAL
fun main() {
    
    println(">> Manipulando Strings <<")
    val welcome = "Bem vindo(a)"
    val name = "rockson"
   
    println("$welcome, ${name.capitalize()}!")  //-> "{variável), {variável}!"
    
    println("\n>> Empty x Blank <<")
    val empty = ""
    println(empty.length)
    val blank = "          "
    println(blank.length)
    val sNull:String? 
    sNull = null
    println(sNull)
    
    println("var empty -> Empty: ${empty.isEmpty()}, Blank: ${empty.isBlank()}")
    println("var blank -> Empty: ${blank.isEmpty()}, Blank: ${blank.isBlank()}")
    println("var sNull -> Null: ${sNull.isNullOrBlank()}")
    
}