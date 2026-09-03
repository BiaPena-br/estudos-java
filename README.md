# 📚 Caderno de Estudos - Java

Repositório dedicado ao meu plano de estudos diário de Java.

## 📌 Módulo 1: Fundamentos
- [x] Sintaxe básica e método `main` -> [`Sintaxebasica.java`](./modulo01_fundamentos/Sintaxebasica.java)
- [x] Sintaxe simplificada -> [`Sintaxebasicajv25.java`](./Sintaxebasicajv25.java)
- [x] Saída de dados -> [`SaidaDados.java`](./modulo01_fundamentos/SaidaDados.java)
- [x] Especificadores de formatos -> [`ConversionEspecifiers.md`](./ConversionEspecifiers.md)
- [x] Entrada de dados -> [`EntradaDados.java`](./modulo01_fundamentos/EntradaDados.java)
- [x] Métodos Next -> [`MetodosNext.md`](./MetodosNext.md)
- [x] Processamento de dados -> [`ProcessamentoDados.java`](./modulo01_fundamentos/ProcessamentoDados.java)
- [x] Funções matemáticas -> [`FuncoesMatematicas.java`](./modulo01_fundamentos/FuncoesMatematicas.java)

## 💡 Minhas Anotações
- **Regra de ouro:** Nome da classe pública precisa ser idêntico ao nome do arquivo `.java`.
- **DICA:** A partir do JAVA 25 a sintaxe teve uma simplificação, porém é recomendado usar a sintaxe tradicional, pois muitas empresas ainda trabalham com ela, inclusive para usar o framework Spring Boot se usa a estrutura tradicional.
- **DICA:** A nova sintaxe simplificada serve somente se for um arquivo simples, se ele tiver package tem que usar a estrutura tradicional.
- **Regra de ouro das saídas de dados:**
  - `println`: Imprime o valor e pula uma linha ao final.
  - `print`: Imprime o valor na tela **sem** pular linha no final (aceita variáveis e textos).
  - `printf`: Imprime textos formatados usando especificadores de tipo (ex: `%.2f` para casas decimais).
- **DICA:** Em blocos de texto (`"""`), a quebra de linha do seu próprio teclado é respeitada automaticamente, descartando o uso manual de `\n` ou `%n`.
- **DICA:** O tipo `char` guarda apenas **um único caractere** (letra, número ou símbolo) e exige obrigatoriamente o uso de **aspas simples** (`'a'`).
- **DICA:** Digitar Sysout e apertar Ctrl + Espaço escreve automaticamente o comando System.out.println();.
- **Regra de ouro:** nextInt(), nextDouble() e next() leem só o valor e deixam o \n (Enter) no buffer. Se o próximo comando for nextLine(), ele encontra esse \n sobrando e retorna uma string vazia, pulando a leitura.
A solução: colocar um sc.nextLine() extra (descartável) logo depois, só pra limpar o \n
- **DOCUMENTAÇÃO:** site da documentação oficial de funções matemáticas em JAVA : [Java Math Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
