using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploExplorando.Models
{
    public class Pessoa
    {
        public Pessoa()
        {

        }

        public Pessoa(string nome, string sobrenome)
        {

            Nome = nome;
            Sobrenome = sobrenome;

        }
        private string _nome;
        private int _idade;
        public string Nome
        {
            get
            {
                return _nome.ToUpper();
            }

            set
            {
                _nome = value;
                if (value == "")
                {
                    throw new ArgumentException("O nome não pode ser vazio");
                }

            }
        }

        public string Sobrenome { get; set; }
        public string NomeCompleto => $"{Nome} {Sobrenome}".ToUpper();


        public int Idade
        {
            get => _idade;
            set
            {
                _idade = value;
                if (value < 0)
                {
                    throw new ArgumentException("A idade não pode ser zero");
                }

            }
        }

        public void Apresentar()
        {
            Console.WriteLine($"Nome: {Nome}, Idade {Idade}");
        }
    }
}