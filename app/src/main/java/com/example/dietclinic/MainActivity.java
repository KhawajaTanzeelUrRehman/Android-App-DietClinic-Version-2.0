package com.example.dietclinic;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.dietclinic.Fragment.About;
import com.example.dietclinic.Fragment.Chat;
import com.example.dietclinic.Fragment.DietPlan;
import com.example.dietclinic.Fragment.Home;
import com.example.dietclinic.Fragment.Progress;
import com.facebook.login.LoginManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FirebaseAuth auth;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 5
                && keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            Log.d("CDA", "onKeyDown Called");
            onBackPressed();
        }

        return super.onKeyDown(keyCode, event);
    }

    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent setIntent = new Intent(Intent.ACTION_MAIN);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();



        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.dietplan:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new DietPlan());
                        break;
                    case R.id.home:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new Home());
                        break;
                    case R.id.about:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new About());
                        break;
                    case R.id.progress:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new Progress());
                        Intent intent2 = new Intent(MainActivity.this,WeeklyForm.class);
                        startActivity(intent2);
                        break;
                    case R.id.chat:
                        fragmentTransaction.replace(R.id.fragmentContainerView, new Chat());
                        Intent intent1 = new Intent(MainActivity.this,RegistrationForm.class);
                        startActivity(intent1);
                        break;
                }
                fragmentTransaction.commit();
                return true;
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.logout:
                auth.signOut();
                LoginManager.getInstance().logOut();
                Intent intent = new Intent(MainActivity.this,SigninActivity.class);
                startActivity(intent);
                break;

        }
        return true;
    }
}