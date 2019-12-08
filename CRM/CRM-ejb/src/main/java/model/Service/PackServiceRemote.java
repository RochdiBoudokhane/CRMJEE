package model.Service;

import java.util.List;

import javax.ejb.Remote;

import model.Packs;


@Remote
public interface PackServiceRemote {
	public void ajouterPack(Packs Pack);
	public void modifierPack (int idPack, String packName);
	public void supprimerPack (int idPack);
	public void modifier(Packs pack);
	public List<Packs> findAllPacks();
	public List<Packs> ActifPack();
}
