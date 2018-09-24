import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class VentanaJuego extends JFrame {

	private JPanel contentPane;
	private CocheJuego cj = new CocheJuego();
	Coche coche1 = new Coche();
	boolean sigue = true;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//	}
		
	public VentanaJuego() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Coche coche1 = new Coche();
		JButton btnAcelera = new JButton("Acelera");
		btnAcelera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coche1.setMiVelocidad(coche1.getMiVelocidad() + 5);
				System.out.println(coche1.getMiVelocidad());
				
			}	
		});
		
		btnAcelera.setBounds(38, 499, 115, 29);
		contentPane.add(btnAcelera);
		
		JButton btnFrena = new JButton("Frena");
		btnFrena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coche1.setMiVelocidad(coche1.getMiVelocidad() - 5);
				System.out.println(coche1.getMiVelocidad());
			}
		});
		btnFrena.setBounds(194, 499, 115, 29);
		contentPane.add(btnFrena);
		
		JButton btnGiraIz = new JButton("Gira iz.");
		btnGiraIz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coche1.setMiDireccionActul((coche1.getMiDireccionActul() - 1));
				System.out.println(coche1.getMiDireccionActul());
			}
		});
		btnGiraIz.setBounds(344, 499, 115, 29);
		contentPane.add(btnGiraIz);
		
		JButton btnGiraDer = new JButton("Gira der.");
		btnGiraDer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coche1.setMiDireccionActul((coche1.getMiDireccionActul() + 1));
				System.out.println(coche1.getMiDireccionActul());
			}
		});
		btnGiraDer.setBounds(494, 499, 115, 29);
		contentPane.add(btnGiraDer);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 57, 479, 393);
		panel.add(cj.getlCoche());
		contentPane.add(panel);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				sigue = false;
			}
		});
		
		Thread hilo = new Thread() {
			public void run() {
				
					
						try {
							while(sigue) {
								coche1.mueve();
								cj.getlCoche().setRotacion(coche1.getMiDireccionActul());
								panel.repaint();
								Thread.sleep(40);
								if(coche1.getPosY()<=0 || coche1.getPosY()>= 450 || coche1.getPosX()<=0 || coche1.getPosX()>= 700) {
									coche1.girar(Math.PI);
									cj.getlCoche().setRotacion(coche1.getMiDireccionActul());
									panel.repaint();
								}
							}
							
							}catch (Exception e) {
							
							
						
							}	
						
					}
				
					
				};
			hilo.start();
	}
}
	
		
	
	

