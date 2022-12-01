package ac8.follow.ac8_todolist.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<String> todoList = new ArrayList<>();

    @GetMapping("/list")
    public List<String> list(){
        return todoList;
    }

    @GetMapping("/receiveList")
    public List<String> receiveList(String todo){
        todoList.add(todo);
        return todoList;
    }

    @GetMapping("/deleteList")
    public List<String> deleteList(int todo) {
        todoList.remove(todo)
        return todoList;
    }

} //CLASS
