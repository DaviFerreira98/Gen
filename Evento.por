programa
{
	
	funcao inicio()
	{
		inteiro seg,min,hora,total

		escreva("\nEscreva os segundos: ")
		leia(total)
		hora= total/3600
		min = (total % 3600)/60
		seg = (total % 3600) % 60

		escreva("\nhoras: ",hora,"\nminutos: ",min,"\nsegundos: ",seg)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */