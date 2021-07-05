package it.rubrica.business;

import java.util.List;

import it.rubrica.data.Contatto;

public interface Rubrica {

	public void addContatto(Contatto c);

	public void updateContatto(Contatto c);

	public void removeContatto(Contatto c);

	public Contatto getContatto(Integer id) ;

	public List<Contatto> getContatti();

}