//subclasse 1: aluno
package academico;

public class Aluno extends pessoa
{
	private String curso;
	private int periodo;
	public String getCurso() 
	{
		return curso;
	}
	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
	public int getPeriodo() 
	{
		return periodo;
	}
	public void setPeriodo(int periodo) 
	{
		this.periodo = periodo;
	}
	@Override
	public String toString() 
	{
		return " Curso = " + curso + ", Périodo = " + periodo + "!";
	}
	public int Periodosleft()
	{
		return (6-this.periodo);
	}
}
