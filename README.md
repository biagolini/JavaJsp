# Sistema de Gerenciamento de Contatos

Este projeto é um exemplo simples de um sistema de aplicação Java, usando Servlets e JSP. O Maven é usado para gerenciar "builds" do projeto. Esse projeto apresenta um gerenciador de contatos que permite adicionar, listar e armazenar informações sobre contatos, como nome, email, endereço e data de nascimento, usando um DAO.

## Estrutura do Projeto

O projeto segue uma estrutura básica de aplicação web Java, com a seguinte organização:
Diretórios:

```
project_root/
│
├── src/
│      ├── main/java/br/edu/ifsp/spo/
│                                   ├── controller/
│                                   ├── listener/
│                                   └── model/
│      └── webapp/
│                └── WEB-INF/
└─
```

Arquivos:

```
project_root/
│
├── src/main/java/br/edu/ifsp/spo/contatos/controller/AdicionarContatoServlet.java
├── src/main/java/br/edu/ifsp/spo/contatos/controller/ListarContatosServlet.java
├── src/main/java/br/edu/ifsp/spo/contatos/listener/AppContextListener.java
├── src/main/java/br/edu/ifsp/spo/contatos/model/Contato.java
├── src/main/java/br/edu/ifsp/spo/contatos/model/ContatoDAO.java
├── src/main/webapp/WEB-INF/web.xml
├── src/main/webapp/adicionar.html
├── src/main/webapp/index.html
├── src/main/webapp/listar.jsp
├── src/main/webapp/style.css
└── pom.xml
```

### Classes Java

- `Contato.java`: Representa o modelo de Contato com seus atributos e métodos de acesso (getters e setters).
- `ContatoDAO.java`: Classe responsável pelo armazenamento e recuperação dos contatos em memória.
- `AdicionarContatoServlet.java`: Servlet responsável por receber os dados do formulário de adição de contato e armazená-los no ContatoDAO.
- `ListarContatosServlet.java`: Servlet responsável por recuperar os contatos armazenados e apresentá-los na página listar.jsp.

### Páginas Web

- `index.html`: Página inicial com botões para navegar para páginas de adicionar um novo contato e listar os contatos existentes.
- `adicionar.html`: Formulário para adicionar um novo contato.
- `listar.jsp`: Página para listar os contatos armazenados.

### Estilos

- `styles.css`: Arquivo CSS que contém os estilos aplicados em todas as páginas do projeto.

## Instruções para Execução

1. Clone o repositório ou faça download do projeto.
2. Importe o projeto em seu ambiente de desenvolvimento Java (como Eclipse ou IntelliJ IDEA).
3. Certifique-se de que você possui um servidor de aplicação Java (como Apache Tomcat) configurado em seu ambiente de desenvolvimento.
4. Execute o projeto no servidor e acesse a aplicação no navegador.
