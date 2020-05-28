//Outro exemplo com o uso do bind
function pessoa(){
    this.idade = 0

    setInterval(function() {
        this.idade++
        console.log(this.idade)
    }.bind(this), 1000)// o 1000 é o segundo parâmetro que é o tempo em que a função vai ser chamada em milissegundos
    //O setInterval é outra função, então por mais que eu crie uma função como parâmetro, o this aponta para o escopo do setInterval
    //Então por isso o bind 
}

new pessoa