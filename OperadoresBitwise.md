## Operadores Bit a Bit (Bitwise) em Java

| Operador | Nome | Descrição | Exemplo em Java | Resultado |
| :--- | :--- | :--- | :--- | :--- |
| `&` | **AND** | Retorna `1` apenas se **ambos** os bits forem `1`. Usado para checar ou filtrar bits. | `0b0101 & 0b0011` | `0b0001` (1) |
| `\|` | **OR** | Retorna `1` se **pelo menos um** dos bits for `1`. Usado para ativar flags/permissões. | `0b0101 \| 0b0011` | `0b0111` (7) |
| `^` | **XOR** | Retorna `1` apenas se **os bits forem diferentes**. Usado para inverter (toggle) bits. | `0b0101 ^ 0b0011` | `0b0110` (6) |
| `~` | **NOT** | **Inverte todos os bits** do número (`0` vira `1` e `1` vira `0`). | `~0b00000101` | `-6` |
| `<<` | **Left Shift** | Desloca os bits para a esquerda. Multiplica o valor por $2^n$. | `5 << 1` | `10` |
| `>>` | **Right Shift com Sinal** | Desloca os bits para a direita, preservando o sinal (+/-). Divide por $2^n$. | `20 >> 2` | `5` |
| `>>>` | **Right Shift sem Sinal** | Desloca os bits para a direita preenchendo com zeros à esquerda (trata como positivo). | `-20 >>> 2` | `1073741819` |

### Operadores de Atribuição Composta

| Atribuição | Equivalente | Uso Comum |
| :--- | :--- | :--- |
| `a &= b;` | `a = a & b;` | Aplica uma máscara de limpeza / filtro. |
| `a \|= b;` | `a = a \| b;` | Adiciona uma nova flag ou permissão. |
| `a ^= b;` | `a = a ^ b;` | Alterna o estado (toggle) de um bit. |
| `a <<= n;` | `a = a << n;` | Desloca $n$ posições para a esquerda. |
| `a >>= n;` | `a = a >> n;` | Desloca $n$ posições para a direita com sinal. |
| `a >>>= n;` | `a = a >>> n;` | Desloca $n$ posições para a direita sem sinal. |