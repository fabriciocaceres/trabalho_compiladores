package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Choice;
import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.Window.Type;
import java.awt.List;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.TextField;
import java.awt.TextArea;

import javax.swing.JPanel;

import java.awt.Dialog.ModalExclusionType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

import controleDeArquivos.*;

import javax.swing.SwingConstants;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;

public class Tela  extends JFrame{

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnFile; 
	private JMenuItem mntmNovo;
	private JMenuItem mntmAbrirArquivo;
	private JMenuItem mntmSalvar;
	private JMenu mnRun;
	private JMenuItem mntmRun;
	private JButton btnNovo;
	private JButton btnAbrirArquivo;
	private JButton btnCompilador;
	private JPanel panel_1;
	private JPanel panel_3;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_1;
	private JTextArea textArquivo;
	private JTextArea textMsg;
	private JTextArea textArea_1 ;
	private JTextArea textConsole;
	
	private File file;
	private boolean controleArquivo = false;
	
	private String campoTexto = null;
	private JTextArea textArea_2;
	private JButton btnSalvarComo;
	

	/**
	 * Create the application.
	 */
	public Tela() {
		
		this.lookFeel();
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("  CBola IDE");
		setBounds(100, 100, 1000, 618);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmNovo = new JMenuItem("Novo");
		mnFile.add(mntmNovo);
		
		mntmAbrirArquivo = new JMenuItem("Abrir Arquivo");
		mntmAbrirArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            file = fc.getSelectedFile().getAbsoluteFile();
		            //This is where a real application would open the file.
		            ReadFile read = new ReadFile();
		            read.openFile(file);
		    		textArquivo.append(read.readRecords());
		    		read.closeFile();
		        }
			}
		});
		mntmAbrirArquivo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmAbrirArquivo);
		
		mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_MASK));
		mntmSalvar.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(mntmSalvar);
		
		mnRun = new JMenu("Run");
		menuBar.add(mnRun);
		
		mntmRun = new JMenuItem("Run");
		mntmRun.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnRun.add(mntmRun);
		getContentPane().setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(44, 75, 567, 313);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textArquivo = new JTextArea();
		scrollPane_2 = new JScrollPane ();
		scrollPane_2.setBounds(0, 0, 567, 313);
		scrollPane_2.setViewportView(textArquivo);
		textArquivo.setBounds(10, 55, 615, 285);
		panel_1.add(scrollPane_2);
		
		panel_3 = new JPanel();
		panel_3.setBounds(621, 75, 353, 313);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 353, 313);
		panel_3.add(scrollPane_1);
		
		textMsg = new JTextArea();
		textMsg.setEditable(false);
		scrollPane_1.setViewportView(textMsg);
		
		panel_2 = new JPanel();
		panel_2.setBounds(10, 424, 964, 135);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 964, 135);
		panel_2.add(scrollPane);
		
		textConsole = new JTextArea();
		scrollPane.setViewportView(textConsole);
		textConsole.setEditable(false);
		
		JLabel lblArquivo = new JLabel("Arquivo");
		lblArquivo.setBounds(54, 55, 46, 14);
		getContentPane().add(lblArquivo);
		
		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setBounds(630, 55, 80, 14);
		getContentPane().add(lblMensagem);
		
		JLabel lblConsole = new JLabel("Console");
		lblConsole.setBounds(20, 399, 80, 14);
		getContentPane().add(lblConsole);
								
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(10, 75, 28, 313);
		getContentPane().add(textArea_2);
		
		btnNovo = new JButton("");
		btnNovo.setIcon(new ImageIcon(Tela.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		btnNovo.setBounds(10, 11, 28, 21);
		getContentPane().add(btnNovo);
		btnNovo.setBackground(SystemColor.activeCaptionBorder);
		
		btnAbrirArquivo = new JButton("");
		btnAbrirArquivo.setIcon(new ImageIcon(Tela.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		btnAbrirArquivo.setBounds(49, 11, 28, 21);
		getContentPane().add(btnAbrirArquivo);
		btnAbrirArquivo.setBackground(Color.LIGHT_GRAY);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(Tela.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnSalvar.setBounds(84, 11, 28, 21);
		getContentPane().add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Abre o negocio para selecionar
				JFileChooser jc = new JFileChooser();
				jc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int i= jc.showSaveDialog(null);
				
				//Se o retorno for == 1 quer dizer que o usuario apertou em cancelar 
				if (i==1){ 
					textArquivo.setText("");
				}
				// Se não, ele escreveu o nome do arquivo, ou selecionou o arquivo que queira salvar
				else {
					// Pega o arquivo selecionado ou novo
					file = jc.getSelectedFile();
					
					try{
						// Classe para salvar em arquivo txt
						FileWriter fw = new FileWriter(file);
						
						//Salva todo o conteudo que esta no campo de texto e grava no arquivo
					    fw.write(textArquivo.getText());
					   
					    //Salva o conteudo
					    fw.flush();
					    
					    //Fecha o arquivo
					    fw.close();
					   
					}catch(IOException ex){
						setConsole(ex.getMessage());
					}
		            

				}
			}		});
		btnSalvar.setBackground(SystemColor.activeCaptionBorder);
		

				btnCompilador = new JButton("");
				btnCompilador.setIcon(new ImageIcon(Tela.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
				btnCompilador.setBounds(813, 11, 58, 36);
				getContentPane().add(btnCompilador);
				btnCompilador.setBackground(Color.LIGHT_GRAY);
				
				btnSalvarComo = new JButton("");
				btnSalvarComo.setIcon(new ImageIcon(Tela.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
				btnSalvarComo.setBounds(117, 11, 28, 21);
				getContentPane().add(btnSalvarComo);
		btnAbrirArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            file = fc.getSelectedFile().getAbsoluteFile();
		            //This is where a real application would open the file.
		            ReadFile read = new ReadFile();
		            read.openFile(file);
		            textArquivo.setText("");
		            campoTexto = new String();
		            campoTexto = read.readRecords();	            
		    		textArquivo.append(campoTexto);
		    		controleArquivo = true;
		    		
		    		read.closeFile();
		        }
		
			}
		});
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArquivo.setText("");
			}
		});
		
		
		/*====================================================*/
		
	}
	
	public void lookFeel() {//Altera o tipo de interface que ira exibir

		  try {

		   for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

		    if ("Nimbus".equals(info.getName())) {

		     UIManager.setLookAndFeel(info.getClassName());
		    }
		   }

		  } catch (Exception e) {

		   JOptionPane.showMessageDialog(null,
		     "Nao foi possivel executar o nimbus");
		  }
		  
	}
	
	/*=== Funçao que retorna um o botao do compilador ===*/
	public JButton getCompilar() {
		return btnCompilador;
	}
	
	public JMenuItem mntmRun(){
		return mntmRun;
	}
	
	public JTextArea getTextArquivo(){
		return textArquivo;
	}
	
	/*=== Funçao para adicionar msg no console ===*/
	public void setConsole(String msg){
		textConsole.append(msg+"\n");
	}
	
	/*=== Funçao para adicionar msg no campo de msg ===*/
	public void setMsg(String msg){
		textMsg.append(msg+"\n");
	}
	
	/*=== Funçao que retorna o arquivo que esta sendo editado ===*/
	public File getCodigo(){
		return file;
	}
	
	public String getCampoTexto(){
		return campoTexto;
	}
	
	public boolean getControleArquivo(){return controleArquivo;}
	
	public void setControleArquivo(boolean controle){
		this.controleArquivo = controle;
	}
	
	public void setVazioConsoleMsg(){
		textConsole.setText("");
		textMsg.setText("");
	}
}
