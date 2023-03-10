public class Empleado {

    protected String nombreDeUsuario;
    protected String correoElectronico;

    public Empleado(String nombreDeUsuario, String correoElectronico) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.correoElectronico = correoElectronico;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
}
