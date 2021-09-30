programa
{
	inclua biblioteca Matematica -->math
	
	funcao inicio()
	{
		real n1,n2,n3,n4,nq1,nq2,nq3,nq4
		escreva("Digite o valor do primeiro numero: ")
		leia(n1)
		escreva("\nDigite o valor do segundo numero: ")
		leia(n2)
		escreva("\nDigite o valor do terceiro numero: ")
		leia(n3)
		escreva("\nDigite o valor do quarto numero: ")
		leia(n4)

		nq1 = math.potencia(n1, 2.0)
		nq2 = n2*n2
		nq3 = n3*n3
		nq4 = math.potencia(n4, 2.0)

		se(nq3 >= 1000){
			escreva("\nTerceiro numero elevado ao quadrado é: ",nq3)
		}
		senao{
			escreva("\n",n1," Elevado ao quadrado é: ",nq1)
			escreva("\n",n2," Elevado ao quadrado é: ",nq2)
			escreva("\n",n3," Elevado ao quadrado é: ",nq3)
			escreva("\n",n4," Elevado ao quadrado é: ",nq4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */