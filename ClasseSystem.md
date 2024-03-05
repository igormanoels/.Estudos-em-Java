**Tabela com as Principais funções de manipulação da classe System em Java:**


| Método/Campo                | Descrição                                                                                              | Exemplo de Uso                                    |
|-----------------------------|--------------------------------------------------------------------------------------------------------|---------------------------------------------------|
| `in`                        | Representa a entrada padrão do sistema, geralmente associada ao teclado.                                | `int c = System.in.read();`                      |
| `out`                       | Representa a saída padrão do sistema, geralmente associada ao console.                                 | `System.out.println("Hello, World!");`           |
| `err`                       | Representa o fluxo de erro padrão do sistema, geralmente associado ao console para mensagens de erro. | `System.err.println("Erro: divisão por zero");`  |
| `currentTimeMillis()`       | Retorna o tempo atual em milissegundos desde a meia-noite de 1º de janeiro de 1970 (tempo Unix).      | `long currentTime = System.currentTimeMillis();`|
| `nanoTime()`                | Retorna o tempo atual em nanossegundos.                                                                 | `long nanoTime = System.nanoTime();`             |
| `getProperty(String key)`   | Retorna o valor da propriedade do sistema especificada pela chave.                                      | `String osName = System.getProperty("os.name");` |
| `setProperty(String key, String value)` | Define o valor da propriedade do sistema especificada pela chave.                                  | `System.setProperty("my.property", "value");`    |
| `clearProperty(String key)` | Remove a propriedade do sistema especificada pela chave.                                               | `System.clearProperty("my.property");`           |
| `getenv(String name)`       | Retorna o valor da variável de ambiente do sistema especificada pelo nome.                              | `String javaHome = System.getenv("JAVA_HOME");`  |
| `exit(int status)`          | Encerra a execução do programa Java com o status especificado.                                         | `System.exit(0);`                                |
| `gc()`                      | Solicita ao coletor de lixo que seja executado.                                                         | `System.gc();`                                   |
| `arraycopy(Object src, int srcPos, Object dest, int destPos, int length)` | Copia uma matriz de objetos de uma origem para um destino. | `System.arraycopy(src, srcPos, dest, destPos, length);` |
| `identityHashCode(Object x)` | Retorna o código de hash para o objeto especificado.                                                    | `int hashCode = System.identityHashCode(obj);`    |
| `load(String filename)`     | Carrega o arquivo de biblioteca específico.                                                             | `System.load("mylib.dll");`                      |
| `loadLibrary(String libname)` | Carrega a biblioteca especificada.                                                                     | `System.loadLibrary("mylib");`                   |
| `mapLibraryName(String libname)` | Retorna o nome da biblioteca nativa mapeada para a plataforma específica.                              | `String libName = System.mapLibraryName("mylib");`|
| `runFinalization()`         | Executa o método `finalize()` de todos os objetos que estão pendentes de finalização.                  | `System.runFinalization();`                      |
| `runFinalizersOnExit(boolean value)` | Ativa ou desativa a execução automática do método `finalize()` em objetos pendentes de finalização quando o programa termina. | `System.runFinalizersOnExit(true);`          |

Essa tabela oferece uma visão mais detalhada dos métodos e campos da classe `System`, incluindo descrições e exemplos de uso para cada um deles. 