package de.scrummies.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class HeaderPanel extends JPanel {
	Image image;

	public HeaderPanel() {
		image = Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/de/scrummies/images/header.jpg"));
		Dimension size = new Dimension(image.getWidth(null),
				image.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
