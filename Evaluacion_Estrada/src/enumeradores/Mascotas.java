package enumeradores;

import entidades.Mascota;
import interfaces.Listable;

public enum Mascotas implements Listable{
	
	MECCA("Mecca"),KIBO("Kibo"),KOI("Koi");
	
	private String nombre;
	private String tipo;
	
	private Mascotas(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	public Mascota getMascota() {
		Mascota m = null;
		try {
			m = (Mascota) Class.forName("entidades."+this.nombre).newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return m;
	}

	
}
