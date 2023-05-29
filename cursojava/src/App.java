import Animais.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        
        //System.out.println("Hello, World!");

    //byte variavelByte = -120;
    //short -+32768
    //char 0 65535
    //int 2b -+
    //long-+ 9t
    //System.out.println(variavelByte);
    
       // int variavelByte = 21456655;

    //System.out.println(variavelByte);

    Cachorro cachorro1;
    cachorro1 = new Cachorro();

    cachorro1.nome ="agnes";
    cachorro1.cor ="pretoBranco";
    cachorro1.altura= 25;
    cachorro1.peso= 5.5;
    cachorro1.tamanhoDoRabo = 5;

    cachorro1.latir();
    
    System.out.println(cachorro1.pegar());
    //System.out.println(cachorro1);
    
    System.out.println(cachorro1.espirito(carinho));
    }
}
