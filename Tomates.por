programa
{
	
	funcao inicio()
	{
		real p,m,ex
		escreva("Quantos quilos: ")
		leia(p)
		
		se(p > 50){
			ex= p - 50
			m= ex * 4
			escreva("Quilos exedido: ",ex,"\nMulta no Valor de RS: ",m)
		}
		senao{
			escreva("Peso correto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */