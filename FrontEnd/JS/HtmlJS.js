
let menssagem = 'oi mundo';
console.log(menssagem);

function somar(numA, numB) {
    return numA + numB;
}

let results = somar(22, 11);
    console.log(results);

    let numeros = [1, 2, 3, 5,]
    console.log(numeros[3]);
    numeros.push(6);
    console.dir(numeros);


    let pessoa = {
        nome: 'Denis',
        idade: 17,
        tel: '988727788',
        resumo: function () {
            return this.nome + " " + this.idade + " " + this.tel
        }
    }
    console.dir(pessoa);
    console.log(pessoa.resumo());

    if (pessoa.idade >= 18){
        console.log(menssagem)
    }else{
        console.log(results)
    }

    for (let num of numeros){
        console.log(num);
    }