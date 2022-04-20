import kotlin.system.exitProcess

/* ideia base
um programa que leia as notas da primeira, segunda, terceira e quarta avaliação de um aluno.
Calcule e imprima a média semestral.
somente notas 0-10 validar a nota antes de add ela no array, array dentro de um if
“novo cálculo (1-sim 2-nao)” ao final de cada aluno
 ----> indicando se deseja ou não EXECUTAR o algoritmo NOVAMENTE
 (aceitar apenas os código 1 ou 2)

● Quando 4 notas válidas forem lidas, deve ser impressa a mensagem
após ler as 4 notas = exibir "média= ” seguido do valor do cálculo.
e mostrar a pergunta
"novo cálculo (1-sim 2-nao)"
  -> -> 2 o programa deve ser encerrado.
  exitProcess(0)

● O programa deve parar quando o valor lido para este X for igual a 2.
se for 1 RODAR TODO O PROGRAMA NOVAMENTE
 */

/* estrutura
menu inicial explicando o q faz
pedindo e validando notas = if array / else, insira novamente
calculo média com retorno parametro puxa as notas
exibir média puxar do retorno anterior
//caixa opção 1 ou 2  if 1 rodar novamente else if 2 sair else retorna a mesma caixa opção
 */


fun main(){
    sistamaEscola()
}

fun sistamaEscola(){
    println("\nOlá! Bem vindo ao nosso sistema de notas da Escola SimCity")





    perguntaExecutarNovamente()
}

fun perguntaExecutarNovamente(){
    println("\nDeseja fazer um novo cálculo? \n1-sim 2-nao")
    val numeroDigitado = readln().toInt()
    when (numeroDigitado) {
        1 -> sistamaEscola()
        2 -> encerrarSistema()
        else -> perguntaExecutarNovamente()
    }
}

fun encerrarSistema(){
    println("Obrigado por usar nosso sistema!")
    exitProcess(0)
}