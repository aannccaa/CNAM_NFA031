/* Un premier programme:
-son nom est Conversion
-il est sauvegarde dans le fichier Conversion.java
-il est compile par javac Conversion.java
-il est execute par java Conversion
SAPx*/
public class Conversion {
public static void main (String[] args) {
// Variables du programme
double euros, francs;
// Message pour la saisie
Terminal.ecrireStringln("Entrez la somme en euros: ");
// Lecture dans la variable euros
euros = Terminal.lireDouble();
// Calcul de la conversion
francs = euros *6.559;
// Affichage du resultat
Terminal.ecrireStringln("La somme convertie en francs: "+ francs);
}
}