package fr.parisnanterre.miage.poa.BurgerFactory.Factory;

/**
 * Created by arielnataf on 06/11/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public enum Menu {
	MENU_FISH("Fish"),
	MENU_BEEF("Beef");
	private final String nomMenu;

	Menu(String nomMenu) {
		this.nomMenu = nomMenu;
	}

	String getNomMenu(){
		return nomMenu;
	}
}
