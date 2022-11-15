package useCases;
import entities.RegisteredUser;
import java.util.List;
import java.util.Optional;
import java.util.List;
import java.util.Optional;

public interface UserRepositoryInterface {


    static RegisteredUser create(RegisteredUser user) {
        return null;
    }

    static Optional<RegisteredUser> findById(String id) {
        return null;
    }

    Optional<RegisteredUser> findByEmail(String email);

    static List<RegisteredUser> findAllUsers() {
        return null;
    }

    public static boolean existsByUsername(String username) {
        return false;
    }

}
