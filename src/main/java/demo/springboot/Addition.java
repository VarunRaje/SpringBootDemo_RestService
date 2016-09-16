package demo.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by vdeshpande on 09-09-2016.
 */
@Component
public class Addition {

    public int add(int a, int b){
        return a+b;
    }
}
