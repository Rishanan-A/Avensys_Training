import React from 'react';
import { Provider } from 'react-redux';
import TodoApp from './components/First'; 
import redux from './components/redux'; 

function App() {
  return (
    <Provider store={redux}>
      <TodoApp />
    </Provider>
  );
}

export default App;
