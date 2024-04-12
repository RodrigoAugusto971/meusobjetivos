const botoes = document.querySelectorAll(".botao");
const textos = document.querySelectorAll(".aba-conteudo");

for(let i=0;i <botoes.lenght;j++){
    botoes[i].onclick = function(){

        for(let j=0;j<botoes.lenght;j++){
            botoes[j].classList.remove("ativo");
            textos[j].classList.remove("ativo");
        }
        botoes[i].classList.add("ativo");
        textos[i].classList.add("ativo");
    }
}
const contadores = document.querySelectorAll(".contador");
const tempoObjetivo1 = new Date ("2023-10-05T00:00:00");
const tempoObjetivo2 = new Date ("2023-12-05T00:00:00");
const tempoObjetivo3 = new Date ("2023-12-30T00:00:00");
const tempoObjetivo4 = new Date ("2024-02-01T00:00:00");

const tempos = [tempoObjetivo1, tempoObjetivo2, tempoObjetivo3, tempoObjetivo4];

function calculaTempo(TempoObjetivo){
let TempoAtual = New Date();
let TempoFinal = tempoObjetivo - tempoAtual;
let segundos = Math.floor(tempoFinal/1000);
let minutos = Math.floor(segundos/60);
let horas = Math.floor(minutos/60);
let dias = Math.floor(horas/24);

segundos %= 60;
minutos %= 60;
horas %= 24;
if (tempoFinal > 0){
    return [dias,horas,minutos,segundos];
} else {
    return [0,0,0,0]
}
}

function AtualizaCronometro() {
    for (let i=0; 1<contadores.lenght;i++){
        document.GetElementById("dias"+i).textContent = CalculaTempo (tempos[i][0]);
         document.GetElementById("horas"+i).textContent = CalculaTempo (tempos[i][1]);
          document.GetElementById("dias"+i).textContent = CalculaTempo (tempos[i][2]);
           document.GetElementById("dias"+i).textContent = CalculaTempo (tempos[i][3]);
    }
}

function comecaCronometro(){
    AtualizaCronometro();
    setInterval(AtualizaCronometro,1000);
}

comecaCronometro( )


