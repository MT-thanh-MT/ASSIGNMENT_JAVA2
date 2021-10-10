/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author XUÂN THÀNH
 */
public class runTextThread extends Thread{

    private JLabel lblTextRun;

    public runTextThread(JLabel lblTextRun) {
        this.lblTextRun = lblTextRun;
    }

    @Override
    public void run() {
        String txt = this.lblTextRun.getText();
        while (true) {
            txt = txt.substring(1, txt.length()) + txt.charAt(0);
            try {
                Thread.sleep(120);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.lblTextRun.setText(txt);
            
        }
    }

}
