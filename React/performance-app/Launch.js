import React, { useState, useMemo } from 'react';

export function Launch() {
  const [number, setNumber] = useState(0);
  const [enteredName, setEnteredName] = useState('');

  function increaseIt() {
    setNumber(number + 1);
  }

  function decreaseIt() {
    setNumber(number - 1);
  }

  function collectIt(event) {
    setEnteredName(event.target.value);
  }

  const numberCube = useMemo(() => {
    return number * number * number;
  }, [number]);

  const memoizedEnteredName = useMemo(() => {
    return enteredName;
  }, [enteredName]);

  return (
    <div>
      <h2>This Number is: {number} and its cube is {numberCube}</h2>
      <button onClick={increaseIt}>Increase</button>
      <button onClick={decreaseIt}>Decrease</button>
      <hr />

      <h2>The name is: {memoizedEnteredName}</h2>
      Enter the name:
      <input type="text" id="text" onChange={collectIt} />
    </div>
  );
}

export default Launch;
