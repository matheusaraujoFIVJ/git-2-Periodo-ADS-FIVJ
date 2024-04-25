using System.Text;

internal class Program
{
    private static void Main(string[] args)
    {
        string teste = "matheus";
        StringBuilder teste_maiuscula = new StringBuilder();
        for (int i=0; i<teste.Length;i++)
        {
        if(teste[i] >= 'a' && teste[i] <= 'z')
            teste_maiuscula.Append(Convert.ToChar(teste[i] -'a' + 'A'));
        else 
            teste_maiuscula.Append(teste[i]);
        }
        
        Console.WriteLine(teste_maiuscula.ToString());
    }
}