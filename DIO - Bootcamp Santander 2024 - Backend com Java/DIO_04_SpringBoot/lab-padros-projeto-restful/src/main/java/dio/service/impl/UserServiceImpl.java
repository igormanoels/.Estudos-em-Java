package dio.service.impl;

import dio.domain.model.User;
import dio.domain.repository.UserRepository;
import dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber()))
        {
            throw new IllegalArgumentException("A conta informada já existe.");
        }
        return userRepository.save(userToCreate);
    }
}
