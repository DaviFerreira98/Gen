programa
{
	
	funcao inicio()
	{
		inteiro anos,meses,dias
		escreva("Escreva sua idade: ")
		leia(anos)
		escreva("\nEscreva quantos meses tem: ")
		leia(meses)
		escreva("\nEscreva quantos dias tem: ")
		leia(dias)

		anos = anos * 365
		meses = meses*30
		dias = anos + meses + dias

		escreva("\nVoce tem ",dias," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */