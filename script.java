@import url('https://fonts.googleapis.com/css2?family-Chakra+Petch:w ght@400:700&display=swap'); 

:root {
    --cor-de-fundo: #1E1E1E;
    --verde: #6FFF57;
    --branco: #FFFFFF;
    --botao-ativo: #3A375E;
    --botao-inativo: rgba(58, 55, 94, 0.5);
    --texto-fundo: rgba(58, 55, 94, 0.3);

}
body {
    background-color: var(--cor-de-fundo);
    color: var(--branco);
    font-family: 'Chakra Petch', sans-serif;
}
.conteudo-principal {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    max-width: 1200px;
    width: 100%;
    margin: 0 auto;
}

.titulo-principal {
    text-align: left;
    width: 100%;
    font-size: 32px;
}

.titulo-principal{
    color: var(--verde);
}

.botao {
    font-family: "Chakra Petch", sans-serif;
    background-color: var(--botao-inativo);
    display: flex;
    justify-self: center;
    padding: lem;
    font-size: 18px;
    align-items: center;
    width: 100%;
    border-bottom: 4px solid var(--botao-ativo);
    border-left: 2px solid var(--botao-ativo);
    border-top: 2px solid var(--botao-ativo);
    border-top: none;
}

.botao:first-child{
    border-radius: 40px 40px 0 0;
}

.botoes {
    display: block;
}

.botao.ativo{
    background-color: var(--botao-ativo);
    border-bottom: 4px solid var(--verde);
}

@media screen and (min-width: 768px){
    .botoes{
        display: flex;
    }

    .botao:first-child{
        border-radius: 40px 0 0;
    }
    .botao:last-child{
        border-radius: 0 40px 0;
    }
}
.aba-textos{
    background-color: var(--texto-fundo);
padding: 40px;
border-radius: 0 0 40px 40px;
}
.aba-conteudo.ativo{
    display: block;
}

.aba-conteudo{
    display: none;
}

.aba-conteudo-titulo-principal{
    font-size: 28px;
    text-align: center;
}
.aba-conteudo-titulo-secundario{
    text-align: center;
    color: var(--verde);
    text-transform: uppercase;
}

.contador{
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
}
.contador-digito{
    padding: 0 16px;
    text-align: center;
    min-width: 100px;
}

.contador-digito-numero{
    font-size: 80px;
    margin: 0;

}

.contador-digito-texto{
    color: var(--verde);
    font-size: 20px;
    margin: 0;

}



