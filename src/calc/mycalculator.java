package calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//import javax.swing.JTextField;

//import javax.swing.JFrame;

public class mycalculator extends Frame implements WindowListener,ActionListener {


	private static final long serialVersionUID = 1L;
TextField display;
Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,clear,add,sub,mul,div,equ,sin,cos,tan,back;
Panel p;	
String nums;
double op1,op2;
int i,op;
static final int ADD=1,SUB=2,MUL=3,DIV=4;
public mycalculator()
	{
		nums="0";
	
	
	    this.addWindowListener(this);
		this.setLayout(new GridLayout(2,1));
		display=new TextField(0);
		display.setEditable(false);
		this.add(display);
		p=new Panel();
		p.setLayout(new GridLayout(7,7));
		this.add(p);
		
		
		b_0=new Button("0");
		b_0.addActionListener(this);
		p.add(b_0);
		b_1=new Button("1");
		b_1.addActionListener(this);
		p.add(b_1);
		b_2=new Button("2");
		b_2.addActionListener(this);
		p.add(b_2);
		b_3=new Button("3");
		b_3.addActionListener(this);
		p.add(b_3);
		b_4=new Button("4");
		b_4.addActionListener(this);
		p.add(b_4);
		b_5=new Button("5");
		b_5.addActionListener(this);
		p.add(b_5);
		b_6=new Button("6");
		b_6.addActionListener(this);
		p.add(b_6);
		b_7=new Button("7");
		b_7.addActionListener(this);
		p.add(b_7);
		b_8=new Button("8");
		b_8.addActionListener(this);
		p.add(b_8);
		b_9=new Button("9");
		b_9.addActionListener(this);
		p.add(b_9);
		add=new Button("+");
		add.addActionListener(this);
		p.add(add);
		sub=new Button("-");
		sub.addActionListener(this);
		p.add(sub);
		mul=new Button("*");
		mul.addActionListener(this);
		p.add(mul);
		div=new Button("/");
		div.addActionListener(this);
		p.add(div);
		equ=new Button("=");
		equ.addActionListener(this);
		p.add(equ);
		sin=new Button("sin");
		sin.addActionListener(this);
		p.add(sin);
		cos=new Button("cos");
		cos.addActionListener(this);
		p.add(cos);
		tan=new Button("tan");
		tan.addActionListener(this);
		p.add(tan);
		back=new Button("back");
		back.addActionListener(this);
		p.add(back);
		
		
		
	
	}
	
	
	
	public static void main(String[] args) {
       mycalculator mc;
       mc=new mycalculator();
       mc.setTitle("SAM SAKTHI CALCULATOR");
       mc.setSize(400, 400);
       mc.setVisible(true);
            


	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		
		System.exit(0);	
	}

	@Override
	public void windowClosed(WindowEvent e) {
			
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b_0)
		{
			nums=nums+"0";
			display.setText(nums);
		}else if(e.getSource()==b_1)
		{
			nums=nums+"1";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_2)
		{
			nums=nums+"2";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_3)
		{
			nums=nums+"3";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_4)
		{
			nums=nums+"4";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_5)
		{
			nums=nums+"5";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_6)
		{
			nums=nums+"6";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_7)
		{
			nums=nums+"7";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_8)
		{
			nums=nums+"8";
			display.setText(nums);
			
		}
		else if(e.getSource()==b_9)
		{
			nums=nums+"9";
			display.setText(nums);
			
		}else if(e.getSource()==clear)
		{
			nums="0";
			display.setText(nums);
			
		}
		else if(e.getSource()==add) {
			op1=Double.parseDouble(nums);
			op=ADD;
			nums="0";
			display.setText(nums);}
		else if(e.getSource()==sub) {
				op1=Double.parseDouble(nums);
				op=SUB;
				nums="0";
				display.setText(nums);
			
		}else if(e.getSource()==mul) {
			op1=Double.parseDouble(nums);
			op=MUL;
			nums="0";
			display.setText(nums);
		
	}else if(e.getSource()==div) {
		op1=Double.parseDouble(nums);
		op=DIV;
		nums="0";
		display.setText(nums);
	


}else if (e.getSource()==equ)
		{
			switch(op)
			{
			case 1:
				op2=Double.parseDouble(nums);
				nums=""+(op1+op2);
				display.setText(nums);
				break;
			
			
			case 2:
			op2=Double.parseDouble(nums);
				nums=""+(op1-op2);
				display.setText(nums);
				break;
			
			
			case 3:
			op2=Double.parseDouble(nums);
				nums=""+(op1*op2);
				display.setText(nums);
				break;
			
			
			case 4:
			op2=Double.parseDouble(nums);
				nums=""+(op1/op2);
				display.setText(nums);
				break;
			}
			display.setText(nums);
		}
			
			

			else if(e.getSource()==sin){
				op1=Double.parseDouble(nums);
					nums=""+Math.sin(op1*Math.PI/180);
				display.setText(nums);
				
			}
			else if(e.getSource()==cos){
				op1=Double.parseDouble(nums);
					nums=""+Math.cos(op1*Math.PI/180);
				display.setText(nums);
				
			}
			else if(e.getSource()==tan){
				op1=Double.parseDouble(nums);
					nums=""+Math.tan(op1*Math.PI/180);
				display.setText(nums);
				
			}
			else if (e.getSource()==back) {
				nums=nums;
				nums=nums.substring(0,nums.length()-1 );
				display.setText(nums);
			
		}
	}
		
	}


