import com.neweast.demo.domain.User;
import com.neweast.demo.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liwg2 on 2018/1/8.
 */
public class UserTest extends BaseJUnitTest{

    @Autowired
    private UserMapper userMapper;
    @Test
    public void userTest(){
        User user = userMapper.getUserById(1L);
        System.out.println(user.getUserName());
    }
}
