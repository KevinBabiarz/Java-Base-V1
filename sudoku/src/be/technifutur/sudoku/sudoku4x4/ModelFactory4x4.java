package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuModelFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ModelFactory4x4 implements SudokuModelFactory {
    @Override
    public SudokuModel4x4 getModel(String filename) {
        int ligne = 0;
        int col = 0;
        SudokuModel4x4 model4x4 = new SudokuModel4x4();
        File file = new File(filename);
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                while(col<4){
                    char value = line.charAt(col);
                    if(value != '.' && value != ' '){
                        model4x4.setValue(ligne, col, value);
                    }else if (value == ' '){
                        model4x4.setValue(ligne,col, ' ');
                    }
                    col++;
                }
                col=0;
                ligne++;
            }
        }catch(FileNotFoundException e){
            System.out.println("Le fichier n'existe pas");
        }

        return model4x4;
    }
}
