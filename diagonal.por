programa
{
	
	funcao inicio()
	{
		inteiro m[3][3],somamat=0,l,c,diag=0

		para(l=0;l<3;l++){

			para(c=0;c<3;c++){
				escreva("Digite o valor de ",(l+1)," ",(c+1),": ")
				leia(m[l][c])
				
				somamat+=m[l][c]
			}
		}
		para(l=0;l<3;l++){

			para(c=0;c<3;c++){
				se(l == c){
				diag += m[l][c]
				
				}
			}
		}
		escreva("\nA soma das diagonais: ",diag)	
		escreva("\nA soma da matriz é: ",somamat)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 6, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */