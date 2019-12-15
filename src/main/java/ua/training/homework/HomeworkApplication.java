package ua.training.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.homework.entity.User;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		User user = context.getBean("user", User.class);
		System.out.println(user.toString());
		context.close();
	}

}
