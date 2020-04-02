//Escrever uma função que retorne números aleatórios

function numeroAleatorio(num){
    return Math.floor(Math.random() * num ) + 1;
}

//floor utlizado para arredondar pois o aleatorio pode gerar números quebrados

// o +1 é para poder ir até o número passado

console.log(numeroAleatorio(10));
console.log(numeroAleatorio(100));
console.log(numeroAleatorio(50));