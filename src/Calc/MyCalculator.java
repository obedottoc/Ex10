package Calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyCalculator extends Frame implements WindowListener,ActionListener {
 TextField display;
 Button b_0,b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9;
 Button b_add,b_sub,b_equal,b_sin,b_cos,b_clear;
 Panel p;
 String nums;
 Double Op1,Op2;
 int Op;
 static final int OP_ADD=1;
 static final int OP_Sub=2;
 static final int OP_SIN=3;
 static final int OP_COS=4;
 static final int OP_CLEAR=5;
 public MyCalculator() {
	
		nums="0";
	    this.addWindowListener(this);
		this.setLayout((new GridLayout(2,1)));
		display=new TextField(0);
		this.add(display);
		
		p=new Panel();
		p.setLayout(new GridLayout(5,5));
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
		
		b_add=new Button("add");
		b_add.addActionListener(this);
		p.add(b_add);
		

		b_sub=new Button("sub");
		b_sub.addActionListener(this);
		p.add(b_sub);
		

		b_equal=new Button("equal");
		b_equal.addActionListener(this);
		p.add(b_equal);
		
		b_sin=new Button("sin");
		b_sin.addActionListener(this);
		p.add(b_sin);
		 
		b_cos=new Button("cos");
		b_cos.addActionListener(this);
		p.add(b_cos);
		
		b_clear=new Button("clear");
		b_clear.addActionListener(this);
		p.add(b_clear);
		
	}
	public static void main(String[] args) {
	
		MyCalculator mc;
		mc=new MyCalculator();		
		mc.setTitle("calculator");
		mc.setSize(700,500);
		
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
		// TODO Auto-generated method stub
		
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
		 }else if(e.getSource()==b_2)
			 
			 {
				nums=nums+"2";
				display.setText(nums);
			 }else if(e.getSource()==b_3)
				 
			 {
				nums=nums+"3";
				display.setText(nums);
			 }else if(e.getSource()==b_4)
				 
			 {
				nums=nums+"4";
				display.setText(nums);
			 }else if(e.getSource()==b_5)
				 
			 {
				nums=nums+"5";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_6)
				 
			 {
				nums=nums+"6";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_7)
				 
			 {
				nums=nums+"7";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_8)
				 
			 {
				nums=nums+"8";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_9)
				 
			 {
				nums=nums+"9";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_clear)
				 
			 {
				 
				 nums="0";
				display.setText(nums);
			 
			 }
			 else if(e.getSource()==b_add)
				 
			 {
				 Op1=Double.parseDouble(nums);
				 Op=OP_ADD;
				 nums="0";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_sub)
		     {
				 Op1=Double.parseDouble(nums);
				 Op=OP_Sub;
				 nums="0";
				display.setText(nums);
			 
			 }else if(e.getSource()==b_sin)
		     {
				 Op1=Double.parseDouble(nums);
				 
				 nums=""+Math.asin(Op1*Math.PI/180);
				display.setText(nums);
			 
			 }else if(e.getSource()==b_cos)
		     {
				 
				 nums=""+Math.acos(Op1*Math.PI/180);;
				display.setText(nums);
			 
			 }


			 
			 else if(e.getSource()==b_equal)
				 
			 {
			    Op2 =Double.parseDouble(nums);
			    switch(Op)
			    {
			    case 1:
			    	nums=""+(Op1+Op2);
			    	display.setText(nums);
			    	break;
			    	
			    
			    case 2:
			    	nums=""+(Op1-Op2);
			    	display.setText(nums);
			    	break;
			    	
			    
			    }
			 }
	}

}
