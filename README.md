# My First Web API

## 🚀 Sobre

Esta é a minha **primeira API REST** desenvolvida em **Java com Spring Boot**.  
O projeto implementa operações CRUD para gerenciamento de usuários, tratamento de exceções personalizado e documentação interativa com **Swagger/OpenAPI**.

O objetivo foi consolidar conceitos de **POO, arquitetura de APIs REST e boas práticas de backend**.

---

## 💡 Funcionalidades

- Listar todos os usuários (`GET /users`)  
- Buscar usuário pelo login (`GET /users/{username}`)  
- Criar usuário (`POST /users`)  
- Atualizar usuário (`PUT /users`)  
- Remover usuário pelo ID (`DELETE /users/{id}`)  
- Tratamento de exceções personalizado com `BusinessException`  
- Documentação interativa da API com **Swagger/OpenAPI**  

---

## 🛠 Tecnologias

- Java 21  
- Spring Boot 3  
- Swagger / OpenAPI (springdoc-openapi)  
- Arquitetura MVC (Controller, Model, Repository)  
- Boas práticas de POO e modularidade de código  
- Logs de execução no console  

---

## 📦 Estrutura do projeto

my-first-web-api/
│
├─ src/main/java/enzoanthony/web/api/

│ ├─ controller/ # Controllers REST (UsuarioController, WelcomeController)

│ ├─ model/ # Model (Usuario)

│ ├─ repository/ # Camada de repositório (UserRepository)

│ ├─ handler/ # Tratamento de exceções (GlobalExceptionHandler, BusinessException)

│ └─ MyFirstWebApiApplication.java # Classe principal
│
├─ pom.xml # Dependências Maven
└─ README.md # Documentação do projeto


---

## 📄 Endpoints da API

### UsuarioController
| Método | Endpoint            | Descrição                     |
|--------|-------------------|--------------------------------|
| GET    | /users             | Lista todos os usuários       |
| GET    | /users/{username}  | Busca um usuário pelo login  |
| POST   | /users             | Cria um novo usuário         |
| PUT    | /users             | Atualiza um usuário existente|
| DELETE | /users/{id}        | Remove um usuário pelo ID    |

### WelcomeController
| Método | Endpoint | Descrição              |
|--------|---------|----------------------|
| GET    | /       | Mensagem de boas-vindas|

---

## 📌 Executando a aplicação

1. Clone o repositório:  
   ```bash
   git clone https://github.com/seu-usuario/my-first-web-api.git
Abra o projeto no IntelliJ IDEA ou outra IDE compatível com Maven.



