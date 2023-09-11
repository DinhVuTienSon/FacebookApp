package vn.edu.usth.facebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    button b1, b2;
    textEdit e1, e2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.button);
        e1 = (EditText) findViewById(R.id.textEdit);
        e2 = (EditText) findViewById(R.id.textEdit2);

        b2 = (Button) findViewById(R.id.button2);
        tx1 = (TextView) findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE)

        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v)
            if (ed1.getText().toString().equals("admin") &&
                ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Loging in...", Toast.LENGTH_SHORT.show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Login Failed", Toast.LENGTH_SHORT.show();

                tx1.setVisibility(View.VISIBLE);
                tx1.setBackgroundColor(Color.RED);
                counter--;
                tx1.setText(Integer.toString(counter));

                if (counter == 0) {
                    b1.setEnabled(false);
                }
            }
        }
    });

      b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });
}
}