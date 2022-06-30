package com.example.signoscontador;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.signoscontador.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    public TextView hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.hora;

        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());

        SimpleDateFormat df=new SimpleDateFormat("HH:mm");
        String formattedDate= df.format(c.getTime());
        //Formato tiene el tiempo actual
        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();

        //Desplegar formattedDate en el TextView
        TextView hora= new TextView(this);
        hora.setText(formattedDate);
        hora.setGravity(Gravity.CENTER);
        hora.setTextSize(20);
        setContentView(hora);

        Fitness.get
    }
}