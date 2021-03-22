import java.util.*;

/**
 * AD1_2020_2
 * Created on 3/22/2021
 *
 * @author: AmandaMiquilini
 **/
class CaixaPostal {
    String nome, e;
    List<Email> emails = new ArrayList<>();

    // Construtor
    CaixaPostal(String n){
        nome = n;
    }

    // Métodos
    public String toString(){
        e = "";
        for(int i = 0; i<emails.size(); i++){
            e = e + emails.get(i).mostraEmail() + "\n";
        }
        return ">>> Caixa Postal de " + nome + " <<<" + "\n" + e;
    }

}
