package be.technifutur.sudoku;

import be.technifutur.sudoku.sudoku4x4.SudokuModel4x4;
import be.technifutur.sudoku.sudoku4x4.SudokuVue4x4;
import be.technifutur.sudoku.sudoku4x4.ModelFactory4x4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku");

        //SudokuModel4x4 model =  new SudokuModel4x4();
        ModelFactory4x4 partie = new ModelFactory4x4();
        SudokuController ctrl = new SudokuController(partie);
       // SudokuModel4x4 model = partie.getModel("Ressources\\Sudoku4x4.txt");

       // SudokuVue vue = new SudokuVue4x4(model);

        //vue.getModel().setValue(0,0, (char) 1);
        ctrl.start("Ressources\\Sudoku4x4.txt");
        // SudokuVue4x4 vue = partie.getVue("Ressources\\Sudoku4x4.txt");
        // System.out.println(vue.getScreen());


    }
}