// import React, {useState} from 'react';
// import { Link } from 'react-router-dom';
// import '../login.css';

// components
// import SignIn from '../login/sign-in/SignIn';
// import SignUp from '../login/sign-up/SignUp'; 

// const Container = () => {
//   const [welcome, setWelcome] = useState(false)

//   const setBannerClass = () => {
//     const classArr = ["banner-side cfb"]
//     if(welcome)
//     {
//        classArr.push('send-right')
//     }
//     return classArr.join(' ')
//   }

//   const setFormClass = () => {
//     const classArr = ["form-side cfb"] 
//     if (welcome)
//     {
//       classArr.push('send-left')
//     } 
//     return classArr.join(' ')
//   }

//   return (
//     <div className="App cfb">

//     <div className="Container cfb">

//       <div className={setBannerClass()}> 

//         {welcome ? 
//           <h2>Hello!!</h2>
//             : <h2>Welcome Back</h2>}

//         <Link style={{textDecoration:"none" , color:"white"}}><btn onClick={()=> setWelcome(!welcome)}>
//           {welcome ?
//             "Log In"
//               : "Create new Account"}
//         </btn>
//         </Link>
//       </div>
//       <div className={setFormClass()}> 
//           {welcome ? 
//             <SignUp /> 
//               : <SignIn/>
//           }
          
//       </div>
//     </div>
//     </div>
//   );
// }

// export default Container;