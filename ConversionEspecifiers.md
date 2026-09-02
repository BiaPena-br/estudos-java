## Especificadores de Formato (printf / String.format)

| Especificador | Tipo esperado                                        | Exemplo | Saída       |
|:--------------:|:-----------------------------------------------------:|:-------:|:-----------:|
| `%s`           | String (ou qualquer objeto, via `toString()`)         | `%s`    | `Computer`  |
| `%d`           | Inteiro (`int`, `long`, `byte`, `short`)               | `%d`    | `25`        |
| `%f`           | Ponto flutuante (`float`, `double`)                    | `%.2f`  | `2100.00`   |
| `%c`           | Caractere                                              | `%c`    | `A`         |
| `%b`           | Boolean                                                | `%b`    | `true`      |
| `%n`           | Quebra de linha (não consome argumento)                | `%n`    | *(newline)* |
| `%%`           | Sinal de porcentagem literal (não consome argumento)   | `%%`    | `%`         |