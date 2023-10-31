package model.dao;

import android.content.Context;

import java.util.LinkedList;
import java.util.List;

public class UserDAO {

    private final Context context;
    private List<User> dataset;

    public UserDAO(Context context){
        this.context = context;
        dataset = new LinkedList<>();
        readSharedPreferences();
    }

    public boolean create(User user){
        if (user != null){
            if(!dataset.contains(user)){
                dataset.add(user);
                writeSharedPreferences();
                readSharedPreferences();
                return true;
            }
        }
        return false;
    }

    public User recuperate(String username){
        return dataset.stream().filter(user-> user.getName().equals(username)).findFirst().orElse(null);
    }


}
