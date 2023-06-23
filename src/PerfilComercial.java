public class PerfilComercial extends Perfil {

  public String email;

  public PerfilComercial(String nome, String ig, String email) {
    super(nome, ig);
    
    this.email = email;
  }

  @Override
  public void imprimirDados() {
    super.imprimirDados();
    
    System.out.println("Email: " + email);
  }  
}
