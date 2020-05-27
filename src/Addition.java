import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTable;

public class Addition {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addition window = new Addition();
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
	public Addition() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblRestApiTesting = new JLabel("Rest API Testing");
		lblRestApiTesting.setBounds(152, 11, 226, 23);
		lblRestApiTesting.setForeground(Color.RED);
		frame.getContentPane().add(lblRestApiTesting);
		
		JButton btnGetRequest = new JButton("GET Request");
		btnGetRequest.setBounds(76, 45, 111, 23);
		frame.getContentPane().add(btnGetRequest);
		
		JButton btnPostRequest = new JButton("POST Request");
		btnPostRequest.setBounds(219, 45, 101, 23);
		frame.getContentPane().add(btnPostRequest);
		
		JButton btnPutRequest = new JButton("PUT Request");
		btnPutRequest.setBounds(152, 95, 111, 23);
		frame.getContentPane().add(btnPutRequest);
	}
}
