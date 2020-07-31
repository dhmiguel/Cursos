const anonimo = process.argv.indexOf('-a') !== -1

//console.log(anonimo);
if(anonimo){
    process.stdout.write('Fala Anônimo!\n')
    process.exit()
}
else{
    process.stdout.write('Informe o seu nome: ')
    process.stdin.on('data', data =>{//Evento On Data, quando o usuário entra com um dado e aperta enter
        const nome = data.toString().replace('\n', '')

        process.stdout.write(`Fala ${nome}!\n`)
        process.exit()
    })
}

/*
Um exemplo disso é quando é feito o comando npm init
E você tem que ir digitando os dados do projeto
 */