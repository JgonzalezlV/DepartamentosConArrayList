import java.time.LocalDate;

public class Empleado {
    private int Num_empleado;
    private String Apellido;
    private double salario;
    private LocalDate fechaAlta;
    private Departamento departamento;

    public Empleado(int num_empleado, String apellido, double salario, LocalDate fechaAlta, Departamento departamento) {
        Num_empleado = num_empleado;
        Apellido = apellido;
        this.salario = salario;
        this.fechaAlta = fechaAlta;
        this.departamento = departamento;
    }

    public int getNum_empleado() {
        return Num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        Num_empleado = num_empleado;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                "Num_empleado: " + Num_empleado +
                ", Apellido: '" + Apellido + '\'' +
                ", Salario: " + salario +
                ", Fecha en la que se dio de alta al empleado: " + fechaAlta +
                ", Departamento que pertenece: " + departamento;
    }
}
