package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class tste {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tste window = new tste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultMutableTreeNode raiz = montarArvore();
		
		JTree tree = new JTree(raiz);
		tree.setBounds(61, 11, 270, 199);
		frame.getContentPane().add(tree);
	}
	
	 private DefaultMutableTreeNode montarArvore(){ 
		    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Cidades"); 
		    DefaultMutableTreeNode regiao = new DefaultMutableTreeNode("Região"); 
		    regiao.add(new DefaultMutableTreeNode("Centro-Oeste"));
		    regiao.add(new DefaultMutableTreeNode("Norte"));
		    regiao.add(new DefaultMutableTreeNode("Sul"));     
		         
		    raiz.add(regiao); 
		    return raiz; 
		  }
}
