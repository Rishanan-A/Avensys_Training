import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';

function TodoApp() {
  const [input, setInput] = useState('');
  const udispatch = useDispatch();
  const todos = useSelector(state => state.todos);

  const handleSubmit = (event) => {
    event.preventDefault();

    udispatch({
      type: 'ADD_TODO',
      payload: input
    });

    setInput('');
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        Enter task: <input value={input} onChange={e => setInput(e.target.value)} />
        <button type="submit">Submit</button>
      </form>
      <ul>
        {todos.map((todo, index) => <li key={index}>{todo}</li>)}
      </ul>
    </div>
  );
}

export default TodoApp;
