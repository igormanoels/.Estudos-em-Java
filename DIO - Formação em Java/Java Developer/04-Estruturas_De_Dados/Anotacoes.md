# Estrutura de Dados
## Introdução 
- Na manipulação de variáveis com valores atribuído, os valores em memória são copiados. Ou seja, a manipulação refere-se ao conteúdo do endereço de memória.
- Já na manipulação de objetos, o que se é copiado é o endereço de memória.

Ex.:
int valorA = 1;
int valorB = valorA;
System.out.println("Valor A: " + valorA + " - Valor B: " + valorB);

valorA = 2;
System.out.println("Valor A: " + valorA + " - Valor B: " + valorB);

*saída*        
Valor A: 1 - Valor B: 1
Valor A: 2 - Valor B: 1

Objeto objA = new Objeto(1);
Objeto objB = objA;
System.out.println("Valor A: " + objA + " - Valor B: " + objB);
		
objA.setNum(2);
System.out.println("Valor A: " + objA + " - Valor B: " + objB);

*saída*
Valor A: 1 - Valor B: 1
Valor A: 2 - Valor B: 2


## Conceito de Nó e Encadeamento
- O nó é um espaço em memória que armazena um dado, e a referência para a próxima informação.
- Essa ramificação não é infinica, ela se segue até o último nó apontar para nulo
    - ex. Nó...ref --> Nó..ref --> Nó...ref --> Nó...null
    - System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    - Caso o haja uma tentativa de acessar um nó após o *null*, o java retorna um erro *NullPointerException*


## Gererics <T>
- Usado para evitar o casting excessivo
- Também para evitar redundancia
- E para encontrar erros em tempo de compilação
- Unknown Wildcard: Usado para receber qualquer tipo de objeto
- UpperBounded Wildcard: Usado para receber listas, que são decendentes (filhas) de uma classe expecifica 
- LowerBounded Wildcard: Usado para receber listas, de classes acendentes (mães) de uma classe expecifica
- Implementação segundo a convenção
    - K para "Key", exemplo : Map<K,V>
    - V para "Value", exemplo : Map<K,V>
    - E para "Element", exemplo : List<E>
    - T para "Type", exemplo : Collections#addAll
    - ? quando genérico


## Pilhas
- O conceito de pilhas leva em consideração o padrão last-in, first-out. Sempre o último elemento é o primeiro a sair
    - ex.  null <-- Nó..ref <-- Nó...ref <-- Nó...ref <-- Nó
- Métodos 
    - Top: Pega o conteúdo do último elemento da pilha, e mantém ele na pilha
    - Pop: Pega o conteúdo do último elemento da pilha, removendo ele da pilha
    - Push: Gera uma nova referencia de topo para a pilha


## Filas
- FIFO (First in First out): o primeiro a entrar é o primeiro a sair
    - ex. ref --> Nó...ref --> Nó..ref --> Nó...ref --> Nó...null
- Métodos:
    - enqueue(): Enfileirar, pega um elemento, joga atrás da fila, e faz com que a referente aponte pra ele
    - dequeue(): Desenfileirar, pega o primeiro elemento da fila, remove, e faz com que o segundo aponte para nulo
    - isEmpty: Está vazio, verifica se há conteudo


## Listas Encadeadas
- Métodos:
    - add: Adciona um nó na lista, informando o indice, e altera as refencias do novo nó para o anterior e do posterior para ele
    - remove: Remove um nó da lista, informando o indice, e aponta o nó posterior para o anterior  
    - isEmpty:Verifica se há conteudo
    - get: Pega o conteúdo pelo indece, sem remover da lista, sendo o último elemento iniciado em 0
- ex. ref --> Nó..ref --> Nó...ref --> Nó...null


## Listas Duplamente Encadeadas
- ex.              null <-- ref ant..Nó..ref pos --> ref ant..Nó..ref pos --> null 
        ref.primeiro Nó -->                                               <-- ref ultimo Nó
- Métodos:
    - add(elemento): Adciona um nó na lista, informando o indice, e altera as refencias do novo nó para o anterior e do posterior para ele
    - add(index, elemento)
    - remove(index): Remove um nó da lista, informando o indice, e aponta o nó posterior para o anterior  
    - isEmpty:Verifica se há conteudo
    - get(index): Pega o conteúdo pelo indece, sem remover da lista, sendo o último elemento iniciado em 0


## Listas Circulares
- ex. ref entrada --> Nó..ref --> Nó...ref --> Nó...ref entrada
- Métodos:
    - add(elemento): Adciona um nó na lista, informando o indice, e altera as refencias do novo nó para o anterior e do posterior para ele
    - remove(index): Remove um nó da lista, informando o indice, e aponta o nó posterior para o anterior  
    - isEmpty:Verifica se há conteudo
    - get(index): Pega o conteúdo pelo indece, sem remover da lista, sendo o último elemento iniciado em 0


## Árvores
- Estrutura de dados bidimensional
- Utilização
    - Sistemas de arquivos
    - Banco de dados
    - Interfaces gráficas
    - Páginas Web
- Árvore de busca binária
    - Posição dos nós (maior a direita, menor a esquerda)
- Nó é composto por
    - Objeto
    - Nó Esquerda
    - Nó Direita

## Equals
- Permite a comparação entre igualdades

## hashCode
- Perminte melhorar a busca entre objetos

## Stack Pilha
- É uma estrutura de pilha

## Queue
- É uma estrutura de fila

## List
- É uma estrutura de lista
- Preserva a ordem dos valores inseridos

## Set
- É uma estrutura de lista
- Não preserva a ordem dos valores inseridos

## Map
- É uma estrutura de lista
- Não preserva a ordem dos valores inseridos
- Constituido por uma cadeira de chave e valor

## Collections
- É um objeto que agrupa múltiplos elementos dentro de uma única unidade.
    - List
        - Permite elementos duplicados
        - Garante ordem de inserção
        - ArrayList: Usa um array para guardar os elementos, menos eficiente para remover elementos.
        - LinkedList: Usa uma estrutura de lista duplamente encadeada, mais eficiente para remover elementos. Pode implementar também a interface Queue
    - Set
        - Não permite elementos duplicados
        - Não garante a ordenação por inserção
        - TreeSet: Mantém a ordem natural dos elementos inseridos, pior performance e não permite elementos nulos
        - HashSet: Não mantem a ordem dos elementos inseridos, melhor performance e permite apenas um elemento nulo
        - LinkedHashSet: mantém a ordem dos elementos inseridos e permite apenas um elemento nulo

    - Map
        - Permite elementos únicos chave, para cada valor
        - TreeMap: É utilizado para a ordenação, não permite chaves nulas
        - LinkedHashMap: Permite chaves nulas
        - HashMap: Permite chaves nulas
    - Stream
        - Classe Anonima: É a declaração de uma classe dentro de um método quando o seu uso é breve.
        - Funcional Interface: Pode ser tratada como expressão lambda, sendo elas Comparator, Comsumer, Funcition e Predicate
        - Lambda: O método é declado no mesmo local de uso, definida por (argumento) => (corpo)
        - Reference Method: faz o uso de "::" para simplificar uma expressão lambda
        - Stream API: Facilita a manipulação de coleções, combinada com expressões lambdas. 

