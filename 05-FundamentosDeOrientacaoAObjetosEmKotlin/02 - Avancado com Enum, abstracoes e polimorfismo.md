Fundamentos de Orientação a Objetos com Kotlin 2/2 (Jether Rodrigues do Nascimento)

> Avançado com Enum, abstrações e polimorfismo

## Introdução a Enum
Enumeração é uma lista nomeada de constantes.  
Em Kotlin, como em muitas outras linguagens de programação, uma enumeração tem seu próprio tipo especializado [_enum_], indicando que algo tem uma série de valores possíveis. Ao contrário dos enums Java (que são um tipo de estrutura de dados), os **enums** Kotlin **são classes**.  
Alguns pontos importantes sobre as classes enum em kotlin:
- As constantes de Enum não são apenas meras coleções de constantes - elas têm propriedades, métodos, etc.
- Cada uma das constantes de enum atua como instâncias separadas da classe e separadas por vírgulas.
- Enums aumenta a legibilidade de seu código atribuindo nomes predefinidos a constantes.
- Uma instância da classe enum não pode ser criada usando construtores.  

[ Material complementar ](https://www.geeksforgeeks.org/enum-classes-in-kotlin/)

## Abstrações - Classes abstratas
A programação Orientada a Objetos permite a reutilização de código de forma que uma classe pode fornecer suas propriedades para outras classes. Dessa forma é possível que uma superclasse estenda seus membros (atributos e métodos) para outras subclasses que podem assim especializar suas características.  
Assim como Java, a keyword **abstract** é usada para declarar uma classe ou método abstrato. As classes abstratas não podem ser instanciadas, ou seja, não possível criar objetos dela. No entanto, você pode **herdar** subclasses deles.  
Por padrão, as classes Kotlin são finais: não podem ser herdadas. Para que se possa herdar de uma classe, é preciso acrescentar o modificador **open**. Os métodos abstratos não possuem funções e precisam ser implementados nas subclasses [_override_].  

[ Material complementar ](https://www.programiz.com/kotlin-programming/abstract-class)

##### Interfaces
As interfaces em Kotlin podem conter declarações de métodos abstratos, bem como implementações de métodos. O que os torna diferentes das classes abstratas é que as interfaces não podem armazenar estados. Eles podem ter propriedades, mas precisam ser abstratos ou possibilitar a implementações das classes herdeiras.

[ Material Complementar ](https://kotlinlang.org/docs/interfaces.html)

## Polimorfismo
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse.
