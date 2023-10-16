import React from "react"
import Dashboard from './AdminDashboard/Dashboard';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom"
import { Account } from "./pages/account/Account"
import { Home } from "./pages/home/Home" 
import { useSelector } from "react-redux"
import LoginSignup from "./components/LoginSignup/LoginSignup"
import ProductDash from "./AdminDashboard/ProductDash";
import VendorDash from "./AdminDashboard/VendorDash";

const App = () => {
  const isLoggIn = useSelector((state) => state.auth.isLoggIn)
  const cartItems = useSelector((state) => state.cart.itemsList)
  console.log(cartItems)
  return (
    <>
       
        <Router>
        
          <Switch>
          <Route exact path='/dashboard' component={Dashboard} />
          <Route exact path='/Vendordash' component={VendorDash} />
          <Route exact path='/Productdash' component={ProductDash} />
            <Route exact path='/' component={LoginSignup} />
            <Route exact path='/home' component={Home} />
            <Route exact path='/account' component={Account} />
          </Switch>
        
        </Router>
   
    </>
  )
  
}
export default App

// import './App.css';
// import Sidebar from './Dashboard/Sidebar';
// function App() {
//   return (
//     <div className="App">
//       <Sidebar/>
//     </div>
//   );
// }

// export default App;
// import React from 'react';// Import your Dashboard component
// import Product from './AdminDashboard/Product';


// function App() {
//   return (
//     <div className="App">
//       {/* Add any other components or content here */}
//       <Product/>

//     </div>
//   );
// }

// export default App;
