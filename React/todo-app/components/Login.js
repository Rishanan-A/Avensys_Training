import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

function Login({ onLogin }) {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");

  const handleLogin = (e) => {
    e.preventDefault();
    if (username === "Raju" && password === "Welcome") {
      onLogin(username);
    } else {
      setError("Invalid username or password.");
    }
  };

  return (
    <div className="container">
      <form onSubmit={handleLogin} className="mt-5">
        <h1>Login</h1>
        {error && <div className="alert alert-danger">{error}</div>}
        <input
          type="text"
          className="form-control mt-3"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
          placeholder="Username"
        />
        <input
          type="password"
          className="form-control mt-3"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          placeholder="Password"
        />
        <button className="btn btn-primary mt-3">Login</button>
      </form>
    </div>
  );
}

export default Login;
