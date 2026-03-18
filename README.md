# 🚀 Consulta de CEP com Java | ViaCEP API

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![API](https://img.shields.io/badge/API-ViaCEP-blue?style=for-the-badge)
![JSON](https://img.shields.io/badge/JSON-Gson-green?style=for-the-badge)
![Status](https://img.shields.io/badge/status-Concluído-success?style=for-the-badge)

---

## 📖 Descrição

Aplicação Java que realiza consultas de CEP utilizando a API pública **ViaCEP**, retornando informações como cidade, estado e logradouro.

O sistema permite ao usuário inserir um CEP via terminal, realiza a requisição HTTP, processa os dados e salva o resultado em um arquivo `.txt` ou `.json`.

---

## 🎯 Objetivo

Este projeto foi desenvolvido com foco em:

- 🌐 Consumo de APIs externas
- 🔗 Requisições HTTP em Java
- 📦 Manipulação de JSON com Gson
- 🧠 Organização de código em camadas
- ✅ Validação de entrada do usuário

---

## 🧠 Visão Geral

### 🔄 Fluxo da Aplicação

```text
Usuário → Digita CEP
        ↓
Validação do CEP
        ↓
Requisição HTTP (ViaCEP)
        ↓
Resposta JSON
        ↓
Conversão para Objeto Java
        ↓
Geração de Arquivo (.txt / .json)  

## 🗂️ Estrutura do Projeto

📁 src
 ├── 📁 modelo
 │    └── Endereco.java
 │
 ├── 📁 principal
 │    └── Testes.java
 │
 ├── 📁 servicos
 │    ├── Conversor.java
 │    ├── GeradorArquivo.java
 │    ├── InteracaoUsuario.java
 │    └── ViaCEPService.java
 │
📁 lib
 └── gson.jar

 ## ⚙️ Como Funciona

- InteracaoUsuario → Recebe e valida o CEP

- ViaCEPService → Faz a requisição HTTP

- Conversor → Converte JSON para objeto Java

- GeradorArquivo → Salva os dados em arquivo

- Endereco → Representa os dados da API