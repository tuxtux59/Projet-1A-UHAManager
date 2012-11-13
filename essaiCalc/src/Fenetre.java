import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Fenetre extends JFrame{
	
	private Panneau pan =new Panneau();
	private JButton bouton = new JButton("Se Connecter");
	private JPanel content = new JPanel();
	private JLabel label1 = new JLabel ("Votre Ecole");
	private JLabel label2 = new JLabel ("Votre Filière");
	private JComboBox listederoulante = new JComboBox();
	
	private JEditorPane editorPane, apercu;
	private JTabbedPane onglet = new JTabbedPane();
	
	private JComboBox listederoulante2 = new JComboBox();
	private JLabel label3 = new JLabel ("Votre Année");
	private JComboBox listederoulante3 = new JComboBox();
	public String[] tab;
	public JLabel icon = new JLabel(new ImageIcon("http://ensisa.pinade.org/img/info/1a"));
	
	
	public Fenetre(){
	this.setTitle("UHA Manager");
	this.setSize(960,620);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
	content.setBackground(Color.WHITE);
	content.setLayout(new BorderLayout());
	content.add(pan,BorderLayout.CENTER);
	content.add(bouton,BorderLayout.SOUTH);
	this.setContentPane(content);	
	
	//this.setContentPane(content);
	
	this.setVisible(true);
	}
	public Fenetre(int a){
		
		switch(a){
		case 1:
			this.setTitle("UHA Manager-Connexion");
			this.setSize(960,620);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
			content.setBackground(Color.WHITE);
			content.setLayout(new BorderLayout());
			content.add(pan,BorderLayout.CENTER);
			content.add(new JButton("Retour"),BorderLayout.SOUTH);
			this.setContentPane(content);	
			
			//this.setContentPane(content);
			
			this.setVisible(true);
			break;
		case 2:
			this.setTitle("UHA Manager-EDT");
			this.setSize(960,620);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			content.setBackground(Color.WHITE);
			content.setLayout(new BorderLayout());
			listederoulante.setPreferredSize(new Dimension(100,20));
			listederoulante.addItem("ENSISA");
			listederoulante.addItem("ENSCMu");
			listederoulante.addItem("FLSH");
			listederoulante.addItemListener(new ItemState());
			String tab[]= {"Auto","Info"};
			listederoulante2= new JComboBox(tab);
			listederoulante2.setPreferredSize(new Dimension(70,20));
			
			listederoulante3.setPreferredSize(new Dimension(70,20));
			listederoulante3.addItem("1A");
			listederoulante3.addItem("2A");
			listederoulante3.addItem("3A");
			
			
			
			JPanel top = new JPanel();
			top.add(label1);
			top.add(listederoulante);
			top.add(label2);
			top.add(listederoulante2);
			top.add(label3);
			top.add(listederoulante3);
			JPanel center = new JPanel();
			//center.setBackground(Color.BLUE);
			center.add(icon);
			content.add(center,BorderLayout.CENTER);
			content.add(top,BorderLayout.NORTH);
			content.add(new JButton("Retour"),BorderLayout.SOUTH);
			this.setContentPane(content);	
			
			//this.setContentPane(content);
		
			this.setVisible(true);
			break;
		case 3:
			
			this.setTitle("Conteneur éditable");
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			editorPane = new JEditorPane();
			apercu = new JEditorPane();
			apercu.setEditable(false);
			onglet.addTab("Editeur HTML", new JScrollPane(editorPane));
			onglet.addTab("Aperçu", new JScrollPane(apercu));
		
		}
		if(a==1){
			
		}else{
			
		}
	}
		public Fenetre(ArrayList<Event> list){
			this.setTitle("UHA Manager-compte");
			this.setSize(960,620);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
			content.setBackground(Color.WHITE);
			content.setLayout(new BorderLayout());
			content.add(pan,BorderLayout.CENTER);
			content.add(new JButton("Retour"),BorderLayout.SOUTH);
			this.setContentPane(content);	
			
			//this.setContentPane(content);
			
			this.setVisible(true);
		
	}
		class ItemState implements ItemListener{
			public void itemStateChanged(ItemEvent e){
				System.out.println("evenement sur : "+e.getItem());
				if(e.getItem()=="ENSCMu"){
					System.out.println("Vous n'êtes pas de l'ENSISA!!");
					
					tab = new String[] {"Chinois","Anglais"};
				}
			}

			
			
		}

}
