import java.util.*;

/**
 * AD1_2020_2
 * Created on 3/22/2021
 *
 * @author: AmandaMiquilini
 **/
class ServidorEmails {
    List<CaixaPostal> lista_cp = new ArrayList<>();

    // Construtor
    ServidorEmails(){}

    // Métodos
    public void adicionaCaixa(CaixaPostal n){
        lista_cp.add(n);
    }
    public void enviaEmail(Email e){
        for(int i = 0 ; i < e.dest.length; i++){
            for (int j = 0 ; j < lista_cp.size(); j++){
                if(e.dest[i] == lista_cp.get(j).nome){
                    lista_cp.get(j).emails.add(e);
                }
            }
        }
    }
    public void encaminhaEmail(Email e, String d){
        for (int i = 0 ; i < lista_cp.size(); i++){
            if(d == lista_cp.get(i).nome){
                lista_cp.get(i).emails.add(e);
            }
        }

    }
}
