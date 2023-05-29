package Animais;

public class Cachorro {
    
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoEspirito;

    public void comer(){}

    public void latir(){
        System.out.println("auau auau");
    }

    /**
     * @return
     */
    public String pegar(){
        return "toma bolinha";
    }

    /**
     * @return
     */
    public String espirito(String acao){

        if (acao == "chutar") {

            return "moder";
            
        }

        if (acao == "carinho") {

            return "lamber";
        }

        if (acao == "pisar") {

            return "grunir";

        }

    }
}
