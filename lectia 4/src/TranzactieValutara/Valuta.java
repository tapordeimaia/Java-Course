package TranzactieValutara;

public enum Valuta {
    EUR("euro", 223), LEI("lei", 555), USD("usd", 666);
    String descriere;
    Integer numCode;
    Valuta(String des, Integer num){
        descriere = des;
        numCode = num;
    }
    public String getDescriere(){

        return descriere;
    }
    public int getNumCode(){

        return numCode;
    }
}

