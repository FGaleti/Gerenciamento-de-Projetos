# API de Gerenciamento de Projetos

Esta é uma API RESTful desenvolvida em **Spring Boot** com o objetivo de gerenciar projetos. O projeto foi construído para praticar o mapeamento objeto-relacional (ORM) utilizando **JPA/Hibernate**, focado no tratamento de datas (`LocalDate`) e na implementação das operações básicas de CRUD (Create, Read, Update, Delete).

## 🚀 Tecnologias Utilizadas
* Java
* Spring Boot
* Spring Data JPA
* Banco de Dados Relacional (H2 / MySQL / PostgreSQL)

## 📌 Endpoints da API

A API expõe os seguintes endpoints na rota base `/projetos`:

* `POST /projetos`: Cria um novo projeto.
* `GET /projetos`: Lista todos os projetos cadastrados.
* `GET /projetos/{id}`: Busca um projeto específico pelo seu ID.
* `DELETE /projetos/{id}`: Deleta um projeto específico pelo seu ID.

## 👥 Contribuidores

* Felipe Galeti Gôngora - 24036480-2
* Breno Bertaglia Nosima - 24113673-2
