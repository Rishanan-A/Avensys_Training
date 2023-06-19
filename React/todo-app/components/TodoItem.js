import React, { useState } from 'react';

function TodoItem({ todo, index, removeTodo, updateTodo }) {
  const [isEditing, setIsEditing] = useState(false);
  const [editText, setEditText] = useState(todo.text);

  const handleEdit = () => {
    setIsEditing(true);
  };

  const handleSave = () => {
    setIsEditing(false);
    updateTodo(todo.id, editText);
  };

  const handleTextChange = (event) => {
    setEditText(event.target.value);
  };

  return (
    <div className="card mt-3">
      <div className="card-body">
        {
          isEditing ? 
          <>
            <input type="text" value={editText} onChange={handleTextChange} className="form-control"/>
            <button className="btn btn-success ml-3" onClick={handleSave}>Save</button>
          </> :
          <>
            <h5>{index + 1}. {todo.text}</h5>
            <button className="btn btn-danger ml-3" onClick={() => removeTodo(todo.id)}>Delete</button>
            <button className="btn btn-primary ml-3" onClick={handleEdit}>Edit</button>
          </>
        }
      </div>
    </div>
  );
}

export default TodoItem;
