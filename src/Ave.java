public class Ave {
    //Atributos
    private static String color, tamano, tipo;
    //Constructor
    public Ave(String color, String tamano, String tipo) {

        this.color = color;
        this.tamano = tamano;
        this.tipo = tipo;
    }
    //Metodos
     static void volar(){
        System.out.println("El ave esta volando");
    }

    static void comer(){
        System.out.println("El ave esta comiendo");
    }

    // Getters
    public static String getColor() {
        return color;
    }

    public static String getTamano() {
        return tamano;
    }

    public static String getTipo() {
        return tipo;
    }
    // Setters
    public static void setColor(String color) {
        Ave.color = color;
    }

    public static void setTamano(String tamano) {
        Ave.tamano = tamano;
    }

    public static void setTipo(String tipo) {
        Ave.tipo = tipo;
    }
}
