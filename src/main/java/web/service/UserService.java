package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    // @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    //@Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
