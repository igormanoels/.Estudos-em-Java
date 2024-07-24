#   APACHE MAVEN: FERRAMENTA PARA GERENCIAR BUILD E DEPENDENCIAS DE UM PROJETO
	  
##  COMANDO NO APACHE MAVEN
	  
-   mvn compile - COMPILA TODOS OS PROJETOS, E INSERE DENTRO DA PASTA TARGET
-   mvn test - EXECUTA UM TESTE, A PARTIR DAS CLASSES DE TESTE
-   mvn package - CRIA UM PACOTE DA APLICAÇÃO EM .jar
-   mvn clean - LIMPA O DIRETÓRIO DE TRABALHO, APAGANDO A TASTA DE TESTE

## 
	  
* MAVEN ARCHTYPE LIST - MODELOS DE PROJETOS *
- https://maven.apache.org/archetypes/index.html
	  
* POM - PROJECT OBJECT MODEL*
- É A PARTIR DO POM QUE O MAVEN COMPREENDE AS DEPENDÊNCIAS DO PROJETO
	  
* REPOSITÓRIOS *
- LOCAL ONDE SE ENCONTRA PLUGINS E BIBLIOTECAS
	  
* DEPENDÊNCIA DIRETA * - DECLARADA NO pom.xml
* DEPENDÊNCIA TRANSITIVA * - É DECLARADA POR OBRIGAÇÃO APARTIR DAS DEPENDÊNCIAS DECLARADAS NO pom.xml
	  
### TIPOS DE ESCOPOS
* compile *:
-   Descrição: Este é o escopo padrão se nenhum outro escopo for especificado.
-   Características: 
-   Transitivo: Sim
-   Disponível em todos os classpaths (compilação, execução e teste).
-   Uso Comum: Dependências que são necessárias para compilar, testar e executar o aplicativo.
	  
* provided *:
-   Descrição: Dependência fornecida pelo ambiente de execução (como um servidor de aplicações).
-   Características:
-   Transitivo: Não
-   Disponível apenas no classpath de compilação e teste.
-   Uso Comum: Dependências que são necessárias para compilar e testar, mas que serão fornecidas pelo ambiente de execução.
	  
* runtime *:
-   Descrição: Dependência necessária apenas em tempo de execução.
-   Características:
-   Transitivo: Sim
-   Disponível nos classpaths de runtime e teste, mas não no classpath de compilação.
-   Uso Comum: Dependências que não são necessárias para compilar, mas são necessárias para executar o aplicativo.
	  
* test *:
-   Descrição: Dependência usada somente para compilar e executar testes.
-   Características:
-   Transitivo: Não
-   Disponível apenas nos classpaths de compilação e execução de testes.
-   Uso Comum: Bibliotecas de teste, como frameworks de teste unitário.
	  
* system *:
-   Descrição: Similar ao provided, mas a dependência deve ser explicitamente fornecida pelo sistema (ou seja, não será baixada do repositório de dependências).
-   Características:
-   Transitivo: Não
-   Disponível nos classpaths de compilação e teste, mas não no classpath de runtime.
-   Uso Comum: Dependências específicas do sistema que não estão disponíveis em repositórios de dependências e devem ser incluídas manualmente.
	  
* import *:
-   Descrição: Usado no escopo de dependências de tipo pom para importar dependências de um POM específico.
-   Características:
-   Transitivo: Sim
-   Importa dependências de outro POM no dependencyManagement do seu projeto.
-   Uso Comum: Gerenciar versões de dependências em projetos multi-módulos.
	  
### 	MAVEN BUILD LIFECYCLE
-    default Lifecycle: Principal ciclo, e responsável pelo deply local e composto por 23 fases.
-    clean Lifecycle: Fase de limpeza do projeto, composto por 3 fases.
-    site Lifecycle: fase de publicação, responsavél pela documentação de um projeto e composto por 4 fases.
	   
