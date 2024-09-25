package fr.uvsq.cprog.zhengyao;

/**
 * Class contenant le point d'entrée du programme.
 * 
 * <p>L'objet APPLICATION représente... l'application.
 * Il est possible d'y conserver des données utiles dans l'ensemble du programme.
 * Attention toutefois à ne pas en abuser : cela ressemble grandement à des variables globales.
 * C'est un exemple du design pattern Singleton.
 *
 * @see <a href="https://refactoring.guru/fr/design-patterns/singleton">Pattern Singleton</a>
 *
 * @author hal
 * @version 2024
 */
public enum Main {
    APPLICATION;

    /**
     * Point d'entrée de l'application.
     * 
     * <p>C'est ici qu'il faut créer les objets principaux et lancer les interactions entre eux.
     *
     * @param args les paramètres de la ligne de commande
     */
    public void run(String[] args) {
        Complex cplx = new Complex(1, 2);
        System.out.println("Le complexe : " + cplx);
    }

    public static void main(String[] args) {
        APPLICATION.run(args);
    }
}
