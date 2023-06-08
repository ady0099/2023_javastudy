package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ex03_Canvas extends Canvas {
	@Override
	public void paint(Graphics g) {

		// 이미지
		Image image = Toolkit.getDefaultToolkit().getImage("src/img/java1.png");
		g.drawImage(image, 10, 230, this);

		g.drawImage(image, 120, 230, 100, 100, this); // 크기 조절

		try {
			BufferedImage image2 = ImageIO.read(new File("src/img/java2.png"));
			g.drawImage(image2, 240, 230, 100, 100, this);
			g.drawImage(image2, 350, 230, 100, 100, new Color(255, 255, 0, 22), this);

		} catch (IOException e) {
		}
		Image image3 = new ImageIcon("src/imag/java3.png").getImage();
		g.drawImage(image3, 460, 230, 100, 100, new Color(0, 100, 0, 120), this);
	}
}