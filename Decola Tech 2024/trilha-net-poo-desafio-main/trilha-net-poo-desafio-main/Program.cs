using DesafioPOO.Models;

Nokia nokia = new Nokia("123456789", 128, "5464654-54654-4546", "Tijolo");
nokia.Numero = "(11) 9455784555";
nokia.Imei = " 47832748932-423432-324324";
nokia.Memoria = 8;
nokia.Modelo = "2.4";
nokia.InstalarAplicativo();

Iphone iphone = new Iphone("11953336542", 512, "8797-89-7979879-514", "Iphone 15 plus");
iphone.Numero = "(11) 985962472";
iphone.Memoria = 128;
iphone.Imei = "45128498-27324-64978547";
iphone.Modelo =" Iphone X";
iphone.InstalarAplicativo();