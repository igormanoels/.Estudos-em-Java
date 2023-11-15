**Tabela completa com todos os métodos da classe `Math` em Java:

| Expressão                         | Descrição                                                                      |
|-----------------------------------|--------------------------------------------------------------------------------|
| `Math.abs(x)`                     | Retorna o valor absoluto de `x`.                                               |
| `Math.acos(x)`                    | Retorna o arco cosseno de `x`, em radianos.                                    |
| `Math.addExact(x, y)`             | Retorna a soma exata de `x` e `y`.                                             |
| `Math.asin(x)`                    | Retorna o arco seno de `x`, em radianos.                                       |
| `Math.atan(x)`                    | Retorna o arco tangente de `x`, em radianos.                                    |
| `Math.atan2(y, x)`                | Retorna o ângulo entre o eixo x e um ponto (y, x), em radianos.                 |
| `Math.cbrt(x)`                    | Retorna a raiz cúbica de `x`.                                                  |
| `Math.ceil(x)`                    | Retorna o menor inteiro maior ou igual a `x`.                                   |
| `Math.copySign(magnitude, sign)`  | Retorna o primeiro argumento com o sinal do segundo argumento.                   |
| `Math.cos(Math.toRadians(x))`     | Retorna o cosseno de `x`, em radianos.                                          |
| `Math.cosh(x)`                    | Retorna o cosseno hiperbólico de `x`.                                           |
| `Math.decrementExact(x)`          | Retorna `x - 1` como um inteiro exato.                                          |
| `Math.exp(x)`                     | Retorna `e` elevado à potência de `x`, onde `e` é a base dos logaritmos naturais.|
| `Math.expm1(x)`                   | Retorna `e` elevado à potência de `x` menos `1`.                                |
| `Math.floor(x)`                   | Retorna o maior inteiro menor ou igual a `x`.                                    |
| `Math.floorDiv(x, y)`             | Retorna o resultado da divisão inteira de `x` por `y`, arredondado para baixo.   |
| `Math.floorMod(x, y)`             | Retorna o resto da divisão inteira de `x` por `y`, garantindo um resultado positivo. |
| `Math.getExponent(x)`             | Retorna o expoente binário de `x`.                                              |
| `Math.hypot(x, y)`                | Retorna a raiz quadrada da soma dos quadrados de seus argumentos.                |
| `Math.incrementExact(x)`          | Retorna `x + 1` como um inteiro exato.                                          |
| `Math.log(x)`                     | Retorna o logaritmo natural de `x`.                                             |
| `Math.log10(x)`                   | Retorna o logaritmo de base 10 de `x`.                                          |
| `Math.log1p(x)`                   | Retorna o logaritmo natural de `x + 1`.                                         |
| `Math.max(a, b)`                  | Retorna o maior entre `a` e `b`.                                                |
| `Math.maxExact(x, y)`             | Retorna o maior valor exato entre `x` e `y`.                                    |
| `Math.min(a, b)`                  | Retorna o menor entre `a` e `b`.                                                |
| `Math.minExact(x, y)`             | Retorna o menor valor exato entre `x` e `y`.                                    |
| `Math.multiplyExact(x, y)`        | Retorna o produto exato de `x` e `y`.                                           |
| `Math.multiplyFull(x, y)`         | Retorna o produto completo de `x` e `y`.                                        |
| `Math.multiplyHigh(x, y)`         | Retorna os bits de ordem superior do produto de `x` e `y`.                       |
| `Math.negateExact(x)`             | Retorna o oposto de `x` como um inteiro exato.                                  |
| `Math.nextAfter(start, direction)`| Retorna o próximo número após `start` na direção de `direction`.                 |
| `Math.nextDown(x)`                | Retorna o maior número de ponto flutuante menor que `x`.                         |
| `Math.nextUp(x)`                  | Retorna o menor número de ponto flutuante maior que `x`.                         |
| `Math.pow(base, exponent)`        | Retorna `base` elevado à potência de `exponent`.                                 |
| `Math.random()`                   | Retorna um número pseudoaleatório entre 0.0 e 1.0.                               |
| `Math.remainder(x, y)`            | Retorna o resto da divisão de `x` por `y`.                                      |
| `Math.rint(x)`                    | Retorna o número mais próximo de `x` com valor integral, arredondando conforme a regra IEEE 754. |
| `Math.round(x)`                   | Retorna o valor de `x` arredondado para o inteiro mais próximo.                  |
| `Math.scalb(flt, scaleFactor)`    | Retorna `flt` escalado por uma potência de 2 representada por `scaleFactor`.     |
| `Math.signum(x)`                  | Retorna o sinal de `x`: -1 se `x` é negativo, 0 se `x` é zero e 1 se `x` é positivo. |
| `Math.sin(Math.toRadians(x))`     | Retorna o seno de `x`, em radianos.                                              |
| `Math.sinh(x)`                    | Retorna o seno hiperbólico de `x`.                                              |
| `Math.sqrt(x)`                    | Retorna a raiz quadrada de `x`.                                                  |
| `Math.subtractExact(x, y)`        | Retorna a subtração exata de `x` e `y`.                                         |
| `Math.tan(Math.toRadians(x))`     | Retorna a tangente de `x`, em radianos.                                          |
| `Math.tanh(x)`                    | Retorna a tangente hiperbólica de `x`.                                           |
| `Math.toDegrees(x)`               | Converte o ângulo `x` de radianos para graus.                                   |
| `Math.toIntExact(x)`              | Retorna o valor inteiro exato de um `long`.                                      |
| `Math.toRadians(x)`               | Converte o ângulo `x` de graus para radianos.                                   |
| `Math.ulp(x)`                     | Retorna a unidade de ponto flutuante de `x`.                                    |

Esses são todos os métodos disponíveis na classe `Math` do Java, cada um destinado a realizar operações matemáticas específicas.
// algumas funções precisaram usar (Math.toRadians(x)) para serem executadas corretamente.