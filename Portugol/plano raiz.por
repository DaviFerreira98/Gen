programa
{
	inclua biblioteca Matematica-->math
	
	funcao inicio()
	{
	real d,x1=0.0,x2=0.0,y1=0.0,y2=0.0
		escreva("Escreva o valor de X1: ")
		leia(x1)
		escreva("Escreva o valor de X2: ")
		leia(x2)
		escreva("Escreva o valor de Y1: ")
		leia(y1)
		escreva("Escreva o valor de Y2: ")
		leia(y2)

		d=math.arredondar(math.raiz((math.potencia((x2-x1),2.0))+(math.potencia((y2-y1), 2.0)),2.0),2)
		escreva("O resltado é: ",d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */