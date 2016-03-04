import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.MEDEA_3);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//EYE1
		px.setPixel(30, 13, Color.YELLOW);
		px.setPixel(30, 15, Color.YELLOW);
		
		//EYE2
		px.setPixel(31, 13, Color.YELLOW);
		px.setPixel(31, 15, Color.YELLOW);
		
		//SMILE
		px.setPixel(32, 10, Color.YELLOW);
		px.setPixel(32, 18, Color.YELLOW);
		px.setPixel(33, 11, Color.YELLOW);
		px.setPixel(33, 17, Color.YELLOW);
		px.setPixel(34, 12, Color.YELLOW);
		px.setPixel(34, 16, Color.YELLOW);
		
		px.setPixel(35, 13, Color.YELLOW);
		px.setPixel(35, 14, Color.YELLOW);
		px.setPixel(35, 15, Color.YELLOW);

		
	}

}
