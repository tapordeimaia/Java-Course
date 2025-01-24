public class Contain {
    String[] array = new String[3];
    public boolean contains (String[] array, String value){
        for (String element:array){
            if (element == value){
                return true;
            }
        }
        return false;
    }
}
