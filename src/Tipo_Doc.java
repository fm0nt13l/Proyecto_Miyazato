public class Tipo_Doc {
    private int id_tipo_doc;
    private final String[] tipo_doc= new String[] {"DNI","Pasaporte","LC","LE"};

    public Tipo_Doc() {
    }

    public Tipo_Doc(int tipo_doc) {
        id_tipo_doc = tipo_doc;
    }

    /**
     * Devuelve el Id del tipo de documento
     * @return int.
     */
    public int getId_tipo_doc() {
        return id_tipo_doc;
    }

    /**
     * Cambia el tipo de documento con el índice que se pasa por parámetro
     * @param id_tipo_doc Id del tipo de documento
     */
    public void setId_tipo_doc(int id_tipo_doc) {
        this.id_tipo_doc = id_tipo_doc;
    }

    /**
     * Devuelve el tipo de documento que tiene el objeto en formato String
     * @return String.
     */
    public String getTipo_doc() {
        return tipo_doc[this.id_tipo_doc];
    }

    /**
     * Devuelve el tipo de documento en formato String a partir de un índice
     * @return String.
     * @param index id del tipo de documento
     */
    public String getTipo_doc(int index) {
        return tipo_doc[index];
    }
}
