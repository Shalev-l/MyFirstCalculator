package com.example.shalev.myfirstcalculator;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculatorActivity extends AppCompatActivity {
   // private EditText Scr;// Textbox screen
   // private float NumberBF; //sשומר את המספר לפני שלוחצים על אופרטור
   // private String Operation;
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel,
            equal; EditText disp; int op1; int op2; String optr; //creat Button objects


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        add = (Button) findViewById(R.id.buttonAdd);
        sub = (Button) findViewById(R.id.buttonMinus);
        mul = (Button) findViewById(R.id.buttonX);
        div = (Button) findViewById(R.id.buttonDIV);
        cancel = (Button) findViewById(R.id.buttonDIV);
        equal = (Button) findViewById(R.id.buttonEQWAL);
        disp = (EditText) findViewById(R.id.Answer);
    }


        public void operation()
        {
            if(optr.equals("+"))
            { op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 + op2;
                disp.setText("Result : " + Integer.toString(op1));
            }
            else if(optr.equals("-"))
            { op2 = Integer.parseInt(disp.getText().toString());
                disp.setText(""); op1 = op1 - op2;
                disp.setText("Result : " + Integer.toString(op1));
            }
            else if(optr.equals("*"))
            { op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 * op2;
                disp.setText("Result : " + Integer.toString(op1));
            }
            else if(optr.equals("/"))
            { op2 = Integer.parseInt(disp.getText().toString());
                disp.setText("");
                op1 = op1 / op2;
                disp.setText("Result : " + Integer.toString(op1));
            }
        }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_calculator, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }


    public void onClick(View arg0)
    {
        Editable str = disp.getText();
        switch(arg0.getId())
        {
            case R.id.button1:
                if(op2 != 0)
            { op2 = 0; disp.setText("");
            }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.button2:
                if(op2 != 0)
            {
                op2 = 0; disp.setText("");
            }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.button3:
                if(op2 != 0)
            {
                op2 = 0; disp.setText("");
            }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.button4:
                if(op2 != 0)
            {
                op2 = 0;
                disp.setText("");
            }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.button5:
                if(op2 != 0)
            {
                op2 = 0;
                disp.setText("");
            }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.button6:
                if(op2 != 0)
            {
                op2 = 0;
                disp.setText("");
            }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.button7:
                if(op2 != 0)
            {
                op2 = 0; disp.setText("");
            }
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.button8:
                if(op2 != 0)
            {
                op2 = 0;
                disp.setText("");
            }
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.button9:
                if(op2 != 0)
            {
                op2 = 0;
                disp.setText("");
            }
                str = str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.buttonC:
                op1 = 0;
                op2 = 0;
                disp.setText("");
                disp.setHint("Perform Operation ");
                break;
            case R.id.buttonAdd:
                optr = "+";
                if(op1 == 0)
                { op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0)
                {
                    op2 = 0;
                    disp.setText("");
                }
                else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 + op2;
                    disp.setText("Result : " + Integer.toString(op1));
                } break;
            case R.id.buttonMinus:
                optr = "-";
                if(op1 == 0)
                {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0){ op2 = 0;
                    disp.setText("");
                }
                else{ op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 - op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonX:
                optr = "*";
                if(op1 == 0)
                {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0)
                {
                    op2 = 0;
                    disp.setText("");
                }
                else
                { op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 * op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonDIV:
                optr = "/";
                if(op1 == 0)
                {
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0)
                {
                    op2 = 0;
                    disp.setText("");
                }
                else
                {
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 / op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.buttonEQWAL:
                if(!optr.equals(null))
            {
                if(op2 != 0)
                {
                    if(optr.equals("+"))
                    {
                        disp.setText("");/*op1 = op1 + op2;*/
                        disp.setText("Result : " + Integer.toString(op1));
                    }
                    else if(optr.equals("-"))
                    {
                        disp.setText("");/* op1 = op1 - op2;*/
                        disp.setText("Result : " + Integer.toString(op1));
                    }
                    else if(optr.equals("*"))
                    {
                        disp.setText("");/* op1 = op1 * op2;*/
                        disp.setText("Result : " + Integer.toString(op1));
                    }
                    else if(optr.equals("/"))
                    { disp.setText("");/* op1 = op1 / op2;*/
                        disp.setText("Result : " + Integer.toString(op1));
                    }
                } else
                {
                    operation();
                }
            }
                break;
        }
    }
}

