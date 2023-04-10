package com.task.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.task.roomdatabase.RoomDatabaseConnection.AppDatabase;
import com.task.roomdatabase.UserApplicationDataMOdel.User;
import com.task.roomdatabase.UserQuery.UserDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    UserDao userDao;
    List<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "test_db").build();
        userDao = db.userDao();
        User u1=new User();
        u1.firstName="Rishant";
        u1.lastName="kaushik";
        u1.uid=1;
        userDao.insertAll(u1);
        users = userDao.getAll();
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }

    }
}