# Exercício - Lugarzinho

Criar um sistema que permita o cadastro e visualização de anúncios por parte
dos usuários.

## Parte 1- Criar CRUDs de Usuário e Anúncio

### POST /usuario

Request Body
```
{
  "nome": "João José",
  "email" "joao@jose.com",
  "nomeusuario": "joazer",
  "senha": "segredosecreto123"
}
```
Response 201
```
{
  "id": 1,
  "nome": "João José",
  "email" "joao@jose.com",
  "nomeusuario": "joazer"
}
```

### POST /anuncio

Request Body
```
{
  "titulo": "Xbox 360",
  "descricao" "Bom estado. Usado com carinho.",
  "preco": 560.00
}
```
Response 201
```
{
  "id": 1,
  "titulo": "Xbox 360",
  "descricao" "Bom estado. Usado com carinho.",
  "preco": 560.00,
  "data": "2018-06-06T08:01:35"
}
```

### GET /anuncios
```
[
  {
    "id": 1,
    "titulo": "Xbox",
    "descricao" "Bom estado. Usado com carinho.",
    "preco": 560.00,
    "data": "2018-06-06T08:01:35",
    "usuario": {
      "nome": "João José",
      "email" "joao@jose.com",
      "nomeusuario": "joazer"
    }
  }
]
```

## Parte 2- Implementar Login e Autenticação de Endpoints

### POST /login
Request Body
```
{
  "nomeusuario": "joaozer",
  "senha": "supersecreta123"
}
```

Response 200
Headers
```
Authorization: Bearer token-vai-aqui
Access-Control-Expose-Headers: Authorization
```

Body
```
{
  "id": 1,
  "nome": "João José",
  "email" "joao@jose.com",
  "nomeusuario": "joazer"
}
```

Response 400
```
{
  "mensagem": "Usuário ou senha inválidos"
}
```

### POST /anuncio
Alterar o endpoint de forma que ele só possa ser utilizado com autenticação. Qualquer chamada à esse endpoint sem autenticação ou com token inválido deve receber um status 403.

Request Headers
```
Authorization: Bearer token-vai-aqui
```
