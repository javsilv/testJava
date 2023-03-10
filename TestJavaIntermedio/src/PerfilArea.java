import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PerfilArea extends Empleado{

    protected String perfilUsuario;

    public PerfilArea(String nombreDeUsuario, String correoElectronico, String perfilUsuario) {
        super(nombreDeUsuario, correoElectronico);
        this.perfilUsuario = perfilUsuario;
    }

    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    public String getcorreoElectronico() {
        return correoElectronico;
    }

    public void imprimir() {
        System.out.println(perfilUsuario+" y "+correoElectronico);
    }

    public void validarAdmin(String perfilUsuario) {
        if(perfilUsuario.equals("admin")){
            System.out.println("Eres Admin :)");
        }else{
            System.out.println("No eres Admin :(");
        }
    }

    public void validarCorreo(String correo){

        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        if (mather.find() == true) {
            System.out.println("Es un email válido :)");
        } else {
            System.out.println("Es un email inválido :(");
        }

    }

}
