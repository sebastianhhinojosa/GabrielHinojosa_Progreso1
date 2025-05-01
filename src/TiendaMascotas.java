public class TiendaMascotas {
    private Especie especie1;
    private Especie especie2;
    private Especie especie3;
    private Especie especie4;

    public TiendaMascotas() {
        especie1 = new Especie("Cacatua Blanca", Especie.Categoria.ave,4,100,20);
        especie2 = new Especie("Boa Constrictor", Especie.Categoria.reptil,20,75,20);
        especie3 = new Especie("Titi Dorado", Especie.Categoria.mamifero,15,1000,20);
        especie4 = new Especie("Guacamaya Roja", Especie.Categoria.ave,3,50,20);

    }
}
