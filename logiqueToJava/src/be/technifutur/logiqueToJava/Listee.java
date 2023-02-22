package be.technifutur.logiqueToJava;

public class Listee implements Runnable{
    public void run(){
        MyList laList = null;
        int taille = longueur(laList);
        System.out.println(taille);
        System.out.println(taille);
        laList = ajouterDebut(laList, 15);
        laList = ajouterDebut(laList, 125);
        laList = ajouterDebut(laList, -615);
        laList = ajouterDebut(laList, 1);
        laList = ajouterDebut(laList, 18);
        taille = longueur(laList);
        System.out.println(toString(laList));


    }

    private String tostring(MyList list){
        String result="";
        while( list != null){
            result += " "+list.valeur;
            list = list.suivant;
        }
        return result;
    }

    private int longueur(MyList list){
        int taille = 0;
        int result = 0;

        while( list != null){
            list = list.suivant;
            result = result + 1;
        }
        return 0;
    }

    private MyList ajouterDebut(MyList list, int value){
        MyList result = null;
        return result;
    }

   

}
