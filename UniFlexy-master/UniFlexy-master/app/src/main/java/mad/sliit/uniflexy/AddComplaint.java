package mad.sliit.uniflexy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

import mad.sliit.uniflexy.Database.ComplaintDB;

public class AddComplaint extends AppCompatActivity {
    private static final String TAG = "AddComplaint";

    Spinner spinPriority;
    EditText edtCategory, edtName, edtDescription;
    ImageView photo;
    Button submit;
    Button add;

    String type,name,description;
    byte[] imageBitmapByte;
    int priority;


    /*** Question 18 ***/


    private static final int REQUEST_IMAGE_CAPTURE = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_complaint);
        spinPriority = findViewById(R.id.spinPriority);
        edtCategory = findViewById(R.id.edtCategory);
        edtName = findViewById(R.id.edtName1);
        edtDescription = findViewById(R.id.edtDescription);
        submit = findViewById(R.id.btnSubmit);
        add = findViewById(R.id.btnAdd);
        photo = findViewById(R.id.imgPhoto);


        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");

//      /***   Question 20    ***/


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<Level> arrayAdapter = new ArrayAdapter<>(
                /*** Question 19 - (i) ***/
                ,
                /*** Question 19 - (ii) ***/
                ,
                /*** Question 19 - (iii) ***/);
// Specify the layout to use when the list of choices appears
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        /*** Question 19 - (iv) ***/





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageCapture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                if(imageCapture.resolveActivity(getPackageManager())!=null){
                    startActivityForResult(imageCapture,REQUEST_IMAGE_CAPTURE);

                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



                /*** Question 21   ***/


*//*            /** Question 22 ***/
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap)extras.get("data");
            photo.setImageBitmap(imageBitmap);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            imageBitmapByte = byteArray;


        }

    }
}
