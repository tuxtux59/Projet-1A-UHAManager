import java.awt.*;
import javax.swing.*;

public class Panneau extends JPanel{
	
	public void paintComponent(Graphics g){
		
		int x1=this.getWidth()/4;
		int y1=this.getHeight()/4;
		
		System.out.println("éxécutée");
		/*Font font = new Font("Helvetica",Font.CENTER_BASELINE,20);
		g.setFont(font);*/
		g.setColor(Color.black);
		
		g.drawString("Bienvenue sur l'application UHA Manager ! \n identifiez vous :",(this.getWidth()/2)-(x1/2),(this.getHeight()/2)-(y1/2));
	}	

}
