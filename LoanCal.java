import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class LoanCal extends JFrame{


	private JPanel contentPane;
	private JTextField Amount;
	private JLabel lblInterestRate;
	private JLabel lblLoanTerms;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField r1;
	private JTextField r2;
	private JTextField r3;
	private JTextField r4;
	private JTextField r5;
	private JTextField r6;
	private JTextField r7;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JComboBox Loanterm;
	private JComboBox Interest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanCal frame = new LoanCal();
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
	public LoanCal() {
		setVisible(true);
		setTitle("Loan Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 234, 162));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Amount = new JTextField();
		Amount.setBackground(new Color(255, 255, 255));
		Amount.setBounds(210, 6, 202, 20);
		contentPane.add(Amount);
		Amount.setColumns(10);

		JLabel lblLoanAmount = new JLabel("Loan Amount(1,000-100,000):");
		lblLoanAmount.setForeground(new Color(0, 0, 0));
		lblLoanAmount.setFont(new Font("Arial", Font.BOLD, 12));
		lblLoanAmount.setBounds(10, 9, 183, 12);
		contentPane.add(lblLoanAmount);

		lblInterestRate = new JLabel(" Interest Rate Per Month(1-20%):");
		lblInterestRate.setFont(new Font("Arial", Font.BOLD, 12));
		lblInterestRate.setBounds(10, 51, 211, 12);
		contentPane.add(lblInterestRate);

		lblLoanTerms = new JLabel("Loan Terms( 6, 12, 18, 24, 30 or 36 months):");
		lblLoanTerms.setFont(new Font("Arial", Font.BOLD, 12));
		lblLoanTerms.setBounds(10, 93, 255, 12);
		contentPane.add(lblLoanTerms);

		lblNewLabel_4 = new JLabel("Results:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 169, 46, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Principal Amount (Loan Amount):");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 186, 255, 14);
		contentPane.add(lblNewLabel_5);

		r1 = new JTextField();
		r1.setBounds(244, 181, 149, 20);
		contentPane.add(r1);
		r1.setColumns(10);

		r2 = new JTextField();
		r2.setBounds(244, 212, 149, 20);
		contentPane.add(r2);
		r2.setColumns(10);

		r3 = new JTextField();
		r3.setBounds(244, 243, 149, 20);
		contentPane.add(r3);
		r3.setColumns(10);

		r4 = new JTextField();
		r4.setBounds(244, 274, 149, 20);
		contentPane.add(r4);
		r4.setColumns(10);

		r5 = new JTextField();
		r5.setBounds(244, 305, 149, 20);
		contentPane.add(r5);
		r5.setColumns(10);

		r6 = new JTextField();
		r6.setBounds(244, 336, 149, 20);
		contentPane.add(r6);
		r6.setColumns(10);

		r7 = new JTextField();
		r7.setBounds(244, 367, 149, 23);
		contentPane.add(r7);
		r7.setColumns(10);

		lblNewLabel_6 = new JLabel("Interest Rate per month:");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 217, 255, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Interest Amount per month:");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 242, 183, 21);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Loan Terms:");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_8.setBounds(10, 274, 172, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("Total Interest Amount:");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_9.setBounds(10, 305, 183, 14);
		contentPane.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("Total Loan Amount:");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_10.setBounds(10, 336, 211, 14);
		contentPane.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("Payment per month :");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_11.setBounds(10, 368, 211, 14);
		contentPane.add(lblNewLabel_11);

		JButton Total = new JButton("TOTAL");
		Total.setBackground(new Color(255, 218, 185));
		Total.setFont(new Font("Tahoma", Font.BOLD, 11));
		Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = 0;
				int interestR = 0;
				int terms = 0;

				amount = Integer.parseInt(Amount.getText());

				if (amount < 1000 || amount > 100000) {
					JOptionPane.showMessageDialog(null, "Error!");
					Amount.setText("");
					return;
				}
				interestR = Integer.parseInt((String)Interest.getSelectedItem());

				if (interestR < 1 || interestR > 20) {
					JOptionPane.showMessageDialog(null, "Error!");
					Interest.setSelectedItem("");
					return;
				}
				terms = Integer.parseInt((String) Loanterm.getSelectedItem());

				if (terms != 6 && terms != 12 && terms != 18 && terms != 24 && terms != 30 && terms != 36) {
					JOptionPane.showMessageDialog(null, "Error!");
					Loanterm.setSelectedItem("");
				}
				double Interest = interestR / 100.0;

				double interestAPM = amount * Interest;
				double totaliA = interestAPM * terms;
				double totalLA = amount + totaliA;
				double paymentPM = totalLA / terms;

				r1.setText("" + amount);
				r2.setText("" + Interest);
				r3.setText("" + interestAPM);
				r4.setText("" + terms);
				r5.setText("" + totaliA);
				r6.setText("" + totalLA);
				r7.setText("" + String.format("%.2f", paymentPM));
			}
		});
		Total.setBounds(291, 133, 89, 23);
		contentPane.add(Total);

		JButton Clear = new JButton("CLEAR");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r1.setText("");
				r2.setText("");
				r3.setText("");
				r4.setText("");
				r5.setText("");
				r6.setText("");
				r7.setText("");

				Amount.setText("");
				Interest.getSelectedItem();
				Loanterm.getSelectedItem();

			}

		});
		Clear.setBackground(new Color(255, 218, 185));
		Clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		Clear.setBounds(82, 133, 89, 23);
		contentPane.add(Clear);
		
		
		
	String [] LoanTerms = {"6", "12", "18","24","30","36"};
	Loanterm = new JComboBox(LoanTerms);
	Loanterm.addActionListener(e -> {
			String selected = (String) Loanterm.getSelectedItem();
			
		});
		Loanterm.setBounds(276, 89, 136, 20);
		contentPane.add(Loanterm);
		
		String [] InterestRate = {"1", "2", "3","4","5","6", "7", "8", "9", "10", "11", "12", "13","14","15","16", "17", "18", "19", "20"};
		Interest = new JComboBox(InterestRate);
		Interest.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Interest.addActionListener(e -> {
			String selected = (String) Loanterm.getSelectedItem();
			
	});
		Interest.setBounds(218, 47, 194, 20);
		contentPane.add(Interest);
	}
}