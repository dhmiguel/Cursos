//Usando o express para criar e configurar meu servidor

const express = require('express');
const server = express();

//Configurar arquivos estáticos (css, scripts, imagens)
server.use(express.static("public"))

//Configuração do nunjucks

const nunjucks = require("nunjucks");
nunjucks.configure("views", {
    express: server,
    noCache: true,
})

/*Criando uma rota / 
e capturando o pedido do cliente para responder */
server.get("/", function(req, res){
    return res.render("index.html") 
 
})

server.get("/ideas", function(req, res){
    return res.render("ideas.html") 

})

//Ligando o Servidor na porta 3000
server.listen(3000);