package com.hw.spring_todo;

import com.hw.spring_todo.entity.Todo;
import com.hw.spring_todo.entity.User;
import com.hw.spring_todo.repository.TodoRepository;
import com.hw.spring_todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTodoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringTodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setPassword("password to be hashed");
		user.setUsername("Dee");

		Todo todo = new Todo();
		todo.setContent("finish project");

		user.getTodoList().add(todo);

		userRepository.save(user);
	}
}
