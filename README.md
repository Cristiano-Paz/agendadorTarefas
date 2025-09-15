# 🗓️ Agendador de Tarefas

> API desenvolvida em **Java 17** com **Spring Boot**, para gerenciamento de tarefas agendadas e controle de notificações.

---

## 🚀 Tecnologias

- Java 17  
- Spring Boot 3.5.3  
- Spring Web  
- Spring Security (JWT)  
- Spring Data JPA  
- PostgreSQL  
- Spring Cloud OpenFeign  
- MapStruct  
- Lombok

---

## 📌 Funcionalidades

- Criar tarefas agendadas
- Listar tarefas por:
  - Período
  - Usuário (via token)
- Atualizar status de notificação
- Editar informações de uma tarefa
- Excluir tarefas

---

## 🌐 Endpoints

> Todos os endpoints exigem um **token JWT** no header `Authorization`.

| Método   | Endpoint            | Descrição |
|----------|--------------------|------------|
| `POST`   | `/tarefas`         | Cria uma nova tarefa |
| `GET`    | `/tarefas/eventos` | Lista tarefas por período (`dataInicial`, `dataFinal`) |
| `GET`    | `/tarefas`         | Lista tarefas do usuário autenticado |
| `DELETE` | `/tarefas`         | Remove uma tarefa pelo `id` |
| `PATCH`  | `/tarefas`         | Atualiza o status de notificação |
| `PUT`    | `/tarefas`         | Atualiza as informações de uma tarefa |

### Exemplo de Request – Criar Tarefa
```http
POST /tarefas
Authorization: Bearer <seu_token>
Content-Type: application/json

{
  "titulo": "Reunião com equipe",
  "descricao": "Reunião de planejamento da sprint",
  "dataAgendada": "2025-09-20T15:00:00",
  "statusNotificacao": "PENDENTE"
}
```

---

## 🛠 Como Executar

### Pré-requisitos
- Java 17+
- PostgreSQL em execução  
- Gradle (ou use o wrapper `./gradlew`)

### Passo a Passo
\`\`\`bash
# 1️⃣ Clone o repositório
git clone https://github.com/seu-usuario/agendador-tarefas.git
cd agendador-tarefas

# 2️⃣ Configure o banco no arquivo application.yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco
    username: seu_usuario
    password: sua_senha

# 3️⃣ Execute a aplicação
./gradlew bootRun
\`\`\`

---

## 📂 Estrutura do Projeto
\`\`\`
src/
 ├─ main/java/com/java/agendadorTarefas
 │   ├─ controller        # Endpoints REST
 │   ├─ business          # Regras de negócio
 │   ├─ infrastructure    # Configurações, enums, etc.
 │   └─ model/dto         # Entidades e DTOs
 └─ main/resources
     └─ application.yml
\`\`\`

---

## 🧪 Testes
\`\`\`bash
./gradlew test
\`\`\`

---

## 🤝 Contribuindo
1. Faça um fork do projeto  
2. Crie uma branch (`git checkout -b feature/nova-feature`)  
3. Commit suas alterações (`git commit -m 'Minha nova feature'`)  
4. Push (`git push origin feature/nova-feature`)  
5. Abra um Pull Request

---
