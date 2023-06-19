import React from 'react';
import { auth } from './Firebase';
import { GoogleAuthProvider, signInWithPopup } from 'firebase/auth';

import googleLogo from './googleLogo.png';

const SignIn = () => {
  const signInWithGoogle = async () => {
    const provider = new GoogleAuthProvider();

    try {
      await signInWithPopup(auth, provider);
    } catch (error) {

      if (error.code === 'auth/popup-closed-by-user') {
        
        return;
      }
      // For any other errors, you might want to handle them differently
      console.error(error);
    }
  };

  return (
    <div className="d-flex justify-content-center align-items-center" style={{ height: '100vh' }}>
      <div className="p-5 border bg-light shadow">
        <h2 className="mb-4 text-center">Sign in</h2>
        <button onClick={signInWithGoogle} className="btn btn-secondary d-flex align-items-center">
          <img src={googleLogo} alt="Google Logo" style={{ width: '24px', marginRight: '8px' }} />
          <span>Sign in with Google</span>
        </button>
      </div>
    </div>
  );
};

export default SignIn;
