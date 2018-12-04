function abrirPag_Post(formulario, valor){

    var url = valor;

    // getElementById - paga o valor do campo. - indicação e exemplos - http://www.codigofonte.net/dicas/javascript/717_estruturas-de-condicao-de-javascript
    // elements - Permite aceder o valor de um elemento - indicação e exemplos - http://translate.google.com.br/translate?hl=pt-BR&sl=en&u=http://www.javascriptkit.com/jsref/elements.shtml&ei=sHcOTLiKMsP68Aad08DWCA&sa=X&oi=translate&ct=result&resnum=1&ved=0CBwQ7gEwAA&prev=/search%3Fq%3Delements%255Bi%255D%26hl%3Dpt-BR%26prmd%3Dv

    valorCampo = document.getElementById(formulario);

    xmlRequest.open("POST",http://localhost:8080/TrabalhoPratico/webresources/br.udesc.cavi.eso.dsw.trabalhopratico.categoria,true);


    xmlRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xmlRequest.setRequestHeader("Content-length", params.length);
    xmlRequest.setRequestHeader("Connection", "close");

    // uso o for para ler todos os inputs do formulário e enviar um arquivo (bem imagino está correto)
    for (i=0; i < valorCampo.elements.length; i++){

        params += valorCampo.elements[i].value;
    }

    xmlRequest.onreadystatechange = mudancaEstado;
    xmlRequest.send(params);

}