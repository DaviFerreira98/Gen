programa
{
	
	funcao inicio()
	{
		inteiro totaldias,dias,meses, anos
		escreva("Digite o toral de dias: ")
		leia(totaldias)
		
		anos = totaldias / 365
		meses = (totaldias/365) % 12
		dias = (totaldias / 365) % 12

		escreva("\nAnos: ",anos, "\nMeses: ", meses, "\nDias: ",dias)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */