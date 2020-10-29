import java.time.*;

public abstract class Person {
    protected String nombre,apellido,nro_doc,telefono,fecha_nac;
    protected Tipo_Doc tipo_doc;

    protected abstract void setNombre(String nombre);
    protected abstract void setApellido(String apellido);
    protected abstract void setNro_doc(String nro_doc);
    protected abstract void setTelefono(String telefono);
    protected abstract void setTipo_doc(int index);
    protected abstract void setFecha_nac(String fecha_nac);

    protected abstract String getNombre();
    protected abstract String getApellido();
    protected abstract String getNro_doc();
    protected abstract String getTelefono();
    protected abstract Tipo_Doc getTipo_doc();
    protected abstract String getFecha_nac();
}
