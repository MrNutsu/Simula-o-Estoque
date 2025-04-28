
# 💻 Sistema de Estoque em Java

Este é um projeto de um **Sistema de Estoque simples em Java**, desenvolvido com foco educacional. Ele simula o cadastro e a exibição de produtos como **computadores** e **celulares**, utilizando os princípios da programação orientada a objetos (POO).

---

## 🚀 Objetivos do Projeto

- Demonstrar o uso prático de **herança**, **encapsulamento** e **abstração** em Java.
- Criar um sistema funcional de gerenciamento de produtos com interação via terminal.
- Aplicar boas práticas de codificação, organização e reutilização de código.

---

## 📚 Conceitos de Programação Aplicados

### 🧱 1. **Encapsulamento**
Cada classe possui seus atributos `private` e oferece métodos `public` (getters e setters) para acessá-los de forma segura.

### 🧬 2. **Herança**
As classes `Computador` e `Celular` herdam da classe abstrata `Produto`, reutilizando código comum entre produtos.

### 📦 3. **Abstração**
A classe `Produto` é **abstrata**, ou seja, não pode ser instanciada diretamente. Ela define um método abstrato `calcularValorTotal()` que deve ser implementado pelas subclasses.

### ♻️ 4. **Polimorfismo**
O sistema trata diferentes tipos de produtos (`Celular` e `Computador`) através de referências da superclasse `Produto`.

### 🛠️ 5. **Modularização**
O código é dividido em pacotes (`classes` e `app`) para manter a organização e separação de responsabilidades.

---

## 🗂️ Estrutura de Pastas

```
Projeto/
│
├── classes/
│   ├── Produto.java        // Classe abstrata base
│   ├── Computador.java     // Subclasse de Produto
│   └── Celular.java        // Subclasse de Produto
│
├── app/
│   └── SistemaEstoque.java // Classe principal com o menu
│
└── README.md               // Este arquivo
```

---

## 💡 Como Funciona

- O programa exibe um **menu no terminal** com as opções:
  - Cadastrar computador
  - Cadastrar celular
  - Listar produtos cadastrados
  - Sair

- O usuário insere as informações pelo teclado e o sistema armazena os produtos em memória (`ArrayList<Produto>`).

- Ao listar produtos, o programa mostra todos os dados, além do **valor total em estoque** (`preço * quantidade`).

---

## 🧪 Exemplo de Execução

```
----- Sistema de Estoque -----
1. Cadastrar Computador
2. Cadastrar Celular
3. Listar Produtos
0. Sair
Escolha uma opção: 1

--- Cadastro de Computador ---
Nome: PC Gamer
Código: 1001
Preço: 5500
Quantidade: 3
Processador: Intel i9
Memória RAM: 32GB
Computador cadastrado com sucesso!
```

---

## ✅ Requisitos para Compilar e Rodar

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 8 ou superior
- Terminal (cmd, PowerShell, Bash, etc.)
- Editor de código recomendado: [VS Code](https://code.visualstudio.com/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/)

### 🔧 Compilação:

Navegue até o diretório do projeto e use:

```bash
javac classes/*.java app/SistemaEstoque.java
```

### ▶️ Execução:

```bash
java app.SistemaEstoque
```

---

## 👨‍🏫 Ideal para

- Estudantes de **Programação Orientada a Objetos (POO)**
- Apresentações de projetos em cursos técnicos ou faculdade
- Portfólio de projetos em Java

---

## 📌 Possíveis Melhorias Futuras

- Armazenar produtos em arquivo `.txt` ou `.csv`
- Interface gráfica com **JavaFX** ou **Swing**
- Banco de dados com **SQLite** ou **MySQL**
- Validações mais robustas e tratamento de exceções

---

## 🧑‍💻 Autor

Desenvolvido por João Pedro Blagitz Ravache.  
Este projeto é de uso educacional e está aberto para melhorias.  
Sinta-se à vontade para fazer *fork*, contribuir ou usar como base!
