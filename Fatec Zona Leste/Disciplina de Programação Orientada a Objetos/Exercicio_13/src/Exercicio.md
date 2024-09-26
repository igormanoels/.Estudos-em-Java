Instru��es
Crie um sistema para gest�o de Alunos

O sistema dever� permitir a Cria��o, Atualiza��o, Remo��o e Exibi��o do(s) Aluno(s).
A classe Aluno deve conter as seguintes caracter�sticas e comportamentos.


Caracter�sticas :

id : long
nascimento : Date
ra : String
nome : String
Comportamentos :

String toString()    // Deve retornar um texto com os dados do aluno



Crie uma classe chamada GestaoAlunos, contendo as seguintes caracter�sticas e comportamentos.


Caracter�sticas:

indice : int      // Indica em qual posi��o deve ser guardada a proxima inst�ncia de aluno
alunos : Aluno[]  // Matriz com 50 alunos
Comportamentos:

void criar()
void atualizar()
void excluir()
void exibir()
void menu()

Regras do sistema
O comportamento criar() deve criar uma nova inst�ncia de Aluno, preencher as caracter�sticas desta inst�ncia com informa��es fornecidas pelo usu�rio, e deve guardar esta inst�ncia de aluno na matriz (alunos) na posi��o indicada pela vari�vel indice.
A fun��o exibir() deve pedir ao usu�rio para que digite um n�mero de RA e procure qual aluno na matriz (alunos) possui um RA id�ntico. Os dados do aluno encontrado devem ser exibidos na tela.
A fun��o excluir() deve pedir ao usu�rio para digitar um RA, e em seguida deve excluir o(s) aluno(s) com este RA da matriz (alunos)
A fun��o atualizar() deve pedir ao usu�rio para digitar um RA, e em seguida deve procurar pelo primeiro aluno na matriz (alunos) que contenha este RA. A fun��o deve  em seguida solicitar ao usu�rio para que digite os demais dados do aluno (nome e nascimento) para trocar os valores das caracter�sticas do aluno encontrado na matriz pelos valores rec�m informados pelo usu�rio.
O m�todo menu() deve rodar em um loop infinito, mostrando na tela as op��es para o usu�rio:
                (C)riar           (E)xibir             (R)emover               
                (A)tualizar    (S)air

Pegue a primeira letra digitada pelo usu�rio e assuma como sendo a op��o escolhida

String textoMaiusculo = scan.nextLine().toUpperCase();
char letra = textoMaiusculo.charAt(0);
Conforme a op��o escolhida o m�todo deve invocar a fun��o correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.

