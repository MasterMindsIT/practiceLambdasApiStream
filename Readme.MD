Repasando programación funcional Lambdas y Stream<br>
Consumer<T>: Recibe un valor y no retorna nada.<br>
BiConsumer<T,U>: Recibe dos valores y no retorna nada.<br>
Supplier<T>: No recibe ningún valor, pero retorna un resultado.<br>
Predicate<T>: Recibe un valor y devuelve un booleano (true o false).<br>
BiPredicate<T,T>: Recibe dos valores y devuelve un booleano (true o false).<br>
Function<T,U>: Recibe un valor y retorna un resultado.<br>
BiFunction<T,U,V>:  Recibe dos valores y retorna un resultado.<br>
BinaryOperator<T>: Recibe dos valores del mismo tipo y retorna un valor del mismo tipo.<br>
Los siguientes se usan en concurrencia junto a Future<br>
UnaryOperator<T>: Recibe un valor, lo procesa y devuelve un resultado del mismo tipo.<br>
Callable<T>: No recibe valores, pero retorna un resultado y puede lanzar una excepción.<br>
Runnable: No recibe valores y no retorna nada, solo ejecuta una tarea.<br>

