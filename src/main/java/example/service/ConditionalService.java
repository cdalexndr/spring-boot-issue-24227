package example.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean(String.class) //to fail
public class ConditionalService implements BaseService{
}
