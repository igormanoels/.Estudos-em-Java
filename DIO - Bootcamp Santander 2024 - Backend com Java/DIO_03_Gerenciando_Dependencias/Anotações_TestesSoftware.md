# Aula 1: Definição e conceitos básicos: Introdução a testes de software

" Testes de software é o processo de execução de um produto para determinar se ele atingiu suas especificações e funcionou corretamente no ambiente para o qual foi projetado " (Dias Neto)

"Testes podem ser usados para mostrar a presença de bugs, mas nunca para mostrar sua ausência" (Edsger W. Dijkstra)

## MODELO DE TESTE DE SOFTWARE

*CASCATA*
Especificação --> Projeto de Software --> Implementação --> Testes --> Implantação

*DESENVOLVIMENTO ÁGIL*
Reunião e Planejamento --> Projeto --> Desenvolvimento e Teste --> Implantação --> Feedback

    Reunião e Planejamento --> Projeto;
    Projeto --> Desenvolvimento e Teste; 
    Desenvolvimento e Teste; --> Implantação;
    Implantação --> Feedback;
    Feedback --> Reunião e Planejamento;

- Defeito: É um um desenvolvimento técnico que não foi realizado devidamente (conhecido bug). 
- Erro: São é um caminho/ cenário inesperado.
- Falha: São os cenários inesperados (tudo o que usuário tenha contato).
- Verificação: Parte da análise para entender, se o sistema atende as necessidade dos requisitos levantados.
- Validação: Buscar compreender se as regras de negócio estão sendo atendidas no desenvolvimento do projeto.


## NÍVEIS E TÉCNICAS DE TESTE

*Níveis de teste*

Unidade --> Integração --> Sistema --> Regressão --> Aceitação
- Unidade: Testes direcionados as pequenas unidades de software (validando os métodos a partir das entradas). 
- Integração: Testes voltados para estruturas maiores (validando integrações com banco de dados, api's, etc).
- Sistema: Testes realizados para compreender o comportamento do software dentro do ambiente de uso.
- Regressão: Passa por reavaliar o que está sendo desenvolvido, é o momento de compreender se novas funções não causam impacto nas que já estão implantadas.
    - Alpha: Testes em ambiente de produção, para que validações sejam realizadas.
    - Beta: Testes com maior maturidade, com um público maior.
    - Cannary: É uma estratégia de deploy, implantando um sistema em produção.
- Aceitação: Voltado para o cliente, para que ele de o feedback sobre o que ele pensa a respeito do sistema desenvolvido.

*Técnicas de teste*
- Caixa Branca (teste estrutural): Passa por conhecer o código, voltado para validação dos dados, controle de fluxo e chamadas.
- Caixa Preta (teste funcional): Passa por verificar as saídas usando vários tipos de entrada, sem conhecer a estrutura interna do software.

*Teste não funcionais*
- São testes ligados a requisitos não funcionais, ex: Comportamento do sistema, performance, escalabilidade, segurança, infraestrutura.
- Teste de Carga: Realizado para verificar até que ponto o volume de acessos é suportado.
- Teste de Stress: Submete o software a condições extremas, para entender como ele se comporta.
- Teste de segurança: Busca encontrar vulnerabilidades dentro do sistema, para asegurar sua integridade.

*Pirâmide de Testes*
- (topo) UI Tests: Voltados para a interface.
- (meio) Service Tests: Voltado para conexões entre API e Banco de Dados.
- (base) Unit Tests: Voltados para os métodos e controle dos fluxos.

*Obs*: Quando mais pro topo, mais integrado e lento. E quando mais para a base, mais isolado e rápido.


## Testes Unitários com JUnit

*Objetivos:* 
- Compreender o código fonte
- Corrigir bugs com segurança
- Refatorar código sem introduzir bugs
- Entregar com segurança uma nova feature

*Para que serve?*
- Pirâmide de Testes
- Testes unitários como métrica de Qualidade (confiabilidade)
- Cobertura de Testes
- Automação na execução de testes
- Cultura de agilidade

*História*
- JUnit é um framework open source para a criação de teste unitários

*links:*
- https://mvnrepository.com/search?q=junit
- https://mvnrepository.com/search?q=mockito


