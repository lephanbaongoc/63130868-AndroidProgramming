package ntu_63130868;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTuoi;
	private JTextField txtCanNang;
	private JTextField txtChieuCao;
	private JTextField txtKQ;
	private JTextField txtKhuyen;
	private JRadioButton rbtnNu;
	private JRadioButton rbtnNam;
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
		
		JRadioButton rbtnNu = new JRadioButton("Nữ");
		rbtnNu.setBackground(new Color(255, 255, 255));
		rbtnNu.setBounds(60, 45, 69, 23);
		panel.add(rbtnNu);
		rbtnNu.setSelected(true);
		rbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rbtnNam = new JRadioButton("Nam");
		rbtnNam.setBackground(new Color(255, 255, 255));
		rbtnNam.setBounds(174, 45, 62, 23);
		panel.add(rbtnNam);
		rbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		//Gộp rdbtn nam và nữ
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtnNam);
		bg.add(rbtnNu);
		
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
		
		txtTuoi = new JTextField();
		txtTuoi.setBackground(new Color(255, 255, 255));
		txtTuoi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTuoi.setBounds(113, 27, 96, 27);
		panel_1.add(txtTuoi);
		txtTuoi.setColumns(10);
		
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
		
		txtCanNang = new JTextField();
		txtCanNang.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCanNang.setColumns(10);
		txtCanNang.setBackground(Color.WHITE);
		txtCanNang.setBounds(112, 27, 96, 27);
		panel_1_1.add(txtCanNang);
		
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
		
		txtChieuCao = new JTextField();
		txtChieuCao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtChieuCao.setColumns(10);
		txtChieuCao.setBackground(Color.WHITE);
		txtChieuCao.setBounds(112, 27, 96, 27);
		panel_1_1_1.add(txtChieuCao);
		
		JLabel lblNewLabel_3 = new JLabel("mét");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(218, 34, 47, 14);
		panel_1_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Kết quả BMI:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(78, 391, 128, 35);
		contentPane.add(lblNewLabel_4);
		
		txtKQ = new JTextField();
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBackground(Color.WHITE);
		txtKQ.setBounds(196, 395, 96, 27);
		contentPane.add(txtKQ);
		
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
		
		txtKhuyen = new JTextField();
		txtKhuyen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKhuyen.setColumns(10);
		txtKhuyen.setBackground(Color.WHITE);
		txtKhuyen.setBounds(481, 395, 221, 27);
		contentPane.add(txtKhuyen);
	}
	public void XuLyBMI() {
		//Lấy dữ liệu từ điều khiển
		String Str_Tuoi = txtTuoi.getText();
		String Str_ChieuCao = txtChieuCao.getText();
		String Str_CanNang = txtCanNang.getText();
		
		//Chuyển kiểu dữ liệu
		double Tuoi = Double.parseDouble(Str_Tuoi);
		double ChieuCao = Double.parseDouble(Str_ChieuCao);
		double CanNang = Double.parseDouble(Str_CanNang);
		
		//Tính toán
		if(rbtnNu.isSelected()) {
			
		}
		if(rbtnNam.isSelected()) {
			
		}
	}
}
