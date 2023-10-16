// import React from 'react';
// import { useState } from 'react';
// import '../../login.css';
// import axios from 'axios';
// import { useHistory } from 'react-router-dom';

// const SignUp = () => {
//   const [name, setname] = useState("");
//   const [email, setemail] = useState("");
//   const [password, setpassword] = useState("");

//   // let history = useHistory();

//   const handleEmailChange = (e) => {
//     setemail(e.target.value);
// };

//   const handleNameChange = (e) => {
//     setname(e.target.value);
// };
// const handlePasswordChange = (e) => {
//   setpassword(e.target.value);
// };
// const handleSubmit = (e) => {
//   e.preventDefault();
//   const details = { email, password }
//   }
//   let history=useHistory();
//   const handleSignup=async(e)=>
//   {
//     try{
//       const response=await axios.post('http://localhost:8080/api/v1/auth/register',{
//         name:name,
//         email:email,
//         password:password,
//         role:"CUSTOMER"

//       });
//       if(response.status===200)
//       {
//         history.push("/home")
//       }

//     }
//     catch(error){
//       console.log("error");
//     }

//   }
  

//   const details = {name, email, password }
//   return (
//     <div className="form-comp cfb" style={{marginTop:""}}>
//       <h1>Create an new Account</h1>
//       <form className="sign-up-form cfb" onSubmit={handleSubmit}>

//         <label>
//           Name:
//           <br/>
//           <input type="name" required  placeholder='Enter your Name'  onChange={handleNameChange} />
//         </label>
//         <label>
//           Email:
//           <br/>
//           <input type="email" required  placeholder='Enter your Email'  onChange={handleEmailChange}/>
//         </label>
//         <label>
//           Password:
//           <br/>
//           <input type="password" required  placeholder='Enter your Password' onChange={handlePasswordChange}/>
//         </label>
        
//         <button onClick={handleSignup}>
//           Sign Up
//         </button>
//       </form>
//     </div>
//   );
// }

// export default SignUp;