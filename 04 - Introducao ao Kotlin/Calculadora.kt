import kotlin.math.pow

const val size = 40

fun main() {
    var exit:Boolean = false
    
    while(!exit) {
        println("=".repeat(size))
        println(" ".repeat(((size - 9)/2).toInt()) + "CALCULADORA")
        println("=".repeat(size))
        println(" ".repeat(((size - 21)/2).toInt()) + "Selecione a operação:")
        println("  1 -> Soma")
        println("  2 -> Subtração")
        println("  3 -> Multiplicação")
        println("  4 -> Divisão")
        println("  5 -> Potenciação")
        println("  6 -> Raiz")
        println("  7 -> Fatoração")
        println("  8 -> Fatorial")
        println("  9 -> Porcentagem")
        println("=".repeat(size))
        print(" >>> ")
        val operation = readLine()!!.trim().toString()
        
        exit = when (operation){
            "1" -> {question("somar")
                    soma()}
            "2" -> {question("subtrair")
                    subtracao()}
            "3" -> {question("multiplicar")
                    multiplicacao()}
            "4" -> {question("dividir")
                    divisao()}
            "5" -> {question("a potencia")
                    potenciacao()}
            "6" -> {question("a raiz")
                    raiz()}
            "7" -> {question("fatorar")
                    fatoracao()}
            "8" -> {question("o fatorial")
                    fatorial()}
            "9" -> {question("a porcentagem")
                    porcentagem()}
            else -> {println("Valor inválido, tente novamente!")
                    true}
        }
    }

    println("=".repeat(size))
    println(" ".repeat(((size - 32) / 2).toInt()) + "Obrigado por usar nossa Calculadora!")
    println("=".repeat(size))
}

fun question(t:String){
    println("-".repeat(size))
    if (t in listOf("fatorar", "a potencia", "a porcentagem")) {
        println(" ".repeat(((size - (23 + t.length))/2).toInt()) + "Valor que você deseja $t?")
    } else {
        println(" ".repeat(((size - (25 + t.length))/2).toInt()) + "Valores que você deseja $t?")
    }
    println("-".repeat(size))
}

fun value(sig:String = " "):Double{
    var v:Double?
    while(true){
        print(" >>> $sig ")
        try {
            v = readLine()!!.toDouble()
            break
        } catch(e: Exception) {
            println((" ".repeat(((size - 37)/2).toInt()) + "Valor inválido, tente novamente [0.0]"))
        }
    }
    return v ?: 0.0
}

fun valueInt(sig:String = " "):Int{
    var v:Int?
    while(true){
        print(" >>> $sig ")
        try {
            v = readLine()!!.toInt()
            break
        } catch(e: Exception) {
            println((" ".repeat(((size - 37)/2).toInt()) + "Valor inválido, tente novamente [0.0]"))
        }
    }
    return v ?: 0
}

fun exit():Boolean {
    println("\n" + "-".repeat(size))
    println(" ".repeat(((size - 33)/2).toInt()) + "Se deseja fazer uma nova operação")
    println(" ".repeat(((size - 12)/2).toInt()) + "Digite:  sim")
    print(" >>>  ")
    val resp = readLine()!!.trim().toString()
    return if (resp == "sim") false else true 
}

fun soma():Boolean {
    val v1:Double = value()
    val v2:Double = value("+")
    println("\n   -> $v1 + $v2 = ${v1 + v2}")
    return exit()
}

fun subtracao():Boolean {
    val v1:Double = value()
    val v2:Double = value("-")
    println("\n   -> $v1 - $v2 = ${v1 - v2}")
    return exit()
}

fun multiplicacao():Boolean {
    val v1:Double = value()
    val v2:Double = value("*")
    println("\n   -> $v1 * $v2 = ${v1 * v2}")
    return exit()
}

fun divisao():Boolean {
    val v1:Double = value()
    val v2:Double = value("/")
    println("\n   -> $v1 / $v2 = ${v1 / v2}")
    return exit()
}

fun potenciacao():Boolean {
    val v1:Double = value()
    println(" Potência de:")
    val v2:Double = value()
    println("\n   -> $v1 ^ $v2 = ${v1.pow(v2)}")
    return exit()
}

fun raiz():Boolean {
    val v1:Double = value()
    println(" Raiz de:")
    val v2:Double = value()
    println("\n   -> $v1 ^ $v2 = ${v1.pow(1.0/v2)}")
    return exit()
}

fun fatoracao():Boolean {
    var v1:Int = valueInt()
    print("\n   -> $v1 = ")
    for (c in 2..v1.toDouble().pow(1.0/2.0).toInt()) {
        while(v1 % c == 0) {
            v1 /= c
            if (v1 != 1) {
                print("$c * ")
            } else {
                println("$c")
            }
        }
    }
    if(v1 > 1) println("$v1")
    return exit()
}

fun fatorial():Boolean {
    var v1:Int = valueInt()
    print("\n   -> $v1! = ")
    for (c in (v1 - 1) downTo 2) {
        v1 *= c
    }
    println(v1)
    return exit()
}

fun porcentagem():Boolean {
    val v1:Double = value()
    println(" Qual a porcentagem?")
    val v2:Double = value()
    println("\n   -> $v2% de $v1 = ${v1 * (v2/100)}")
    return exit()
}
