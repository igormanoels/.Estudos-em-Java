# Funções do Stream API

| Operação                                | Descrição                                                                                 | Exemplo                                                        |
|-----------------------------------------|-------------------------------------------------------------------------------------------|----------------------------------------------------------------|
| `filter(Predicate<T> predicate)`        | Filtra os elementos com base em um predicado.                                             | `stream.filter(n -> n % 2 == 0)`                               |
| `map(Function<T, R> mapper)`            | Transforma cada elemento aplicando uma função.                                            | `stream.map(n -> n * 2)`                                       |
| `flatMap(Function<T, Stream<R>> mapper)`| Transforma cada elemento em uma stream e concatena todas as streams resultantes.          | `stream.flatMap(list -> list.stream())`                        |
| `distinct()`                            | Remove elementos duplicados.                                                              | `stream.distinct()`                                            |
| `sorted()`                              | Ordena os elementos em ordem natural.                                                     | `stream.sorted()`                                              |
| `sorted(Comparator<T> comparator)`      | Ordena os elementos usando um comparador.                                                 | `stream.sorted(Comparator.reverseOrder())`                     |
| `peek(Consumer<T> action)`              | Executa uma ação para cada elemento e retorna uma nova stream.                            | `stream.peek(System.out::println)`                             |
| `limit(long maxSize)`                   | Trunca a stream para conter no máximo o número especificado de elementos.                 | `stream.limit(5)`                                              |
| `skip(long n)`                          | Ignora os primeiros `n` elementos.                                                        | `stream.skip(3)`                                               |
| `forEach(Consumer<T> action)`           | Executa uma ação para cada elemento.                                                      | `stream.forEach(System.out::println)`                          |
| `collect(Collector<T, A, R> collector)` | Coleta os elementos em uma coleção ou outro resultado.                                    | `List<Integer> list = stream.collect(Collectors.toList())`     |
| `reduce(T identity, BinaryOperator<T> accumulator)` | Combina os elementos em um único valor, começando com um valor inicial.            | `int sum = stream.reduce(0, Integer::sum)`                     |
| `reduce(BinaryOperator<T> accumulator)` | Combina os elementos em um único valor, sem valor inicial.                                 | `Optional<Integer> sum = stream.reduce(Integer::sum)`          |
| `count()`                               | Retorna o número de elementos na stream.                                                  | `long count = stream.count()`                                  |
| `anyMatch(Predicate<T> predicate)`      | Retorna `true` se algum elemento corresponder ao predicado.                               | `boolean anyEven = stream.anyMatch(n -> n % 2 == 0)`           |
| `allMatch(Predicate<T> predicate)`      | Retorna `true` se todos os elementos corresponderem ao predicado.                         | `boolean allEven = stream.allMatch(n -> n % 2 == 0)`           |
| `noneMatch(Predicate<T> predicate)`     | Retorna `true` se nenhum elemento corresponder ao predicado.                              | `boolean noneEven = stream.noneMatch(n -> n % 2 == 0)`         |
| `findFirst()`                           | Retorna o primeiro elemento da stream, se presente.                                       | `Optional<Integer> first = stream.findFirst()`                 |
| `findAny()`                             | Retorna algum elemento da stream, se presente.                                            | `Optional<Integer> any = stream.findAny()`                     |
| `max(Comparator<T> comparator)`         | Retorna o maior elemento de acordo com o comparador fornecido.                            | `Optional<T> max = stream.max(Comparator.naturalOrder())`      |
| `min(Comparator<T> comparator)`         | Retorna o menor elemento de acordo com o comparador fornecido.                            | `Optional<T> min = stream.min(Comparator.naturalOrder())`      |
| `toArray()`                             | Converte a stream em um array.                                                            | `Object[] array = stream.toArray()`                            |
| `toArray(IntFunction<A[]> generator)`   | Converte a stream em um array, usando o gerador fornecido.                                | `Integer[] array = stream.toArray(Integer[]::new)`             |
| `takeWhile(Predicate<T> predicate)`     | Toma elementos da stream enquanto o predicado for verdadeiro.                             | `stream.takeWhile(n -> n < 5)`                                 |
| `dropWhile(Predicate<T> predicate)`     | Descarta elementos da stream enquanto o predicado for verdadeiro.                         | `stream.dropWhile(n -> n < 5)`                                 |
| `unordered()`                           | Retorna uma versão não ordenada da stream, útil para otimizações.                         | `stream.unordered()`                                           |
| `parallel()`                            | Converte a stream em uma stream paralela para processamento paralelo.                     | `stream.parallel()`                                            |
| `sequential()`                          | Converte a stream paralela em uma stream sequencial.                                      | `stream.sequential()`                                          |
| `distinct()`                            | Remove elementos duplicados da stream.                                                    | `stream.distinct()`                                            |
| `boxed()`                               | Converte uma stream de primitivos em uma stream de seus wrappers correspondentes.         | `IntStream.of(1, 2, 3).boxed()`                                |
| `mapToInt(ToIntFunction<T> mapper)`     | Mapeia os elementos para uma stream de inteiros.                                          | `stream.mapToInt(String::length)`                              |
| `mapToLong(ToLongFunction<T> mapper)`   | Mapeia os elementos para uma stream de longos.                                            | `stream.mapToLong(Integer::longValue)`                         |
| `mapToDouble(ToDoubleFunction<T> mapper)`| Mapeia os elementos para uma stream de doubles.                                           | `stream.mapToDouble(Integer::doubleValue)`                     |
| `flatMapToInt(Function<T, IntStream> mapper)`| Transforma cada elemento em uma stream de inteiros e concatena todas as streams resultantes.| `stream.flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))` |
| `flatMapToLong(Function<T, LongStream> mapper)`| Transforma cada elemento em uma stream de longos e concatena todas as streams resultantes.| `stream.flatMapToLong(list -> list.stream().mapToLong(Integer::longValue))` |
| `flatMapToDouble(Function<T, DoubleStream> mapper)`| Transforma cada elemento em uma stream de doubles e concatena todas as streams resultantes.| `stream.flatMapToDouble(list -> list.stream().mapToDouble(Integer::doubleValue))` |

