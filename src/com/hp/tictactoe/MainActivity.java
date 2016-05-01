package com.hp.tictactoe;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener
{
	TextView tv,tv1,tv2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    ToggleButton tb;
    Intent service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service= new Intent(this,MyService.class);
        
        b1=(Button) findViewById(R.id.button1);
		b1.setOnClickListener(this);
		b2=(Button) findViewById(R.id.button2);
		b2.setOnClickListener(this);
		b3=(Button) findViewById(R.id.button3);
		b3.setOnClickListener(this);
		b4=(Button) findViewById(R.id.button4);
		b4.setOnClickListener(this);
	    b5=(Button) findViewById(R.id.button5);
		b5.setOnClickListener(this);		
		b6=(Button) findViewById(R.id.button6);
		b6.setOnClickListener(this);
		b7=(Button) findViewById(R.id.button7);
		b7.setOnClickListener(this);
		b8=(Button) findViewById(R.id.button8);
		b8.setOnClickListener(this);
	    b9=(Button) findViewById(R.id.button9);
	    b9.setOnClickListener(this);
	    b10=(Button) findViewById(R.id.button10);
	    b10.setOnClickListener(this);
	    tb=(ToggleButton)findViewById(R.id.toggleButton1);
	    tv=(TextView)findViewById(R.id.textView1);
	    tv1=(TextView)findViewById(R.id.textView2);
	    tv2=(TextView)findViewById(R.id.textView3);
    }
    static int i=1;
    public void onClick(View v) 
    {
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
		
		case R.id.button1:
			if(i==1||i==3||i==5||i==7||i==9)
			b1.setText("0");
			else
			b1.setText("x");
			i++;
			break;
		case R.id.button2:
			if(i==1||i==3||i==5||i==7||i==9)
			b2.setText("0");
			else
			b2.setText("x");
			i++;
			break;
		case R.id.button3:
			if(i==1||i==3||i==5||i==7||i==9)
			b3.setText("0");
			else
			b3.setText("x");
			i++;
			break;
		case R.id.button4:
			if(i==1||i==3||i==5||i==7||i==9)
			b4.setText("0");
			else
			b4.setText("x");
			i++;
			break;
		case R.id.button5:
			if(i==1||i==3||i==5||i==7||i==9)
			b5.setText("0");
			else
			b5.setText("x");
			i++;
			break;
		case R.id.button6:
			if(i==1||i==3||i==5||i==7||i==9)
			b6.setText("0");
			else
			b6.setText("x");
			i++;
			break;
		case R.id.button7:
			if(i==1||i==3||i==5||i==7||i==9)
			b7.setText("0");
			else
			b7.setText("x");
			i++;
			break;
		case R.id.button8:
			if(i==1||i==3||i==5||i==7||i==9)
			b8.setText("0");
			else
			b8.setText("x");
			i++;
			break;
		case R.id.button9:
			if(i==1||i==3||i==5||i==7||i==9)
			b9.setText("0");
			else
			b9.setText("x");
			i++;
			break;
		case R.id.button10:
			i=1;
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			tv2.setText("");
			break;
		}
		if((b1.getText().equals("0") && b2.getText().equals("0")&&b3.getText().equals("0"))||
				(b1.getText().equals("0")&&b5.getText().equals("0")&&b9.getText().equals("0"))||
				(b3.getText().equals("0")&&b5.getText().equals("0")&&b7.getText().equals("0"))||
				(b1.getText().equals("0")&&b4.getText().equals("0")&&b7.getText().equals("0"))||
				(b2.getText().equals("0")&&b5.getText().equals("0")&&b8.getText().equals("0"))||
				(b3.getText().equals("0")&&b6.getText().equals("0")&&b9.getText().equals("0"))||
				(b4.getText().equals("0")&&b5.getText().equals("0")&&b6.getText().equals("0"))||
				(b7.getText().equals("0")&&b8.getText().equals("0")&&b9.getText().equals("0")))
		{
			tv2.setText("player1 won!");
			i=1;
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		 if((b1.getText().equals("x") && b2.getText().equals("x")&&b3.getText().equals("x"))||
				(b1.getText().equals("x")&&b5.getText().equals("x")&&b9.getText().equals("x"))||
				(b3.getText().equals("x")&&b5.getText().equals("x")&&b7.getText().equals("x"))||
				(b1.getText().equals("x")&&b4.getText().equals("x")&&b7.getText().equals("x"))||
				(b2.getText().equals("x")&&b5.getText().equals("x")&&b8.getText().equals("x"))||
				(b3.getText().equals("x")&&b6.getText().equals("x")&&b9.getText().equals("x"))||
				(b4.getText().equals("x")&&b5.getText().equals("x")&&b6.getText().equals("x"))||
				(b7.getText().equals("x")&&b8.getText().equals("x")&&b9.getText().equals("x")))
		{
			tv2.setText("player2 won!");
			i=1;
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		 else if(i==10)
		 {
			 tv2.setText("sorry, match draw!");
			 i=1;
		 }	
    }
    public void music(View v)
    {
    	String s5=(String)tb.getText();
		if(s5.equals("Music Off"))
		{
			stopService(service);
		}
		else 
		{
			startService(service);
		}
    	
    }
}

