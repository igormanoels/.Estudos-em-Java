**Tabela com as Principais funções de manipulação de string em Java:**

Claro, aqui está uma tabela com algumas das funções de manipulação de strings em Java, juntamente com seus códigos e descrições:

| Método                  | Código                                       | Descrição                                                            |
|-------------------------|-----------------------------------------------|----------------------------------------------------------------------|
| `length()`              | `int length = str.length();`                  | Retorna o comprimento da string.                                      |
| `charAt(int index)`     | `char ch = str.charAt(3);` "str é a variavel" | Retorna o caractere no índice especificado.   Para comparar use 'N'   |
| `substring(int beginIndex)` | `String substr = str.substring(5);`       | Retorna uma substring começando pelo índice especificado.             |
| `substring(int beginIndex, int endIndex)` | `String substr = str.substring(2, 5);` | Retorna uma substring do índice inicial até o índice final.         |
| `toLowerCase()`         | `String lower = str.toLowerCase();`           | Retorna uma nova string com todos os caracteres em minúsculas.        |
| `toUpperCase()`         | `String upper = str.toUpperCase();`           | Retorna uma nova string com todos os caracteres em maiúsculas.        |
| `trim()`                | `String trimmed = str.trim();`                | Remove espaços em branco do início e do final da string.              |
| `replace(char oldChar, char newChar)` | `String replaced = str.replace('a', 'b');` | Substitui todas as ocorrências do caractere antigo pelo novo caractere. |
| `startsWith(String prefix)` | `boolean starts = str.startsWith("Hello");` | Verifica se a string começa com o prefixo fornecido.                 |
| `endsWith(String suffix)` | `boolean ends = str.endsWith("World");`      | Verifica se a string termina com o sufixo fornecido.                  |
| `contains(CharSequence sequence)` | `boolean contains = str.contains("Java");` | Verifica se a string contém a sequência especificada.                |
| `indexOf(int ch)`        | `int index = str.indexOf('a');`               | Retorna o índice da primeira ocorrência do caractere especificado.     |
| `lastIndexOf(int ch)`    | `int lastIndex = str.lastIndexOf('a');`       | Retorna o índice da última ocorrência do caractere especificado.       |
| `split(String regex)`    | `String[] parts = str.split("\\s+");`         | Divide a string em substrings com base no regex fornecido.             |
| `isEmpty()`              | `boolean empty = str.isEmpty();`                 | Verifica se a string está vazia.                                      |
| `equals(Object another)` | `boolean equal = str1.equals(str2);`            | Verifica se duas strings têm o mesmo conteúdo.                        |
| `equalsIgnoreCase(String another)` | `boolean equalIgnoreCase = str1.equalsIgnoreCase(str2);` | Verifica a igualdade sem diferenciar maiúsculas e minúsculas. |
| `concat(String str)`     | `String concatenated = str.concat(" extra");`   | Concatena a string com outra string.                                   |
| `join(CharSequence delimiter, CharSequence... elements)` | `String joined = String.join("-", "2018", "01", "01");` | Une elementos em uma string usando um delimitador.        |
| `startsWith(String prefix, int offset)` | `boolean starts = str.startsWith("Hello", 0);` | Verifica se a string começa com o prefixo a partir do índice especificado. |
| `endsWith(String suffix)`| `boolean ends = str.endsWith("World");`         | Verifica se a string termina com o sufixo fornecido.                  |
| `replaceAll(String regex, String replacement)` | `String replacedAll = str.replaceAll("\\s+", "-");` | Substitui todas as ocorrências do padrão especificado.  |
| `matches(String regex)`   | `boolean matches = str.matches("[0-9]+");`      | Verifica se a string corresponde ao padrão regex fornecido.            |
| `toCharArray()`          | `char[] charArray = str.toCharArray();`         | Converte a string em um array de caracteres.                           |
| `valueOf()`              | `String value = String.valueOf(10);`             | Converte outros tipos de dados em strings.                             |
| `indexOf(String str)`    | `int index = str.indexOf("substring");`         | Retorna o índice da primeira ocorrência da substring especificada.     |
| `lastIndexOf(String str)`| `int lastIndex = str.lastIndexOf("substring");` | Retorna o índice da última ocorrência da substring especificada.       |

Esses métodos são algumas das maneiras comuns de manipular strings em Java, permitindo realizar diversas operações como obtenção de partes da string, conversão de maiúsculas e minúsculas, substituição de caracteres, verificação de prefixos/sufixos e muito mais. Essas funções são fundamentais para lidar eficientemente com dados de texto em Java.