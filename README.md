# Gerenciamento de Acesso com Spring Boot 3, Hibernate e MongoDB

Este projeto de **Gerenciamento de Acesso** é desenvolvido com **Spring Boot 3**, **Hibernate** e **MongoDB**, permitindo o controle de acesso de usuários a um sistema, incluindo criação de ordens de serviço (OS) e verificação de permissões.

## 🚀 Tecnologias Utilizadas
- **Spring Boot 3**: Framework para construção de aplicações Java.
- **Hibernate**: Ferramenta ORM para gerenciamento de dados.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar as informações do sistema.
- **Spring Data MongoDB**: Integração do Spring Boot com MongoDB.

## 📑 Funcionalidades
- **Autenticação e Autorização de Usuários**: Implementado com controle de permissões.
- **CRUD de Ordens de Serviço**: Criação, leitura, atualização e exclusão de ordens de serviço, com campos como local, validade e detalhes do serviço.
- **Gerenciamento de Acesso**: Verifica se o usuário tem uma ordem de serviço válida para acessar o sistema.
- **Integração com MongoDB**: Armazenamento e gerenciamento de dados utilizando MongoDB como banco de dados.

## 📦 Como Executar o Projeto
### Pré-requisitos
- **Java 17+**
- **Maven**
- **MongoDB** instalado ou um serviço MongoDB online (como MongoDB Atlas)

### Passos
Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
  ````
### Navegue até a pasta do projeto:
  ```bash
   cd seu-repositorio
  ````
### Configure as variáveis de ambiente no arquivo application.properties ou application.yml:
```bash
 spring.data.mongodb.uri=mongodb://localhost:27017/seu-banco
  ````

### 🛠️ Endpoints Principais

- **POST** /auth/login - Login de usuários.
- **POST** /orders - Criação de uma nova ordem de serviço.
- **GET** /orders/{id} - Buscar ordem de serviço por ID.
- **PUT** /orders/{id} - Atualizar uma ordem de serviço.
- **DELETE** /orders/{id} - Excluir uma ordem de serviço.

### 📫 Contato
LinkedIn
Email: rodrigokikuchi2020@gmail.com
