import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    private static ArrayList departamentos = new ArrayList();
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static boolean salir = false;

    public static void main(String[] args) throws IOException{
        cargaAutomatica();
        //cargaInteractiva();
        menu();
    }

    static void cargaAutomatica(){
        departamentos.add(new Departamento(17,"Ventas","Malpartida de Cáceres"));
        departamentos.add(new Departamento(145,"Inovacción","Mérida"));
        departamentos.add(new Departamento(56,"RRHH","Madrid"));
    }
    static void mostrarDepartamentos(){
        Iterator<Departamento> it = departamentos.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    static void cargaInteractiva() throws IOException {
        System.out.println("Introduce el número del departamento. ");
        int dept_no = 0;
        try {
            dept_no = Integer.parseInt(br.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Sólo se admiten números. ");
        }
        System.out.println("Introduce el nombre del departamento. ");
        String dNombre = br.readLine();
        System.out.println("Introduce la localidad en la que se encuentra el departamento. ");
        String localizacion = br.readLine();
        departamentos.add(new Departamento(dept_no, dNombre, localizacion));
    }
    static void menu() throws IOException{
        do {
            System.out.println("***************Menú*****************");
            System.out.println("Con que quieres trabajar: ");
            System.out.println("1. Departamentos. ");
            System.out.println("2. Empleados. ");
            System.out.println("3. Abandonar el programa. ");
            int eleccion = Integer.parseInt(br.readLine());
            switch (eleccion){
                case 1 -> menuDepartamento();
                case 2 -> menuEmpleado();
                case 3 -> salir = true;
            }
        }while (!salir);

    }
    static void menuDepartamento() throws IOException{
        boolean salirDepartamentos = false;
        do {
            System.out.println("-------Menú de gestión de Departamentos----------");
            System.out.println("1. Mostrar departamentos. ");
            System.out.println("2. Insertar departamentos. ");
            System.out.println("3. Borrar departamentos. ");
            System.out.println("4. Modificar departamentos. ");
            System.out.println("5. Salir al menú principal. ");
            int eleccionDepartamentos = Integer.parseInt(br.readLine());
            switch (eleccionDepartamentos){
                case 1 -> mostrarDepartamentos();
                case 2 -> cargaInteractiva();
                case 3 -> borrarDepartamentos();
                case 4 -> modificarDepartamentos();
                case 5-> salirDepartamentos = true;
            }
        }while (!salirDepartamentos);
    }
    static void menuEmpleado() throws IOException{
    }
    static void borrarDepartamentos() throws IOException{
        System.out.println("Introduce la posicion en la que se encuentra el departamento a borrar. ");
        int posicion = Integer.parseInt(br.readLine());
        if (posicion>=0){
            mostrarDepartamentos();
            departamentos.remove(posicion);
            System.out.println("se ha borrado perfectamente. ");
            mostrarDepartamentos();
        }else {
            System.out.println("Ese departamento no existe. ");
        }
    }
    static void modificarDepartamentos() {
    }
//FIN CLASE
}
