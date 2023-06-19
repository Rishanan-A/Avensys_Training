
import React, { useState } from 'react';
import Contact from './contact';

function App() {
  const [profiles, setProfiles] = useState([{
    name: 'Rishanan',
    desc: 'Software Developer',
    pic: 'https://static.vecteezy.com/system/resources/previews/005/544/718/original/profile-icon-design-free-vector.jpg'
  }]);

  const [newProfile, setNewProfile] = useState({
    name: '',
    desc: '',
    pic: '',
  });

  const handleInputChange = (e) => {
    setNewProfile({
      ...newProfile,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setProfiles(profiles.concat(newProfile));
    setNewProfile({ name: '', desc: '', pic: '' });
  };

  return (
    <div>
      <form onSubmit={handleSubmit} className="mt-4">
        <div className="mb-3 col-2">
          <label htmlFor="name" className="form-label">Name:</label>
          <input
            type="text"
            id="name"
            name="name"
            className="form-control"
            value={newProfile.name}
            onChange={handleInputChange}
          />
        </div>

        <div className="mb-3 col-2">
          <label htmlFor="desc" className="form-label">Description:</label>
          <input
            type="text"
            id="desc"
            name="desc"
            className="form-control"
            value={newProfile.desc}
            onChange={handleInputChange}
          />
        </div>

        <div className="mb-3 col-2">
          <label htmlFor="pic" className="form-label">Picture URL:</label>
          <input
            type="text"
            id="pic"
            name="pic"
            className="form-control"
            value={newProfile.pic}
            onChange={handleInputChange}
          />
        </div>
      
        <button type="submit" className="btn btn-primary">Add profile</button>
      </form>
      
      <div className="container">
        <div className="row">
          {profiles.map((profile, index) => (
            <div className="col-sm">
              <Contact
                key={index}
                cardName={profile.name}
                cardDesc={profile.desc}
                cardPic={profile.pic}
              />
            </div>
          ))}
        </div>
      </div>

    </div>
  );
}

export default App;
