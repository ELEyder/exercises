package TR;

public class Banco {
	String usuario;
	String DNI;
	double saldoSoles;
	String contra;
		public Banco(String DNI, String cuenta, String password){
			this.usuario = cuenta;
			this.saldoSoles = 0;
			this.DNI = DNI;
			this.contra = password;
		}
		
		public void deposito(double deposito){
			this.saldoSoles += deposito;
		}
		public void retiro(double retiro){
			this.saldoSoles -= retiro;
		}
		public void mostrarSaldo(){
			System.out.println("DNI    : " + this.DNI);
			System.out.println("Usuario: \"" + this.usuario + "\"");
			System.out.println("Saldo  : S/. " + this.saldoSoles);
		}
		public String getDni() {
			return this.DNI;
		}
		public String getUsuario() {
			return this.usuario;
		}
		public String getContra() {
			return this.contra;
		}
}
