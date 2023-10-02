package engineer.maiko.service;

import engineer.maiko.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
