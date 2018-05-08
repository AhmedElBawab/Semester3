//package Gui;
import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import org.omg.CORBA.TIMEOUT;

import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.GridLayout;

public class StartWindow {

	private JFrame frame;
	private JPanel panel_main;
	private JPanel panelCheckBoard;
	private JPanel panelScoreTitle;
	private JPanel panelScore;
	private JPanel panelTimeTitle;
	private JPanel panelTime;
	private JPanel panelBulletsTitle;
	private JPanel panelBullets;
	private JPanel panelLifeTitle;
	private JPanel panelLife;
	private JPanel panelCanvas;
	private ImageIcon img;
	private JLabel lblPhoto;
	private JLabel lblLogo;
	private JLabel lblScoreTitle;
	private JLabel lblScore;
	private JLabel lblTimeTitle;
	private JLabel lblTime;
	private JLabel lblBulletsTitle;
	private JLabel lblBullets;
	private JLabel lblLifeTitle;
	private JLabel lblLife;
	private Canvas canvas;
	
	private JButton btnEasy;
	private JButton btnMedium;
	private JButton btnHard;
	private JButton btnScores;
	private JButton btnIstructions;
	
	//ArrayDraw d = new ArrayDraw();
	
	ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEasy) {
				//send (29,25)
				panel_main.removeAll();
				panel_main.add(panelCanvas);
				panel_main.add(panelCheckBoard);
				panel_main.setBackground(Color.black);
				panel_main.validate();
				panel_main.repaint();
			}
			if(e.getSource() == btnMedium) {
				//send (29,35)
			}
			if(e.getSource() == btnHard) {
				//send (29,45)
			}
			if(e.getSource() == btnScores) {
				//show scores window
			}
			if(e.getSource() == btnIstructions) {
				//show instructions window
			}
		};
	};	
	
	KeyListener action = new KeyListener()
	{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				//d.up();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				//d.down();
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				//d.right();
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				//d.left();
			}
			if(e.getKeyChar() == 'd'){
				//d.fireR();
			}
			if(e.getKeyChar() == 'a'){
				//d.fireL();
			}
			if(e.getKeyChar() == 'w'){
				//d.fireU();
			}
			if(e.getKeyChar() == 'x'){
				//d.fireD();
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
	

	/**
	 * Launch the application.
	 */
	public void mainGui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
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
	public StartWindow() {
		initialize();
		//d.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Pack Man");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(-6, -6, 1380, 800);
		frame.addKeyListener(action);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel_main = new JPanel();
		panel_main.setBackground(Color.WHITE);
		panel_main.setBounds(0, 0, 1364, 749);
		panel_main.addKeyListener(action);
		frame.getContentPane().add(panel_main);
		panel_main.setLayout(null);
		
		//--------------------------------Start First Window------------------------------//
		
		lblPhoto = new JLabel("");
		img = new ImageIcon("E:/Mine/Faculty/OOP/Game/res/index.png");
		lblPhoto.setIcon(img);
		lblPhoto.setBounds(532, 200, 224, 227);
		panel_main.add(lblPhoto);
		
		lblLogo = new JLabel("");
		img = new ImageIcon("E:/Mine/Faculty/OOP/Game/res/logo.png");
		lblLogo.setIcon(img);
		lblLogo.setBounds(487, 48, 374, 128);
		panel_main.add(lblLogo);
		
		btnEasy = new JButton("Easy ");
		btnEasy.setFont(new Font("Tekton Pro", Font.BOLD, 27));
		btnEasy.setToolTipText("Easy");
		btnEasy.setContentAreaFilled(false);
		btnEasy.setFocusPainted(false);
		btnEasy.setBorderPainted(false);
		btnEasy.setBounds(216, 481, 154, 57);
		panel_main.add(btnEasy);
		
		btnMedium = new JButton("Medium");
		btnMedium.setFont(new Font("Tekton Pro", Font.BOLD, 27));
		btnMedium.setToolTipText("Medium");
		btnMedium.setContentAreaFilled(false);
		btnMedium.setFocusPainted(false);
		btnMedium.setBorderPainted(false);
		btnMedium.setBounds(575, 481, 154, 57);
		panel_main.add(btnMedium);
		
		btnHard = new JButton("Hard");
		btnHard.setFont(new Font("Tekton Pro", Font.BOLD, 27));
		btnHard.setToolTipText("Hard");
		btnHard.setContentAreaFilled(false);
		btnHard.setFocusPainted(false);
		btnHard.setBorderPainted(false);
		btnHard.setBounds(1063, 481, 154, 57);
		panel_main.add(btnHard);
		
		btnScores = new JButton("Scores");
		btnScores.setToolTipText("Scores");
		btnScores.setFont(new Font("Tekton Pro", Font.BOLD, 27));
		btnScores.setContentAreaFilled(false);
		btnScores.setFocusPainted(false);
		btnScores.setBorderPainted(false);
		btnScores.setBounds(391, 598, 154, 57);
		panel_main.add(btnScores);
		
		btnIstructions = new JButton("Instructions");
		btnIstructions.setToolTipText("Instructions");
		btnIstructions.setFont(new Font("Tekton Pro", Font.BOLD, 27));
		btnIstructions.setContentAreaFilled(false);
		btnIstructions.setFocusPainted(false);
		btnIstructions.setBorderPainted(false);
		btnIstructions.setBounds(831, 598, 185, 57);
		panel_main.add(btnIstructions);
		
		//---------------------------------End First Window--------------------------------//
		
		//--------------------------------Start Second Window------------------------------//
		
//		panelCheckBoard = new JPanel();
//		panelCheckBoard.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.RED));
//		panelCheckBoard.setBackground(Color.ORANGE);
//		panelCheckBoard.setBounds(1167, 105, 197, 494);
//		//panel_main.add(panelCheckBoard);
//		panelCheckBoard.setLayout(null);
//		
//		panelScore = new JPanel();
//		panelScore.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
//		panelScore.setBackground(Color.RED);
//		panelScore.setBounds(46, 22, 105, 44);
//		panelCheckBoard.add(panelScore);
//		panelScore.setLayout(null);
//		
//		lblScoreTitle = new JLabel("Score");
//		lblScoreTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		lblScoreTitle.setToolTipText("Score");
//		lblScoreTitle.setFont(new Font("Tekton Pro Ext", Font.BOLD, 18));
//		lblScoreTitle.setBounds(0, 0, 105, 44);
//		panelScore.add(lblScoreTitle);
//		
//		panelScoreTitle = new JPanel();
//		panelScoreTitle.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
//		panelScoreTitle.setBackground(Color.GREEN);
//		panelScoreTitle.setBounds(28, 52, 142, 62);
//		panelCheckBoard.add(panelScoreTitle);
//		panelScoreTitle.setLayout(null);
//		
//		lblScore = new JLabel("120");
//		lblScore.setToolTipText("Score");
//		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
//		lblScore.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 12));
//		lblScore.setBounds(10, 25, 122, 26);
//		panelScoreTitle.add(lblScore);
//		
//		panelTimeTitle = new JPanel();
//		panelTimeTitle.setLayout(null);
//		panelTimeTitle.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
//		panelTimeTitle.setBackground(Color.RED);
//		panelTimeTitle.setBounds(46, 138, 105, 44);
//		panelCheckBoard.add(panelTimeTitle);
//		
//		lblTimeTitle = new JLabel("Time");
//		lblTimeTitle.setToolTipText("Time");
//		lblTimeTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTimeTitle.setFont(new Font("Tekton Pro Ext", Font.BOLD, 18));
//		lblTimeTitle.setBounds(0, 0, 105, 44);
//		panelTimeTitle.add(lblTimeTitle);
//		
//		panelTime = new JPanel();
//		panelTime.setLayout(null);
//		panelTime.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
//		panelTime.setBackground(Color.GREEN);
//		panelTime.setBounds(28, 168, 142, 62);
//		panelCheckBoard.add(panelTime);
//		
//		lblTime = new JLabel("01:27");
//		lblTime.setToolTipText("Time");
//		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTime.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 12));
//		lblTime.setBounds(10, 25, 122, 26);
//		panelTime.add(lblTime);
//		
//		panelBulletsTitle = new JPanel();
//		panelBulletsTitle.setLayout(null);
//		panelBulletsTitle.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
//		panelBulletsTitle.setBackground(Color.RED);
//		panelBulletsTitle.setBounds(46, 255, 105, 44);
//		panelCheckBoard.add(panelBulletsTitle);
//		
//		lblBulletsTitle = new JLabel("Bullets");
//		lblBulletsTitle.setToolTipText("Bullets");
//		lblBulletsTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBulletsTitle.setFont(new Font("Tekton Pro Ext", Font.BOLD, 18));
//		lblBulletsTitle.setBounds(0, 0, 105, 44);
//		panelBulletsTitle.add(lblBulletsTitle);
//		
//		panelBullets = new JPanel();
//		panelBullets.setLayout(null);
//		panelBullets.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
//		panelBullets.setBackground(Color.GREEN);
//		panelBullets.setBounds(28, 285, 142, 62);
//		panelCheckBoard.add(panelBullets);
//		
//		lblBullets = new JLabel("5");
//		lblBullets.setToolTipText("Score");
//		lblBullets.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBullets.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 12));
//		lblBullets.setBounds(10, 25, 122, 26);
//		panelBullets.add(lblBullets);
//		
//		panelLifeTitle = new JPanel();
//		panelLifeTitle.setLayout(null);
//		panelLifeTitle.setBorder(new BevelBorder(BevelBorder.RAISED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
//		panelLifeTitle.setBackground(Color.RED);
//		panelLifeTitle.setBounds(46, 374, 105, 44);
//		panelCheckBoard.add(panelLifeTitle);
//		
//		lblLifeTitle = new JLabel("Life");
//		lblLifeTitle.setToolTipText("Score");
//		lblLifeTitle.setHorizontalAlignment(SwingConstants.CENTER);
//		lblLifeTitle.setFont(new Font("Tekton Pro Ext", Font.BOLD, 18));
//		lblLifeTitle.setBounds(0, 0, 105, 44);
//		panelLifeTitle.add(lblLifeTitle);
//		
//		panelLife = new JPanel();
//		panelLife.setLayout(null);
//		panelLife.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
//		panelLife.setBackground(Color.GREEN);
//		panelLife.setBounds(28, 404, 142, 62);
//		panelCheckBoard.add(panelLife);
//		
//		lblLife = new JLabel("3");
//		lblLife.setToolTipText("Score");
//		lblLife.setHorizontalAlignment(SwingConstants.CENTER);
//		lblLife.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 12));
//		lblLife.setBounds(10, 25, 122, 26);
//		panelLife.add(lblLife);
//		
//		//d.drawing();		
//		//panelCanvas = d;
//		panelCanvas.setBackground(SystemColor.desktop);
//		panelCanvas.setBorder(new LineBorder(new Color(0, 0, 0), 5));
//		panelCanvas.setBounds(10, 0, 1147, 749);
//		//panel_main.add(panelCanvas);
		
		
		//---------------------------------End Second Window-------------------------------//
		
	}
}
