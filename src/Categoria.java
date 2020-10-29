public class Categoria {
    private int id_categoria;
    private final String []categoria = new String[] {"Blanco","Celeste","Amarillo",
            "Naranja","Verde","Azul","Marrón","1er Dan",
            "2do Dan","3er Dan","4to Dan", "5to Dan", "6to Dan",
            "7mo Dan", "8vo Dan", "9no Dan", "10mo Dan"};

    public Categoria() {
    }

    public Categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * Modifica el id de la categoría al que pertenece el estudiante
     * @param id_categoria id de categoría
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * Retorna el Id de la categoría al que pertenece el estudiante
     * @return int.
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * Retorna el tipo de categoría en formato String a partir de un índice
     * @param index índice de categoría
     * @return String.
     */
    public String getCategoria(int index) {
        return categoria[index];
    }

    /**
     * Retorna el tipo de categoría que tiene el objeto en formato String
     * @return String.
     */
    public String getCategoria() {
        return categoria[this.id_categoria];
    }
}
