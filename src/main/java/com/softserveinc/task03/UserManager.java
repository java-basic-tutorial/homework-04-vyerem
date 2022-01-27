package com.softserveinc.task03;

import java.util.HashSet;
import java.util.Set;

public class UserManager {
    private final Set<User> users;

    public UserManager() {
        this.users = new HashSet<>();
    }

    public void register (String login, String password){
//        User user = new User(login, password);
//        users.add(user);
        users.add(new User(login, password));
    }
    public void delete (String login) {
//        User user;
        for (User u: users) {
            if (u.getLogin().equals(login)) {
               users.remove(u);
                //user = u;
            }
        }
    }
    public boolean exists (String login, String password){
        for (User i: users) {
              if (i.getLogin().equals(login) && i.getPassword().equals(password)) {
                  return true;
              }
        }
        return false;
    }
    public boolean changePassword(String login, String oldPassword, String newPassword){
        for (User n: users) {
            if (n.getLogin().equals(login) && n.getPassword().equals(oldPassword)) {
                n.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }
}
