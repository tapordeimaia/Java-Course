public interface Animal {
    public abstract void getLocation();
    public default void getCell(){
        System.out.println("Prokaryotic");
    }
    public static void getDescriere(){
        System.out.println("Animal");
    }
}
