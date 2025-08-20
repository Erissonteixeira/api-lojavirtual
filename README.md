# 🛒 Loja Virtual - API REST com Spring Boot

Uma API REST para gerenciamento de produtos de uma loja virtual, desenvolvida com **Spring Boot**.  
O sistema permite realizar todas as operações básicas de um CRUD: **criar, listar, buscar, atualizar e excluir produtos**.  

---

## 📌 Objetivo
Criar uma aplicação para gerenciar produtos com:

- Cadastro de produtos  
- Consulta de produtos (individual e em lista)  
- Atualização de dados dos produtos  
- Exclusão de produtos  

---

## 🏗️ Arquitetura do Sistema

### Stack Tecnológica
- ☕ **Java 17**  
- 🚀 **Spring Boot 3.x**  
- 🌐 **Spring Web** (construção dos endpoints REST)  
- 🗄️ **Spring Data JPA** (persistência de dados)  
- 💾 **H2 Database** (em memória para desenvolvimento)  
- 🛠️ **Maven** (gerenciamento de dependências)  

### 📦 Tecnologias utilizadas nos testes
- ✅ **JUnit 5** → testes unitários  
- ✅ **Spring Boot Test** → testes de integração  
- ✅ **MockMvc** → testes de endpoints REST sem servidor  

---

## 📁 Estrutura do Projeto
```
src/
├── main/
│ ├── java/io/github/usuario/apilojavirtual/
│ │ ├── controller/ (Controllers REST)
│ │ ├── dto/ (Data Transfer Objects)
│ │ ├── model/ (Entidades JPA)
│ │ ├── repository/ (Repositórios)
│ │ └── service/ (Lógica de negócio)
│ └── resources/
│ ├── application.properties
│ └── data.sql (opcional) carga inicial
└── test/ Testes unitários e integração
```
---
 ## 📚 Regras de Negócio

- ✅ Um produto deve ter nome, descrição, preço e quantidade

- ✅ O ID é gerado automaticamente pelo banco de dados

- ✅ Não é permitido cadastrar produtos sem nome ou preço

- ✅ O estoque (quantidade) não pode ser negativo

---

## 🚀 Funcionalidades

- ✅ Cadastrar produto → POST /produtos

- ✅ Listar produtos → GET /produtos

- ✅ Buscar produto por ID → GET /produtos/{id}

- ✅ Atualizar produto → PUT /produtos/{id}

- ✅ Remover produto → DELETE /produtos/{id}

---

## 📬 Endpoints Principais
🔹 Criar produto

- ✅ POST /produtos
- ✅ Corpo da requisição (JSON):
  ```
  {
  "nome": "Notebook Gamer",
  "descricao": "Notebook com 16GB RAM e SSD 512GB",
  "preco": 5999.90,
  "quantidade": 10}
```
Resposta esperada:

{
  "id": 1,
  "nome": "Notebook Gamer",
  "descricao": "Notebook com 16GB RAM e SSD 512GB",
  "preco": 5999.90,
  "quantidade": 10}
```
---
🔹 Remover produto

DELETE /produtos/{id}
Resposta esperada: 204 No Content

---
## 🧪 Banco de Dados H2

A aplicação usa H2 Database em memória para desenvolvimento.

Console disponível em: http://localhost:8080/h2-console

Credenciais padrão:
```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (em branco)
```

---
## 🛠️ Como executar

 Pré-requisitos:

- Java 17+
- Maven 3.9+
---
## Git
Passos:
```
git clone https://github.com/seu-usuario/api-loja-virtual.git
cd api-loja-virtual
mvn spring-boot:run
```
