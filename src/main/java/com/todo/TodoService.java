package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo("american people" ,"USA"));
		todos.add(new Todo("britanic","Gb"));
		todos.add(new Todo("parisian", "France"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
}


