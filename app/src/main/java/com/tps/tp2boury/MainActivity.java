package com.tps.tp2boury;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView msgTxt;
    EditText nomEdt;
    Button affBtn;
    RelativeLayout leLayRelav=(RelativeLayout)findViewById(R.id.layoutPortrait);
    ScrollView svMsgtext = new ScrollView(this);
    LinearLayout layScrol = new LinearLayout(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        svMsgtext.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT) );
        layScrol.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layScrol.setOrientation(LinearLayout.VERTICAL);
        svMsgtext.addView(layScrol);
        leLayRelav.addView(svMsgtext);
    }

    private void initViews() {
        nomEdt = findViewById(R.id.nomEdt);
        affBtn = findViewById(R.id.affBtn);
        affBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View laVue) {
        if (laVue.getId() == R.id.affBtn) {
            msgTxt.setText("Bienvenue "+nomEdt.getText().toString());
            layScrol.addView(msgTxt);

        }

    }
}
