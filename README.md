# workshop-spring-boot-mongodb

## Este projeto é baseado no curso de Java do professor Nélio Alves e implementa um serviço web utilizando o framework Spring Boot e o banco de dados NoSQL MongoDB.

## Descrição
O projeto é uma aplicação RESTful que permite realizar operações CRUD (Create, Read, Update, Delete) em uma entidade "User" (usuário) que cria "Posts" com comentários. Ele utiliza o Spring Boot como framework para criação de APIs web e o MongoDB como banco de dados NoSQL para persistência dos dados.

## Funcionalidades
Listar todos os usuários cadastrados (GET /users)
Buscar usuário por ID (GET /users/{id})
Inserir novo usuário (POST /users)
Atualizar dados de um usuário existente (PUT /users/{id})
Excluir um usuário (DELETE /users/{id})
Buscar um post por ID (GET /posts/{id})
Buscar todos os posts quem possuam um título (GET /posts/titlesearch)
Buscar todos os posts que atendam a critérios de presença de texto bem como intervalo de datas (GET /posts/fullsearch)

## Tecnologias utilizadas
Java
Spring Boot
MongoDB
JPA/Hibertnate
