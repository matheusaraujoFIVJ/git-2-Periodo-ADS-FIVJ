using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ED
{
    public class Fila
    {
        public FilaDinamica (int tamanhoMaximo){
            if (tamanhoMaximo < 0)
                throw new Exception ("Tamanho de lista inválido");

            elementos = new double [tamanhoMaximo];
        }
    }
}