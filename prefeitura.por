programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
		real percsal=0.0,maiorsal=0.0 , mediasalario=0.0,mediafilhos=0.0,perc=0.0,salario,somasalario =0.0,somafilho=0.0
		inteiro filho,x

		para(x=1;x<=20;x++)
		{
		escreva("\nInforme o numero de filhos do Habitante ",x,": ")
		leia(filho)
		escreva("\nInforme seu salario do Habitante ",x,": ")
		leia(salario)
		se(maiorsal<salario)
		{
			maiorsal=salario
		}
		se(salario<=100){
			perc++
			percsal = perc*100/(x-1)
		}
		
		somafilho +=filho
		somasalario+=salario

		
		}
		mediasalario= somasalario/(x-1)
		mediafilhos= somafilho /(x-1)
		escreva("\nA media do salario é: ",math.arredondar(mediasalario, 2),
		"\nA media do numero de filhos é: ",math.arredondar(mediafilhos, 2),
		"\nO maior salario é: ",maiorsal,
		"\nO percentual de pessoas com salario até R$100,00 é: ",math.arredondar(percsal, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */