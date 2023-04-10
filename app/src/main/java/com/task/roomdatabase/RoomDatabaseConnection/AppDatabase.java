package com.task.roomdatabase.RoomDatabaseConnection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.task.roomdatabase.UserApplicationDataMOdel.User;
import com.task.roomdatabase.UserQuery.UserDao;

@Database(entities = {User.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends  RoomDatabase {


        public abstract UserDao userDao();

}
