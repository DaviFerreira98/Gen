programa
{
	
	funcao inicio()
	{
		real numero,soma=0.0,media=0.0,x=0.0
		escreva("\nInforme um numero: ")
		leia(numero)

		enquanto(numero>0)
		{
			x++
			soma+=numero

		escreva("\nInforme um numero: ")
		leia(numero)
		}
		media = soma/x
		escreva("\nA soma dos numeros: ", soma)
		escreva("\nQuantos numeros foi digitado: ", x)
		escreva("\nA media dos numeros: ", media)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */