package dao;

import profile.ProfileUser;

public interface UserDao {

        ProfileUser get(long id);
        void create(ProfileUser user);
        void update(ProfileUser user);
        void delete(ProfileUser user);
}
