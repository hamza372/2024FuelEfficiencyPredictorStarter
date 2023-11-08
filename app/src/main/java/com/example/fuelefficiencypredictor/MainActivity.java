package com.example.fuelefficiencypredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import org.tensorflow.lite.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MainActivity extends AppCompatActivity {

    ScrollView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sv = (ScrollView)findViewById(R.id.sv);
        final EditText cylinders = findViewById(R.id.editText);
        final EditText displacement = findViewById(R.id.editText2);
        final EditText horsePower = findViewById(R.id.editText3);
        final EditText weight = findViewById(R.id.editText4);
        final EditText accelration = findViewById(R.id.editText5);
        final EditText modelYear = findViewById(R.id.editText6);
        final Spinner origin = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,new String[]{"USA","Europe","Japan"});
        origin.setAdapter(arrayAdapter);
        final TextView result = findViewById(R.id.textView2);

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sv.scrollTo( sv.getBottom(),0);
//                float cylindersVal = Float.parseFloat(cylinders.getText().toString());
//                float displacementVal = Float.parseFloat(displacement.getText().toString());
//                float horsePowerVal = Float.parseFloat(horsePower.getText().toString());
//                float weightVal = Float.parseFloat(weight.getText().toString());
//                float accelrationVal = Float.parseFloat(accelration.getText().toString());
//                float modelYearVal = Float.parseFloat(modelYear.getText().toString());
//                float originA = 0;
//                float originB = 0;
//                float originC = 0;
//                switch (origin.getSelectedItemPosition())
//                {
//                    case 0:
//                        originA = 1;
//                        originB = 0;
//                        originC = 0;
//                        break;
//                    case 1:
//                        originA = 0;
//                        originB = 1;
//                        originC = 0;
//                        break;
//                    case 2:
//                        originA = 0;
//                        originB = 0;
//                        originC = 1;
//                        break;
//                }
            }
        });
    }

    //TODO pass input to model and get output
//    public float doInference(float[][] input)
//    {
//        float[][] output = new float[1][1];
//
//        interpreter.run(input,output);
//
//        return output[0][0];
//    }

    //TODO load tflite model
//    private MappedByteBuffer loadModelFile() throws IOException {
//        AssetFileDescriptor assetFileDescriptor = this.getAssets().openFd("automobile.tflite");
//        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
//        FileChannel fileChannel = fileInputStream.getChannel();
//        long startOffset = assetFileDescriptor.getStartOffset();
//        long length = assetFileDescriptor.getLength();
//        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, length);
//    }
}
