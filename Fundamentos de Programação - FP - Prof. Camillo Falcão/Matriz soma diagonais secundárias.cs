//Exercício 2
// Questão 2: Faça um programa que leia uma matriz de números reais de tamanho 5 x 5 e, em seguida, imprima a soma dos números positivos pertencentes à diagonal secundária dessa matriz.
Exemplo: para a matriz
const int TAM = 5;

int i, j;

double[,] matriz = new double[TAM, TAM];

double somaPositivos = 0;

for (i = 0; i < matriz.GetLength(0); i++)
{
    for (j = 0; j < matriz.GetLength(1); j++)
    {
        Console.Write("Elemento {0}, {1}: ", i, j);
        matriz[i, j] = Convert.ToDouble(Console.ReadLine());
    }
}

for (i = 0, j = matriz.GetLength(1) - 1; i < matriz.GetLength(0); i++, j--)
{
    if (matriz[i,j] > 0)
    {
        somaPositivos += matriz[i,j];
    }
}

Console.WriteLine("Soma dos positivos pertencentes à diag. secundária: {0}", somaPositivos);
*/