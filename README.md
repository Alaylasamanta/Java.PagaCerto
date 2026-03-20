# PagaCerto - Sistema de Gestão de Pagamentos

O **PagaCerto** é um protótipo de sistema bancário desenvolvido em Java para fins acadêmicos (FIAP). O projeto simula as operações reais de uma Fintech, permitindo o gerenciamento de usuários, depósitos, pagamentos de boletos e geração de extratos detalhados.

---

##  Funcionalidades Atuais

* **Cadastro de Usuário:** Coleta de dados básicos (Nome, Email, CPF, Senha).
* **Gestão de Saldo:** Operações de depósito com atualização em tempo real.
* **Pagamento de Boletos:** Lógica de verificação de saldo e quitação de títulos.
* **Histórico de Extrato:** Armazenamento dinâmico de todas as transações da sessão.
* **Menu Interativo:** Interface via console para navegação fluida do usuário.

---

##  Estrutura e Conceitos de POO Aplicados


### 1. Herança (`extends`)
Implementamos a diferenciação de contas através de herança. A classe `Usuario` serve como base, enquanto a classe `UsuarioPremium` herda seus atributos e métodos, permitindo funcionalidades exclusivas no futuro (como taxas menores ou cashback).

### 2. Coleções (`ArrayList`)
Utilizamos a estrutura `ArrayList` para gerenciar o histórico de transações. Isso permite que o sistema armazene múltiplos objetos da classe `Extrato` e os exiba de forma organizada ao final da sessão.

---
##  Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Ambiente de Desenvolvimento:** IntelliJ IDEA
* **Versionamento:** Git & GitHub

---

##  Como rodar o projeto

1.  Clone este repositório:
    ```bash
    git clone [https://github.com/SEU_USUARIO/PagaCerto.git](https://github.com/SEU_USUARIO/PagaCerto.git)
    ```
2.  Abra o projeto no seu **IntelliJ IDEA**.
3.  Execute a classe `Main.java`.
4.  Siga as instruções no console para realizar seu cadastro e operações.

---

## Desenvolvedor

* **Alayla Samanta dos Santos**  - (https://www.linkedin.com/in/alayla-samanta-santos-984473314/)
