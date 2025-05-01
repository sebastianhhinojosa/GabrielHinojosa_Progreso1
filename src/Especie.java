public class Especie {
    public enum Categoria{
        ave,
        reptil,
        mamifero
    }

    private String nombre;
    private Categoria claseAnimal;
    private int vidaPromedioMaxima;
    private int precio;
    private int cantPorEspecie;
    private int ventasPorEspecie;

    public Especie(String nombre, Categoria claseAnimal, int VidaPromedio, int precio, int cantPorEspecie, int ventasPorEspecie) {
        this.nombre = nombre;
        this.claseAnimal = claseAnimal;
        this.vidaPromedioMaxima = VidaPromedio;
        this.precio = precio;
        this.cantPorEspecie = cantPorEspecie;
        this.ventasPorEspecie = ventasPorEspecie;
    }

    public String getNombre(){
        return nombre;
    }
    public Categoria getEspecie(){
        return claseAnimal;
    }

    public int getVidaPromedioMaxima() {
        return vidaPromedioMaxima;
    }
    public int getPrecio() {
        return precio;
    }
    public int getCantPorEspecie() {
        return cantPorEspecie;
    }

    public int getVentasPorEspecie() {
        return ventasPorEspecie;
    }
}
