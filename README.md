# 🚗 Locatech — API de Gerenciamento de Locadora de Veículos

> API desenvolvida com o objetivo de gerenciar as operações de uma **locadora de veículos**, oferecendo suporte completo para o controle de clientes, veículos e locações.

---

## 📋 Sobre o Projeto

O **Locatech** é uma API REST back-end voltada para o gerenciamento completo de uma locadora de veículos. O sistema foi desenvolvido com Java e Spring Boot, utilizando banco de dados H2 em memória para facilitar os testes e o desenvolvimento local.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) **Java 21** | Linguagem principal do servidor |
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring&logoColor=white) **Spring Boot 4.0.4** | Framework para criação da API REST |
| **Spring Web MVC** | Camada de controllers e endpoints REST |
| **Spring JDBC** | Camada de acesso e persistência de dados |
| **H2 Database** | Banco de dados em memória para desenvolvimento e testes |
| **Lombok** | Redução de código boilerplate (getters, setters, etc.) |
| **Maven** | Gerenciamento de dependências e build |

---

## 🗂️ Estrutura do Projeto

```
Locatech/
├── .mvn/wrapper/          # Maven Wrapper
├── src/
│   └── main/
│       ├── java/          # Controllers, Services, Repositories, Models
│       └── resources/     # application.properties e scripts SQL
├── .gitignore
├── mvnw / mvnw.cmd        # Scripts de execução com Maven Wrapper
├── pom.xml
└── README.md
```

---

## ⚙️ Funcionalidades

- 🧑 **CRUD completo** de clientes
- 🚙 **CRUD completo** de veículos
- 📋 **Gerenciamento de locações** (criar, consultar, encerrar)
- 🔗 API REST consumível por qualquer front-end ou cliente HTTP
- 🖥️ Console H2 disponível para inspeção do banco de dados em desenvolvimento

---

## 🏁 Como Executar o Projeto

### Pré-requisitos

- [Java 21+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/) *(ou use o Maven Wrapper incluído no projeto)*

---

### 🔧 Executando a API

```bash
# 1. Clone o repositório
git clone https://github.com/Alekey2/Locatech.git

# 2. Acesse a pasta do projeto
cd Locatech

# 3. Execute a aplicação com o Maven Wrapper
./mvnw spring-boot:run
```

> No Windows, utilize `mvnw.cmd spring-boot:run`

A API ficará disponível em: `http://localhost:8080`

O console do H2 ficará disponível em: `http://localhost:8080/h2-console`

---

## 🔌 Endpoints da API

### Clientes

| Método | Endpoint | Descrição |
|---|---|---|
| `GET` | `/clientes` | Lista todos os clientes |
| `GET` | `/clientes/{id}` | Busca cliente por ID |
| `POST` | `/clientes` | Cadastra novo cliente |
| `PUT` | `/clientes/{id}` | Atualiza cliente existente |
| `DELETE` | `/clientes/{id}` | Remove um cliente |

### Veículos

| Método | Endpoint | Descrição |
|---|---|---|
| `GET` | `/veiculos` | Lista todos os veículos |
| `GET` | `/veiculos/{id}` | Busca veículo por ID |
| `POST` | `/veiculos` | Cadastra novo veículo |
| `PUT` | `/veiculos/{id}` | Atualiza veículo existente |
| `DELETE` | `/veiculos/{id}` | Remove um veículo |

### Locações

| Método | Endpoint | Descrição |
|---|---|---|
| `GET` | `/locacoes` | Lista todas as locações |
| `GET` | `/locacoes/{id}` | Busca locação por ID |
| `POST` | `/locacoes` | Registra uma nova locação |
| `PUT` | `/locacoes/{id}` | Atualiza dados de uma locação |
| `DELETE` | `/locacoes/{id}` | Encerra/remove uma locação |

---

## 👤 Autor

Desenvolvido por **[Alekey2](https://github.com/Alekey2)**

---

## 📄 Licença

Este projeto é de uso acadêmico — desenvolvido para fins educacionais no curso de **Pós-Graduação em Arquitetura e Desenvolvimento Java** da **FIAP**.
