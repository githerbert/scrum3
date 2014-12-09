package de.scrummies.gui;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

public class StatusBarPanel extends JPanel{
    
    private JLabel statusIcon;
    private JLabel statusLabel;
    private JProgressBar progressBar;
    
    public StatusBarPanel(){
    	setBorder(new LineBorder(Color.LIGHT_GRAY));
        setBounds(6, 10, 438, 28);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        createStatusBar();
    }
    
    public void createStatusBar(){
    	
    	JLabel platzhalter1 = new JLabel("  ");
    	this.add(platzhalter1);
    	
        statusIcon = new JLabel();
        this.add(statusIcon);
        
    	JLabel platzhalter2 = new JLabel("  ");
    	this.add(platzhalter2);
        
        statusLabel = new JLabel();
        statusLabel.setOpaque(true);
        this.add(statusLabel);
        
    	JLabel platzhalter3 = new JLabel("  ");
    	this.add(platzhalter3);
        
        progressBar = new JProgressBar();
        progressBar.setForeground(Color.GREEN);
        progressBar.setVisible(false);
        this.add(progressBar);
        
    	JLabel platzhalter4 = new JLabel("  ");
    	this.add(platzhalter4);
    }
    
    public void updateStatusMeldung(String status, boolean fehler){
        if(fehler){
            statusIcon.setIcon(new ImageIcon(StatusBarPanel.class.getResource("/de/scrummies/images/statusBar-fails.png")));
            statusLabel.setBackground(Color.RED);
            statusLabel.setText("  Fehler: "+status+"  ");
            Toolkit.getDefaultToolkit().beep();
        }else {
            statusIcon.setIcon(new ImageIcon(StatusBarPanel.class.getResource("/de/scrummies/images/statusBar-success.png")));
            statusLabel.setBackground(Color.GREEN);
            statusLabel.setText("  Erfolgreich: "+status+"  ");
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void activateProgressBar(boolean status){
    	 progressBar.setVisible(status);
    }
    
    public void updateProgressBar(int prozent){
        progressBar.setValue(prozent);
    }
    
}