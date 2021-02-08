# Xana Lang

## Descripción del lenguaje

Un programa está compuesto por una secuencia de definiciones de variables y definiciones de funciones.

### Variables

La definición de una variable es un identificador seguido de `::` y su respectivo tipo.
Se pueden definir varias variables seguidas separadas por `,`.
La definición de una o varias variables debe terminar con un salto de línea. Por ejemplo:

```
mi_variable :: int
otra_variable :: char
variable_1, variable_2, variable_3 :: char
```

### Funciones

#### Definición

Una función se define usando la palabra `def`, el identificador de la función, seguido de una lista de parámetros comprendidos por `(` y `)` y separados por `,`, después de los parámetros, y separado por `::`, se debe especificar el tipo de retorno de dicha función.

> El tipo de retorno de la función y los tipos de los parámetros deben ser de tipo simple (no se permiten arrays, ni registros).

El cuerpo de la función está delimitado por la palabra clave `do` y la palabra clave `end`.

#### Cuerpo

El cuerpo de una función son secuencias de definiciones de variables, seguidas por secuencias de sentencias, cada una de ellas delimitadas por una nueva línea.

Existe una función especial, con el identificador `main`, la cual debe ser la última en el programa.
El tipo de retorno de esta función es `void` y no recibe ningún parámetro.

#### Retorno

Cuando una función tenga un tipo de retorno distinto de `void`, la invocación a esa función será una expresión. En el caso contrario, será una sentencia.

### Tipos

#### Simples

Los tipos simples son:

- `int`
- `double`
- `char`

#### Complejos

##### Arrays

Los arrays pueden ser creados usando `[]` para construir un tipo nuevo, debiendo especificar el tamaño del array, previo a su tipo, en su construcción. Por ejemplo:

```
lista_de_enteros :: [5 :: int]
matriz_de_3 :: [3 :: [3 :: int]]
```

##### Structs

Un registro se puede crear usando la palabra clave `defstruct` y definiendo una secuencia de variables comprendida entre `do` y `end`. Por ejemplo:

```
persona :: defstruct do
  nombre :: [10 :: char]
  edad :: int
end
```

> No se podrán crear alias de tipos (por ejemplo `typedef` en C).

### Elementos básicos del lenguaje

#### Asignaciones
Una asignación está compuesta por dos expresiones separadas por el operador `=`.

```
age :: int = 5
```

#### I/O
Una escritura se compone por la palabra reservada `puts` y una lista de expresiones separadas por comas.
Una lectura tiene la misma estructura que una escritura, pero usando la palabra reservada `in`.
Por ejemplo:

```
age :: int
grade :: char = 'A'

puts grade
in age
puts grade, age
```

#### Control de ejecución

##### If

Una sentencia condicional se define usando la palabra clave `if` seguida de una condición.
El cuerpo de dicha sentencia estará comprendido entre `do` y `end`. Se podrá usar la palabra clave `else`.

Ejemplo simple:

```
if 1 == 1 do
  puts 'a'
end
```

Ejemplo con `else`:

```
if 1 != 0 do
  puts 'a'
else
  puts 'b'
end
```

Ejemplo de una sola línea:

```
if i > 10, do: i = i + 1, else: i = 0
```

##### While

Una sentencia iterativa se define usando la palabra clave `while` y delimitando el cuerpo con `do` y `end`:

```
vidas :: int = 10

while vidas > 0 do
  vidas = vidas - 1
end
```

##### Return

Una función podrá retornar un valor tan pronto como se encuentre la palabra clave `return` seguida de una expresión.
El `return` debe estar seguido obligatoriamente de una expresión.

```
def time() :: int do
  if dia do
    return 9
  end
  return 21
end

def game_loop() :: void do
  if vidas <= 0 do
    return
  end
  actualizar_juego()
  game_loop()
end
```

#### Expresiones

Las expresiones están formadas por:

- Constantes enteras (`1`), reales (`3.14`) y caracteres (`'a'`). Sin signo.
- Identificadores.
- Operadores aplicados a una o dos expresiones.

##### Cast

La conversión explícita a tipos simples (también conocido como cast en inglés) se podrá realizar usando la palabra clave `as`:

```
coins_of_one :: int = 10
money :: double = 0.0

money = coins_of_one as double
```

##### Operadores

Los operadores soportados son los siguientes, por orden de precedencia de manera descendente:

| Operador | Asociatividad |
|---|---|
| `()` | Sin asociatividad |
| `[]` | No asociativo |
| `.` | Asociatividad de izquierda a derecha |
| `as` | No asociativo |
| `-` (unario) | No asociativo |
| `!` | No asociativo |
| `*`, `/` y `%` | Asociatividad de izquierda a derecha |
| `+` y `-` | Asociatividad de izquierda a derecha |
| `>`, `>=`, `<`, `<=`, `!=` y `==` | Asociatividad de izquierda a derecha |
| `&&` y `||` | Asociatividad de izquierda a derecha |
| `=` | Asociatividad de derecha a izquierda |

### Comentarios

#### Comentarios de una línea

Todo lo que esté precedido por una almohadilla `#` se considerará un comentario:

```
# Comentario 1
a :: int

b :: char # Comentario 2
```

#### Comentarios de una multilínea

Se pueden introducir comentarios de varias líneas usando tres comillas dobles `"""`:

```
"""
Complex function
"""
def calc(a :: int, b :: int) :: void do

end
```
