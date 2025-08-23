# Basket Service API 🧺
Projeto desenvolvido durante o curso [Java10x](https://java10x.dev/), com o objetivo de criar APIs utilizando o MongoDB como banco de dados principal e o Redis para cache, simulando um carrinho de compras típico de e-commerces.

---

## Tecnologias utilizadas:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

---

## Endpoints:

### Produtos:

| Método | Rota             | Descrição                      |
|--------|------------------|--------------------------------|
| GET    | `/products`      | Retorna todos os produtos      |
| GET    | `/products/{id}` | Retorna um produto pelo seu ID |

### Cestas:

| Método | Rota                   | Descrição                             |
|--------|------------------------|---------------------------------------|
| GET    | `/basket/{id}`         | Retorna um carrinho pelo ID           |
| POST   | `/basket`              | Cria um novo carrinho                 |
| PUT    | `/basket/{id}`         | Atualiza um carrinho existente pelo ID|
| PUT    | `/basket/{id}/payment` | Realiza o pagamento de um carrinho    |
| DELETE | `/basket/{id}`         | Remove um carrinho pelo ID            |

---

## Como rodar o projeto:

### 1. Clone o repositório
```
git clone https://github.com/NicolasCoiado/basketservice.git
cd basketservice
```
### 2. Configure as Variáveis de Ambiente:
Configure as variáveis de ambiente na sua IDE ou através do seguinte arquivo `.env`:
```.dotenv
MONGO_USER={SEU USUÁRIO DO MONGODB}
MONGO_PASSWORD={SUA SENHA DE ACESSO MONGODB}
MONGO_AUTH_DB={DATABASE DO USUÁRIO}
```

### 3. Rode o docker-compose
`docker-compose up -d`

**Por fim, execute o projeto em sua IDE de preferência e está tudo pronto!**
