package interfaces;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ma_interface extends JFrame {
	private  JLabel L = new JLabel("premier nombre") ;
     private int v1 ;
     private int v2 ;

	public ma_interface() {
		 setTitle("ma fenetre") ;
		 setSize(500,400);
		// Container c = getContentPane() ;
		 JTextField saisie= new JTextField(20);
		 JTextField saisie1= new JTextField(20);
		 JTextField saisie2= new JTextField(20);

		 JPanel P1 = new JPanel() ;
		 
		 P1.setLayout(new GridLayout(5,2));
 		 P1.add(L) ;
		 P1.add(saisie) ;
		 P1.add(new JLabel("Deuxieme nombre :")) ;
		 P1.add(saisie1) ;
		 P1.add(new JLabel("resultat :")) ;
		 P1.add(saisie2) ;
		 JButton s = new JButton("la somme") ;
		 JButton pr = new JButton("le produit") ;

		 JButton so = new JButton("la soustraction") ;

		 JButton d = new JButton("la division") ;
	 d.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		  v1 = Integer.parseInt(saisie.getText());
		  v2 = Integer.parseInt(saisie1.getText());
		  if (v2!=0) {
  			v1 = v1/v2 ;
 			saisie2.setText(""+v1) ;
		  }
		  }
	});
	 so.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		  v1 = Integer.parseInt(saisie.getText());
		  v2 = Integer.parseInt(saisie1.getText());
 			v1 = v1-v2 ;
 			saisie2.setText(""+v1) ;
		}
	});
	 s.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
		  v1 = Integer.parseInt(saisie.getText());
		  v2 = Integer.parseInt(saisie1.getText());
 			v1 += v2 ;
 			saisie2.setText(""+v1) ;
		}
	});
	 pr.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
		  v1 = Integer.parseInt(saisie.getText());
		  v2 = Integer.parseInt(saisie1.getText());
 			v1 = v2*v1 ;
 			saisie2.setText(""+v1) ;
		}
	});
		 

 		 P1.setBackground(Color.gray);
		 P1.setToolTipText("soufian");
		 Font serif32Font = new Font ("Serif" , Font.BOLD,32) ;
		 setFont(serif32Font);
		 add(P1) ;
		 P1.add(s);
		 P1.add(pr);
		 P1.add(d);
		 P1.add(so);

		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
	 }
	
	public static void main(String [] args) {
		
		new ma_interface() ;
	}

}
