const pessoa = {
    saudacao: 'Bom dia', 
    falar(){
        console.log(this.saudacao); //Tem que usar o this, se não ele não acessa 
    }
}

pessoa.falar();

const falar = pessoa.falar //Isso da erro, pois o this está apontando no contexto global

//Usando o bind

const falarDePessoa = pessoa.falar.bind(pessoa); 
//O bind "amarra" a chamada de funções múltiplas, referenciando o this declarado na função especificada

falarDePessoa();