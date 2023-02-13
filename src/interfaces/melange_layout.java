package interfaces;
import java.awt.*;
//import java.beans.Visibility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;
public class melange_layout extends JFrame {
	
	private JPanel P = new JPanel() ;
	private JButton b = new JButton("center") ;
	private JButton b1 = new JButton("east") ;
	private JButton b2 = new JButton("south") ;
	private JButton b3 = new JButton("NORTH") ;
	private JButton b4 = new JButton("south2") ;
	private JTextField b5 = new JTextField() ;
	private JButton b6 = new JButton() ;
	private JButton b7 = new JButton() ;
	private JButton b8 = new JButton() ;
	private JButton b9 = new JButton() ;
	private JButton b10 = new JButton() ;
	private JButton b11 = new JButton() ;
	private JButton b12 = new JButton() ;
	private JLabel b2_1 = new JLabel("nom") ;
	private JTextField b2_2 = new JTextField() ;
	private JLabel b2_3 = new JLabel("prenom") ;
	private JTextField b2_4 = new JTextField() ;
	private JLabel b2_5 = new JLabel("adresse") ;
	
	private JLabel b3_3 = new JLabel("sex") ;
	private JRadioButton b3_4 = new JRadioButton("homme") ;
	private JRadioButton b3_5 = new JRadioButton("femme") ;
	private ButtonGroup G = new ButtonGroup();
	private JCheckBox b1_1 = new JCheckBox("tennis") ;
	private JCheckBox b1_2 = new JCheckBox("squash") ;
	private JCheckBox b1_3 = new JCheckBox("natation") ;
	private JCheckBox b1_4 = new JCheckBox("athletisme") ;
	private JCheckBox b1_5 = new JCheckBox("randonne") ;
	private JCheckBox b1_6 = new JCheckBox("foot") ;
	private JCheckBox b1_7= new JCheckBox("basket") ;
	private JCheckBox b1_8= new JCheckBox("volley") ;
	private JCheckBox b1_9= new JCheckBox("pelanque") ;

	private JButton b4_1= new JButton("Ok") ;
	private JButton b4_2= new JButton("Annule") ;

   private JPanel p2 = new JPanel() ;
   private JPanel p3 = new JPanel() ;

   private JPanel p4 = new JPanel() ;

   private JPanel p5 = new JPanel() ;
   private JPanel p6 = new JPanel() ;

	public melange_layout() {
		setTitle("Melange de Layout");
		setSize(400,300) ;
		add(P) ;
		P.setLayout(new BorderLayout());
		P.add(p2, BorderLayout.CENTER);
		P.add(p3, BorderLayout.EAST);
		P.add(p6, BorderLayout.SOUTH);
		p2.setLayout(new BorderLayout());
		p2.add(p4, BorderLayout.NORTH);
		p2.add(b5, BorderLayout.CENTER);
		p2.add(p5, BorderLayout.SOUTH);
		p3.setLayout(new GridLayout(9,1));
		p3.add(b1_1);
		p3.add(b1_2);
		p3.add(b1_3);
		p3.add(b1_4);
		p3.add(b1_5);
		p3.add(b1_6);
		p3.add(b1_7);
		p3.add(b1_8);
		p3.add(b1_9);
		p4.setLayout(new GridLayout(5,1));
		p4.add(b2_1);
		p4.add(b2_2);
		p4.add(b2_3);
		p4.add(b2_4);
		p4.add(b2_5);
		p5.setLayout(new FlowLayout());
		p5.add(b3_3);
		p5.add(b3_4);
		p5.add(b3_5);
		p6.setLayout(new FlowLayout());
		p6.add(b4_1);
		p6.add(b4_2);
		G.add(b3_4);
		G.add(b3_5);
		b4_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		

		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new melange_layout() ;
		
		
	}

}
