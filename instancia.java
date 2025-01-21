package academico;

public class Instância 
{
	public static void main (String[] args) {
		Aluno lorran = new Aluno();
		lorran.setNome("Arlenson");
		lorran.setSobrenome("Lorn");
		lorran.setEmail("ambantukan@gmail.com");
		lorran.setIdade(17);
		lorran.setSexo("homem");
		lorran.setCurso("Informática");
		lorran.setPeriodo(3);
		System.out.println(lorran.getNome() + "\nSobrenome: " + lorran.getSobrenome() + "\nEmail: "
				+ lorran.getEmail() + "\nIdade: " + lorran.getIdade()
				+ "\nSexo: " + lorran.getSexo() + "\nCurso:"
				+ lorran.getCurso() + "\nPeríodo: " + lorran.getPeriodo() );	
		System.out.println(lorran.Periodosleft());
		Servidor luan = new Servidor();
		luan.setNome("Luan");
		luan.setSobrenome("Pereira");
		luan.setEmail("LuanPerera@gmail.com");
		luan.setIdade(34);
		luan.setSexo("homem");
		luan.setSalario(2.400);
		luan.setServiço("Cozinheiro");
		System.out.println(luan.getNome() + "\nSobrenome: " + luan.getSobrenome() + "\nEmail: "
				+ luan.getEmail() + "\nIdade: " + luan.getIdade()
				+ "\nSexo: " + luan.getSexo() + "\nSalário:"
				+ luan.getSalario() + "\nServiço: " + luan.getServiço() );	
		System.out.println(luan.Salarioamais());
	}
}
