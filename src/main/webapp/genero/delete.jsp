<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Remover Genero </title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
        <main class="container">
            <h1>Remover Genero</h1>
            <hr />
            <p>Tem certeza que deseja remover o genero <em>"${genero.Nome}"</em> ?</p>
            <form action="/genero/delete" method="post">
                <input type="hidden" name="id" value="${Genero.id}" />
                <a href="/genero/list" class="btn btn-primary">Voltar</a>
                <input type="submit" value="Remover" class="btn btn-danger" />
            </form>
        </main>
         
        
    </body>
</html>