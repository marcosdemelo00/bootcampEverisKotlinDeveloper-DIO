const val MIN_AGE = 16
const val MAX_AGE = 68

//FUNÇÃO PRINCIPAL
fun main() {
    
    println(">> Operadores aritméticos <<")
    
    val count = 10
    var times = 9
    val r = count + times
    println(r)
    println(count.plus(times))
    
    //val count =+ 1                     -> erro: val cannot be reassigned
    times += count
    println(times)
    println(count.plus(times))
    
    // >> Concatenação <<
    
    val hello = "Olá "
    val world = "mundo!"
    println(hello + world)
    //println((hello + world) * 3)       -> erro: Unresolved reference
    
    println("\n>> Operadores comparativos <<")
    
    val d = 22
    var t = 90
    
    println(d > t)
    println(d.compareTo(t))            //-> Se d é maior que t
    println(d.compareTo(t) > 0)
    
    t = 20
    println(d >= t)                    //-> Se d é maior ou igual que t
    println(d.compareTo(t) >= t)
    
    println(d.equals(t))               //-> Se d é igual a t
    println(!d.equals(t))              //-> Se d é diferente de t
    
    println("\n>> Operadores lógicos <<")
    
    println((d > t) and (d == t))
    println((d > t) && (d == t))
    
    println(d.equals(t + 2) or (t < d))
    println(d.equals(t + 2) || (t < d))
    
    println("\n>> Operadores in e range <<")
    
    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()      //-> Gera um número aleatório entre o range 1..34
    
    println(number)
    println(number in bingo)
    println(number in 0..40)
    
    println("\n> Pode doar sangue? <")
    var age = (1..100).random()
    println(age)
    println("Sua altorização é: " + (age in MIN_AGE..MAX_AGE).toString())
    println((age >= MIN_AGE) && (age <= MAX_AGE))
    
}