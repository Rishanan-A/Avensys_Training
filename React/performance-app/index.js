import React from 'react';
import ReactDOM from 'react-dom';
import {Launch} from './Launch'

function App() {
    return (
        <div>
            <h1>Hello</h1>
            <Launch />
        </div>
    );
}

ReactDOM.render(<App />, document.getElementById('root'));
