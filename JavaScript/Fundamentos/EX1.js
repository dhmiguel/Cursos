/*01) Crie uma função que dado dois valores (passados como parâmetros) mostre no console a soma, subtração,
multiplicação e divisão desses valores*/

//Usando funcion normal
console.log("Função: \n");
function calcular(num1, num2){
    console.log("Soma: ".concat(num1+num2));
    console.log("Subtração: ".concat(num1-num2));
    console.log("Multiplicação: ".concat(num1*num2));
    console.log("Divisão: ".concat(num1/num2));
}
calcular(65,7);

//Usando arrow function
console.log("Arrow Function: \n");
const calcular1 = (a1, a2) => {
    console.log("Soma: ".concat(a1+a2));
    console.log("Subtração: ".concat(a1-a2));
    console.log("Multiplicação: ".concat(a1*a2));
    console.log("Divisão: ".concat(a1/a2));
}

calcular1(5,4);