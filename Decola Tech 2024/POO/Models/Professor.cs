using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace POO.Models
{
    public class Professor
    {

        public decimal Salario { get; set; }
        public String Materia { get; set; }
        public String Nome { get; set; }
        public int Idade { get; set; }

        public virtual void Aprensetar()
        {
            Console.WriteLine($"Ola, meu nome é {Nome} e tenho {Idade} anos e sou porfessor de {Materia}");
        }
    }
}