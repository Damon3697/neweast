import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liwg2 on 2018/1/8.
 */

@ContextConfiguration(locations = {
        "classpath:spring-config-dao.xml",
        "classpath:spring-config-service.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseJUnitTest {
}
