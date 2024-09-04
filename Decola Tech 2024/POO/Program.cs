using POO.interfaces;
using POO.Models;

ContaCorrente c1 = new ContaCorrente(123, 1000);
c1.exibirSaldor();
c1.Sacar(500);
c1.exibirSaldor();
c1.Sacar(541985);
c1.exibirSaldor();

Aluno a1 = new Aluno("Annabeth");
//a1.Nome = "Annabeth";
a1.Idade = 20;
a1.Nota = 10;
a1.Aprensetar();

Professor p1 = new Professor();
//p1.Nome = "Atena";
p1.Idade = 42;
p1.Materia = "Hístoria";
p1.Salario = 1313;
p1.Aprensetar();

Corrente c = new Corrente();
c.Creditar(500);
c.ExibirSaldo();

Computador c2 =  new Computador();
Console.WriteLine(c2.ToString());

ICalculadora calc = new Calculadora();
Console.WriteLine(calc.Multiplicar(14,9));