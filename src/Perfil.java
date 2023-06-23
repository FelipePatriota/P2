import java.util.ArrayList;

public class Perfil {
  private String nome;
  private String ig;
  private ArrayList<Perfil> seguidores;
  protected boolean imprimiu;

  public Perfil(String nome, String ig) {
    this.nome = nome;
    this.ig = ig;
    this.imprimiu = false;
    this.seguidores = new ArrayList<Perfil>();
  }

  public void addSeguidor(Perfil seguidor) {
    seguidores.add(seguidor);
  }

  public void removeSeguidor(Perfil seguidor) {
    seguidores.remove(seguidor);
  }

  public void imprimirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("IG: " + ig);
    System.out.println("Nº seguidores: " + seguidores.size());
  }

  public void mostrarÁrvoreSeguidores(int nivel) {
    if(this.imprimiu == false) {
      this.imprimiu = true;
      System.out.println(nome);
      
      for (Perfil seguidor : seguidores) {
        for (int i = 0; i < nivel; i++) {
          System.out.print("---");
      }
        System.out.println(seguidor.nome);
        nivel++;
      }

      
    }
  }
}
