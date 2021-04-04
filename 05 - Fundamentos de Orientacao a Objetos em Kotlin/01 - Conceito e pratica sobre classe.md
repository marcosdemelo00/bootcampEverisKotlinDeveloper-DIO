Fundamentos de Orientação a Objetos com Kotlin 1/2 (Jether Rodrigues do Nascimento)

> Conceito e prática sobre classe

Objetivos:
1. Introdução a orientação a objetos em Kotlin
2. Implementação de classe pública e privada
3. classes, construtores, métodos e propriedades
4. entendendo data classes e o principal conceito dobre elas
5. Casses abstratas e interfaces
6. Enum, subclasses, herança e polimorfismo

Requisitos básicos:
- Ter realizado as competências anteriores da Trilha Kotlin
- Instalação da IDE Intellij Community
- Possuir conhecimento sobre o use de Git para versionamento de código
- Possuir conhecimento sobre o gerenciador de dependências, Maven

#### Projeto Prático
Projeto que será utilizado para aplicação dos conhecimentos. Consiste de uma aplicação que vai simular um banco:

>  [Aplicação DigiOneBank](/digitalinnovation).    

Será composto inicialmente por 3 classes:
  - Bank (name, number)
  - Account (branch, number, amount
  - Person (name, taxidentifier)

## Orientação de Objetos em Kotlin
Os conceitos de Orientação a Objetos são comuns a todas as linguagem que suportam esse paradigma. De forma que os conhecimentos de POO aprendidos em Kotlin podem ser utilizados em quais outras linguagens, como Java, Dart, Python, etc.
Ela foi concebida com uma ideia diferente do paradigma procedural (código lido processo a processo), pois nesse paradigma um único código possui todas as instruções, operações e funções do programa tornando o entendimento do processo, em seu todo e suas partes, muito complicado.
Dessa forma o paradigma orientado a objetos trás uma nova abordagem a programação, ela permite a abstração de objetos do mundo real para representação dentro de uma aplicação, com isso é possível modelar e dividir o programa (o código) utilizando e construindo os objetos dentro da aplicação por meio das classes. A Orientação a Objetos possui portanto um nível de complexidade na aprendizagem muito maior maior mas trás um nível de trabalhabilidade, organização e entendimento muito melhor.

#### Classes e Objetos
A abstração do mundo real feita no paradigma de orientação a objetos é feita por intermédio das classes. As classes podem ser definidas como um conjunto de características (atributos) e comportamentos (métodos) que pertencem a um grupo de objetos, é a representação de uma estrutura do mundo real dentro da aplicação.
Das classes podemos então construir objetos. Objetos são as estruturas que são manipuladas e trabalhadas dentro da POO, elas são criadas e referenciadas na memória do computador para uso posterior.
Ex.: Classe : automóvel > Objetos: Carro, Ônibus, Caminhão.

#### Classes - Membros
Os membros de uma classe são as **propriedades (atributos)**, **funções (métodos)** e **construtores**.   
As **propriedades** são os **atributos** de uma classe, as informações que compõem as características na construção de uma classe. Enquanto as **funções** ou **métodos** são ações que as classe podem tomar, realizam alguma operação com as informações do estado do objeto, é o comportamento de uma classe. Os **construtores** são os responsáveis por construir os objetos.  
As classes podem também possuir outras classes como membros, uma inner class dentro de uma outer class. Para utilizar este recurso é necessário muita análise, pois, a depender do projeto, esta pode tirar a flexibilidade de alguma ação. Não é qualquer hora, lugar e momento que se deve ou se consegue utilizar essa ferramenta.

#### Classes - Modificadores
Os membros de uma classe podem possuir características diferentes de acessibilidade mediante a adição de modificadores, esses modificadores podem ser atribuídos também para os getters ou setters especificamente. Eles são:
 - **public**: com esse modificador o membro da classe fica visível em qualquer lugar do código. É o modificador padrão do Kotlin [_default_].
 - **internal**: faz com que o membro seja visível dentro de um módulo. O módulo é um conjunto de arquivos Kotlin que são compilados juntos. Esses podem ser: projetos maven, conjuntos gradle, arquivos gerados doAnt task, ou um módulo do IntelliJ IDEA.
 - **private**: torna o membro visível e acessível apenas dentro do escopo da própria classe, limitando também ao arquivo em que foi declarado. Em Kotlin as _outer classes_ não conseguem ver _privates nested_ (ou _inner_) _classes_
 - **protected**: os membros são vistos apenas dentro de sua classe e de suas subclasses.
 
#### Data Class
Data Class é um modificador para classes que por ele é possível criar objetos cujos os dados são imutáveis, é uma forma de representar as informações ao longe da classe sem ter o perigo de ter as informações ou estado alterado. Podendo ainda implementar interfaces.
É possível realizar uma cópia de uma Data Class (_objName.copy()_) e a partir dessa cópia é possível trabalhar com os valores, manipulando as informações pois essa tem um estado novo.