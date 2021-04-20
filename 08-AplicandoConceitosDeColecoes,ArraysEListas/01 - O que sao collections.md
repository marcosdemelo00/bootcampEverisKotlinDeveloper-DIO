Aplicando conceitos de Coleções, Arrays e Listas (1/2) [Jether Rodrigues]

Objetivos:
1. List, Arrays, Map, Set e Collections
2. MutableList, MutableMap, MutableSet, MutableIterable e MutableCollection
3. Extensions Functions

[Material Base]{https://kotlinlang.org/docs/collections-overview.html#map}
[Material Base]{https://kotlinlang.org/docs/basic-types.html#arrays}

## Collections

A _Collection<T>_ é a raiz da hierarquia das coleções. Essa interface representa o comportamento comum de uma coleção somente leitura. Você pode usar Collection como um parâmetro de uma função que se aplica a diferentes tipos de coleção. Para casos mais específicos, usa-se os herdeiros da _Collection_: _List_ e _Set_.

- _List_: São coleções ordenadas com acesso por índices - números inteiros que referenciam uma posição, inicia com 0 e vai até (list.size - 1). Os elementos podem ser repetidos
- _Map_: ou _dictionary_ é um conjunto de "chave - valor". As chaves são únicas e direcionam para um determinado valor, porém os valores podem se repetir para diferentes chaves. São utilizados para guardar conecções lógicas entre objetos.
- _Set_: É uma coleção com elementos únicos. Geralmente a ordem dos elementos d eum conjunto não é significante.
- _Arrays_: São representados pela classe _Array_. Possuem funções _get_ e _set_ e são invariantes, de forma que uma Array< String> não pode ser atribuido a um Array< any>.

## MutableCollections

As Mutable Collections são tipos de coleções que estendem a interface "somente leitura" correspondente mas com operações de gravação: adicionar, remover e atualizar seus elementos. Os tipos mutáveis podem ser:

- MutableList
- MutableMap
- MutableSet

## Extension functions

[Material base] {https://kotlinlang.org/docs/extensions.html#extensions-are-resolved-statically}

No Kotlin temos a possibilidade de estender uma classe com novas funcionalidades sem ter que herdar da classe ou usar padrões de design, como Decorator. Isso é feito por meio de declarações especiais chamadas extensões.

Por exemplo, você pode escrever novas funções para uma classe de uma biblioteca de terceiros que você não pode modificar. Essas funções estão disponíveis para chamadas da maneira usual, como se fossem métodos da classe original. Esse mecanismo é chamado de funções de extensão. Existem também propriedades de extensão que permitem definir novas propriedades para classes existentes.

As extensões não modificam realmente as classes que estendem. Ao definir uma extensão, você não insere novos membros em uma classe, mas apenas cria novas funções que podem ser chamadas com a notação de ponto em variáveis ​​desse tipo.