import { render } from 'react-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Navbar';

function App() {
  return (
    <div>
      <Navbar/>
    </div>
  );
}

render(<App />, document.getElementById('root'));
