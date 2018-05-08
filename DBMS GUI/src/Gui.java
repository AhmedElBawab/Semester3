import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class Gui {
	
	private JFrame frame;
	private ImageIcon img;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblTableContent;
	private JPanel panel_6;
	private JPanel panel_8;
	private JButton btnAddTable;
	private JButton btnDeleteTable;
	private JButton Helpbtn;
	private JButton Editbtn;
	private JButton Filebtn;
	private JButton DropDatabasebtn;
	private JButton AddDatabasebtn;
	private JLabel lblNewLabel_1;
	
	ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == Helpbtn){
				JOptionPane.showMessageDialog(null,
						  "Welcome to our Programme PHPMYADMIN �������\n"
						+ "---------------------------------------------------------------- \n"
						+ "1-Choose the Shape you want to draw\n"
						+ "2-click in any palce to choose start point\n"
						+ "3-Add Shape window will appeare fill it\n"
						+ "4-Press Enter and watch the shape being drawen\n"
						+ "5-click on the shape in the layers to Modify it\n"
						+ "---------------------------------------------------------------- \n"
						+ "You can also try undo , redo , save and load buttons\n"
						+ "---------------------------------------------------------------- \n"
						+ "Feel free to use the programme ^_^", 
						
						"Help Box", JOptionPane.INFORMATION_MESSAGE);
			}
			if(e.getSource() == Editbtn){
				final JPopupMenu menu = new JPopupMenu("Menu"); 
				menu.add(new JMenuItem(new AbstractAction("New DataBase") {
                    public void actionPerformed(ActionEvent e) {
                    	//create database
                    }
                }));
				menu.add(new JMenuItem(new AbstractAction("Delete Database") {
                    public void actionPerformed(ActionEvent e) {
                    	//delete current database
                    }
                }));
				menu.show(Editbtn, 20, 27);
                menu.setBackground(Color.BLACK);
			}
			if(e.getSource() == Filebtn){
				final JPopupMenu menu = new JPopupMenu("Menu");
				menu.add(new JMenuItem(new AbstractAction("Restart") {
                    public void actionPerformed(ActionEvent e) {
                    	mainGui();
                    }
                }));
                menu.add(new JMenuItem(new AbstractAction("Exit Programme") {
                    public void actionPerformed(ActionEvent e) {
                    	System.exit(0); 
                    }
                }));
                menu.show(Filebtn, 20, 27);
                menu.setBackground(Color.BLACK);
			}
			if(e.getSource() == DropDatabasebtn) {
				//drop selected database
			}
			if(e.getSource() == AddDatabasebtn) {
				//add database
			}
			if(e.getSource() == btnAddTable) {
				//add table
			}
			if(e.getSource() == btnDeleteTable) {
				//delete table
			}
		}			
	};
	
	KeyListener action = new KeyListener()
	{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				//send query
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	  
	};
	
	public void mainGui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//---------------------------------Start Initialize------------------------------------//
		
		frame = new JFrame("PHPMyAdmin �������");
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(-5, -5, 1380, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1362, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Filebtn = new JButton("File");
		Filebtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Filebtn.setBounds(4, 4, 60, 23);
		panel.add(Filebtn);
		Filebtn.setForeground(Color.BLACK);
		Filebtn.setToolTipText("File");
		Filebtn.setContentAreaFilled(false);
		Filebtn.setFocusPainted(false);
		Filebtn.setBorderPainted(false);
		Filebtn.addActionListener(actionListener);
		
		Editbtn = new JButton("Edit");
		Editbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Editbtn.setBounds(74, 4, 60, 23);
		panel.add(Editbtn);
		Editbtn.setForeground(Color.BLACK);
		Editbtn.setToolTipText("Edit");
		Editbtn.setContentAreaFilled(false);
		Editbtn.setFocusPainted(false);
		Editbtn.setBorderPainted(false);
		Editbtn.addActionListener(actionListener);
		
		Helpbtn = new JButton("Help");
		Helpbtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Helpbtn.setBounds(144, 4, 60, 23);
		panel.add(Helpbtn);
		Helpbtn.setForeground(Color.BLACK);
		Helpbtn.setToolTipText("Help");
		Helpbtn.setContentAreaFilled(false);
		Helpbtn.setFocusPainted(false);
		Helpbtn.setBorderPainted(false);
		Helpbtn.addActionListener(actionListener);
		
		//----------------------------------End Initialize-------------------------------------//
		
		//----------------------------------start DBPanel--------------------------------------//
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 79, 231, 546);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 31, 231, 48);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Bases");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(67, 0, 87, 48);
		panel_2.add(lblNewLabel);
		
		//----------------------------------end DBPanel---------------------------------------//

		//--------------------------------start EnterPanel------------------------------------//
		
		JTextArea txtrEnterQueriesHere = new JTextArea();
		txtrEnterQueriesHere.setBackground(Color.LIGHT_GRAY);
		txtrEnterQueriesHere.setToolTipText("Queries");
		txtrEnterQueriesHere.setText("Enter Queries Here ...");
		txtrEnterQueriesHere.setBounds(230, 31, 1131, 48);
		txtrEnterQueriesHere.addKeyListener(action);
		frame.getContentPane().add(txtrEnterQueriesHere);
		
		//---------------------------------End EnterPanel-------------------------------------//

		//------------------------------Start add&delete Table--------------------------------//
		
		panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(1220, 85, 120, 50);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		btnAddTable = new JButton("");
		btnAddTable.setToolTipText("Add Table");
		img = new ImageIcon(
				"C:\\Users\\ahmed\\git\\oop\\OOP\\src\\material\\icons8-plus-40 (2).png");
		btnAddTable.setIcon(img);
		btnAddTable.setBounds(60, 0, 60, 50);
		btnAddTable.setContentAreaFilled(false);
		btnAddTable.setFocusPainted(false);
		btnAddTable.setBorderPainted(false);
		btnAddTable.addActionListener(actionListener);
		panel_8.add(btnAddTable);
		
		btnDeleteTable = new JButton("");
		btnDeleteTable.setToolTipText("Delete Table");
		img = new ImageIcon(
				"C:\\Users\\ahmed\\git\\oop\\OOP\\src\\material\\icons8-cancel-40.png");
		btnDeleteTable.setIcon(img);
		btnDeleteTable.setBounds(0, 0, 60, 50);
		btnDeleteTable.setContentAreaFilled(false);
		btnDeleteTable.setFocusPainted(false);
		btnDeleteTable.setBorderPainted(false);
		btnDeleteTable.addActionListener(actionListener);
		panel_8.add(btnDeleteTable);
		
		//-------------------------------End add&delete Table---------------------------------//
		
		//----------------------------------start Tables--------------------------------------//

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(230, 79, 1132, 28);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Tables");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setToolTipText("Tables");
		lblNewLabel_1.setBounds(10, 0, 61, 31);
		panel_3.add(lblNewLabel_1);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(230, 79, 1132, 76);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(null);
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(0, 28, 989, 37);
		panel_4.add(panel_9);
		
		//-----------------------------------End Tables---------------------------------------//
		
		//---------------------------------start content--------------------------------------//
		
		panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(305, 166, 126, 32);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		lblTableContent = new JLabel("Table Content");
		lblTableContent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTableContent.setForeground(SystemColor.textHighlight);
		lblTableContent.setBounds(10, 8, 106, 14);
		panel_6.add(lblTableContent);
		lblTableContent.setBackground(Color.WHITE);
		
		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(286, 178, 1020, 497);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 29, 1000, 457);
		panel_5.add(panel_10);
		
		//---------------------------------start content--------------------------------------//
		
		//-----------------------------start add&drop Database--------------------------------//

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(0, 625, 231, 76);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		DropDatabasebtn = new JButton("");
		DropDatabasebtn.setToolTipText("Drop DataBase");
		img = new ImageIcon(
				"C:\\Users\\ahmed\\git\\oop\\OOP\\src\\material\\icons8-cancel-40(1).png");
		DropDatabasebtn.setIcon(img);
		DropDatabasebtn.setBounds(10, 16, 89, 49);
		DropDatabasebtn.setContentAreaFilled(false);
		DropDatabasebtn.setFocusPainted(false);
		DropDatabasebtn.setBorderPainted(false);
		DropDatabasebtn.addActionListener(actionListener);
		panel_7.add(DropDatabasebtn);
		
		AddDatabasebtn = new JButton("");
		AddDatabasebtn.setToolTipText("Add DataBase");
		img = new ImageIcon(
				"C:\\Users\\ahmed\\git\\oop\\OOP\\src\\material\\icons8-plus-40.png");
		AddDatabasebtn.setIcon(img);
		AddDatabasebtn.setBounds(132, 16, 89, 49);
		AddDatabasebtn.setContentAreaFilled(false);
		AddDatabasebtn.setFocusPainted(false);
		AddDatabasebtn.setBorderPainted(false);
		AddDatabasebtn.addActionListener(actionListener);
		panel_7.add(AddDatabasebtn);

	}
}
