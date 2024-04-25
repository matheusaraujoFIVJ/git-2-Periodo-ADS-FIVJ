/

//Exercício 1 
// Questão 1: Faça uma função que receba por parâmetro uma string. Se a primeira letra da string for uma vogal, a função deve retornar a string convertida para letras maiúsculas. Caso contrário, a função deve retornar a string convertida para letras minúsculas
using System.Text;

static bool EhVogal(char c)
{
    string vogais = "aeiouAEIOU";

    for (int i = 0; i < vogais.Length; i++)
    {
        if (vogais[i] == c)
        {
            return true;
        }
    }

    return false;
}

static string ConverterParaMaiusculas(string texto)
{
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < texto.Length; i++)
    {
        if (texto[i] >= 'a' && texto[i] <= 'z')
        {
            sb.Append(Convert.ToChar(texto[i] - 'a' + 'A'));
        }
        else
        {
            sb.Append(texto[i]);
        }
    }

    return sb.ToString();
}

static string ConverterParaMinusculas(string texto)
{
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < texto.Length; i++)
    {
        if (texto[i] >= 'A' && texto[i] <= 'Z')
        {
            sb.Append(Convert.ToChar(texto[i] - 'A' + 'a'));
        }
        else
        {
            sb.Append(texto[i]);
        }
    }

    return sb.ToString();
}

static string ConverterTexto(string texto)
{
    if (EhVogal(texto[0]))
    {
        return ConverterParaMaiusculas(texto);
    }
    else
    {
        return ConverterParaMinusculas(texto);
    }
}

Console.WriteLine(ConverterTexto("Teste 123"));
Console.WriteLine(ConverterTexto("Este 123"));
*/



//---------------------------------------------------------------------------------------


/
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