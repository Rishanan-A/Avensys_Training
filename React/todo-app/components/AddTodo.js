import React, { useState } from 'react';

function TodoForm({ addTodo }) {
  const [value, setValue] = useState("");

  const handleSubmit = e => {
    e.preventDefault();
    if (!value) return;
    addTodo(value);
    setValue("");
  };

  return (
    <form onSubmit={handleSubmit} className="mt-3">
      <div className="input-group">
        <h1>Enter Task :</h1>
        <input
          type="text"
          className="form-control"
          value={value}
          onChange={e => setValue(e.target.value)}
          placeholder="Add a new todo"
        />
        <div className="input-group-append">
          <button className="btn btn-primary">Add</button>
        </div>
      </div>
    </form>
  );
}

export default TodoForm;
