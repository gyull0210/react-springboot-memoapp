import { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';

function App() {

  const [hello, setHello] = useState("");

  useEffect(() => {
    fetch("/api/hello")
    .then(response => response.text())
    .then(hello => setHello(hello))
  }, []);
  
  console.log(hello);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          {hello}
        </p>
      </header>
    </div>
  );
}

export default App;
