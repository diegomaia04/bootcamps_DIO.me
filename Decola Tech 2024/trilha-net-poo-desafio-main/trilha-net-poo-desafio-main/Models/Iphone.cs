namespace DesafioPOO.Models
{
    // TODO: Herdar da classe "Smartphone"
    public class Iphone : Smartphone
    {
        // public Iphone(string numero, int memoria, string imei, string modelo) : base(numero, memoria, imei, modelo)
        // {
        //     numero = "(11) 954546485";
        //     memoria = 521;
        //     imei = "001970-01-010000-0";
        //     modelo = " Iphone 15 plus";
        // }

        public Iphone(string numero, int memoria, string imei, string modelo) : base(numero, memoria, imei, modelo)
        {
           
        }
        public override void InstalarAplicativo(string nomeApp = "Netflix")
        {
            Console.WriteLine("O aplicativo da netflix ira ser instalado");
        }
    }
}