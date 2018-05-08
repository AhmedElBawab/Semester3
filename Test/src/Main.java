import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.List;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import com.sun.webkit.ColorChooser;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JSlider;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.BLACK);
		frame.setBounds(-5, -5, 1380, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 30, 1380, 2);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(65, 97, 1009, 594);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("L");
		btnNewButton.setToolTipText("Line");
		btnNewButton.setBounds(11, 219, 50, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("s");
		btnNewButton_1.setToolTipText("Square");
		btnNewButton_1.setBounds(11, 280, 50, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("E");
		btnNewButton_2.setToolTipText("Elipse");
		btnNewButton_2.setBounds(11, 341, 50, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("T");
		btnNewButton_3.setToolTipText("Triangle");
		btnNewButton_3.setBounds(11, 402, 50, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnS = new JButton("S");
		btnS.setToolTipText("Selcet");
		btnS.setBounds(10, 97, 50, 50);
		frame.getContentPane().add(btnS);
		
		JButton btnP = new JButton("P");
		btnP.setToolTipText("Pen");
		btnP.setBounds(11, 158, 50, 50);
		frame.getContentPane().add(btnP);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(1080, 97, 272, 189);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Label label_2 = new Label("Width :");
		label_2.setBounds(10, 26, 42, 22);
		panel_2.add(label_2);
		
		Label label_3 = new Label("Height :");
		label_3.setBounds(10, 89, 42, 22);
		panel_2.add(label_3);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(62, 26, 90, 22);
		panel_2.add(textField_2);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(62, 89, 90, 22);
		panel_2.add(textField_3);
		
		JButton btnNewButton_5 = new JButton("Enter");
		btnNewButton_5.setBounds(96, 157, 89, 23);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Border Color");
		btnNewButton_6.setBounds(134, 54, 128, 23);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Fill Color");
		btnNewButton_7.setBounds(134, 123, 128, 23);
		panel_2.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("ADD SHAPE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(96, 6, 89, 14);
		panel_2.add(lblNewLabel_1);
		
		
		
		JPanel LayersPanel = new JPanel();
		LayersPanel.setBackground(Color.WHITE);
		LayersPanel.setBounds(1080, 344, 272, 347);
		frame.getContentPane().add(LayersPanel);
		LayersPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_4 = new JButton("Undo");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBounds(65, 40, 70, 50);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnRedo = new JButton("Redo");
		btnRedo.setForeground(Color.WHITE);
		btnRedo.setBounds(157, 40, 70, 50);
		btnRedo.setContentAreaFilled(false);
		btnRedo.setFocusPainted(false);
		btnRedo.setBorderPainted(false);
		frame.getContentPane().add(btnRedo);
		
		Panel panel_4 = new Panel();
		panel_4.setForeground(Color.BLACK);
		panel_4.setBounds(233, 35, 2, 55);
		frame.getContentPane().add(panel_4);
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setToolTipText("Save");
		btnNewButton_8.setBounds(254, 40, 70, 50);
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Load");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setToolTipText("Load");
		btnNewButton_9.setBounds(346, 40, 70, 50);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_9);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(1080, 97, 272, 189);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(63, 37, 86, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(63, 84, 86, 20);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Width :");
		lblNewLabel_2.setBounds(10, 40, 46, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Height :");
		lblNewLabel_3.setBounds(10, 87, 46, 14);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_10 = new JButton("Border Color");
		btnNewButton_10.setToolTipText("Border Color");
		btnNewButton_10.setBounds(173, 37, 89, 23);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Fill Color");
		btnNewButton_11.setToolTipText("Fill Color");
		btnNewButton_11.setBounds(173, 86, 89, 23);
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Apply");
		btnNewButton_12.setToolTipText("Apply");
		btnNewButton_12.setBounds(10, 138, 89, 23);
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Remove");
		btnNewButton_13.setToolTipText("Remove");
		btnNewButton_13.setBounds(173, 138, 89, 23);
		panel_3.add(btnNewButton_13);
		
		JLabel lblNewLabel = new JLabel("UPDATE & Remove");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(63, 11, 164, 14);
		panel_3.add(lblNewLabel);
		
		JButton btnNewButton_14 = new JButton("File");
		btnNewButton_14.setForeground(Color.WHITE);
		btnNewButton_14.setToolTipText("File");
		btnNewButton_14.setBounds(4, 4, 60, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Edit");
		btnNewButton_15.setForeground(Color.WHITE);
		btnNewButton_15.setToolTipText("Edit");
		btnNewButton_15.setBounds(75, 4, 60, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Help");
		btnNewButton_16.setForeground(Color.WHITE);
		btnNewButton_16.setToolTipText("Help");
		btnNewButton_16.setBounds(145, 4, 60, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(1080, 297, 272, 48);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Layers");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(107, 11, 59, 26);
		panel_5.add(lblNewLabel_4);
		
		JButton btnNewButton_17 = new JButton("Exit");
		btnNewButton_17.setToolTipText("Exit");
		btnNewButton_17.setBounds(1282, 40, 70, 40);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setToolTipText("Help");
		btnHelp.setBounds(1202, 40, 70, 40);
		frame.getContentPane().add(btnHelp);
		
		JButton btnNew = new JButton("New");
		btnNew.setToolTipText("New");
		btnNew.setBounds(1122, 40, 70, 40);
		frame.getContentPane().add(btnNew);
		
	}	
}
