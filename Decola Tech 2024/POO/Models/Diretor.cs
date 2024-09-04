using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace POO.Models
{
    public class Diretor : Professor
    {

        public override void Aprensetar(){

            Console.WriteLine($"ola, meu nome é {Nome}, tenho {Idade} e gosto de {Materia}");

        }
        
    }
}