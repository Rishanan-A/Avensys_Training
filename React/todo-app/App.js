import React, { useState } from 'react';
import TodoForm from './components/AddTodo';
import TodoList from './components/TodoList';
import Login from './components/Login';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [loggedIn, setLoggedIn] = useState(false);
  const [username, setUsername] = useState("");
  const [todos, setTodos] = useState([]);

  const addTodo = text => {
    const newTodos = [...todos, { text, id: Date.now() }];
    setTodos(newTodos);
  };

  const removeTodo = id => {
    const newTodos = todos.filter(todo => todo.id !== id);
    setTodos(newTodos);
  };

  const updateTodo = (id, newText) => {
    const newTodos = todos.map(todo => {
      if (todo.id === id) {
        return { ...todo, text: newText };
      } else {
        return todo;
      }
    });
    setTodos(newTodos);
  };

  const handleLogin = (username) => {
    setLoggedIn(true);
    setUsername(username);
  };

  return loggedIn ? (
    <div className="container">
      <h1 className="mt-5 text-center">Welcome to To-Do app, {username}</h1>
      <h2 className="mt-3 text-center">Todo List</h2>
      <TodoForm addTodo={addTodo} />
      <TodoList todos={todos} removeTodo={removeTodo} updateTodo={updateTodo} />
    </div>
  ) : (
    <Login onLogin={handleLogin} />
  );
}

export default App;