import React from 'react';
import TodoItem from './TodoItem';

function TodoList({ todos, removeTodo, updateTodo }) {
  return (
    <div>
      {todos.map((todo, index) => (
        <TodoItem key={todo.id} todo={todo} index={index} removeTodo={removeTodo} updateTodo={updateTodo} />
      ))}
    </div>
  );
}

export default TodoList;
