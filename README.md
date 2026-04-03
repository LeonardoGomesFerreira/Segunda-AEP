# 📌 Sistema de Solicitações (POO - Java CLI)

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos (POO) com integração de conceitos de IHC (Perfis/Personas) e Clean Code.

---

# 🎯 Objetivo

Criar um sistema simples que permita:

* Cidadãos registrarem solicitações
* Servidores acompanharem e gerenciarem demandas
* Organização e rastreamento por protocolo

---

# 🧩 Funcionalidades

✔ Criar solicitação
✔ Listar solicitações
✔ Buscar por protocolo
✔ Atualizar status
✔ Registrar histórico com comentários

---

# 🏗️ Estrutura do Projeto

src/
├── model/
│    ├── Usuario.java
│    ├── Categoria.java
│    ├── HistoricoStatus.java
│    └── Solicitacao.java
│
├── service/
│    └── ServicoSolicitacao.java
│
└── Main.java

---

# 🧠 Conceitos de POO Utilizados

* Encapsulamento (atributos privados + getters)
* Separação de responsabilidades
* Organização em camadas (Model / Service)
* Reutilização de código

---

# 👥 IHC — Perfis e Personas

## 🔹 Perfil 1: Baixa familiaridade digital

Maria (58 anos)

* Dificuldade com tecnologia
* Precisa de interface simples
* Medo de errar e perder solicitação

José (65 anos)

* Não usa computador
* Quer resolver problemas rapidamente
* Medo de não conseguir concluir

Ana (50 anos)

* Usa redes sociais básicas
* Dificuldade com formulários
* Medo de não ser atendida

---

## 🔹 Perfil 2: Vulnerabilidade / medo

Carlos (30 anos)

* Quer denunciar anonimamente
* Medo de represália

Juliana (25 anos)

* Baixa confiança no sistema
* Medo de não ser levada a sério

Roberto (40 anos)

* Pouco tempo disponível
* Medo de exposição

---

## 🔹 Perfil 3: Servidores públicos

Fernanda (35 anos)

* Muitos chamados
* Medo de perder prazos

Marcos (45 anos)

* Precisa de controle
* Medo de má gestão

Luana (28 anos)

* Precisa de dados corretos
* Medo de resolver errado

---

# 🖥️ Como Executar

1. Compilar
   javac Main.java

2. Executar
   java Main

---

# 💻 Exemplo de Uso

===== SISTEMA DE SOLICITAÇÕES =====
1 - Criar solicitação
2 - Listar solicitações
3 - Buscar por protocolo
4 - Atualizar status
0 - Sair

---

Descrição: Buraco na rua
Categoria: Infraestrutura

Criado com protocolo: 1

---

# 🔄 Fluxo do Sistema

1. Usuário cria uma solicitação
2. Sistema gera protocolo automaticamente
3. Status inicial: ABERTA
4. Pode ser atualizada ao longo do tempo

---

# 🧹 Clean Code (Relatório)

Função: criarSolicitacao()

* Nome claro e descritivo
* Facilita entendimento

Função: buscarPorProtocolo()

* Responsabilidade única
* Permite reutilização

Função: atualizarStatus()

* Baixo acoplamento
* Mantém histórico separado

---

# 🚀 Melhorias Futuras

* Interface gráfica (JavaFX)
* API REST (Spring Boot)
* Banco de dados
* Sistema de login
* Prioridade de solicitações

---

# 👨‍💻 Autor

Leonardo Gomes Ferreira

---

# 📄 Licença

Projeto acadêmico para fins educacionais.
