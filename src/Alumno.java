import java.time.*;

public class Alumno extends Person{
    private Categoria categoria;
    private String fecha_ingreso, fecha_egreso;
    private boolean es_sensei;
    private Contacto contacto;

    /**
     * Constructor por defecto
     */
    public Alumno() {
        es_sensei = false;
        this.tipo_doc = new Tipo_Doc();
        this.categoria = new Categoria();
        this.contacto = new Contacto();
    }

    /**
     * Constructor donde sólo se agrega la fecha de ingreso. Por defecto arranca la categoría con index 0.
     * @param fecha_ingreso fecha de ingreso al dojo
     */
    public Alumno(String fecha_ingreso) {
        this.categoria = new Categoria(0);
        this.tipo_doc = new Tipo_Doc();
        this.contacto = new Contacto();
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = null;
        es_sensei = false;
    }

    /**
     * Constructor donde se agrega además de la fecha de ingreso, la categoría actual del estudiante
     * @param categoria id de categoría
     * @param fecha_ingreso fecha de ingreso al dojo
     */
    public Alumno(int categoria, String fecha_ingreso) {
        this.categoria = new Categoria(categoria);
        this.tipo_doc = new Tipo_Doc();
        this.contacto = new Contacto();
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = null;
        es_sensei = false;
    }

    /**
     * Constructor donde se agregan todos los datos requeridos por el estudiante
     * @param nombre nombre
     * @param apellido apellido
     * @param nro_doc número de documento
     * @param tipo_doc id de tipo documento
     * @param telefono número de documento
     * @param fecha_nac fecha de nacimiento
     * @param categoria id de categoría
     * @param fecha_ingreso fecha de ingreso al dojo
     */
    public Alumno(String nombre, String apellido, String nro_doc, int tipo_doc,
                  String telefono, String fecha_nac, int categoria, String fecha_ingreso, Contacto contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_doc = nro_doc;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = null;
        es_sensei = false;

        this.tipo_doc = new Tipo_Doc(tipo_doc);
        this.categoria = new Categoria(categoria);
        this.contacto = new Contacto();
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

    /**
     * Obtiene un objeto del tipo Categoría
     * @return Categoria.
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría ingresando un índice
     * @param index índice de categoría
     */
    public void setCategoria(int index) {
        this.categoria.setId_categoria(index);
    }

    /**
     * Obtiene la fecha de ingreso del alumno
     * @return Date
     */
    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    /**
     * Modifica la fecha de ingreso del alumno
     * @param fecha_ingreso fecha de ingreso de los alumnos
     */
    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * Obtiene la fecha de egreso del alumno
     * @return Date
     */
    public String getFecha_egreso() {
        return fecha_egreso;
    }

    /**
     * Modifica la fecha de egreso del alumno
     * @param fecha_egreso fecha de egreso de los alumnos
     */
    public void setFecha_egreso(String fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }

    /**
     * Retorna si el alumno ingresado es Sensei.
     * @return boolean
     */
    public boolean isEs_sensei() {
        return es_sensei;
    }

    /**
     * Retorna si el alumno ingresado es Sensei.
     * @param es_sensei flag True si es sensei y False si no lo es.
     */
    public void setEs_sensei(boolean es_sensei) {
        this.es_sensei = es_sensei;
    }

    /**
     * Retorna el contacto del alumno
     * @return Contacto
     */
    public Contacto getContacto() {
        return contacto;
    }

    /**
     * Modifica el contacto del alumno pasándole una referencia al nuevo contacto
     * @param contacto Referencia al contacto nuevo
     */
    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    /**
     * Obtiene la edad del alumno
     * @return Long
     */
    public int edad(){
        return  LocalDate.now().getYear() - LocalDate.parse(this.fecha_nac).getYear();
    }
}
