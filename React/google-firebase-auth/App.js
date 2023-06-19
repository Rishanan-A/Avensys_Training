import React, { useEffect, useState } from 'react';
import { auth } from './components/Firebase';
import SignIn from './components/SignIn';
import { signOut } from 'firebase/auth';

function App() {
  const [user, setUser] = useState(null);
  const [weatherData, setWeatherData] = useState({});
  const [backgroundImageUrl, setBackgroundImageUrl] = useState('');

  const fetchWeatherData = async () => {
    const response = await fetch(`http://api.weatherapi.com/v1/current.json?key=04194097832d499d97c65347230606&q=singapore`);
    const data = await response.json();
    setWeatherData(data);
  }

  useEffect(() => {
    auth.onAuthStateChanged(user => {
      setUser(user);
    });

    fetchWeatherData();

    const interval = setInterval(() => {
      fetchWeatherData();
    }, 600000); // 10 minutes

    return () => clearInterval(interval);
  }, []);

  useEffect(() => {
    if (weatherData.current) {
      switch (weatherData.current.condition.text) {
        case 'Sunny':
          setBackgroundImageUrl('https://i.gifer.com/CZx.gif');
          break;
        case 'Rain':
          setBackgroundImageUrl('https://i.gifer.com/Sqvz.gif');
          break;
        case 'Partly cloudy':
          setBackgroundImageUrl('https://i.gifer.com/g1vA.gif');
          break;
        // Add more cases as needed...
        default:
          setBackgroundImageUrl('https://i.gifer.com/Sqvz.gif');
      }
    }
  }, [weatherData]);

  const handleSignOut = async () => {
    try {
      await signOut(auth);
    } catch (error) {
      console.error('Error signing out: ', error);
    }
  };

  return (
    <div className="App" 
         style={{
            backgroundImage: `url(${backgroundImageUrl})`, 
            backgroundSize: 'cover', 
            backgroundPosition: 'center', 
            width: '100vw', 
            height: '100vh',
            backgroundRepeat: 'no-repeat'
         }}>
      {user ? (
        <div>
          <button onClick={handleSignOut} className="btn btn-danger position-absolute top-0 end-0 m-3">Logout</button>
          <h1 className="text-center mt-5">Welcome, {user.displayName}</h1>
          <h2 className="text-center mt-5">Current temperature in {weatherData.location?.name} is {weatherData.current?.temp_c}°C</h2>
          <h3 className="text-center">Weather condition: {weatherData.current?.condition.text} <img className="weather-image" src={weatherData.current?.condition.icon} alt="Weather icon" /></h3>
        </div>
      ) : (
        <SignIn />
      )}
    </div>
  );



}

export default App;
