import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;

	JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
	JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");

	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
	JLabel LInternationalFlight1 = new JLabel("<html><B>International Flight Booking</B></html>");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final Object[] col1 ={ "From", "To", "Price", "Time" };
	final Object[] col2 = { "From", "To", "Price", "Time" };
	final Object[] col3 = { "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "Trivandrum", "Bangalore", "3125", "16:30" }, { "Trivandrum", "Chennai ", "3225", "19:00" }, { "Trivandrum", "Delhi", "1425 ", "08:30" }, { "Trivandrum", "Goa", "1025 ", "09:50" }, { "Trivandrum", "Hyderabad", "1525", "11:00" }, { "Trivandrum", "Kolkata", "3825 ", "05:30" }, { "Trivandrum", "Lucknow", "3025 ", "05:30" }, { "Trivandrum", "Mumbai", "1725", "12:00" }, { "Trivandrum", "Vishakapatnam", "3725", "19:00" } };
	final Object[][] row2 = { { "Trivandrum", "Bali", "21485", "06:20" }, { "Trivandrum", "Bangkok", "9000", "20:45" }, { "Trivandrum", "Cairo", "22975", "10:25" }, { "Trivandrum", "CapeTown", "42500", "16:45" }, { "Trivandrum", "Chicago", "35000", "06:30" }, { "Trivandrum", "Dubai", "12000", "08:15" }, { "Trivandrum", "Frankfurt", "18500", "06:50" }, { "Trivandrum", "HongKong", "20845", "12:00" }, { "Trivandrum", "Istanbul", "22000", "10:45" }, { "Trivandrum", "London", "22600", "14:35" }, { "Trivandrum", "LosAngeles", "35000", "22:00" }, { "Trivandrum", "Melbourne", "27800", "21:15" }, { "Trivandrum", "New York", "32000", "08:50" }, { "Trivandrum", "Paris", "18500", "18:45" }, { "Trivandrum", "Rome", "19900", "20:00"}, { "Trivandrum", "SanFrancisco", "35000", "12:00"}, { "Trivandrum", "shanghai", "24430", "10:15" }, { "Trivandrum", "Singapore", "9000", "21:10" }, { "Trivandrum", "Sydney", "27800", "12:00"}, { "Trivandrum", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "Trivandrum", "Bangalore", "9375", "16:30" }, { "Trivandrum", "Chennai ", "9675", "19:00" }, { "Trivandrum", "Delhi", "4275", "08:30" }, { "Trivandrum", "Goa", "3075", "09:50" }, { "Trivandrum", "Hyderabad", "4575", "11:00" }, { "Trivandrum", "Kolkata", "11475", "05:30" }, { "Trivandrum", "Lucknow", "9075", "05:30" }, { "Trivandrum", "Mumbai", "5175", "12:00" }, { "Trivandrum", "Vishakapatnam", "11175", "19:00" } };
	final Object[][] row4 = { { "Trivandrum", "Bali", "64455", "06:20" }, { "Trivandrum", "Bangkok", "27000", "20:45" }, { "Trivandrum", "Cairo", "68925", "10:25" }, { "Trivandrum", "CapeTown", "37500", "16:45" }, { "Trivandrum", "Chicago", "105000", "06:30" }, { "Trivandrum", "Dubai", "36000", "08:15" }, { "Trivandrum", "Frankfurt", "55500", "06:50" }, { "Trivandrum", "HongKong", "62535", "12:00" }, { "Trivandrum", "Istanbul", "66000", "10:45" }, { "Trivandrum", "London", "67800", "14:35" }, { "Trivandrum", "LosAngeles", "105000", "22:00" }, { "Trivandrum", "Melbourne", "83400", "21:15" }, { "Trivandrum", "New York", "96000", "08:50" }, { "Trivandrum", "Paris", "55500", "18:45" }, { "Trivandrum", "Rome", "59700", "20:00" }, { "Trivandrum", "SanFrancisco", "105000", "12:00" }, { "Trivandrum", "shanghai", "73290", "10:15" }, { "Trivandrum", "Singapore", "27000", "21:10"}, { "Trivandrum", "Sydney", "83400", "12:00"}, { "Trivandrum", "Toronto", "105000", "17:00" } };

	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col2);
	JTable TDomesticFlight1 = new JTable(row3, col3);
	JTable TInternationalFlight1 = new JTable(row4, col2);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("img/economic.jpg");
	Icon img2 = new ImageIcon("img/business.jpg");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.jpg");

	JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);

	public LoginPage()
	{
		WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));

		PFlightTypes.setBackground(Color.white);
		PLogin.setBackground(Color.white);
		PFlightDetails.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);

		PFlightTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,350, 340);
		PFlightDetails.setBounds(0,340,790,200);


		LUserName = new JLabel("         User Name ");
		LPassword = new JLabel("         Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		TPPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);

		LDomesticFlight1.setBounds(60, 60, 138, 20);
		LInternationalFlight1.setBounds(60, 100, 153, 20);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);

		PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);

		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		PFlightTypes.add(LEconomic);
		PFlightTypes.add(LBusiness);
		PFlightTypes.add(LEconomic1);
		PFlightTypes.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);


		LDomesticFlight.setBounds(60, 60, 100, 25);
		LInternationalFlight.setBounds(60, 100, 120, 25);

		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		LDomesticFlight.addMouseListener(new mouse1(this, true));
		LInternationalFlight.addMouseListener(new mouse1(this, false));

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));

		LBusiness1.addMouseListener(new mouse2(this, true));
		LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'a','d','m','i','n','\0'};
	JFrame f;
	String sCheck,sCheck1="admin";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PLogin.add(type.LDomesticFlight1);
			type.PLogin.add(type.LInternationalFlight1);

			type.PLogin.remove(type.LUserName);
			type.PLogin.remove(type.TFUserName);
			type.PLogin.remove(type.LPassword);
			type.PLogin.remove(type.TPPassword);
			type.PLogin.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 6 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type);
		else
			new InternationalFlight(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}

public class InternationalFlight extends JFrame
{
	JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LImg1, LImg2, LNotes;
	JTextField TFBookingDate;
	Icon img1, img2;
	JButton BFindFlight;
	JPanel PPanel1, PPanel2;

	LoginPage type1;

	public InternationalFlight(LoginPage type1)
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"Mumbai","Chennai","Delhi","Bengaluru"};
		String[] sItem2={"Bali","Bangkok","Cairo","CapeTown","Chicago","Dubai","Frankfurt","HongKong","Istanbul","London","LosAngeles","Melbourne","New York","Paris","Rome","SanFrancisco","shanghai","Singapore","Sydney","Toronto"};
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(500,200));

		LBookingDetails = new JLabel("<html><b><font color=\"#C71585\">Booking Details</font></b></html>");
		LFrom = new JLabel("From          :");
		LTo = new JLabel("To               :");
		LBookingDate = new JLabel("Booking Date:");
		LClass = new JLabel("Class         :");

		CBFrom = new JComboBox(sItem1);
		CBTo = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(Color.red);

		img1=new ImageIcon("map1.jpg");
		LImg1 = new JLabel(img1);

		BFindFlight = new JButton("Find Flight");

		LBookingDetails.setBounds(20,3,100,20);

		LFrom.setBounds(20,40,100,20);
		CBFrom.setBounds(100,40,100,20);

		LTo.setBounds(20,100,100,20);
		CBTo.setBounds(100,100,100,20);

		LBookingDate.setBounds(14,160,100,20);
		TFBookingDate.setBounds(100,160,100,20);
		LDate.setBounds(210,160,100,20);

		LClass.setBounds(20,220,100,20);
		CBClass.setBounds(100,220,100,20);

		BFindFlight.setBounds(50,270,100,25);

		LImg1.setBounds(0,290,495,260);

		PPanel1.add(LBookingDetails);
		PPanel1.add(LFrom);
		PPanel1.add(CBFrom);
		PPanel1.add(LTo);
		PPanel1.add(CBTo);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(CBClass);
		PPanel1.add(BFindFlight);
		PPanel1.add(LImg1);
		PPanel1.setBackground(Color.white);

		c.add(PPanel1,BorderLayout.WEST);

		PPanel2 = new JPanel(null);
		PPanel2.setPreferredSize(new Dimension(320,160));

		LPassengerDetails=new JLabel("<html><b><font color=\"#C71585\">PassengerDetails</font></b></html>");

		LAdult = new JLabel("Adults(12+)");

		LChildren = new JLabel("Children(2-11)");
		LInfant = new JLabel("Infants(under 2)");

		String[] item4={"1","2","3","4","5","6"};
		CBAdult = new JComboBox(item4);

		String[] item5={"0","1","2","3","4"};
		CBChildren = new JComboBox(item5);

		String[] item6={"0","1","2","3"};
		CBInfant = new JComboBox(item6);

		img2 = new ImageIcon("note_bg.gif");
		LImg2 = new JLabel(img2);
		LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");

		LPassengerDetails.setBounds(40,3,100,20);

		LAdult.setBounds(40,40,100,20);
		CBAdult.setBounds(140,40,100,20);

		LChildren.setBounds(40,105,100,20);
		CBChildren.setBounds(140,105,100,20);

		LInfant.setBounds(40,170,100,20);
		CBInfant.setBounds(140,170,100,20);

		LImg2.setBounds(16,220,320,200);
		LNotes.setBounds(55,240,380,180);

		PPanel2.add(LPassengerDetails);
		PPanel2.add(LAdult);
		PPanel2.add(LChildren);
		PPanel2.add(LInfant);
		PPanel2.add(CBAdult);
		PPanel2.add(CBChildren);
		PPanel2.add(CBInfant);

		PPanel2.add(LNotes);
		PPanel2.add(LImg2);

		PPanel2.setBackground(Color.white);

		c.add(PPanel2,BorderLayout.EAST);

		setSize(795,580);
		setVisible(true);

		BFindFlight.addActionListener(new button2(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new InternationalFlight(type1);
	}
}

class button2 implements ActionListener
{
	InternationalFlight type;
	LoginPage type1;
	button2(InternationalFlight type, LoginPage type1)
	{
		this.type = type;
		this.type1 = type1;
	}
	public void actionPerformed(ActionEvent e)
	{
		String sFrom = (String)type.CBFrom.getSelectedItem();
		String sTo = (String)type.CBTo.getSelectedItem();
		String sClass = (String)type.CBClass.getSelectedItem();
		String sBookingDate = type.TFBookingDate.getText();
		Integer iPrice=0;
		String sTime="";


		Integer iAdult = Integer.parseInt((String)type.CBAdult.getSelectedItem());
		Integer iChildren = Integer.parseInt((String)type.CBChildren.getSelectedItem());
		Integer iInfant = Integer.parseInt((String)type.CBInfant.getSelectedItem());

		int i = 0;

		if(sClass.equals("Economic"))
		{
			try{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row2[i][2]);
						sTime = (String)type1.row2[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access");
				System.exit(0);
			}
		}
		else
		{
			try
			{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row4[i][2]);
						sTime = (String)type1.row4[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access it");
				System.exit(0);
			}
		}
		type.setTitle(iPrice + " " + sTime);

		iPrice = (iPrice*iAdult)+(iPrice*(iChildren/2));

		int iCount=0;
		int iSeatCount=0;

		String[] sTempFrom=new String[1250];
		String[] sTempTo=new String[1250];
		String[] sTempClass=new String[1250];
		String[] sTempBookingDate=new String[1250];
		String[] sTempTime=new String[1250];
		Integer[] iTempAdult=new Integer[1250];
		Integer[] iTempChildren=new Integer[1250];
		Integer[] iTempInfant=new Integer[1250];
		Integer[] iTempPrice=new Integer[1250];

		try
		{
//read from data
			Save1 save1;
			ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save1"));
			do
			{
				save1 = (Save1)OIS1.readObject();
				sTempFrom[iCount] = save1.sFrom;
				sTempTo[iCount] = save1.sTo;
				sTempClass[iCount] = save1.sClass;
				sTempBookingDate[iCount] = save1.sBookingDate;
				sTempTime[iCount] = save1.sTime;
				iTempAdult[iCount] = save1.iAdult;
				iTempChildren[iCount] = save1.iChildren;
				iTempInfant[iCount] = save1.iInfant;
				iTempPrice[iCount] = save1.iPrice;

				iCount++;
				if(save1.sBookingDate.equals(sBookingDate))
					if(save1.sTo.equals(sTo))
						iSeatCount=iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
			}while(save1!=null);
			OIS1.close();

		}
		catch(Exception e1)
		{
		}

		iSeatCount = iSeatCount + iAdult + iChildren + iInfant;

		if(iSeatCount > 60)
		{
			JOptionPane.showMessageDialog(null,"Seats are full. Sorry!");
		}
		else
		{
			int iChoice = JOptionPane.showConfirmDialog(null,"Seats available. Do you want to Book now?");
			if(iChoice == JOptionPane.YES_OPTION)
			{
				new PrintTicket1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
			try
			{
//write into data
				Save1 save2=new Save1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
				ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save1"));
				for(i=0;i<iCount;i++)
				{
					Save1 temp1=new Save1(sTempFrom[i], sTempTo[i], sTempClass[i], iTempAdult[i], iTempChildren[i], iTempInfant[i], sTempBookingDate[i], iTempPrice[i], sTempTime[i]);
					OOS1.writeObject(temp1);
System.out.println(temp1);
				}
				OOS1.writeObject(save2);
				OOS1.close();
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			else
			{
			}
		}
	}
}


class Save1 implements Serializable
{
	String sFrom, sTo, sClass, sBookingDate, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;
//	int iCount;
	public Save1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		this.sFrom=sFrom;
		this.sTo=sTo;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.iPrice=iPrice;
		this.sTime=sTime;
//		this.iCount = iCount;
	}
	public String toString()
	{
		return sFrom+" "+sTo+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+iPrice+" "+sTime;
	}
}
public class DomesticFlight extends JFrame
{
	JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LImg1, LImg2, LNotes;
	JTextField TFBookingDate;
	Icon img1, img2;
	JButton BFindFlight;
	JPanel PPanel1, PPanel2;

	LoginPage type1;

	public DomesticFlight(LoginPage type1)
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"Mumbai"};
		String[] sItem2 ={ "Bangalore", "Chennai ", "Delhi", "Goa", "Hyderabad", "Kolkata", "Lucknow", "Mumbai", "Vishakapatnam" };
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(500,200));

		LBookingDetails = new JLabel("<html><b><font color=\"#C71585\">Booking Details</font></b></html>");
		LFrom = new JLabel("From          :");
		LTo = new JLabel("To               :");
		LBookingDate = new JLabel("Booking Date:");
		LClass = new JLabel("Class         :");

		CBFrom = new JComboBox(sItem1);
		CBTo = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(Color.red);

		img1=new ImageIcon("map1.jpg");
		LImg1 = new JLabel(img1);

		BFindFlight = new JButton("Find Flight");

		LBookingDetails.setBounds(20,3,100,20);

		LFrom.setBounds(20,40,100,20);
		CBFrom.setBounds(100,40,100,20);

		LTo.setBounds(20,100,100,20);
		CBTo.setBounds(100,100,100,20);

		LBookingDate.setBounds(14,160,100,20);
		TFBookingDate.setBounds(100,160,100,20);
		LDate.setBounds(210,160,100,20);

		LClass.setBounds(20,220,100,20);
		CBClass.setBounds(100,220,100,20);

		BFindFlight.setBounds(50,270,100,25);

		LImg1.setBounds(0,290,495,260);

		PPanel1.add(LBookingDetails);
		PPanel1.add(LFrom);
		PPanel1.add(CBFrom);
		PPanel1.add(LTo);
		PPanel1.add(CBTo);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(CBClass);
		PPanel1.add(BFindFlight);
		PPanel1.add(LImg1);
		PPanel1.setBackground(Color.white);

		c.add(PPanel1,BorderLayout.WEST);

		PPanel2 = new JPanel(null);
		PPanel2.setPreferredSize(new Dimension(320,160));

		LPassengerDetails=new JLabel("<html><b><font color=\"#C71585\">PassengerDetails</font></b></html>");

		LAdult = new JLabel("Adults(12+)");

		LChildren = new JLabel("Children(2-11)");
		LInfant = new JLabel("Infants(under 2)");

		String[] item4={"1","2","3","4","5","6"};
		CBAdult = new JComboBox(item4);

		String[] item5={"0","1","2","3","4"};
		CBChildren = new JComboBox(item5);

		String[] item6={"0","1","2","3"};
		CBInfant = new JComboBox(item6);

		img2 = new ImageIcon("note_bg.gif");
		LImg2 = new JLabel(img2);
		LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");

		LPassengerDetails.setBounds(40,3,100,20);

		LAdult.setBounds(40,40,100,20);
		CBAdult.setBounds(140,40,100,20);

		LChildren.setBounds(40,105,100,20);
		CBChildren.setBounds(140,105,100,20);

		LInfant.setBounds(40,170,100,20);
		CBInfant.setBounds(140,170,100,20);

		LImg2.setBounds(16,220,320,200);
		LNotes.setBounds(55,240,380,180);

		PPanel2.add(LPassengerDetails);
		PPanel2.add(LAdult);
		PPanel2.add(LChildren);
		PPanel2.add(LInfant);
		PPanel2.add(CBAdult);
		PPanel2.add(CBChildren);
		PPanel2.add(CBInfant);

		PPanel2.add(LNotes);
		PPanel2.add(LImg2);

		PPanel2.setBackground(Color.white);

		c.add(PPanel2,BorderLayout.EAST);

		setSize(795,580);
		setVisible(true);

		BFindFlight.addActionListener(new button3(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new DomesticFlight(type1);
	}
}

class button3 implements ActionListener
{
	DomesticFlight type;
	LoginPage type1;
	button3(DomesticFlight type, LoginPage type1)
	{
		this.type = type;
		this.type1 = type1;
	}
	public void actionPerformed(ActionEvent e)
	{
		String sFrom = (String)type.CBFrom.getSelectedItem();
		String sTo = (String)type.CBTo.getSelectedItem();
		String sClass = (String)type.CBClass.getSelectedItem();
		String sBookingDate = type.TFBookingDate.getText();
		Integer iPrice=0;
		String sTime="";


		Integer iAdult = Integer.parseInt((String)type.CBAdult.getSelectedItem());
		Integer iChildren = Integer.parseInt((String)type.CBChildren.getSelectedItem());
		Integer iInfant = Integer.parseInt((String)type.CBInfant.getSelectedItem());

		int i = 0;

		if(sClass.equals("Economic"))
		{
			try{
				while(i<20)
				{
					if(type1.row1[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row1[i][2]);
						sTime = (String)type1.row1[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access");
				System.exit(0);
			}
		}
		else
		{
			try
			{
				while(i<20)
				{
					if(type1.row1[i][1].equals(sTo))
					{
						iPrice = Integer.parseInt((String)type1.row3[i][2]);
						sTime = (String)type1.row3[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access it");
				System.exit(0);
			}
		}
		type.setTitle(iPrice + " " + sTime);

		iPrice = (iPrice*iAdult)+(iPrice*(iChildren/2));

		int iCount=0;
		int iSeatCount=0;

		String[] sTempFrom=new String[1250];
		String[] sTempTo=new String[1250];
		String[] sTempClass=new String[1250];
		String[] sTempBookingDate=new String[1250];
		String[] sTempTime=new String[1250];
		Integer[] iTempAdult=new Integer[1250];
		Integer[] iTempChildren=new Integer[1250];
		Integer[] iTempInfant=new Integer[1250];
		Integer[] iTempPrice=new Integer[1250];

		try
		{
//read from data
			Save2 save1;
			ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save2"));
			do
			{
				save1 = (Save2)OIS1.readObject();
				sTempFrom[iCount] = save1.sFrom;
				sTempTo[iCount] = save1.sTo;
				sTempClass[iCount] = save1.sClass;
				sTempBookingDate[iCount] = save1.sBookingDate;
				sTempTime[iCount] = save1.sTime;
				iTempAdult[iCount] = save1.iAdult;
				iTempChildren[iCount] = save1.iChildren;
				iTempInfant[iCount] = save1.iInfant;
				iTempPrice[iCount] = save1.iPrice;

				iCount++;
				if(save1.sBookingDate.equals(sBookingDate))
					if(save1.sTo.equals(sTo))
						iSeatCount=iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
			}while(save1!=null);
			OIS1.close();

		}
		catch(Exception e1)
		{
		}

		iSeatCount = iSeatCount + iAdult + iChildren + iInfant;

		if(iSeatCount > 60)
		{
			JOptionPane.showMessageDialog(null,"Seats are full. Sorry!");
		}
		else
		{
			int iChoice = JOptionPane.showConfirmDialog(null,"Seats available. Do you want to Book now?");
			if(iChoice == JOptionPane.YES_OPTION)
			{
				new PrintTicket1(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
			try
			{
//write into data
				Save2 save2=new Save2(sFrom, sTo, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
				ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save2"));
				for(i=0;i<iCount;i++)
				{
					Save2 temp1=new Save2(sTempFrom[i], sTempTo[i], sTempClass[i], iTempAdult[i], iTempChildren[i], iTempInfant[i], sTempBookingDate[i], iTempPrice[i], sTempTime[i]);
					OOS1.writeObject(temp1);
System.out.println(temp1);
				}
				OOS1.writeObject(save2);
				OOS1.close();
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			else
			{
			}
		}
	}
}


class Save2 implements Serializable
{
	String sFrom, sTo, sClass, sBookingDate, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;
//	int iCount;
	public Save2(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		this.sFrom=sFrom;
		this.sTo=sTo;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.iPrice=iPrice;
		this.sTime=sTime;
//		this.iCount = iCount;
	}
	public String toString()
	{
		return sFrom+" "+sTo+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+iPrice+" "+sTime;
	}
}
