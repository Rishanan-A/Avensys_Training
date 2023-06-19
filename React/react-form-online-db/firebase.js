import firebase from "firebase/compat/app" 
import "firebase/compat/firestore"

const firebaseConfig = {
  apiKey: "****",
  authDomain: "****",
  projectId: "****",
  storageBucket: "****",
  messagingSenderId: "****",
  appId: "****"
};

// Initialize Firebase
const app = firebase.initializeApp(firebaseConfig);
export const db = firebase.firestore()