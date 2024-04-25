// LeMatriz
static void LeMatriz(int[,] mat)
{
    for(int i=0; i <mat.GetLength(0); i++)
    {
        for(int j=0; j <mat.GetLength(1); j++)
        {
            Console.Write("Elemento {0},{1}", i,j);
            mat[i,j] = Convert.ToInt32(Console.ReadLine());
        }
    }
}
//ImprimeMatriz
static void ImprimeMatriz(int[,]mat)
{
    for (int i=0; i<mat.GetLength(0); i++)
    {
        for(int j=0; j <mat.GetLength(1); j++)
        {
            Console.Write("{0}",mat[i,j]);
        }
        Console.WriteLine();
    }
}

//Imprime Linha constante, i fixo
static void ImprimeLinha(int[,]mat, int linha)
{
    for(int j=0;j<mat.GetLength(1); j++)
    {
        Console.Write("{0} ", mat[linha,j]);
    }
}

//Imprime Coluna constante, j fixo
static void ImprimeColuna(int[,]mat, int coluna)
{
    for(int i=0;i<mat.GetLength(1); i++)
    {
        Console.Write("{0} ", mat[i, coluna]);
    }
}

//Imprime Diagonal Principal
static void ImprimeDiagonal(int[,] mat, linha)
{
    for(int i=0; i<mat.GetLength(0); i++)
    {
        for(int j=0; j<mat.GetLength(1);j++)
        {
            if (i==j)
            Console.Write("{0} ", mat[i,j]);
        }
    }
}

//Imprime Diagonal Secundária
static void ImprimeDiagonalSecundaria(int[,] mat)
{
int i,j;

    for(int i=0; i=mat.GetLength(0); i++)
    {
      Console.Write("{0} ", mat[i,mat.GetLength(0) -1-i]);
    }
}