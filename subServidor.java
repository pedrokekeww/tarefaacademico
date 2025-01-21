//subclasse 2 do academico: servidor
package academico;

public class Servidor extends pessoa
{
	private String serviço;
	private double salario;
	public String getServiço() {
		return serviço;
	}
	public void setServiço(String serviço) {
		this.serviço = serviço;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() 
	{
		return "Serviço = " + serviço + ", Salário = " + salario + ".";
	}
	public double Salarioamais()
	{
		return this.salario-1.518;
	}
}
