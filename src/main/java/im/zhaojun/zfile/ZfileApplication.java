package im.zhaojun.zfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@ServletComponentScan(basePackages = "im.zhaojun.zfile.*.filter")
@ComponentScan(basePackages = "im.zhaojun.zfile.*")
public class ZfileApplication {


    public static void main(String[] args) {
        SpringApplication.run(ZfileApplication.class, args);
    }


}