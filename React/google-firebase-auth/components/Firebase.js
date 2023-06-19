import { initializeApp } from 'firebase/app';
import { getAuth } from 'firebase/auth';

const firebaseConfig = {
    apiKey: "AIzaSyA-7s5ixG9MpwzhWlxLYq6CaNPTIq3IJyw",
    authDomain: "fir-auth-d2386.firebaseapp.com",
    projectId: "fir-auth-d2386",
    storageBucket: "fir-auth-d2386.appspot.com",
    messagingSenderId: "1022369554521",
    appId: "1:1022369554521:web:9943d9176c17ae1c469148"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
export const auth = getAuth(app);
