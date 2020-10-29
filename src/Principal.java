import java.time.*;

public class Principal {
    public static void main(String[] args) {
        Alumno a = new Alumno();

        cargarObjeto(a);

        System.out.println(a.edad());
    }

    public static void cargarObjeto(Object x){
        if(x instanceof Alumno){
            ((Alumno) x).setApellido("alvarez");
            ((Alumno) x).setNombre("alberto");
            ((Alumno) x).setFecha_nac("" + LocalDate.of(1990,Month.MAY,15).toString());
            ((Alumno) x).setTelefono("3512654821");
            ((Alumno) x).setTipo_doc(0);
            ((Alumno) x).setNro_doc("365214582");
            ((Alumno) x).setFecha_ingreso(LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth() + "/" +
                    LocalDate.now().getYear());
            ((Alumno) x).setCategoria(0);
            ((Alumno) x).setEs_sensei(false);
        }
    }
}
