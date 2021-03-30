// FUNÇÃO PRINCIPAL
fun main() {
    
    println(">> Funções <<")
    val name = "Marcos"
    val lastName = "Lourenco"
    
    println(getFullnameReturn(name, lastName))
    
    getFullnameVoid(name, lastName)
    
    println(getFullnameSingleLine(name, lastName))
    
    println("\n>> Funções de ordem superior <<")
    val z:Int
    
    z = calculate(34, 90, ::sum)
    println(z)
    println(calculate(34, 90){a, b -> 
        print("A soma é: ")
        a+b
    })
    
    println("\n>> Funções extensão")
    val str = "testando"
    println(str.randomCapitalizedLetter())
    
}


// FUNÇÕES SECUNDÁRIAS
private fun getFullnameReturn(name:String, lastName:String):String {
    val fullname = "$name $lastName"
    return fullname
}

private fun getFullnameVoid(name:String, lastName:String) {
    println("$name $lastName")
}

// FUNÇÃO SINGLE LINE
private fun getFullnameSingleLine(name:String, lastName:String) = "$name $lastName"

// FUNÇÃO DE ORDEM SUPERIOR
fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int {
    val result = operation(n1, n2)
    return result
}

// FUNÇÃO EXTENSÃO
fun String.randomCapitalizedLetter():String {
    var l = this[(0..this.length-1).random()]
    return this.replace(l, l.toUpperCase())
}