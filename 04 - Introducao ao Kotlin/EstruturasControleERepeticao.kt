// FUNÇÃO PRINCIPAL
fun main() {
    
    println(">> Estruturas de controle: if/else <<")
    
    val a = 1
    val b = 2
    val c = 3
    
    if (a == b) {
        println("Bloco if")
    } else if (b >= c) {
        println("Bloco else if")
	} else {
        println("Bloco else")
    }    
    
    println("\n>> Atribuição if/else <<")
    val MaxValue = if (a > b) "a = $a" else if (a < b) "b = $b" else "iguais"
    println("Maior valor entre a e b: $MaxValue")
    
    val MinValue = if (a > b) {
        "b = $b"
    } else if (a < b) {
        "a = $a"
    } else {
        "iguais"
    }
    println("Menor valor entre a e b: $MinValue")
    
    println("\n>> Estrutura de controle: when")
    when {
        a > b -> {println("Iiihhuuuuu!")}
        (a != b) and (a < c) -> {println("Oxi!!")}   //-> se executar uma condição as demais serão ignoradas
        b == 2 -> {println ("Sooooo...")}
        else -> {println("Deu ruim...")}
    }
    
    val year = (-4000..4000).random()
    var period:String?
    period = when (year) {
        in -4000..475 -> {"Antiga"}
        in 476..1452 -> {"Média"}
        in 1453..1788 -> {"Modernoa"}
        in 1789..2021 -> {"Contemporânea"}
    	in 2022..4000 -> {"Futura"}
        else -> {"Impossible"}
    }
    println("$year pertence a Idade $period")
    
    println("\n>> Estrutura de controle: Elvis Operator <<")
    val aa:Int? = null
    val bb:Int? = null
    val cc:Int? = 29
    println(aa ?: bb ?: "Valores nulos")
    println(aa ?: bb ?: cc ?: "Valores nulos")
    
    println("\n>> Estruturas de repetição <<")
    var count = 0
    
    println("while")
    while(count < 10) {
        print(count)
        count += 1
    }
    
    println("\nfor in step")
    for(count in 0..10 step 2) {
        print(count)
    }
    
    println("\nfor in downTo")
    count = 10
    for(i in count downTo 0 step 2) {
        print(i)
    }
    
    println("\nfor in until")
    for(count in 0 until 20) {
        print(count)
    }
    
    println()
    var text = "Kotlin é o bicho!"
    for (i in text) {
        print("$i".toUpperCase())
    }
    text.forEach{
        l -> print(l)
    }
}