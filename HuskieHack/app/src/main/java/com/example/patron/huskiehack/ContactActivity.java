package com.example.patron.huskiehack;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import android.content.Intent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ContactActivity extends ActionBarActivity {

    public static final MediaType FORM_DATA_TYPE
            = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");

    public static final String URL = "https://docs.google.com/forms/d/19GoT7rDNOtUfy412Gwv0r3y7kL2N-xhC8-S3s2GkdCA/formResponse";

    public static final String NAME_KEY = "entry.1598949676";
    public static final String PHONE_KEY = "entry.1840864087";
    public static final String MAILING_KEY = "entry.1215192729";
    public static final String DATE_KEY = "entry.1649970228";
    public static final String TIME_KEY = "entry.441390324";
    public static final String LOCATION_KEY = "entry.784457348";
    public static final String EMAIL_KEY = "entry.1820875364";

    private Context context;
    private EditText emailEditText;
    private EditText nameEditText;
    private EditText phoneEditText;
    private EditText mailingEditText;
    private EditText dateEditText;
    private Spinner locationEditText;
    private EditText timeEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_contact);


        Button sendButton = (Button) findViewById(R.id.sendButton);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        phoneEditText = (EditText) findViewById(R.id.phoneEditText);
        mailingEditText = (EditText) findViewById(R.id.mailingEditText);
        dateEditText = (EditText) findViewById(R.id.dateEditText);
        locationEditText = (Spinner) findViewById(R.id.locationEditText);
        String[] items = new String[]{"Enter Location for Volunteering", "Amber Manor", "Annie Glidden Heritage Garden", "Bethlehem Lutheran Church",
                "Briarwood", "Children’s Learning Center & The Growing Place", "Civic Apartments", "Conexion Comunidad", "DeKalb Adult Day Care Center",
                "Dolce Vita Hair Salon & Day Spa", "End of Normal Garden", "Five Points Food Forest", "Genoa Community Gardens", "KEC", "Kishwaukee Family YMCA",
                "Kish Health Systems", "Kish Health Behavioral Services", "Lewis Court", "Mayor’s Community Garden", "Mason Court", "NIU Communiversity Garden",
                "Outreach Garden", "St. Paul’s Episcopal Church", "Taylor Street", "Walnut Grove Farm", "Valley West Medical Center Gardens",
                "Voluntary Action Center", "Brooks Elementary School", "Clinton Rosette Middle School", "Founders Elementary School", "Lincoln Elementary School",
                "Littlejohn Elementary School", "Tyler Elementary School", "Cortland Elementary School", "Malta Elementary School", "West Elementary School",
                "North Elementary School", "North Grove Elementary School", "South Prairie Elementary School", "Southeast Elementary School"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        locationEditText.setAdapter(adapter);
        timeEditText = (EditText) findViewById(R.id.timeEditText);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailEditText.getText().toString()).matches()) {
                    Toast.makeText(context, "Please enter a valid email.", Toast.LENGTH_LONG).show();
                    return;
                }


                PostDataTask postDataTask = new PostDataTask();


                postDataTask.execute(URL, emailEditText.getText().toString(),
                        nameEditText.getText().toString(),
                        phoneEditText.getText().toString(),
                        mailingEditText.getText().toString(),
                        dateEditText.getText().toString(),
                        locationEditText.getSelectedItem().toString(),
                        timeEditText.getText().toString());
            }
        });
    }


    private class PostDataTask extends AsyncTask<String, Void, Boolean> {

        @Override
        protected Boolean doInBackground(String... contactData) {
            Boolean result = true;
            String url = contactData[0];
            String name = contactData[1];
            String phone = contactData[2];
            String mailing = contactData[3];
            String email = contactData[4];
            String date = contactData[5];
            String location = contactData[6];
            String time = contactData[7];
            String postBody = "";

            try {

                postBody = NAME_KEY + "=" + URLEncoder.encode(name, "UTF-8") +
                        "&" + PHONE_KEY + "=" + URLEncoder.encode(phone, "UTF-8") +
                        "&" + MAILING_KEY + "=" + URLEncoder.encode(mailing, "UTF-8") +
                        "&" + EMAIL_KEY + "=" + URLEncoder.encode(email, "UTF-8") +
                        "&" + DATE_KEY + "=" + URLEncoder.encode(date, "UTF-8") +
                        "&" + LOCATION_KEY + "=" + URLEncoder.encode(location, "UTF-8") +
                        "&" + TIME_KEY + "=" + URLEncoder.encode(time, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                result = false;
            }


            try {
                //Create OkHttpClient for sending request
                OkHttpClient client = new OkHttpClient();
                //Create the request body with the help of Media Type
                RequestBody body = RequestBody.create(FORM_DATA_TYPE, postBody);
                Request request = new Request.Builder()
                        .url(url)
                        .post(body)
                        .build();
                //Send the request
                Response response = client.newCall(request).execute();
            } catch (IOException exception) {
                result = false;
            }
            return result;
        }

        @Override
        protected void onPostExecute(Boolean result) {
            //Print Success or failure message accordingly
            Toast.makeText(context, result ? "Your registration is accepted!" : "There was some error in sending message. Please try again after some time.", Toast.LENGTH_LONG).show();
        }




    }
}
