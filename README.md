# 🚀 Estruturas Condicionais e Manipulação de Dados 2 em Java

![java-8](https://github.com/user-attachments/assets/c4a90589-5ad7-4ec6-ab65-48cc9c7a89f7)

Este repositório contém diversos programas em Java que exploram o uso de estruturas condicionais e manipulação de dados, 
abordando operações essenciais para o desenvolvimento eficiente de algoritmos. Entre os principais conceitos abordados, 
destacam-se:

- Estruturas condicionais, como `if-else`, para controle de fluxo baseado em condições específicas.
- Estruturas de repetição, incluindo `while` e `for`, permitindo a execução iterativa de blocos de código conforme determinado por condições lógicas ou intervalos predefinidos.
- Iteração sobre coleções, facilitando a navegação e manipulação de conjuntos de dados armazenados em arrays, listas (`List`) e mapas (`Map`).
  
Além disso, os programas implementam técnicas de modularização, organizando o código em métodos reutilizáveis,
promovendo clareza, manutenção e reutilização eficiente do código-fonte.

## 🔹 Estruturas de Dados Utilizadas

Os programas utilizam diferentes estruturas de dados para armazenar e processar informações de maneira eficiente:

- **Arrays (`array[]`)**  
  - Utilizados quando é necessário armazenar um conjunto fixo de elementos.  
  - Garantem acesso rápido por índice e são eficientes em termos de memória.  

- **Listas (`List`)**  
  - Oferecem mais flexibilidade do que arrays, permitindo **tamanho dinâmico**.  
  - Permitem **inserção e remoção eficientes**, sendo ideais para cenários em que a quantidade de elementos pode variar.  

- **Mapas (`Map`)**  
  - Estrutura que armazena pares **chave-valor**.  
  - Proporciona uma forma otimizada de **buscar e organizar dados** sem a necessidade de estruturas condicionais extensas, como múltiplos `if-else` ou `switch-case`.  

## 🔹 Recursos Adicionais

- Implementação de modularização, organizando o código em métodos reutilizáveis.
- Utilização `Scanner` para entrada de dados do usuário.

## 🔹 Benefícios do Uso de Map, List e Arrays

- O uso do `Map` se destaca como uma alternativa eficiente para substituir loops e a estrutura `switch-case`, tornando o código mais limpo, legível e de fácil manutenção.
- A combinação de `List` e `array[]` permite manipular conjuntos de dados de maneira versátil e eficiente, dependendo da necessidade da aplicação.

## 🚀 Tecnologias Utilizadas

- **Java (JDK 8+)** – Linguagem principal utilizada para desenvolvimento dos programas.  
- **Scanner** – Responsável por capturar entradas do usuário no console.  
- **Estruturas de controle** – Implementação de condicionais (`if`, `else if`, `else`) para tomada de decisões no código.  
- **Estruturas de repetição** – Uso de loops (`for`, `while`) para percorrer coleções e executar operações iterativas.  
- **Estruturas de dados** – Manipulação de **arrays**, **listas (`List`)** e **mapas (`Map`)**, garantindo flexibilidade no armazenamento e recuperação de informações.  
- **Map e entrySet** – Utilização do `Map` para armazenar pares **chave-valor** e do `entrySet()` para percorrer elementos de maneira eficiente.  
- **Captura de exceções** – Tratamento de erros utilizando `try-catch` para garantir maior robustez e evitar falhas inesperadas.  
- **Modularização do código** – Organização do código por meio de **métodos reutilizáveis**, tornando a solução mais clara e fácil de manter.  

## 📌 Confira meu artigo no DEV.to

Para explorar mais sobre **estruturas condicionais, loops e manipulação de dados em Java**, confira meu artigo no  
[DEV.to](https://dev.to/) 🚀

Neste artigo, compartilho **exemplos práticos e soluções eficientes** para manipulação de **arrays**, 
**listas** (`List`) e **mapas** (`Map`), além do uso de **estruturas de repetição** (`for`, `while`) e 
**controle de fluxo** (`if-else`).

O objetivo é demonstrar **boas práticas na escrita de código**, abordando desde a entrada de dados 
com `Scanner` até técnicas avançadas de organização e modularização para tornar o código mais 
**eficiente** e **fácil de manter**.

## 📂 Estrutura do Projeto

```estrutura
📦 condicionais-parte-2
├── 📁 contagemVogaisV1
│   └── ContagemVogaisV1.java
├── 📁 contagemVogaisV2
│   └── ContagemVogaisV2.java
├── 📁 contagemVogaisV3
│   └── ContagemVogaisV3.java
├── 📁 fraseReversaV1
│   └── FraseReversaV1.java
├── 📁 fraseReversaV2
│   └── FraseReversaV2.java
├── 📁 fraseReversaV3
│   └── FraseReversaV3.java
├── 📁 maiorMenorNumeroV1
│   └── MaiorMenorNumeroV1.java
├── 📁 maiorMenorNumeroV2
│   └── MaiorMenorNumeroV2.java
├── 📁 maiorMenorNumeroV3
│   └── MaiorMenorNumeroV3.java
├── 📁 maiorMenorNumeroV4
│   └── MaiorMenorNumeroV4.java
├── 📁 mediaExemploFuncionamento
│   └── MediaExemploFuncionamento.java
├── 📁 mediaNumeros
│   └── MediaNumeros.java
├── 📁 mediaNumerosV2
│   └── MediaNumerosV2.java
├── 📁 numerosEntreAeB
│   └── NumerosEntreAeB.java
├── 📁 numerosPrimos
│   └── NumerosPrimos.java
├── 📁 quadradosPerfeitos
│   └── QuadradosPerfeitos.java
├── 📁 sequenciaFibonacci
│   └── SequenciaFibonacci.java
└── 📁 somaNumerosPositivos
    └── SomaNumerosPositivos.java
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**

Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, execute o seguinte comando para compilar o código:

```sh
javac -d . condicionais-parte-2/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**

Após a compilação, você pode executar o programa com o comando abaixo:

```sh
java condicionais-parte-2.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java condicionais-parte-2.contagemVogaisV1.ContagemVogaisV1
```

## 📌 Descrição dos Programas

### 🔤 **Contagem de Vogais - Versão 1**
📝 **Objetivo:** Solicitar ao usuário uma frase e exibir a quantidade de vogais nela. Utilizando um array `String[]`.

### 🔤 **Contagem de Vogais - Versão 2**
📝 **Objetivo:** Solicitar ao usuário uma frase e exibir a quantidade de vogais nela. Utilizando uma lista `List`.

### 🔤 **Contagem de Vogais - Versão 3**
📝 **Objetivo:** Solicitar ao usuário uma frase e exibir a quantidade de vogais nela. Utilizando um `Map`.

---

### 🔄 **Frase Reversa - Versão 1**
🔙 **Objetivo:** Solicitar ao usuário uma frase e exibir a frase de trás para frente. Usando um array `String[]`.

### 🔄 **Frase Reversa - Versão 2**
🔙 **Objetivo:** Solicitar ao usuário uma frase e exibir a frase de trás para frente. Usando uma lista `List`.

### 🔄 **Frase Reversa - Versão 3**
🔙 **Objetivo:** Solicitar ao usuário uma frase e exibir a frase de trás para frente. Usando um `Map`.

---

### 🔢 **Maior e Menor Número - Versão 1**
📊 **Objetivo:** Solicitar ao usuário uma lista de números, até que o número zero seja digitado, e 
exibir o maior e o menor número da lista utilizando if-else, for e comparações (`>` e `<`).

### 🔢 **Maior e Menor Número - Versão 2**
📊 **Objetivo:** Solicitar ao usuário uma lista de números, até que o número zero seja digitado, 
e exibir o maior e o menor número da lista utilizando **Streams**.

### 🔢 **Maior e Menor Número - Versão 3**
📊 **Objetivo:** Solicitar ao usuário uma lista de números, até que o número zero seja digitado, 
e exibir o maior e o menor número da lista utilizando **Collections.max()** e **Collections.min()**.

### 🔢 **Maior e Menor Número - Versão 4**
📊 **Objetivo:** Solicitar ao usuário uma lista de números, até que o número zero seja digitado, 
e exibir o maior e o menor número da lista utilizando **int[]** e **forEach**.

---

### 📉 **Média - Exemplo de Funcionamento**
📏 **Objetivo:** Calcular a média dos números utilizando `List<Integer>`, `List.of()` e `Arrays.asList()`.

### 📉 **Média de Números**
📏 **Objetivo:** Solicitar números do usuário até que o número zero seja digitado e exibir 
a **média** dos números digitados.

### 📉 **Média de Números - Versão 2**
📏 **Objetivo:** Solicitar números do usuário até que o número zero seja digitado 
e exibir a **média** dos números digitados, utilizando `List<Integer>` que é reponsável  em converter 
para **IntStream**.

---

### 🔢 **Números Entre A e B**
🔢 **Objetivo:** Solicitar ao usuário dois números, **A** e **B**, e exibir todos os números entre **A** e **B**.

### 🔢 **Números Primos**
🔢 **Objetivo:** Exibir os primeiros **N números primos**, onde **N** é informado pelo usuário, 
utilizando um laço de repetição.

### 🔢 **Quadrados Perfeitos**
🔢 **Objetivo:** Exibir os primeiros **N quadrados perfeitos**, onde **N** é informado pelo usuário, 
utilizando um laço de repetição.

### 🔢 **Sequência de Fibonacci**
🔢 **Objetivo:** Solicitar ao usuário um número e exibir a **sequência de Fibonacci** 
até o número informado, utilizando um laço de repetição.

### ➕ **Somar Números Positivos**
➕ **Objetivo:** Solicitar números do usuário até que um número negativo seja digitado 
e exibir a **soma dos números positivos**.

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, 
novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos 
programas ou funcionalidades, sinta-se à vontade para abrir um Pull Request. 
Estou ansioso para ver suas melhorias! 😃
