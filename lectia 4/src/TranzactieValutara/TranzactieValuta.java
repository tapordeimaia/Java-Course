package TranzactieValutara;

public class TranzactieValuta {
    Valuta DinValuta;
    Valuta InValuta;
    Float curs;
    Float suma;
    public TranzactieValuta(Valuta from, Float c, Valuta to, Float s){
        DinValuta = from;
        InValuta = to;
        curs = c;
        suma = s;
    }
    public Float cumpara(){
        return suma/curs;
    }
    public Float vinde(){
        return suma*curs;
    }
}
