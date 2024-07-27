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
    - ex. INT...ref --> INT..ref --> INT...ref --> INT...null
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
    - ex.  null <-- INT..ref <-- INT...ref <-- INT...ref <-- ref
- Método Top: Pega o conteúdo do último elemento da pilha, e mantém ele na pilha
- Método Pop: Pega o conteúdo do último elemento da pilha, removendo ele da pilha
- Método push: Gera uma nova referencia de topo para a pilha