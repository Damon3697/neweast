import com.neweast.demo.domain.User;
import com.neweast.demo.mapper.UserMapper;
import com.neweast.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liwg2 on 2018/1/8.
 */
public class UserTest extends BaseJUnitTest{

    @Autowired
    private UserService userService;
    @Test
    public void userTest(){
        User user = userService.getUserById(1L);
        System.out.println(user.getUserName());
    }
}
