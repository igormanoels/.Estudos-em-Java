## O que é versionamento de código?
- Registra o histórico de atualizações de um arquivo;
- Geria quais foram as atualizações, a data, autor, etc.;
- Organização, controle e segurança.


### CVCS - Centralizado
Trás um servidor que fica responsavél pelas áres de trabalho, porém se o servidor cair você não consegue trabalhar no projeto.

                Servidor Central
                Banco de Versões    
                    Versão 3
arquivo <---        Versão 2        ---> arquivo
                    Versão 1

### DVCS - Distribuído
Trás os bancos de versão duplicados localmente, logo é possível realizar trabalhos mesmo com o servidor fora do ar.

- Clonar um repositório o que inclui o histórico de Versões.
- Cada clone é como um backup;
- Possibilita um fluxo de trabalho flexível;
- Possibilidade de trabalho sem conexão à rede.

                Servidor Central
                Banco de Versões    
                    Versão 3
arquivo <--->       Versão 2       <---> arquivo
Banco de Versões    Versão 1      Banco de Versões
Versão 3                           Versão 3
Versão 2       <------------>      Versão 2    
Versão 1                           Versão 1


## O que é Git?
Sistema de Controle de Versão Distribuído.
- Gratuito e Open Source;
- Ramificações (branching) e fusões (merging) eficientes;
- Leve e rápido.

[link sobre o Git] (https://www.git-scm.com/about)
[link da Documentação] (https://www.git-scm.com/doc)

### Configurando e Comandos
- ctrl + L: limpa o terminal
- git config: Permite visualizar e definir variáveis de configuração do Git.
- git config --global --list: Retorna todas as configurações globais (Usuário, E-mail e Diretório do Projeto).
- git config --global user.name "seu nick name": Define o usuário que realizara as modificações no repositório.
- git config --global user.email "seu email": Define o usuário que realizara as modificações no repositório.
- git config user.name: Retorna o usuário cadastrado.
- git config user.email: Retorna o email cadastrado.
- git config init.defaulfBranch: Retorna em qual Branch o git está Configurando.
- git config --global init.defaulfBranch **NomeDaBranch**: Altera a Branch no Git para o versionamento dos projetos.
- git clone + código https: Retorna uma cópia do repositório desejado **(Necessário ter um tokken ativo)**.
- git config --global credential.helper cache/store (temporário/permanente): salva o tokken do repositório.
- git config --global credential.helper: Retorna o tipo de configuração da credencial se ela é cache ou store (temporário/ permanente).
- mkdir **NomeDaPasta**: Cria um diretório no local.
- cd **NomeDaPasta**/ : Acessa a pasta desejada.
- git init: Inicializa um repositório Git dentro da pasta desejada.
- cd .git: Faz com que se tenha acesso ao conteúdo oculto do repositório.
- ls: Lista todo o conteúdo dentro da pasta.
- cat **NomeDoArquivo**: Retorna o conteúdo do arquivo.
- rm -rf .git: Remove a atribuição de repositório git para aquele diretório local.
- git restore **NomeDoArquivo**: Restaura os arquivos locais, de acordo com o conteúdo salvo no repositório do GitHub.
- git reset --soft **LogDoCommit**: Restaura os arquivos para a versão antes desse último commit informado.


### Fluxo básico
- git clone: Clona um repositório Git existente para um novo diretório local.
- git status: Mostra o status dos arquivos.
- git add **NomeDoArquivo**: Coloca o arquivo dentro da área de preparação para commit.
- git add . : Coloca todo o conteúdo do diretório na área de preparação.
- git log: Mostra as informações de identidade sobre o commit.
- git commit -"Espaço para colocar a mensagem desejada sobre o commit": Grava alterações no repositório.
- git pull: Puxa as alterações do repositório para o local (busca e mescla).
- git push: Empurra as alterações do repositório local para o remoto.
- echo **NomeDaPasta/NomeDoArquivo** > .gitignore: Adciona o conteúdo a uma lista de exceção para não ser inserido no repositório do GitHub.


## O que é GitHub
Plataforma de hospedagem de código para controle de versão com Git, e colaboração.
- Comunidade ativa;
- Utilizado mundialmente;
- Mascote "Octocat";
- linguagem utilizada em repositórios para arquivos ReadMe.md é o Markdown;
- Apertando apenas o **.** no teclado dentro do repositório do GitHub estando logado, você tem acesso ao VSCode online.

[link GitHub] (https://github.com/)
[link Guia do Markdown] (https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github)
[link Plataforma de desenvolvimento em Markdown] (https://readme.so/pt)


## O que é um Branch (ramo)
É uma ramificação do projeto, que aposta para o último commit realizado.
- Branch **main** é a principal do projeto
- Pode haver mais de uma Branch, com nomes independentes para o teste de funcionalidades
- Para a **main** aponte para outras branches é necessário realizar a mesclagem 
    - git checkout -b **NomeDaBranch**: Cria uma Branch para a reaização de commit
    - git commit -v: Lista os últimos commit realizados para as branches
    - git marge **NomeDaBranch**: Quando dentro da main ele executa a mesclagem com a branch apontada
    - git branch: Lista as braches existentes, um * será colocado para apontar onde o usuário está localizado
    - git branch -d **NomeDaBranch**: Deleta a branch desejada
    - git stash: Arquiva uma modificação realizada
    - git stash list: Lista as modificações que foram arquivadas


