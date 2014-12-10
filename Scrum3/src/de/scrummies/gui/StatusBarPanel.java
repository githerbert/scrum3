package de.scrummies.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.ProgressMonitor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class StatusBarPanel extends JPanel{
    
    private JLabel statusIcon;
    private JLabel statusLabel;
    private JProgressBar dpb;
    private JDialog dlg;
    private Color c;
    
    public StatusBarPanel(){
    	
    	setBorder(new LineBorder(Color.LIGHT_GRAY));
        setBounds(6, 10, 438, 28);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        loadUIManagerSettings();
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
    }
    
    public void loadUIManagerSettings(){
    	c = new Color(204, 222,164);
    	UIManager.put("ProgressBar.background", c);
    	UIManager.put("ProgressBar.foreground", c);
    	UIManager.put("ProgressBar.selectionBackground", Color.BLACK);
    	UIManager.put("ProgressBar.selectionForeground", Color.BLACK);
    }
    
    public void createProgressMonitor(String name, Frame owner, boolean modal, int progressLength){
    	dlg = new JDialog(owner, "Progress Dialog", modal);
    	dlg.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/icon.png")));
	    dpb = new JProgressBar(0, progressLength);
	    dpb.setStringPainted(true);
	    dlg.add(BorderLayout.CENTER, dpb);
	    dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    dlg.setSize(300, 75);
	    dlg.setLocationRelativeTo(owner);
	    dlg.setVisible(true);
    }
    
    public void updateStatusMeldung(String status, boolean fehler){
        if(fehler){
            statusIcon.setIcon(new ImageIcon(StatusBarPanel.class.getResource("/de/scrummies/images/statusBar-fails.png")));
            statusLabel.setBackground(Color.RED);
            statusLabel.setText("  Fehler: "+status+"  ");
            Toolkit.getDefaultToolkit().beep();
        }else {
            statusIcon.setIcon(new ImageIcon(StatusBarPanel.class.getResource("/de/scrummies/images/statusBar-success.png")));
            statusLabel.setBackground(c);
            statusLabel.setText("  Erfolgreich: "+status+"  ");
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public JProgressBar getProgressBar(){
    	return dpb;
    }
    
    public JDialog getProgressDialog(){
    	return dlg;
    }
    
}