programa
{
	
	funcao inicio()
	{
		inteiro num[2][3],somanum=0,l,c
		real medianum

		para(l=0;l<2;l++){

			para(c=0;c<3;c++){
				escreva("numero: ")
				leia(num[l][c])
				somanum+=num[l][c]
			}
			
		}

		para(l=0;l<2;l++){

			para(c=0;c<3;c++){
				
				escreva("[",num[l][c],"]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 132; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */