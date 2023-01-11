package lcheun.numble_carrot.controller;

import lcheun.numble_carrot.dto.UserDto;
import lcheun.numble_carrot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value="/users")
public class UserController {

    private final UserService userService;


}