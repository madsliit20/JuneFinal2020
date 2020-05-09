package mad.sliit.uniflexy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinerUser);
        ArrayList<String> arrayList = new ArrayList<>();


        /*** Question 9  ***/


// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                /*** Question 10   (i)  ***/

                ,

                /*** Question 10   (ii)  ***/
                );
// Specify the layout to use when the list of choices appears
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(  /*** Question 10   (iii)  ***/);
/**************/
        //button events

        Button button = findViewById(R.id.btnLogin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = spinner.getSelectedItem().toString();

                /*** Question 13  ***/


            }
                else if(user == "Admin"){
                    textView = findViewById(R.id.txtPassword);
                    String   /*** Question 14.1  ***/ = textView.getText().toString();


                    if(pwd.contains("1234")){
                        /*** Question 14.2  ***/
                    }else{

                        /*** Question 14.3  ***/
                        /*** Question 15  ***/
                        }
                }
            }
        });


    }
}
