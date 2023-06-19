import {render} from 'react-dom';
import RegistrationFrom from './RegistrationFrom';

function App() {
    return (
        <div>
            <h2>Welcome to Form Validation</h2>
            <RegistrationFrom/>
        </div>
    );
}

render(<App />, document.getElementById('root'));
