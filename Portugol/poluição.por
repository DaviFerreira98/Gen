programa
{
	
	funcao inicio()
	{
		real ip
		escreva("Digite o indice de poluição: ")
		leia(ip)
		
		se(ip>=0.3 e ip<0.4){
			escreva("\nAs industrias do primeiro grupo devem ser paradas")
		}
		senao se(ip>=0.4 e ip<0.5){
			escreva ("\nAs industrias do primeiro e do segundo grupo devem ser paradas")
		}
		senao se(ip >=0.5){
			escreva("\nTodas as industrias devem ser paradas")
		}
		senao{
			escreva("\nEsta tudo dentro dos parametros")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */