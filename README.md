## Agenda de Contatos

Essa agenda de contatos foi realizada com as tais ferramentas: como linguagem principal java swing para criar a interface, aquilo que chamo de agenda, também o banco de dados MySQL para realizar a conexão com o java conforme o ensinado nas aulas, assim então coumprindo os pré requisitos.

| Ferramentas  Utilizadas |  Descrição                                       |
|-------------------------|--------------------------------------------------|
| Java                    | Como linguagem de programação principal          |
| Swing                   | Para criar a interface da agenda de contatos     |
| MySQL                   | Banco de dados                                   |
| JDBC                    | Para fazer a conexão com o banco de dados        |
| NetBeans                | Software utilizado para realizar a programação   | 

##  Objetivo
Utilizando do conteúdo aprendido em aula e das ferramentas fornecidas pelo conhecimento adquirido durante o curso, criei uma agenda de contatos com o objetivo de facilitar o ato de ter uma agendaz como automatizala e tira-la do papel.

## O projeto segue essa seguinte estrutura: 
```sh
Dao/Conexao.java

Dao/Contato.java

Model/modelo.java

View/jAgenda.java
```

## Interface da Agenda de Contatos
<img width="921" height="598" alt="image" src="https://github.com/user-attachments/assets/b5240b64-10e9-4bb5-823e-d7a4fe003770" />

## Para a criação do banco de dados do projeto, faça da seguinte forma: 
```sh
create database agenda;

CREATE TABLE contatos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(20),
    email VARCHAR(100)
);

select * from contatos;
```

## Funcionamento dos botões da interface: 
```sh
Botão de Salvar:
Permite registrar um novo contato. 🔹 Quando o usuário insere nome, telefone e e-mail nos campos de texto e clica em "Salvar", os dados são enviados ao banco de dados e imediatamente exibidos na tabela. 🔹 Ideal para adicionar novos registros.

Botão de Editar:
Permite modificar um contato existente. 🔹 O usuário seleciona uma linha da tabela, ajusta os campos de texto e clica em "Editar". 🔹 O sistema atualiza aquele registro no banco de dados com os novos dados informados. 🔹 Muito útil para correções ou atualizações nos contatos.

Botão de Excluir:
Remove permanentemente um contato da lista. 🔹 Ao selecionar um contato na tabela e clicar em "Excluir", o sistema remove aquele registro do banco de dados após confirmação. 🔹 Evita acúmulo de informações antigas ou incorretas.

Botão de Buscar:
Filtra os dados exibidos na tabela com base nos critérios inseridos. 🔹 O usuário digita parte do nome, telefone ou e-mail e ao clicar em "Buscar", a tabela mostra apenas os contatos correspondentes. 🔹 Facilita localizar informações específicas sem precisar vasculhar manualmente.
