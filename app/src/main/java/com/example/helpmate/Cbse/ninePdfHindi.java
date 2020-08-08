package com.example.helpmate.Cbse;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmate.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ninePdfHindi extends AppCompatActivity {
    private TextView text1;
    private PDFView pdfView;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference mhref;

    public ninePdfHindi() {
        this.mhref = this.database.getReference("CbhinTen");
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_pdf_edpol);
        this.pdfView = (PDFView)this.findViewById(R.id.pdf);
        this.text1 = (TextView)this.findViewById(R.id.text1);
        this.mhref.addValueEventListener(new ValueEventListener() {
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = (String)dataSnapshot.getValue(String.class);
                ninePdfHindi.this.text1.setText(value);
//                Toast.makeText(ninePdfHindi.this, "Updated", Toast.LENGTH_SHORT).show();
                String url = ninePdfHindi.this.text1.getText().toString();
                (ninePdfHindi.this.new RetrivePdfStream()).execute(new String[]{url});
            }

            public void onCancelled( DatabaseError databaseError) {
                Toast.makeText(ninePdfHindi.this, "Failed to Update", Toast.LENGTH_SHORT).show();
            }
        });
    }

    class RetrivePdfStream extends AsyncTask<String, Void, InputStream> {
        RetrivePdfStream() {
        }

        protected InputStream doInBackground(String... strings) {
            BufferedInputStream inputStream = null;

            try {
                URL uRl = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)uRl.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }

                return inputStream;
            } catch (IOException var5) {
                return null;
            }
        }

        protected void onPostExecute(InputStream inputStream) {
            ninePdfHindi.this.pdfView.fromStream(inputStream).load();
        }
    }
}
