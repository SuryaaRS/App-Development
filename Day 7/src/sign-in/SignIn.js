import React, { useState } from 'react';

// import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';

import '../App.css';

const SignIn = () => {

  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");

  // let history = useHistory();

  const handleEmailChange = (e) =>
   {
    setemail(e.target.value);
   };
const handlePasswordChange = (e) => 
{
  setpassword(e.target.value);
};

  const handleSubmit = (e) =>{
    e.preventDefault()
    
  }

  return (
    <div className="form-comp cfb">
      <h1>Login</h1>
      <form className="sign-up-form cfb" onSubmit={handleSubmit}>
        <label>
          Email:
          <br/>
          <input type="email" placeholder='Enter your Email' onChange={handleEmailChange}/>
        </label>
        <label>
          Password:
          <br/>
          <input type="password"  placeholder='Enter your Password'onChange={handlePasswordChange} />
        </label>
        <br/>
        <button> 
         Log In
        </button>
      </form>
    </div>
  );
}

export default SignIn;
