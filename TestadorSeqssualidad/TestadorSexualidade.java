/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestadorSexualidade;
    import javax.swing.*;
/**
 *
 * @author udesc
 */
public class TestadorSexualidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] options1 = { "bruhs", "bruhsettes", "can haz all?", "idfk nibba" };
        int input = JOptionPane.showOptionDialog(new JFrame(), "you like?", "Testador de sequissoalidad", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, options1[0]);
        if(input==0){
            JOptionPane.showMessageDialog(new JFrame(), "u hav de big gay");
        }else if(input==1){
            JOptionPane.showMessageDialog(new JFrame(), "ur str8");
        }else if(input==2){
            JOptionPane.showMessageDialog(new JFrame(), "ur biseqss");
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "ur asekssual");
        }
        System.exit(0);
    }
    
}
