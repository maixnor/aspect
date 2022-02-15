package at.spengergasse.library.persistance;

import at.spengergasse.library.billing.User;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class UserRepository {

    private Hashtable<Long, User> users = new Hashtable<>();

    public User fromId(Long id) {
        if (!users.containsKey(id)) {
            users.put(id, new User(id));
        }
        return users.get(id);
    }

}
