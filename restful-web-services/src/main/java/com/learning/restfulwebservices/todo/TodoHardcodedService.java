package com.learning.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<Todo>();

    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "ken", "Learn Angular", new Date(), false));
        todos.add(new Todo(++idCounter, "ken", "Learn Spring", new Date(), false));
        todos.add(new Todo(++idCounter, "ken", "Learn Kubernets", new Date(), false));

    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if (todo == null) {
            return null;
        }

        if (todos.remove(todo)) {
            return todo;
        }

        return null;

    }

    public Todo findById(long id) {
        for (Todo todo : todos) {
            if (id == todo.getId()) {
                return todo;
            }
        }
        return null;
    }

    public Todo saveTodo(Todo todo) {
        if(todo.getId() > 0) {
            deleteById(todo.getId());
            todos.add(todo);
        }
        else {
            todo.setId(++idCounter);
            todos.add(todo);
        }

        return todo;
    }

}
