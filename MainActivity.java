package com.example.eshwar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      Button AC;
      Button DEL;
      Button modulus;
      Button divide;
      Button seven,eight,nine;
      Button mul;
      Button four,five,six;
      Button sub;
      Button qone,two,three;
      Button plus;
      Button zero;
      Button dot;
      Button equals;
      EditText mEditText;
      float mValue1,mValue2;

      boolean mAddition,mMultiplication,msubtraction,mDivision,mModulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AC= findViewById(R.id.AC_btn);
        DEL= findViewById(R.id.DEL_btn);
        modulus= findViewById(R.id.MOD_btn);
        divide=findViewById(R.id.DIV_btn);
        seven=findViewById(R.id.seven_btn);
        eight=findViewById(R.id.eight_btn);
        nine=findViewById(R.id.nine_btn);
        mul=findViewById(R.id.mul_btn);
        four=findViewById(R.id.four_btn);
        five=findViewById(R.id.five_btn);
        six=findViewById(R.id.SIX_btn);
        sub=findViewById(R.id.sub_btn);
        qone=findViewById(R.id.one_btn);
        two=findViewById(R.id.two_btn);
        three=findViewById(R.id.three_btn);
        plus=findViewById(R.id.plus_btn);
        zero=findViewById(R.id.zero_btn);
        dot=findViewById(R.id.dot_btn);
        equals=findViewById(R.id.equals_btn);
        mEditText=findViewById(R.id.edit);

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","AC PRESSED");
                mEditText.setText(" ");

            }
        });
        DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","DEL PRESSED");
                mEditText.setText(" ");

            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","MODULUS PRESSED");

                    mValue1=Float.parseFloat(mEditText.getText() + " ");
                    mModulus=true;
                    mEditText.setText("%");


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mValue1= Float.parseFloat(mEditText.getText() + " ");
                    mDivision=true;
                    mEditText.setText(null);

                }

            });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","SEVEN pressed");
                mEditText.setText(mEditText.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","EIGHT pressed");
                mEditText.setText(mEditText.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","NINE pressed");
                mEditText.setText(mEditText.getText() + "9");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","mul pressed");


                    mValue1= Float.parseFloat(mEditText.getText() + " ");
                    mMultiplication= true;
                    mEditText.setText(null);
                }


        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","FOUR PRESSED");
                mEditText.setText(mEditText.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","FIVE PRESSED");
                mEditText.setText(mEditText.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","SIX pressed");
                mEditText.setText(mEditText.getText() + "6");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal", "SUB pressed");

                   mValue1= Float.parseFloat(mEditText.getText() + " ");
                   msubtraction=true;
                   mEditText.setText(null);

            }

        });
        qone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","ONE PRESSED");
                mEditText.setText(mEditText.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","TWO PRESSED");
                mEditText.setText(mEditText.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","THREE PRESSED");
                mEditText.setText(mEditText.getText() + "3");
            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","plus pressed");

                    mValue1=Float.parseFloat(mEditText.getText() + " ");
                    mAddition=true;
                    mEditText.setText(null);

            }

        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","zero pressed");
                mEditText.setText(mEditText.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cal","dot pressed");
                mEditText.setText(mEditText.getText() + ".");
            }
        });

       equals.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Log.d("cal", "Equals pressed");

              mValue2 = Float.parseFloat(mEditText.getText() + " ");

               if (mAddition == true) {

                   mEditText.setText(mValue1 + mValue2 + "");
                   mAddition = false;
               }


               if (msubtraction == true) {
                   mEditText.setText(mValue1 - mValue2 + "");
                   msubtraction = false;
               }

               if (mMultiplication == true) {
                   mEditText.setText(mValue1 * mValue2 + "");
                   mMultiplication = false;
               }

               if (mDivision == true) {
                   mEditText.setText(mValue1 / mValue2 + "");
                   mDivision  = false;
               }
           }
          // End of program
       });
    }
}
