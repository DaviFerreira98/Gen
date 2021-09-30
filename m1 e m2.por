programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6],n2[4][6],l,c,m1[4][6],m2[4][6]
		para(l=0;l<4;l++){

			para(c=0;c<6;c++){
				escreva("\nDigite um valor para o primeiro: ")
				leia(n1[l][c])
			}
		}
		para(l=0;l<4;l++){

			para(c=0;c<6;c++){
				escreva("\nDigite um valor para o segundo vetor: ")
				leia(n2[l][c])
			}
		}
		para(l=0;l<4;l++){

			para(c=0;c<6;c++){
				m1[l][c]=n1[l][c]+n2[l][c]
			}
			
		}
		
		para(l=0;l<4;l++){

			para(c=0;c<6;c++){
				m2[l][c]=n1[l][c]-n2[l][c]
				
			}
			
		}
		escreva("\nA soma das marizes:\n")
		para (l=0;l<4;l++){

			para(c=0;c<6;c++){
				escreva("[",m1[l][c],"]")
			}
			escreva("\n")
			
		}
		escreva("A diferença das matrizes é:\n")
		para (l=0;l<4;l++){

			para(c=0;c<6;c++){
				escreva("[",m2[l][c],"]")
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
 * @POSICAO-CURSOR = 702; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m1, 6, 32, 2}-{m2, 6, 41, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */