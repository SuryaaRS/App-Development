import React from 'react';

// styling
import './App.css';
import Admin from './Admin';
import Container from './container/Container';
import {BrowserRouter, Routes, Route} from 'react-router-dom';

const App = () => {
  return (
   
     <BrowserRouter>
     <Routes>
      <Route path='/' element={<Container />} />
      <Route path='/admin' element={<Admin />} />
     </Routes>
     </BrowserRouter>
    

  
  );
}

export default App;
