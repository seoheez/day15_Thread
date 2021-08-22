package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");
		
		c.add(label);
		
		frame.setLocation(1000, 200);//가로, 세로 위치
		frame.setPreferredSize(new Dimension(200, 200));//프레임 크기
		frame.pack();//설정값 적용
		
//		Font font = new Font(null, Font.ITALIC, 32);
		Font font = new Font("바탕", Font.ITALIC, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//중지 됨.
		
		label.setText("안녕하세요");//글씨 내용 변경
	}
}
