# Introdução ao Kotlin 5/5 (Ana Luísa Dias)
> Kotlin, Sintaxe básica : Estruturas de controle e repetição

## Estruturas de controle

> [Exemplos no PlayGround](https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjMwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLy8gRlVOw4fDg08gUFJJTkNJUEFMXG5mdW4gbWFpbigpIHtcbiAgICBcbiAgICBwcmludGxuKFwiPj4gRXN0cnV0dXJhcyBkZSBjb250cm9sZTogaWYvZWxzZSA8PFwiKVxuICAgIFxuICAgIHZhbCBhID0gMVxuICAgIHZhbCBiID0gMlxuICAgIHZhbCBjID0gM1xuICAgIFxuICAgIGlmIChhID09IGIpIHtcbiAgICAgICAgcHJpbnRsbihcIkJsb2NvIGlmXCIpXG4gICAgfSBlbHNlIGlmIChiID49IGMpIHtcbiAgICAgICAgcHJpbnRsbihcIkJsb2NvIGVsc2UgaWZcIilcblx0fSBlbHNlIHtcbiAgICAgICAgcHJpbnRsbihcIkJsb2NvIGVsc2VcIilcbiAgICB9ICAgIFxuICAgIFxuICAgIHByaW50bG4oXCJcXG4+PiBBdHJpYnVpw6fDo28gaWYvZWxzZSA8PFwiKVxuICAgIHZhbCBNYXhWYWx1ZSA9IGlmIChhID4gYikgXCJhID0gJGFcIiBlbHNlIGlmIChhIDwgYikgXCJiID0gJGJcIiBlbHNlIFwiaWd1YWlzXCJcbiAgICBwcmludGxuKFwiTWFpb3IgdmFsb3IgZW50cmUgYSBlIGI6ICRNYXhWYWx1ZVwiKVxuICAgIFxuICAgIHZhbCBNaW5WYWx1ZSA9IGlmIChhID4gYikge1xuICAgICAgICBcImIgPSAkYlwiXG4gICAgfSBlbHNlIGlmIChhIDwgYikge1xuICAgICAgICBcImEgPSAkYVwiXG4gICAgfSBlbHNlIHtcbiAgICAgICAgXCJpZ3VhaXNcIlxuICAgIH1cbiAgICBwcmludGxuKFwiTWVub3IgdmFsb3IgZW50cmUgYSBlIGI6ICRNaW5WYWx1ZVwiKVxuICAgIFxuICAgIHByaW50bG4oXCJcXG4+PiBFc3RydXR1cmEgZGUgY29udHJvbGU6IHdoZW5cIilcbiAgICB3aGVuIHtcbiAgICAgICAgYSA+IGIgLT4ge3ByaW50bG4oXCJJaWloaHV1dXV1IVwiKX1cbiAgICAgICAgKGEgIT0gYikgYW5kIChhIDwgYykgLT4ge3ByaW50bG4oXCJPeGkhIVwiKX0gICAvLy0+IHNlIGV4ZWN1dGFyIHVtYSBjb25kacOnw6NvIGFzIGRlbWFpcyBzZXLDo28gaWdub3JhZGFzXG4gICAgICAgIGIgPT0gMiAtPiB7cHJpbnRsbiAoXCJTb29vb28uLi5cIil9XG4gICAgICAgIGVsc2UgLT4ge3ByaW50bG4oXCJEZXUgcnVpbS4uLlwiKX1cbiAgICB9XG4gICAgXG4gICAgdmFsIHllYXIgPSAoLTQwMDAuLjQwMDApLnJhbmRvbSgpXG4gICAgdmFyIHBlcmlvZDpTdHJpbmc/XG4gICAgcGVyaW9kID0gd2hlbiAoeWVhcikge1xuICAgICAgICBpbiAtNDAwMC4uNDc1IC0+IHtcIkFudGlnYVwifVxuICAgICAgICBpbiA0NzYuLjE0NTIgLT4ge1wiTcOpZGlhXCJ9XG4gICAgICAgIGluIDE0NTMuLjE3ODggLT4ge1wiTW9kZXJub2FcIn1cbiAgICAgICAgaW4gMTc4OS4uMjAyMSAtPiB7XCJDb250ZW1wb3LDom5lYVwifVxuICAgIFx0aW4gMjAyMi4uNDAwMCAtPiB7XCJGdXR1cmFcIn1cbiAgICAgICAgZWxzZSAtPiB7XCJJbXBvc3NpYmxlXCJ9XG4gICAgfVxuICAgIHByaW50bG4oXCIkeWVhciBwZXJ0ZW5jZSBhIElkYWRlICRwZXJpb2RcIilcbiAgICBcbiAgICBwcmludGxuKFwiXFxuPj4gRXN0cnV0dXJhIGRlIGNvbnRyb2xlOiBFbHZpcyBPcGVyYXRvciA8PFwiKVxuICAgIHZhbCBhYTpJbnQ/ID0gbnVsbFxuICAgIHZhbCBiYjpJbnQ/ID0gbnVsbFxuICAgIHZhbCBjYzpJbnQ/ID0gMjlcbiAgICBwcmludGxuKGFhID86IGJiID86IFwiVmFsb3JlcyBudWxvc1wiKVxuICAgIHByaW50bG4oYWEgPzogYmIgPzogY2MgPzogXCJWYWxvcmVzIG51bG9zXCIpXG4gICAgXG4gICAgcHJpbnRsbihcIlxcbj4+IEVzdHJ1dHVyYXMgZGUgcmVwZXRpw6fDo28gPDxcIilcbiAgICB2YXIgY291bnQgPSAwXG4gICAgXG4gICAgcHJpbnRsbihcIndoaWxlXCIpXG4gICAgd2hpbGUoY291bnQgPCAxMCkge1xuICAgICAgICBwcmludChjb3VudClcbiAgICAgICAgY291bnQgKz0gMVxuICAgIH1cbiAgICBcbiAgICBwcmludGxuKFwiXFxuZm9yIGluIHN0ZXBcIilcbiAgICBmb3IoY291bnQgaW4gMC4uMTAgc3RlcCAyKSB7XG4gICAgICAgIHByaW50KGNvdW50KVxuICAgIH1cbiAgICBcbiAgICBwcmludGxuKFwiXFxuZm9yIGluIGRvd25Ub1wiKVxuICAgIGNvdW50ID0gMTBcbiAgICBmb3IoaSBpbiBjb3VudCBkb3duVG8gMCBzdGVwIDIpIHtcbiAgICAgICAgcHJpbnQoaSlcbiAgICB9XG4gICAgXG4gICAgcHJpbnRsbihcIlxcbmZvciBpbiB1bnRpbFwiKVxuICAgIGZvcihjb3VudCBpbiAwIHVudGlsIDIwKSB7XG4gICAgICAgIHByaW50KGNvdW50KVxuICAgIH1cbiAgICBcbiAgICBwcmludGxuKClcbiAgICB2YXIgdGV4dCA9IFwiS290bGluIMOpIG8gYmljaG8hXCJcbiAgICBmb3IgKGkgaW4gdGV4dCkge1xuICAgICAgICBwcmludChcIiRpXCIudG9VcHBlckNhc2UoKSlcbiAgICB9XG4gICAgdGV4dC5mb3JFYWNoe1xuICAgICAgICBsIC0+IHByaW50KGwpXG4gICAgfVxuICAgIFxuICAgIHZhciB0ZXh0ID0gXCJLb3RsaW5cIlxuXHR0ZXh0ID0gbnVsbFxuIFx0dGV4dCArPSBcIkxhbmd1YWdlXCJcbn0ifQ==)

- Tipos de estruturas de controle:
  - if/else
  - when : semelhante ao switch/case
  - elvis operator : operador ternário
- Podem ser utilizados tanto para controle de fluxo quanto para atribuição
- Podem ser encadeados com múltiplas estruturas

#### if/else
- Usada para tomada de decisão
- A partir de uma condição é decido se o _bloco if_ será executado, caso contrário o _bloco else_ será executado
- Caso haja mais condições após a primeira condição do _if_, utiliza-se o _else if_ para as demais. É aconselhado que se houver **mais do 3 condições** utilizar a estrutura **when** 

##### Atribuição : if/else 

- Estruturas de controle if/else podem também **retornar algum valor**
- O valor atribuído tem que estar na **última linha do bloco**
- A condicional pode não usar chaves se só fizer a atribuição

#### when
- É equivalente ao switch/case de outras linguagens
- Aceita tanto **valores** quanto **condicionais**, mas não é possível trabalhar com ambos no mesmo bloco
- Aceita range como case

#### Elvis Operator
- O mais próximo que a linguagem possui de um operador ternário
- Verifica se um valor é nulo e apresenta uma opção caso seja
- Pode ser infinitamente encadeada
- _Curiosidade_: Nome Elvis vem do comando _?:_ lembrar um emoji com topete que remete ao cantor Elvis Presley

## Estrutura de repetição
- As estruturas de repetição são similares às convencionais em outras linguagens, são elas:
  - while
  - do..while
  - for
  - forEach
-  As estruturas aceitam os comandos: **in**, **range**, **until**, **downTo** e **step**

#### while e do..while
- Estrutura que continua repetindo até a condição aplicada ser false
- **while** só inicia se a condição for true, **do..while** vai passar uma vez pelo bloco para ao final fazer a validação da condicional

#### for
- Estrutura:
  **for** (variávelIndexadora **in/until/downTo** faixaDeValores/condicional **step** intervalo) {blocoDeExecução}
  - **in**: conta do valor inicial até o valor final estabelecido
  - **Until**: conta do valor atual até o valor estabelecido menos 1
  - **downTo**: conta de maneira decrescente
  - **step**: determina o intervalo da contagem

> Exercício final
> Com os conhecimento aplicados anteriormente, vamos criar uma calculadora que dados dois valores Float? e um número correspondente a operação (constante), retorne e imprima o resultado como Float ou uma mensagem de erro caso um dos valores seja nulo.
> Use sua criatividade! Adicione outras operações como fatorial, porcentagem, potenciação e etc.