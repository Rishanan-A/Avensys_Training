import React, { useState, useEffect } from "react";

function App() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then((response) => response.json())
      .then((data) => {
        setCount(data.length);
      })
      .catch((error) => {
        console.error(error);
      });
  }, []);

  function increaseCount() {
    setCount(count + 1);
  };

  return (
    <div className="App">
      <h2>Testing react code</h2>
      <h2>Hello</h2>
      
      <div>
        <p>Count: {count}</p>
        <button onClick={increaseCount}>Increase</button>
      </div>
    </div>
  );
}

export default App;
