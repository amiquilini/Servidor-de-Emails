/**
 * AD1_2020_2
 * Created on 3/22/2021
 *
 * @author: AmandaMiquilini
 **/
class Email {
    String remet, assun, msg, e, d;
    String[] dest;

    // Construtor
    Email(String r, String[] d, String a, String m){
        remet = r;
        dest = d;
        assun = a;
        msg = m;
    }

    // Métodos
    public String mostraEmail() {
        e="";
        d="";
        for(int j = 0; j<dest.length; j++){
            if(j==dest.length-1){
                d = d + dest[j];
            }
            else{d = d + dest[j]+ ", ";
            }
        }
        e = e + "De: " + remet + "\n" + "Para: " + d + "\n";
        e = e + assun + "\n" + msg + "\n";
        return e;
    }
}
