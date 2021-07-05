package it.rubrica.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import it.rubrica.business.RubricaEJBLocal;
import it.rubrica.data.Contatto;

@ManagedBean(name = "rubrica")
@RequestScoped
public class RubricaManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private RubricaEJBLocal rubrica_ejb;
	
	private Contatto contatto;

	
	public RubricaManagedBean() {
		contatto = new Contatto();
	}

	public Contatto getContatto() {
		return contatto;
	}

	public void setContatto(Contatto contatto) {
		this.contatto = contatto;
	}
	
	public List<Contatto> getElencoContatti(){
		return rubrica_ejb.getContatti();
	}

	public void salva() {
		rubrica_ejb.addContatto(contatto);
	}
}
