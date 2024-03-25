package ntu_63130868;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Create the frame.
	 */
	public AppBMI() {
		setTitle("BMI CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(76, 67, 281, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chọn giới tính:");
		lblNewLabel.setBounds(10, 11, 119, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setBackground(new Color(255, 255, 255));
		rdbtnNu.setBounds(60, 45, 69, 23);
		panel.add(rdbtnNu);
		rdbtnNu.setSelected(true);
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBackground(new Color(255, 255, 255));
		rdbtnNam.setBounds(174, 45, 62, 23);
		panel.add(rdbtnNam);
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(421, 67, 281, 76);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Độ tuổi:");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 11, 78, 27);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(111, 27, 96, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập thông tin của bạn");
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(217, 21, 320, 35);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(421, 200, 281, 76);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cân nặng:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(10, 11, 96, 27);
		panel_1_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(112, 27, 96, 27);
		panel_1_1.add(textField_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("kilogram");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(218, 35, 47, 14);
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setBounds(76, 200, 281, 76);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Chiều cao:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(10, 11, 96, 27);
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(112, 27, 96, 27);
		panel_1_1_1.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("mét");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(218, 34, 47, 14);
		panel_1_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả BMI:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(78, 391, 128, 35);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(196, 395, 96, 27);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("KIỂM TRA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyBMI();
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(335, 312, 115, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_1 = new JLabel("Lời khuyên:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(368, 391, 103, 35);
		contentPane.add(lblNewLabel_4_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(481, 395, 221, 27);
		contentPane.add(textField_4);
	}
	public void XuLyBMI() {
		
	}
}
