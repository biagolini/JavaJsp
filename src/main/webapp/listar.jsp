<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="br.edu.ifsp.spo.contatos.model.Contato" %>
<%@ page import="java.util.Collection" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listar Contatos</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="container">
    <h1>Listar Contatos</h1>
    <button class="button" onclick="window.location.href='index.html'">
        <span>Voltar para a Página Inicial</span>
    </button>
    <br><br>
    <table>
        <tr>
            <th>Nome</th>
            <th>Email</th>
            <th>Endereço</th>
            <th>Data de Nascimento</th>
        </tr>
        <%
            Collection<Contato> contatos = (Collection<Contato>) request.getAttribute("contatos");
            for (Contato contato : contatos) {
        %>
        <tr>
            <td><%= contato.getNome() %></td>
            <td><%= contato.getEmail() %></td>
            <td><%= contato.getEndereco() %></td>
            <td><%= new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento()) %></td>
        </tr>
        <% } %>
    </table>
</div>
</body>
</html>
