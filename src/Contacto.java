import java.util.Date;

public class Contacto extends Person{

    /**
     * Constructor por defecto
     */
    public Contacto() {
    }

    public Contacto(String nombre, String apellido, int tipo_doc, String nro_doc, String telefono, String fecha_nac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_doc = new Tipo_Doc(tipo_doc);
        this.nro_doc = nro_doc;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
    }

    /**
     * Modifica el nombre del alumno
     * @param nombre nombre
     */
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Modifica el apellido del alumno
     * @param apellido apellido
     */
    @Override
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    /**
     * modifica el nro de documento del alumno
     * @param nro_doc número de documento
     */
    @Override
    public void setNro_doc(String nro_doc){
        this.nro_doc = nro_doc;
    }

    /**
     * Modifica el teléfono
     * @param telefono número de teléfono con carácterística incluído
     */
    @Override
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    /**
     * Modifica el tipo de documento pasando por parámetro un índice
     * @param index índice del tipo de documento
     */
    @Override
    public void setTipo_doc(int index){
        this.tipo_doc.setId_tipo_doc(index);
    }

    /**
     * Modifica fecha de nacimiento
     * @param fecha_nac fecha de nacimiento
     */
    @Override
    public void setFecha_nac(String fecha_nac){
        this.fecha_nac = fecha_nac;
    }

    /**
     * Obtiene el nombre del alumno
     * @return String
     */
    @Override
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el apellido del alumno
     * @return String
     */
    @Override
    public String getApellido(){
        return this.apellido;
    }

    /**
     * Obtiene el numero de documento del alumno
     * @return String
     */
    @Override
    public String getNro_doc(){
        return this.nro_doc;
    }

    /**
     * Obtiene el teléfono del alumno
     * @return String
     */
    @Override
    public String getTelefono(){
        return this.telefono;
    }

    /**
     * Obtiene un objeto del tipo TIPO_DOC
     * @return Tipo_Doc
     */
    @Override
    public Tipo_Doc getTipo_doc(){
        return this.tipo_doc;
    }

    /**
     * Obtiene fecha de nacimiento
     * @return Date
     */
    @Override
    public String getFecha_nac(){
        return this.fecha_nac;
    }
}
