# 💻 Programming Logic - Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Este repositório foi criado para documentar minha jornada de aprendizado em lógica de programação e algoritmos, utilizando a linguagem **Java**. O foco principal é a resolução de problemas práticos, abrangendo desde fundamentos básicos até estruturas de dados mais complexas.

##  Objetivos

- Praticar a sintaxe e os recursos da linguagem Java.
- Desenvolver o pensamento analítico para resolução de problemas.
- Dominar o uso de estruturas de controle (condicionais e repetição).
- Aprofundar o conhecimento em manipulação de **Arrays** e **Matrizes**.
- Aplicar conceitos iniciais de Programação Orientada a Objetos (POO).

## Estrutura do Repositório

Os exercícios estão organizados por temas para facilitar a navegação:

- `Fundamentos/`: Variáveis, tipos de dados e operadores.
- `EstruturasCondicionais/`: Exercícios com `if-else` e `switch-case`.
- `EstruturasRepeticao/`: Prática de loops `for`, `while` e `do-while`.
- `ArraysEMatrizes/`: Manipulação de vetores e tabelas multidimensionais (ex: busca de elementos e navegação de índices).
- `POO/`: Pequenos projetos focados em classes, atributos e métodos.

##  Como Executar os Projetos

1. Certifique-se de ter o **JDK** (Java Development Kit) instalado (versão 17 ou superior recomendada).
2. Clone o repositório:
   ```bash
   git clone [https://github.com/MayconXis/ProgrammingLogic.git](https://github.com/MayconXis/ProgrammingLogic.git)
3. Abra o projeto na sua IDE de preferência.
4. Localize a classe que deseja testar e execute o método main.

👨‍💻 Desenvolvido por: **Maycon Douglas da Silva**  
📧 Contato: [mayconcontacts@gmail.com]  
🌐 GitHub: [https://github.com/MayconXis]  


Este repositório é alimentado constantemente conforme avanço em meus estudos de Engenharia de Software.

##  Projetos em Destaque



### 1. Sistema de Conta Bancária (POO)

Um projeto prático desenvolvido para aplicar os pilares da Orientação a Objetos. O sistema simula operações bancárias básicas, focando na integridade dos dados e na organização do código.

- **Conceitos Aplicados:**

    - **Encapsulamento:** Uso de modificadores de acesso (private) para proteger os dados da conta.

    - **Construtores:** Implementação de construtores padrão e sobrecarregados para inicialização de objetos.

    - **Métodos de Instância:** Lógica de negócio para depósitos e saques (incluindo tratamento de taxas).

    - **Sobrescrita (Override):** Customização do método `toString()` para exibição formatada dos dados da conta.


### 2. Navegador de Matrizes Dinâmicas ($M \times N$)

Um algoritmo de **busca linear** aplicado a um espaço bidimensional, projetado para identificar padrões de vizinhança.

- **Lógica de Travessia:**  
  O algoritmo percorre a matriz utilizando **laços aninhados**, garantindo uma complexidade de tempo de  
  **$O(M \times N)$**.

- **Tratamento de Bordas (Guard Clauses):**  
  Implementação de verificações lógicas rigorosas para evitar o erro  
  `ArrayIndexOutOfBoundsException`.  
  O código valida as coordenadas antes de acessar os índices vizinhos:
  - Acima  
  - Abaixo  
  - Esquerda  
  - Direita  

- **Aplicação Prática:**  
  Esse tipo de lógica é a base para:
  - Algoritmos de **processamento de imagens**
  - **Sistemas de coordenadas** em aplicações back-end


### 3. Implementações de Lógica Fundamental

Além da manipulação de matrizes, o repositório explora diversos padrões de algoritmos essenciais:

- **Estruturas de Repetição Otimizadas:**  
  Uso estratégico de `for`, `while` e `do-while` para processamento eficiente de fluxos de dados e coleções.

- **Condicionais Complexas:**  
  Implementação de lógica de decisão baseada em múltiplos critérios, com foco em:
  - Legibilidade
  - Redução de aninhamento excessivo

- **Gestão de Memória:**  
  Estudo prático da diferença entre:
  - Tipos primitivos  
  - Tipos de referência  

  Observando como o Java gerencia o armazenamento em:
  - **Stack**
  - **Heap**

### C. Padrões de Entrada e Saída (I/O)

- Manipulação de fluxos de entrada utilizando a classe `Scanner`, tratando diferentes tipos de tokens.
- Fechamento adequado de recursos para evitar **vazamentos de memória (memory leaks)**.
- **Formatação de saída** de dados para geração de relatórios técnicos claros e precisos no console.


   
