# DAO With JDBC

Este projeto demonstra como implementar o padrão DAO (Data Access Object) utilizando JDBC (Java Database Connectivity), com foco em uma arquitetura limpa, separando a lógica de acesso a dados da lógica de negócios. São utilizados dois domínios principais: **Department** e **Seller**.

## 📚 Sobre o Projeto

O projeto simula operações básicas de um sistema de gestão, permitindo realizar CRUD (Create, Read, Update, Delete) para as entidades `Department` e `Seller` utilizando JDBC puro, com conexões ao banco de dados MySQL.

---

## 🛠️ Tecnologias Utilizadas

- Java
- JDBC
- MySQL
- Maven (estruturação do projeto)
- IntelliJ IDEA (IDE recomendada)

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com.giovannyenes/
            ├── application/
            │   ├── Program.java
            │   └── Program2.java
            ├── dao/
            │   ├── DaoFactory.java
            │   ├── DepartmentDao.java
            │   ├── SellerDao.java
            │   └── impl/
            │       ├── DepartmentDaoJDBC.java
            │       └── SellerDaoJDBC.java
            ├── db/
            │   ├── DB.java
            │   ├── DbException.java
            │   └── DbIntegrityException.java
            └── entities/
                ├── Department.java
                └── Seller.java
└── test/
    └── java/
        └── com.giovannyenes/
            └── AppTest.java
```

---

## ⚙️ Configuração do Ambiente

1. **Clone o repositório:**

```bash
git clone https://github.com/GiovannyEnes/Dao-With-JDBC.git
```

2. **Configure o banco de dados:**

- Crie um banco de dados MySQL chamado `coursejdbc`.
- Execute os scripts SQL para criação das tabelas `department` e `seller` com seus relacionamentos.

3. **Configure o arquivo `db.properties`:**

No diretório raiz do projeto, insira suas credenciais do banco de dados:

```
dburl=jdbc:mysql://localhost:3306/coursejdbc
user=seu_usuario
password=sua_senha
```

---

## ✅ Funcionalidades

O projeto implementa as seguintes operações para as entidades `Department` e `Seller`:

### 📂 Department

- 🔍 Buscar um departamento por ID
- 📜 Listar todos os departamentos
- ➕ Inserir um novo departamento
- ✏️ Atualizar dados de um departamento existente
- ❌ Remover um departamento por ID

### 👤 Seller

- 🔍 Buscar um vendedor por ID
- 📜 Listar todos os vendedores
- ➕ Inserir um novo vendedor
- ✏️ Atualizar dados de um vendedor existente
- ❌ Remover um vendedor por ID

---

## ▶️ Como Executar

1. Compile o projeto na sua IDE ou terminal.
2. Execute as classes `Program` e `Program2` localizadas em `application/` para testar as funcionalidades.
3. Utilize o teste `AppTest.java` para validar o comportamento esperado (pode ser estendido com testes JUnit).

---

## 🧠 Padrões Utilizados

- DAO (Data Access Object)
- Factory Method (`DaoFactory`)
- Exceções customizadas para tratamento de erros de banco (`DbException`, `DbIntegrityException`)

---
