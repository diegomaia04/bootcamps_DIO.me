namespace DesafioPOO.Models
{
    // TODO: Herdar da classe "Smartphone"
    public class Nokia : Smartphone
    {

        // public Nokia(string numero, int memoria, string imei, string modelo) : base(numero, memoria, imei, modelo)
        // {
        //     numero = "(11) 953336542";
        //     memoria = 128;
        //     imei = "001970-01-010000-0";
        //     modelo = " Nokia Tijolo";
        // }

         public Nokia(string numero, int memoria, string imei, string modelo) : base(numero, memoria, imei, modelo)
        {
           
        }
        public override void InstalarAplicativo(string nomeApp = "Instagram")
        {
            Console.WriteLine("O aplicativo do Instagram ira ser instalado");
        }
    }
}


