package be.technifutur.sudoku.sudoku4x4;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

public class SudokuVue4x4 implements SudokuVue {
    private static String format = """
            +-----+-----+
            | . . | . . |
            | . . | . . |
            +-----+-----+
            | . . | . . |
            | . . | . . |
            +-----+-----+""".replace(".","%s");

    private SudokuModel4x4 model;
    public SudokuVue4x4(SudokuModel4x4 leModel){
        this.model = leModel;
    }

    @Override
    public String getScreen(){
        Character[] val = new Character[16];
        int pos = 0;
        for (int l = 0; l < model.getMaxLine(); l++) {
            for (int c = 0; c < getModel().getMaxColumn(); c++) {
                if (model.isEmpty(l,c)){
                    val[pos]='.';
                }else{
                    val[pos]=model.getValue(l,c);
                }
                pos++;
            }
        }
        return String.format(format,val);
    }

    @Override
    public SudokuModel getModel(){
        return this.model;
    }

}
