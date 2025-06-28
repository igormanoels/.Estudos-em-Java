# Anotações Sobre o curso de Java


O Java é uma linguagem universal, comumente chamado de 'WORA' justamente por sua versatilidade. 
    
    WORA - Write Once, Run Anywhere (Escreva uma vez, execute em qualquer lugar)


### JVM (Java Virtual Machine)
A Java Virtual Machine é uma máquina virtual, um software que simula uma máquina física e consegue executar vários programas, gerenciar processos, memória e arquivos. Então a JVM vai além de interpretar código, é também responsável pela execução das pilhas, gerenciamento de memória, threads e etc., ou seja, é um “computador virtual”. 

Uma de suas funções que podemos notar aqui é o Garbage Collector. Ele é uma thread responsável pela “limpeza” da memória virtual, ou seja, quando existe muito “lixo” na memória virtual, o Garbage Collector entra em ação. Porém, é difícil prever quando isso irá acontecer, por ele ser uma thread, isso porque as threads são lançadas de acordo com o escalonador de processos.

A JVM não entende código Java, e sim um código especifico chamado ByteCode, que é gerado pelo compilador Java (javac). Esse código é o que será traduzido pela Virtual Machine para o código de cada máquina em questão, ao longo do tempo esses processos foram aperfeiçoados, pois no início, a Virtual Machine interpretava apenas um ByteCode por vez. Hoje em dia, a JVM possui sistemas de compilação JIT (Just - In - Time) misturados com a interpretação do código. Essa técnica cria os chamados “Hot-Spots”, que nada mais são que áreas de código executadas com maior frequência. Isso ocorre com a análise dos ByteCodes à medida que eles são interpretados pela Virtual Machine.

### API (Java Application Programming Interface)
Conjunto de bibliotecas que permite a realização de instruções e troca de informações através de tarefas/ rotinas, atuando através de interface que permitem que um aplicativo acesse recursos ou funcionalidades de outro aplicativo ou biblioteca, sem a necessidade de conhecer os detalhes internos de implementação. 

##
### Instalando o Java
***Windows***
- 1 - [Download Java SE](https://www.oracle.com/br/java/technologies/java-se-glance.html)
- 2 - Teste pelo CMD se o Java está instalado - '**java -version**'
- 3 - Teste pelo CMD se o Compilador do Java está configuirado como variável de ambiente - '**javac -version**'

***Linux***
- 1 - No no Linux faça o download do repositório via comando '**sudo add-apt-repository ppa:webupd8team/java**'
- 2 - Em seguida você deve atualizar o sistema via comando '**sudo apt-get update**'
- 3 - Por fim, utilize o seguinte comando para instalar o Java 
    - Última versão: '**sudo apt install default-jdk**'
    - Versão específica: '**sudo apt install openjdk-'XX'-jdk**''


##
### Rodando o primeiro código
- 1 - Crie um arquivo com extensão java             -->         'HelloWorld.java'
- 2 - Compile o arquivo com o comando               -->         'javac HelloWorld.java'
- 3 - Execute o arquivo compilado com o comando     -->         'java HelloWorld'