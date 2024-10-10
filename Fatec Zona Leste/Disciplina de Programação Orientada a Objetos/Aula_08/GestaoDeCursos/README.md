# Ex19 - Curso (Boundary, Control e Entity) - Simplificado

## Instruções

Exercício - Curso (Boundary, Control e Entity) – Simplificado Usando Java FX

Crie um CRUD para fazer a manutenção de cursos, contendo o Boundary, o Control e a Entidade (BCE), contendo um botão para adicionar novo curso e outro para pesquisar, conforme layout abaixo:

*Curso:*
- Id        
- Nome
- Código do Curso
- Nome do Coordenador
- Quantidade de alunos

1 - Faça com que o Control guarde a lista de cursos e tenha uma função para gravar novos cursos [ public void gravar(Contato c) ] e outra função para pesquisar [ public Contato pesquisar( String parteNome ) ] para localizar um curso pelo nome

2 - Faça com que o Boundary tenha uma instância de Control e acione os métodos gravar e pesquisar desta instância conforme os botões gravar e pesquisar são acionados.
Dentro do Boundary crie uma função [ public Curso toEntity() ] que irá gerar e retornar um objeto do tipo Curso com os dados que estiverem na tela. Crie também uma função chamada [ public void fromEntity(Curso c) ] que deverá pegar os dados do objeto do tipo Curso informado no parâmetro colocando-os na tela.
