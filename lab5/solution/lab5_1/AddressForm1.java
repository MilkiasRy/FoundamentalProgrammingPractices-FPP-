package lab5_1;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddressForm1 extends JFrame {
	private JPanel topPanel;
	private JPanel namePanel;
	private JPanel streetPanel;
	private JTextField street;
	private JTextField city;
	private JTextField state;
	private JTextField zip;
	private JPanel cityPanel;
	private JPanel middlePanel;
	private JPanel statePanel;
	private JPanel zipPanel;
	private JPanel bottomPanel;
	private JPanel buttonPanel;
	private JTextField name;

	public AddressForm1() {
		initializeWindow();
		topPanel();
		middlePanel();
		bottomPanel();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		getContentPane().add(mainPanel); // throw panel on the Frame

	}

	private void topPanel() {
		topPanel = new JPanel();
		namePanel();
		streetPanel();
		cityPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(namePanel, BorderLayout.WEST);
		topPanel.add(streetPanel, BorderLayout.CENTER);
		topPanel.add(cityPanel, BorderLayout.EAST);
	}

	
	private void namePanel() {
	
		namePanel = new JPanel();
		JLabel label1 = new JLabel("Name");
		this.name = new JTextField(10);
		namePanel.setLayout(new BorderLayout());
		namePanel.add(label1, BorderLayout.NORTH); // throw labels on the Panel
		namePanel.add(name, BorderLayout.SOUTH); // throw textFields on the
													// Panel
	}

	private void streetPanel() {
		streetPanel = new JPanel();
		JLabel label1 = new JLabel("Street");
		this.street = new JTextField(10);
		streetPanel.setLayout(new BorderLayout());
		streetPanel.add(label1, BorderLayout.NORTH); // throw labels on the
														// Panel
		streetPanel.add(street, BorderLayout.SOUTH); // throw textFields on the
														// Panel
	}

	private void cityPanel() {
		cityPanel = new JPanel();
		JLabel label1 = new JLabel("City");
		this.city = new JTextField(10);
		cityPanel.setLayout(new BorderLayout());
		cityPanel.add(label1, BorderLayout.NORTH); // throw labels on the Panel
		cityPanel.add(city, BorderLayout.SOUTH); // throw textFields on the
													// Panel
	}

	private void middlePanel() {
		middlePanel = new JPanel();
		statePanel();
		zipPanel();

		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		middlePanel.add(statePanel, BorderLayout.WEST);
		middlePanel.add(zipPanel, BorderLayout.EAST);
	}
	private void zipPanel() {
		zipPanel = new JPanel();
		JLabel label1 = new JLabel("Zip");
		this.zip = new JTextField(10);
		zipPanel.setLayout(new BorderLayout());
		zipPanel.add(label1, BorderLayout.NORTH); // throw labels on the Panel
		zipPanel.add(zip, BorderLayout.SOUTH); // throw textFields on the Panel
	}


	private void statePanel() {
		statePanel = new JPanel();
		JLabel label1 = new JLabel("State");
		this.state = new JTextField(10);
		statePanel.setLayout(new BorderLayout());
		statePanel.add(label1, BorderLayout.NORTH); // throw labels on the Panel
		statePanel.add(state, BorderLayout.SOUTH); // throw textFields on the
													// Panel
	}

	
	private void bottomPanel() {
		bottomPanel = new JPanel();
		buttonPanel();

		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		bottomPanel.add(buttonPanel, BorderLayout.NORTH);
	}

	private void buttonPanel() {
		buttonPanel = new JPanel();
		JButton button = new JButton("Submit");
		button.addActionListener(new MyButtonListener());
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(button, BorderLayout.CENTER); // throw textFields on the
														// Panel
	}

	class MyButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String fname = name.getText();
			String st = street.getText();
			String ct = city.getText();
			String stt = state.getText();
			String zipc = zip.getText();

			System.out.printf(" %s \n %s \n %s , %s  %s ", fname, st, ct, stt,
					zipc);
		}
		
	}

	public void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		setSize(550, 200);
		centerFrameOnDesktop(this);

		setResizable(false);
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddressForm1 mf = new AddressForm1();
				mf.setVisible(true);
			}
		});
	}

}
