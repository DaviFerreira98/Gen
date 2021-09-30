programa
{
	inclua biblioteca Matematica -->math
	
	funcao inicio()
	{
		real cons, fab,dis,imp
		escreva("Valor do carro na fabrica: ")
		leia(fab)
		dis = fab * 0.28
		imp = fab * 0.45
		cons = fab + (dis + imp)
		escreva ("Valor do carro para o consumidor: ",math.arredondar(cons, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */