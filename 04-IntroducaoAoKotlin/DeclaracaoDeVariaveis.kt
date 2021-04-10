const val MAX_AGE = 68
const val MIN_AGE = 16

//FUNÇÃO PRINCIPAL
fun main() {
    
    // >> Declaração de variáveis <<
    
    val fixedAge = 20
    println(fixedAge)
    // fixedAge = 21          -> erro: Val cannot be reassigned
    
    var currentAge:Int?
    currentAge = 29
    println(currentAge)
    
    currentAge = 30
    println(currentAge)
    
    // const val MAX_AGE = 68 -> erro: Mofier"const is not applicable to 'local variable'
    // MAX_AGE = 50           -> erro: Val cannot be ressigned 
    println(MAX_AGE)
    
    // >> Erros na declaração de variáveis <<
    
    // var currentYear        -> erro: This variable must either have a type annotation or be initialized
    var currentYear = "2020"
    // currentYear = 2021     -> erro: The integer literal does not conform to the expected type String
    
    // >> Valores nulos <<
    
    var mouth:Int? = null   //-> Atribui valor null corretamente a variável
    // var mouth:Int = null   -> erro: Nul can not be a value of a non-null type Int
}