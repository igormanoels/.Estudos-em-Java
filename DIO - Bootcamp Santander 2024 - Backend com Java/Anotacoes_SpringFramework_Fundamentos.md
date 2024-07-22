# Java com Spring Framework

## Aula 1
- O que é Spring Framework?: Framework open source desenvolvido para a plataforma Java baseado nos padrões de projetos inversão de controle e injeção de dependência.
- Spring Versus Java EE: Olhando um pouco a história, há muito, mas muito tempo atrás, o Java EE era realmente muito complicado e nem era necessário entrar numa discussão, usar o Spring era um caminho mais simples e mais fácil de evoluir. Aí chegou a versão 5 do Java EE e a discussão voltou a ficar um pouco mais quente.
- Conceito de Inversão de Controle (Inversion of Control ou IOC): Trata-se do redirecionamento do fluxo de execução de um código retirando parcialmente o controle sobre ele e delegando-o para um container. O principal propósito é minimizar o acoplamento do código.
- Injeção de Dependências: Injeção de dependência é um padrão de desenvolvimento com a finalidade de manter baixo o nível de acoplamento entre módulos de um sistema.
- Beans: Objeto que é instanciado (criado), montado e gerenciado por um container através do princípio da inversão de controle.
- Autowired: Uma anotação (indicação) onde deverá ocorrer uma injeção automática de dependência.
    - byName: É buscado um método set que corresponde ao nome do Bean.
    - byType: É considerado o tipo da classe para inclusão do Bean.
    - byConstrutor: Usamos o construtor para incluir a dependência.
- Scopes:
    - Singleton: O contêiner do Spring IOC define apenas uma instância do objeto.
    - Prototype: Será criado um novo objeto a cada solicitação ao container.
    - Http Request: Um bean será criado para cada requisição HTTP. Os objetos existirão enquanto a requisição estiver em execução.
    - Http Session: Um bean será criado para a sessão de usuário. Precisamos acessar a mesma solicitação duas vezes para testar os escopos específicos da web.
    - http Global: Ou Application Scope cria um bean para o ciclo de vida do contexto da aplicação. Objetos compartilhados por toda a aplicação.


## Aula 2
- O que é Springboot?: Enquanto que o Spring Framework é baseado no padrão de injeção de dependências, o Springboot foca na configuração automática.
- Configurações manuais: Dado que a maior parte das configurações necessárias para o início de um projeto são sempre as mesmas, por que não iniciar um projeto com todas estas configurações já definidas?
- Starters: Descritores de dependências
- Principais Starters:
    - data-jpa: Integração ao banco de dados via JPA - Hibernate.
    - data-mongodb: Interação com banco de dados MongoDB.
    - web: Inclusão do container Tomcat para aplicações REST.
    - web-services: Webservices baseados na arquitetura SOAP.
    - batch: Implementação de JOBS de processos.
    - test: Disponibilização de recursos para testes unitários como JIJnit
    - openfeign: Client HTTP baseado em interfaces
    - actuator: Gerenciamento de monitoramento da aplicação.
- Configuração de fábrica

*Quando usar @Bean?* 
-Quando não se tem acesso ao código fonte, ex. uso de uma api

*Quando usar @Component?*
- Quando se tem uma classe que pode ser utilizada através do conceito de injeção de dependências

*@Scope ("prototype/singleton")*
- Singleton:
    - Único objeto, sendo manipulado pelas dependencias
- Prototype:
    - A cada dependencia da aplicação um objeto

*@Value*
- Nem tudo precisa ser explicito

*Spring Web*
- REST: A API REST (representational state transfer) é como um guia de boas práticas
- RESTful: E RESTful é a capacidade de determinado sistema aplicar os princípios de REST.
    - GET: Retornar Dados
    - POST: Gravar Dados
    - PUT: Alterar Dados
    - DELETE: Remover Dados
- Controllers: Um controller é um recurso que disponibiliza as funcionalidades de negócio da aplicação através do protqcolo HTTP. 
    - @RestController: Responsável por designar o bean de compoment que surporta requisições HTTP com base na arquitetura REST.
    - @RequestMapping("prefiR'): Determina qual a URI comum para todos os recursos disponibilizados pelo Controller.
    - @GetMapping: Determina que o método aceitará requisições HTTP do tipo GET.
    - @PostMapping: Determina que o método aceitará requisições HTTP do tipo POST.
    - @PutMapping: Determina que o método aceitará requisições HTTP do tipo PUT.
    - @DeleteMapping: Determina que o método aceitará requisições HTTP do tipo DELETE.
    - @RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
    - @PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos nas requisições.
- Swagger: O Swagger é usado junto com um conjunto de ferramentas de software de código aberto para projetar, construir, documentar e usar serviços da Web RESTful
- Exception Handler: 
- O Starter do spring lança a API dentro da porta Localhost:8080
