using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace POO.Models
{
    public class Aluno : Pessoa
    {

        public Aluno(string nome) : base(nome)
        {
            
        }

        public Double Nota { get; set; }

        public override void Aprensetar()
        {
            Console.WriteLine($"Ola, meu nome é {Nome} e tenho {Idade} anos e sou um aluno nota {Nota}");
        }
    }


}