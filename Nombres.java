public class Nombres extends Expression {
    private int valeurNombre;
    /**
     *@param valeur : cette valeur sera égale à ce qu'aura enregistré this.valeurNombre 
     * 
     */
     
    public Nombres(int valeur) {
        this.valeurNombre = valeur;
    }
    /**
     * Cette méthode doit retourner la valeur du résultat du calcul
     * @param valeurNombre : un entier quelconque qui est le résultat de l'opération
     * @author Seraphin
     * @return valeurNombre
     */
    public double valeur() {
        return valeurNombre;
    }
    /**
     * @return this.valeurNombre
     * <p>
     * Methode toString basique
     * 
    */

    public String toString() {
        return "(" + this.valeurNombre + ")";
    }
}

