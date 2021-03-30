# Introdução ao Kotlin 3/5 (Ana Luísa Dias)
> Kotlin, Sintaxe básica : Variáveis e Strings

## Sintaxe básica
- [Kotlin Playground]( https://play.kotlinlang.org/ )
  - Tutoriais
  - Exemplos
  - Plataforma OpenSource

#### Tipos de dados
- Int: .toInt()
- Short: .toShort()
- Long: .toLong()
- Float: .toFloat()
- Double: .toDouble()
- Char: toChar()
- String: toString()
- Array
- Boolean
- Byte: .toByte()
- Null
``` kotlin
> println(Int.MAX_VALUE) //-> 2147483647
> println(Float.MAX_VALUE) //-> 3.4028235E38
> println(Long.MAX_VALUE) //-> 9223372036854775807
> println(Byte.MAX_VALUE) //-> 127
> println(Short.MAX_VALUE) //-> 32767
```

## Como declarar variáveis

> [Exemplos no PlayGround](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjMwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiY29uc3QgdmFsIE1BWF9BR0UgPSA2OFxuY29uc3QgdmFsIE1JTl9BR0UgPSAxNlxuXG4vL0ZVTsOHw4NPIFBSSU5DSVBBTFxuZnVuIG1haW4oKSB7XG4gICAgXG4gICAgLy8gPj4gRGVjbGFyYcOnw6NvIGRlIHZhcmnDoXZlaXMgPDxcbiAgICBcbiAgICB2YWwgZml4ZWRBZ2UgPSAyMFxuICAgIHByaW50bG4oZml4ZWRBZ2UpXG4gICAgLy8gZml4ZWRBZ2UgPSAyMSAgICAgICAgICAtPiBlcnJvOiBWYWwgY2Fubm90IGJlIHJlYXNzaWduZWRcbiAgICBcbiAgICB2YXIgY3VycmVudEFnZTpJbnQ/XG4gICAgY3VycmVudEFnZSA9IDI5XG4gICAgcHJpbnRsbihjdXJyZW50QWdlKVxuICAgIFxuICAgIGN1cnJlbnRBZ2UgPSAzMFxuICAgIHByaW50bG4oY3VycmVudEFnZSlcbiAgICBcbiAgICAvLyBjb25zdCB2YWwgTUFYX0FHRSA9IDY4IC0+IGVycm86IE1vZmllclwiY29uc3QgaXMgbm90IGFwcGxpY2FibGUgdG8gJ2xvY2FsIHZhcmlhYmxlJ1xuICAgIC8vIE1BWF9BR0UgPSA1MCAgICAgICAgICAgLT4gZXJybzogVmFsIGNhbm5vdCBiZSByZXNzaWduZWQgXG4gICAgcHJpbnRsbihNQVhfQUdFKVxuICAgIFxuICAgIC8vID4+IEVycm9zIG5hIGRlY2xhcmHDp8OjbyBkZSB2YXJpw6F2ZWlzIDw8XG4gICAgXG4gICAgLy8gdmFyIGN1cnJlbnRZZWFyICAgICAgICAtPiBlcnJvOiBUaGlzIHZhcmlhYmxlIG11c3QgZWl0aGVyIGhhdmUgYSB0eXBlIGFubm90YXRpb24gb3IgYmUgaW5pdGlhbGl6ZWRcbiAgICB2YXIgY3VycmVudFllYXIgPSBcIjIwMjBcIlxuICAgIC8vIGN1cnJlbnRZZWFyID0gMjAyMSAgICAgLT4gZXJybzogVGhlIGludGVnZXIgbGl0ZXJhbCBkb2VzIG5vdCBjb25mb3JtIHRvIHRoZSBleHBlY3RlZCB0eXBlIFN0cmluZ1xuICAgIFxuICAgIC8vID4+IFZhbG9yZXMgbnVsb3MgPDxcbiAgICBcbiAgICB2YXIgbW91dGg6SW50PyA9IG51bGwgICAvLy0+IEF0cmlidWkgdmFsb3IgbnVsbCBjb3JyZXRhbWVudGUgYSB2YXJpw6F2ZWxcbiAgICAvLyB2YXIgbW91dGg6SW50ID0gbnVsbCAgIC0+IGVycm86IE51bCBjYW4gbm90IGJlIGEgdmFsdWUgb2YgYSBub24tbnVsbCB0eXBlIEludFxufSJ9)

#### Palavras reservadas
- **var** (valor mutável, CamelCase):
  - Variável que pode ter seu valor alterado durante o código
- **val** (valor imutável, CamelCase):
  - Variável que terá somente o valor atribuído (similar ao _final_ em Java)
- **const val** (valor imutável, SNAKE_CASE):
  - Constante cujo valor é atribuído durante a compilação

#### Possíveis erros
- Uma variável **não pode** ser declarada **sem tipo e sem atribuição**
- Uma **variável com inferência de tipo** só receberá **valores do mesmo tipo que a sua primeira atribuição**

#### Nullability Variáveis nulas
- Qualquer tipo pode ser null, porém isso deve ser explicitado na declaração de variáveis através do uso da interrogação **?**
- A inferência de tipo não atribui nullability


## Operadores 

> [Exemplos no PlayGround](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjMwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiY29uc3QgdmFsIE1JTl9BR0UgPSAxNlxuY29uc3QgdmFsIE1BWF9BR0UgPSA2OFxuXG4vL0ZVTsOHw4NPIFBSSU5DSVBBTFxuZnVuIG1haW4oKSB7XG4gICAgXG4gICAgcHJpbnRsbihcIj4+IE9wZXJhZG9yZXMgYXJpdG3DqXRpY29zIDw8XCIpXG4gICAgXG4gICAgdmFsIGNvdW50ID0gMTBcbiAgICB2YXIgdGltZXMgPSA5XG4gICAgdmFsIHIgPSBjb3VudCArIHRpbWVzXG4gICAgcHJpbnRsbihyKVxuICAgIHByaW50bG4oY291bnQucGx1cyh0aW1lcykpXG4gICAgXG4gICAgLy92YWwgY291bnQgPSsgMSAgICAgICAgICAgICAgICAgICAgIC0+IGVycm86IHZhbCBjYW5ub3QgYmUgcmVhc3NpZ25lZFxuICAgIHRpbWVzICs9IGNvdW50XG4gICAgcHJpbnRsbih0aW1lcylcbiAgICBwcmludGxuKGNvdW50LnBsdXModGltZXMpKVxuICAgIFxuICAgIC8vID4+IENvbmNhdGVuYcOnw6NvIDw8XG4gICAgXG4gICAgdmFsIGhlbGxvID0gXCJPbMOhIFwiXG4gICAgdmFsIHdvcmxkID0gXCJtdW5kbyFcIlxuICAgIHByaW50bG4oaGVsbG8gKyB3b3JsZClcbiAgICAvL3ByaW50bG4oKGhlbGxvICsgd29ybGQpICogMykgICAgICAgLT4gZXJybzogVW5yZXNvbHZlZCByZWZlcmVuY2VcbiAgICBcbiAgICBwcmludGxuKFwiXFxuPj4gT3BlcmFkb3JlcyBjb21wYXJhdGl2b3MgPDxcIilcbiAgICBcbiAgICB2YWwgZCA9IDIyXG4gICAgdmFyIHQgPSA5MFxuICAgIFxuICAgIHByaW50bG4oZCA+IHQpXG4gICAgcHJpbnRsbihkLmNvbXBhcmVUbyh0KSkgICAgICAgICAgICAvLy0+IFNlIGQgw6kgbWFpb3IgcXVlIHRcbiAgICBwcmludGxuKGQuY29tcGFyZVRvKHQpID4gMClcbiAgICBcbiAgICB0ID0gMjBcbiAgICBwcmludGxuKGQgPj0gdCkgICAgICAgICAgICAgICAgICAgIC8vLT4gU2UgZCDDqSBtYWlvciBvdSBpZ3VhbCBxdWUgdFxuICAgIHByaW50bG4oZC5jb21wYXJlVG8odCkgPj0gdClcbiAgICBcbiAgICBwcmludGxuKGQuZXF1YWxzKHQpKSAgICAgICAgICAgICAgIC8vLT4gU2UgZCDDqSBpZ3VhbCBhIHRcbiAgICBwcmludGxuKCFkLmVxdWFscyh0KSkgICAgICAgICAgICAgIC8vLT4gU2UgZCDDqSBkaWZlcmVudGUgZGUgdFxuICAgIFxuICAgIHByaW50bG4oXCJcXG4+PiBPcGVyYWRvcmVzIGzDs2dpY29zIDw8XCIpXG4gICAgXG4gICAgcHJpbnRsbigoZCA+IHQpIGFuZCAoZCA9PSB0KSlcbiAgICBwcmludGxuKChkID4gdCkgJiYgKGQgPT0gdCkpXG4gICAgXG4gICAgcHJpbnRsbihkLmVxdWFscyh0ICsgMikgb3IgKHQgPCBkKSlcbiAgICBwcmludGxuKGQuZXF1YWxzKHQgKyAyKSB8fCAodCA8IGQpKVxuICAgIFxuICAgIHByaW50bG4oXCJcXG4+PiBPcGVyYWRvcmVzIGluIGUgcmFuZ2UgPDxcIilcbiAgICBcbiAgICB2YWwgYmluZ28gPSBsaXN0T2YoOCw2LDM0LDIsMTMpXG4gICAgdmFyIG51bWJlciA9ICgxLi4zNCkucmFuZG9tKCkgICAgICAvLy0+IEdlcmEgdW0gbsO6bWVybyBhbGVhdMOzcmlvIGVudHJlIG8gcmFuZ2UgMS4uMzRcbiAgICBcbiAgICBwcmludGxuKG51bWJlcilcbiAgICBwcmludGxuKG51bWJlciBpbiBiaW5nbylcbiAgICBwcmludGxuKG51bWJlciBpbiAwLi40MClcbiAgICBcbiAgICBwcmludGxuKFwiXFxuPiBQb2RlIGRvYXIgc2FuZ3VlPyA8XCIpXG4gICAgdmFyIGFnZSA9ICgxLi4xMDApLnJhbmRvbSgpXG4gICAgcHJpbnRsbihhZ2UpXG4gICAgcHJpbnRsbihcIlN1YSBhbHRvcml6YcOnw6NvIMOpOiBcIiArIChhZ2UgaW4gTUlOX0FHRS4uTUFYX0FHRSkudG9TdHJpbmcoKSlcbiAgICBwcmludGxuKChhZ2UgPj0gTUlOX0FHRSkgJiYgKGFnZSA8PSBNQVhfQUdFKSlcbiAgICBcbn0ifQ==)

#### Operadores Aritméticos básicos
- Os operadores podem ser chamados tanto como expressão tanto como comando. O resultado será o mesmo.
- A função de soma também funciona para concatenar Strings

|  Função | Espressão | Comando | Atribuição |
| ------------- | ------------- | ------------- | ------------- |
| soma | a + b | a.plus(b) | a += b |
| subtração | a - b | a.minus(b) | a -= b |
| multiplicação | a * b | a.times(b) | a *= b |
| divisão | a / b | a.div(b) | a /=b |
| resto | a % b | a.mod(b) | a %= b |

#### Operadores Comparativos
- Os comandos **compareTo** retornam os **valores -1 (menor que), 0 ( igual ou 1 (maior que)**. Enquanto que os **operadores** retornam **valores booleanos**
- O comando **equals** retorna um **booleano**

| Função | Expressão | Comando |
| ----- | ----- | ----- |
| maior/menor | a > b ou a < b | a.compareto(b) > 0 ou < 0 |
| maior/menor igual | a >=b ou a <= b | a.compareTo(b) >= 0 ou  <= 0 |
| igual | a == b | a.equals(b) |
| diferente | a != b | | !(a.equals(b)) |

#### Operadores Lógicos
- Quando utiliza-se o comando, é recomendado colocar a expressão entre parênteses

| Função e expressão | Comando |
| ----- | ----- |
| e (&&) | (expressão1) and (expressão2) |
| ou (&#124;&#124;) | (expressão1) or (expressão2) |

#### Operadores In e Range
- Se valor está presente em uma lista ou uma faixa (range) de valores
- Range cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo

| Função e expressão |
| ----- |
| contém (in) |
| não contém (!in) |
| range / Faixa de valores (int..int) |

## Manipulação de Strings

> [Exemplos no PlayGround](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjMwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLy8gRlVOw4fDg08gUFJJTkNJUEFMXG5mdW4gbWFpbigpIHtcbiAgICBcbiAgICBwcmludGxuKFwiPj4gTWFuaXB1bGFuZG8gU3RyaW5ncyA8PFwiKVxuICAgIHZhbCB3ZWxjb21lID0gXCJCZW0gdmluZG8oYSlcIlxuICAgIHZhbCBuYW1lID0gXCJyb2Nrc29uXCJcbiAgIFxuICAgIHByaW50bG4oXCIkd2VsY29tZSwgJHtuYW1lLmNhcGl0YWxpemUoKX0hXCIpICAvLy0+IFwie3ZhcmnDoXZlbCksIHt2YXJpw6F2ZWx9IVwiXG4gICAgXG4gICAgcHJpbnRsbihcIlxcbj4+IEVtcHR5IHggQmxhbmsgPDxcIilcbiAgICB2YWwgZW1wdHkgPSBcIlwiXG4gICAgcHJpbnRsbihlbXB0eS5sZW5ndGgpXG4gICAgdmFsIGJsYW5rID0gXCIgICAgICAgICAgXCJcbiAgICBwcmludGxuKGJsYW5rLmxlbmd0aClcbiAgICB2YWwgc051bGw6U3RyaW5nPyBcbiAgICBzTnVsbCA9IG51bGxcbiAgICBwcmludGxuKHNOdWxsKVxuICAgIFxuICAgIHByaW50bG4oXCJ2YXIgZW1wdHkgLT4gRW1wdHk6ICR7ZW1wdHkuaXNFbXB0eSgpfSwgQmxhbms6ICR7ZW1wdHkuaXNCbGFuaygpfVwiKVxuICAgIHByaW50bG4oXCJ2YXIgYmxhbmsgLT4gRW1wdHk6ICR7YmxhbmsuaXNFbXB0eSgpfSwgQmxhbms6ICR7YmxhbmsuaXNCbGFuaygpfVwiKVxuICAgIHByaW50bG4oXCJ2YXIgc051bGwgLT4gTnVsbDogJHtzTnVsbC5pc051bGxPckJsYW5rKCl9XCIpXG4gICAgXG59In0=)

- Strings possuem diversos métodos associados:
  - indexação
  - concatenação (plus/+)
  - comparação
  - formatação 
- Também é tratada como um array de Char

#### Indexação
- String como array:
  - first(): acessa primeira posição do array [0]
  - last(): acessa a última posição do array [s.length - 1]
  - String.length: retorna o tamanho da String
  - String[index]

#### Concatenação
- Para concatenar duas strings o plus/+ pode ser utilizado
- Para concatenar uma variável a uma String, os símbolos ${} devem ser inseridos ou utilizar o método toString()

| Nome | Função | Métodos  |
|------|------|-----|
| Capitalização de strings | Alterar a formatação entre letras minúsculas e maiúsculas | capitalize(). toUpperCase(), toLowerCase, and decapitalize() |
| Remoção de espaços | Remove espaços vazios e caracteres inadequados para impressão | trimEnd(), trimStart(), trim() |
| Substituição de caracteres | Substituir caracteres por outros                              | replace(x, y) |
| Formatação | Formatar outros valores para um padrão de string | "padrão ${valor}".format(valor) |

- Uma String vazia está em branco ou é nula?
  - Se o **tamanho da string** (s.length) for **0 está empty e Blank**
  - Se o **tamanho for > 0** mas **todos os caracteres são espaços em branco**, ela está **blank** mas **não empty**
    - isBlank() : retorna true se não houver caracteres ou se todos forem espaços vazios
    - isNullOrBlank(): retorna true se a String for blank ou se possui um valor nulo
    - isEmpty(): retorna true se não houver caracteres nem espaços em branco, uma String vazia
