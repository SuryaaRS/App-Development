// import React, { useState } from 'react';
// // import { useHistory } from 'react-router-dom/cjs/react-router-dom.min';
// import { Link, useHistory } from 'react-router-dom';
// // styling
// import '../../login.css';
// import axios from 'axios';
// import apiconfig from '../../Service/Api';

// const SignIn = () => {
// const history = useHistory();
//   const [email, setemail] = useState("");
//   const [password, setpassword] = useState("");

//   // let history = useHistory();
// const handleLogin = async(e) =>{

//   try{
//     const response=await axios.post('http://localhost:8080/api/v1/auth/login',{
//       email:email,
//       password:password
//     });
//     if(response.status===200)
//     {
//       // apiconfig(response.data)
//       history.push("/home")
//     }
// }
// catch(error)
// {
//   console.log("error");

// }

//   const handleEmailChange = (e) =>
//    {
//     setemail(e.target.value);
//    };
// const handlePasswordChange = (e) => 
// {
//   setpassword(e.target.value);
// };

//   const handleSubmit = (e) =>{
//     e.preventDefault()
    
//   }
//   return (
//     <div className="form-comp cfb">
//       <h1>Login</h1>
//       <form className="sign-up-form cfb" onSubmit={handleSubmit}>
//         <label>
//           Email:
//           <br/>
//           <input type="email" required  placeholder='Enter your Email' onChange={handleEmailChange}/>
//         </label>
//         <label>
//           Password:
//           <br/>
//           <input type="password" required  placeholder='Enter your Password'onChange={handlePasswordChange} />
//         </label>
//         <br/>
//         <button className='btn' onClick={handleLogin}>
//          Log In
//         </button>
        
//       </form>
//     </div>
//   );
// }
// }

// export default SignIn;
