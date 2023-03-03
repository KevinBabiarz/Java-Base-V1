package be.technifutur.sudoku;

import be.technifutur.sudoku.sudoku4x4.SudokuVue4x4;

import java.util.Scanner;

public class SudokuController{

    private SudokuModelFactory ctrl;
    public SudokuController(SudokuModelFactory laFactory){
        this.ctrl = laFactory;
    }

    public void start(String filename){
        SudokuVue vue = this.ctrl.getVue(filename);
        System.out.println(vue.getScreen());

        System.out.println("Entrez une pos et une valeur ");

        Scanner scanner = new Scanner(System.in);

        String stringLigne = scanner.nextLine();
        int ligne = Integer.parseInt(stringLigne);

        String stringColumn = scanner.nextLine();
        int column = Integer.parseInt(stringColumn);

        String stringValue = scanner.nextLine();
        char value = stringValue.charAt(0);

        SudokuModel model = vue.getModel();
        model.setValue(ligne, column, value);
        System.out.println(vue.getScreen());




    }

}
