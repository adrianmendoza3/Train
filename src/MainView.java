
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MainView {

	/*
	 * 
	 * All robots						buttonsPanel
		Comboboxes for adding			combo1
		button for adding				add1
		capacity spinner 				newTrainCapacity
		deploy button					deploy
		panels per station				panel1
		text area per station			station1
		scrollpane per text area			sp1
		Station Label					lblStat1
		Add passengers label				lblAddPassengers
		To Label							lblTo
		From Label						lblFrom
		Train Capacity Label				lblTrainCap
		Number of Trains Label			lblNoOfTrains
		Train Count						lblTrainCount
		Train Capacities					trainCaps
	 */
	
	
	private JFrame frame;
	private JComboBox<String> combo1, combo2, combo3, combo4, combo5, combo6, combo7, combo8;
	private JButton add1, add2, add3, add4, add5, add6, add7, add8, deploy;
	private JSpinner newTrainCapacity;
	private JLabel lblStat1, lblStat2, lblStat3, lblStat4, lblStat5, lblStat6, lblStat7, lblStat8, lblAddPassengers, lblTo, lblFrom, lblTrainCap, lblNoOfTrains, lblTrainCount;
	private JScrollPane sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8;
	private JTextArea station1, station2, station3, station4, station5, station6, station7, station8;
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
	private int trainNo = 0;
	private int passengerNo = 0;
	private MainControl control;
	private ArrayList<Integer> trainCaps = new ArrayList<Integer>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		new MainView();
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
		control = new MainControl(getView());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(11, 43, 116));
		frame.setBounds(100, 100, 1100, 750);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(6, 6, 1088, 716);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(new Color(0, 255, 255));
		buttonsPanel.setBounds(848, 6, 234, 704);
		panel.add(buttonsPanel);
		buttonsPanel.setLayout(null);
		
		add1 = new JButton("Station 1");
		add1.setBounds(0, 49, 117, 29);
		buttonsPanel.add(add1);
		
		add2 = new JButton("Station 2");
		add2.setBounds(0, 87, 117, 29);
		buttonsPanel.add(add2);
		
		lblAddPassengers = new JLabel("Add passengers");
		lblAddPassengers.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblAddPassengers.setBounds(17, 6, 162, 16);
		buttonsPanel.add(lblAddPassengers);
		
		lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblFrom.setBounds(10, 32, 96, 16);
		buttonsPanel.add(lblFrom);
		
		lblTo = new JLabel("To");
		lblTo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTo.setBounds(120, 32, 73, 16);
		buttonsPanel.add(lblTo);
		
		add3 = new JButton("Station 3");
		add3.setBounds(0, 128, 117, 29);
		buttonsPanel.add(add3);
		
		add4 = new JButton("Station 4");
		add4.setBounds(0, 169, 117, 29);
		buttonsPanel.add(add4);
		
		add5 = new JButton("Station 5");
		add5.setBounds(0, 210, 117, 29);
		buttonsPanel.add(add5);
		
		add6 = new JButton("Station 6");
		add6.setBounds(0, 251, 117, 29);
		buttonsPanel.add(add6);
		
		add7 = new JButton("Station 7");
		add7.setBounds(0, 292, 117, 29);
		buttonsPanel.add(add7);
		
		add8 = new JButton("Station 8");
		add8.setBounds(0, 333, 117, 29);
		buttonsPanel.add(add8);
		
		combo1 = new JComboBox<String>();
		combo1.setBounds(116, 50, 118, 27);
		buttonsPanel.add(combo1);	
		for(int i=1; i<9; i++) {
			if(i != 1)
			combo1.addItem("Station " + i);
		}
		combo1.setSelectedIndex(0);
		
		combo2 = new JComboBox<String>();
		combo2.setBounds(116, 88, 118, 27);
		buttonsPanel.add(combo2);
		for(int i=1; i<9; i++) {
			if(i != 2)
			combo2.addItem("Station " + i);
		}
		combo2.setSelectedIndex(1);

		
		combo3 = new JComboBox<String>();
		combo3.setBounds(116, 129, 118, 27);
		buttonsPanel.add(combo3);
		for(int i=1; i<9; i++) {
			if(i != 3)
			combo3.addItem("Station " + i);
		}
		combo3.setSelectedIndex(2);
		
		combo4 = new JComboBox<String>();
		combo4.setBounds(116, 170, 118, 27);
		buttonsPanel.add(combo4);
		for(int i=1; i<9; i++) {
			if(i != 4)
			combo4.addItem("Station " + i);
		}
		combo4.setSelectedIndex(3);
		
		combo5 = new JComboBox<String>();
		combo5.setBounds(116, 210, 118, 27);
		buttonsPanel.add(combo5);
		for(int i=1; i<9; i++) {
			if(i != 5)
			combo5.addItem("Station " + i);
		}
		combo5.setSelectedIndex(4);
		
		combo6 = new JComboBox<String>();
		combo6.setBounds(116, 252, 118, 27);
		buttonsPanel.add(combo6);
		for(int i=1; i<9; i++) {
			if(i != 6)
			combo6.addItem("Station " + i);
		}
		combo6.setSelectedIndex(5);
		
		combo7 = new JComboBox<String>();
		combo7.setBounds(116, 293, 118, 27);
		buttonsPanel.add(combo7);
		for(int i=1; i<9; i++) {
			if(i != 7)
			combo7.addItem("Station " + i);
		}
		combo7.setSelectedIndex(6);
		
		combo8 = new JComboBox<String>();
		combo8.setBounds(116, 334, 118, 27);
		buttonsPanel.add(combo8);
		for(int i=1; i<9; i++) {
			if(i != 8)
			combo8.addItem("Station " + i);
		}
		combo8.setSelectedIndex(0);
		
		newTrainCapacity = new JSpinner();
		newTrainCapacity.setBounds(75, 408, 84, 26);
		buttonsPanel.add(newTrainCapacity);
		newTrainCapacity.setValue(5);
		
		lblTrainCap = new JLabel("Train Capacity");
		lblTrainCap.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblTrainCap.setBounds(58, 385, 117, 16);
		buttonsPanel.add(lblTrainCap);
		
		deploy = new JButton("Deploy");
		deploy.setBounds(58, 439, 117, 29);
		buttonsPanel.add(deploy);
		
		lblNoOfTrains = new JLabel("Number of Trains Deployed");
		lblNoOfTrains.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNoOfTrains.setBounds(8, 490, 222, 16);
		buttonsPanel.add(lblNoOfTrains);
		
		lblTrainCount = new JLabel("0");
		lblTrainCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrainCount.setFont(new Font("Lucida Grande", Font.BOLD, 55));
		lblTrainCount.setBounds(36, 500, 162, 156);
		buttonsPanel.add(lblTrainCount);
		
		panel1 = new JPanel();
		panel1.setBackground(new Color(123, 104, 238));
		panel1.setBounds(6, 6, 269, 227);
		panel.add(panel1);
		panel1.setLayout(null);
		
		lblStat1 = new JLabel("Station 1");
		lblStat1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat1.setForeground(new Color(250, 240, 230));
		lblStat1.setBounds(91, 6, 87, 32);
		panel1.add(lblStat1);
		
		sp1 = new JScrollPane();
		sp1.setBounds(6, 46, 257, 175);
		panel1.add(sp1);
		
		station1 = new JTextArea();
		station1.setEditable(false);
		station1.setLineWrap(true);
		sp1.setViewportView(station1);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(123, 104, 238));
		panel2.setBounds(287, 6, 269, 227);
		panel.add(panel2);
		panel2.setLayout(null);
		
		lblStat2 = new JLabel("Station 2");
		lblStat2.setForeground(new Color(250, 240, 230));
		lblStat2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat2.setBounds(91, 6, 87, 32);
		panel2.add(lblStat2);
		
		sp2 = new JScrollPane();
		sp2.setBounds(6, 46, 257, 175);
		panel2.add(sp2);
		
		station2 = new JTextArea();
		station2.setEditable(false);
		station2.setLineWrap(true);
		sp2.setViewportView(station2);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(new Color(123, 104, 238));
		panel3.setBounds(568, 6, 269, 227);
		panel.add(panel3);
		
		lblStat3 = new JLabel("Station 3");
		lblStat3.setForeground(new Color(250, 240, 230));
		lblStat3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat3.setBounds(91, 6, 87, 32);
		panel3.add(lblStat3);
		
		sp3 = new JScrollPane();
		sp3.setBounds(6, 46, 257, 175);
		panel3.add(sp3);
		
		station3 = new JTextArea();
		station3.setEditable(false);
		station3.setLineWrap(true);
		sp3.setViewportView(station3);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(new Color(123, 104, 238));
		panel4.setBounds(6, 245, 269, 227);
		panel.add(panel4);
		
		lblStat4 = new JLabel("Station 4");
		lblStat4.setForeground(new Color(250, 240, 230));
		lblStat4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat4.setBounds(91, 6, 87, 32);
		panel4.add(lblStat4);
		
		sp4 = new JScrollPane();
		sp4.setBounds(6, 46, 257, 175);
		panel4.add(sp4);
		
		station4 = new JTextArea();
		station4.setEditable(false);
		station4.setLineWrap(true);
		sp4.setViewportView(station4);
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(new Color(123, 104, 238));
		panel5.setBounds(287, 245, 269, 227);
		panel.add(panel5);
		
		lblStat5 = new JLabel("Station 5");
		lblStat5.setForeground(new Color(250, 240, 230));
		lblStat5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat5.setBounds(91, 6, 87, 32);
		panel5.add(lblStat5);
		
		sp5 = new JScrollPane();
		sp5.setBounds(6, 46, 257, 175);
		panel5.add(sp5);
		
		station5 = new JTextArea();
		station5.setEditable(false);
		station5.setLineWrap(true);
		sp5.setViewportView(station5);
		
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBackground(new Color(123, 104, 238));
		panel6.setBounds(568, 245, 269, 227);
		panel.add(panel6);
		
		lblStat6 = new JLabel("Station 6");
		lblStat6.setForeground(new Color(250, 240, 230));
		lblStat6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat6.setBounds(91, 6, 87, 32);
		panel6.add(lblStat6);
		
		sp6 = new JScrollPane();
		sp6.setBounds(6, 46, 257, 175);
		panel6.add(sp6);
		
		station6 = new JTextArea();
		station6.setLineWrap(true);
		station6.setEditable(false);
		sp6.setViewportView(station6);
		
		panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBackground(new Color(123, 104, 238));
		panel7.setBounds(147, 484, 269, 227);
		panel.add(panel7);
		
		lblStat7 = new JLabel("Station 7");
		lblStat7.setForeground(new Color(250, 240, 230));
		lblStat7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat7.setBounds(103, 6, 87, 32);
		panel7.add(lblStat7);
		
		sp7 = new JScrollPane();
		sp7.setBounds(6, 46, 257, 175);
		panel7.add(sp7);
		
		station7 = new JTextArea();
		station7.setLineWrap(true);
		station7.setEditable(false);
		sp7.setViewportView(station7);
		
		panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBackground(new Color(123, 104, 238));
		panel8.setBounds(437, 483, 269, 227);
		panel.add(panel8);
		
		lblStat8 = new JLabel("Station 8");
		lblStat8.setForeground(new Color(250, 240, 230));
		lblStat8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblStat8.setBounds(91, 6, 87, 32);
		panel8.add(lblStat8);
		
		sp8 = new JScrollPane();
		sp8.setBounds(6, 46, 257, 175);
		panel8.add(sp8);
		
		station8 = new JTextArea();
		station8.setLineWrap(true);
		station8.setEditable(false);
		sp8.setViewportView(station8);
		
		buttonActions();
		
		frame.revalidate();
		frame.repaint();
	}
	
		public MainView getView() {
			return this;
		}
	
		public void buttonActions() {

			add1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo1.getSelectedItem().toString().substring(8).trim());
//					station1.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 1, stationNo);
				}
			});
			
			add2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo2.getSelectedItem().toString().substring(8).trim());
//					station2.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 2, stationNo);
				}
			});
			
			add3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo3.getSelectedItem().toString().substring(8).trim());
//					station3.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 3, stationNo);
				}
			});
			
			add4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo4.getSelectedItem().toString().substring(8).trim());
//					station4.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 4, stationNo);
				}
			});
			
			add5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo5.getSelectedItem().toString().substring(8).trim());
//					station5.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 5, stationNo);
				}
			});
			
			add6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo6.getSelectedItem().toString().substring(8).trim());
//					station6.append("New Passenger until Station " + stationNo +"\n");
					control.addPassenger(passengerNo, 6, stationNo);
				}
			});
			
			add7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo7.getSelectedItem().toString().substring(8).trim());
//					station7.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 7, stationNo);
				}
			});
			
			add8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int stationNo = Integer.parseInt(combo8.getSelectedItem().toString().substring(8).trim());
//					station8.append("New Passenger until Station " + stationNo +"\n");
					passengerNo++;
					control.addPassenger(passengerNo, 8, stationNo);
				}
			});
			
			deploy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(trainNo < 16) {
						trainNo++;
						lblTrainCount.setText("" + trainNo);
						
						control.addTrain(trainNo, Integer.parseInt(newTrainCapacity.getValue().toString()));
						
						/*
							trainCaps.add(Integer.parseInt(newTrainCapacity.getValue().toString()));
							station2.append(Integer.parseInt(newTrainCapacity.getValue().toString()) + "\n");
							station3.append(trainCaps.get(trainNo-1) + "\n");
							station1.append("Train#"+ trainNo + " now arriving\n");
						*/
					}
					else {
						JOptionPane.showMessageDialog(null, "Maximum Number of Trains Deployed");
					}
				}
			});
		}
		
		public JTextArea getStation(int num) {
			switch(num+1) {
				case 1: return station1;
				case 2: return station2;
				case 3: return station3;
				case 4: return station4;
				case 5: return station5;
				case 6: return station6;
				case 7: return station7;
				case 8: return station8;
				default: return null;

			}
		}
		
		public JTextArea getStation1() {
			return station1;
		}

		public JTextArea getStation2() {
			return station2;
		}

		public JTextArea getStation3() {
			return station3;
		}

		public JTextArea getStation4() {
			return station4;
		}

		public JTextArea getStation5() {
			return station5;
		}

		public JTextArea getStation6() {
			return station6;
		}

		public JTextArea getStation7() {
			return station7;
		}

		public JTextArea getStation8() {
			return station8;
		}

		public ArrayList<Integer> getTrainCaps() {
			return trainCaps;
		}	
}
