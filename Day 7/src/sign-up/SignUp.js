import React from "react";
import {useNavigate } from 'react-router-dom'
import { useState } from "react";
import { signup } from "../features/user";
import { useDispatch } from "react-redux";

// styling
import "../App.css";

const SignUp = () => {
  const [name, setname] = useState("");
  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");

 
  let dispatch = useDispatch();
  let navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();


    if (email.trim() && name.trim() && password.trim()) {

      dispatch(signup({ name: name, email: email, password: password }));
      navigate('/admin');
    }
  };

  const handleEmailChange = (e) => {
    setemail(e.target.value);
  };

  const handleNameChange = (e) => {
    setname(e.target.value);
  };
  const handlePasswordChange = (e) => {
    setpassword(e.target.value);
  };

  const details = { name, email, password };
  return (
    <div className="form-comp cfb">
      <h1>Create an new Account</h1>
      <form className="sign-up-form cfb" onSubmit={handleSubmit}>
        <label>
          Name:
          <br />
          <input
            type="name"
            placeholder="Enter your Name"
            onChange={handleNameChange}
          />
        </label>
        <label>
          Email:
          <br />
          <input
            type="email"
            placeholder="Enter your Email"
            onChange={handleEmailChange}
          />
        </label>
        <label>
          Create Password:
          <br />
          <input
            type="password"
            placeholder="Enter your Password"
            onChange={handlePasswordChange}
          />
        </label>
        <br />
        <label>
          Confirm Password:
          <br />
          <input type="password" placeholder="ReEnter your Password" />
        </label>

        <button
          type="submit"
        >
          Sign Up
        </button>
      </form>
    </div>
  );
};

export default SignUp;
