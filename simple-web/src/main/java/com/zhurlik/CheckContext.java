package com.zhurlik;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

import static org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext;

/**
 * A simple class just to check beans from Global Spring Context.
 *
 * @author zhurlik@gmail.com
 */
public class CheckContext {

    public static String printInfo(final ServletContext context) {
        final ApplicationContext spring = getWebApplicationContext(context);
        return new StringBuilder()
                .append(">> Web Spring Context: ").append(spring)
                .append("<br/>")
                .append(spring.getBean("test", String.class))
                .append("<br/>")
                .append(spring.getBean("webBean", String.class)).toString();
    }
}
