# 📌 Sistema de Solicitações (Java - POO)

Este projeto é um sistema simples em Java desenvolvido com foco em Programação Orientada a Objetos (POO), executado via terminal (CLI).

---

# 🧩 Funcionalidades

* Criar solicitação
* Listar solicitações
* Buscar por protocolo
* Atualizar status
* Registrar comentários no histórico

---

# 🏗️ Estrutura do Código

O projeto está organizado em camadas:

src/
├── dominio/ → classes de domínio
│    ├── Usuario.java
│    ├── Categoria.java
│    ├── HistoricoStatus.java
│    └── Solicitacao.java
│
├── central/ → regras de negócio
│    └── ServicoSolicitacao.java
│
└── Main.java → execução do sistema

---

# 🧠 Organização das Classes

## 📁 dominio

* **Usuario** → representa o usuário do sistema
* **Categoria** → tipo da solicitação
* **HistoricoStatus** → registra mudanças de status
* **Solicitacao** → entidade principal do sistema

---

## ⚙️ central

* **ServicoSolicitacao**

  * Cria solicitações
  * Lista solicitações
  * Busca por protocolo
  * Atualiza status

---

## 🖥️ Main

Responsável pela interação com o usuário via terminal.

Contém:

* Menu do sistema
* Entrada de dados
* Chamadas para o serviço

---

# 🔄 Fluxo do Sistema

1. Usuário cria uma solicitação
2. Sistema gera automaticamente um protocolo
3. Status inicial é "ABERTA"
4. Solicitação pode ser atualizada
5. Histórico é registrado a cada alteração

---

# 🧪 Exemplo de Uso

Criando uma solicitação:

Descrição: Buraco na rua
Categoria: Infraestrutura

Resultado:

Criado com protocolo: 1

---

# 🧠 Conceitos de POO Aplicados

* Encapsulamento (atributos privados + getters)
* Separação de responsabilidades
* Baixo acoplamento
* Código organizado em camadas

---

# 🖥️ Como Executar

1. Compilar
   javac Main.java

2. Executar
   java Main

---

# 👨‍💻 Autor

Leonardo Gomes Ferreira
