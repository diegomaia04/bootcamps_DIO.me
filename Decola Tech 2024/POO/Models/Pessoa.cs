using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace POO.Models
{
    public class Pessoa
    {

        public Pessoa(String nome)
        {
            Nome = nome;
        }

        public String Nome { get; set; }
        public int Idade { get; set; }
        public String Email { get; set; }

        public virtual void Aprensetar()
        {
            Console.WriteLine($"Ola, meu nome é {Nome} e tenho {Idade} anos");
        }
    }
}