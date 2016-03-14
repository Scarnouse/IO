package flujosIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GrupoUsuarios implements Serializable{
	private String nombreGrupo;
	private List<Usuario> usuarios;
	public GrupoUsuarios(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
		this.usuarios = new ArrayList<Usuario>();
	}
	public boolean addUsuario(Usuario u){
		return usuarios.add(u);
	}
	public boolean removeUsuario(Usuario u){
		return usuarios.remove(u);
	}
	@Override
	public String toString() {
		return "GrupoUsuarios [nombreGrupo=" + nombreGrupo + ", usuarios=" + usuarios + "]";
	}	
}
