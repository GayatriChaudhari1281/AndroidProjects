package com.example.texteditorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    public EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextMultiLine);
    }

    public void buttonBold(View view)
    {
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new StyleSpan(Typeface.BOLD),editText.getSelectionStart(),editText.getSelectionEnd(),0);
        editText.setText(spannableString);
    }
    public void buttonItalics(View view)
    {
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new StyleSpan(Typeface.ITALIC),editText.getSelectionStart(),editText.getSelectionEnd(),0);
        editText.setText(spannableString);
    }
    public void buttonUnderline(View view)
    {
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new UnderlineSpan(),editText.getSelectionStart(),editText.getSelectionEnd(),0);
        editText.setText(spannableString);
    }
    public void buttonNoFormat(View view)
    {
        String stringText=editText.getText().toString();
        editText.setText(stringText);
        editText.setTextColor(Color.BLACK);
    }
    public void buttonAlignmentLeft(View view)
    {
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }
    public void buttonAlignmentCenter(View view)
    {
        editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }
    public void buttonAlignmentRight(View view)
    {
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        Spannable spannableString=new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);

    }
    public void buttonGreen(View view)
    {
        editText.setTextColor(Color.GREEN);
    }
    public void buttonRed(View view)
    {
        editText.setTextColor(Color.RED);
    }
    public void buttonBlue(View view)
    {
        editText.setTextColor(Color.BLUE);
    }
}