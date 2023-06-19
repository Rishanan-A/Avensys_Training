import React from 'react';
import './contact.css';
import 'bootstrap/dist/css/bootstrap.min.css';

// Contact.js
function Contact({ cardName, cardDesc, cardPic }) {
    return (
      <div className="card">
        <img src={cardPic} className="card-img-top" alt={cardName} />
        <div className="card-body">
          <h5 className="card-title">{cardName}</h5>
          <p className="card-text">{cardDesc}</p>
          <a href="#" className="btn btn-primary">Go somewhere</a>
        </div>
      </div>
    );
  }
  
  export default Contact;
  
