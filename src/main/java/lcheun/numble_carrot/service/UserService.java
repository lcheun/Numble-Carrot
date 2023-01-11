package lcheun.numble_carrot.service;

import jakarta.transaction.Transactional;
import lcheun.numble_carrot.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserService {


}
