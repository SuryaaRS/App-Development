// import React from 'react';
// import './sidebar.css';
// import {SidebarData} from './SidebarData';
// function Sidebar() {
//   return (
//     <div className="Appsidebardash">
//     <div className='.Sidebardash'>
//       <ul className='SidebarList'>
//         {SidebarData.map((val,key)=>{
//           return (
//             <li 
//             key={key}
//             className='small'
//             id={ window.location.pathname==val.link?"dashactive":""}
//           onClick={()=>{
//             window.location.pathname=val.link;
//           }}
//           >
//               <div id='dashicon'>
//                 {val.icon}
//               </div>
//               <div id='dashtitle'>
//                 {val.title}
//               </div>
//             </li>
//           );
//         })}
//       </ul>
//     </div>
//     </div>
    
//     );  
//   }
  
// export default Sidebar
import React, { useEffect } from 'react';
import { SidebarData } from './SidebarData';
import './Dashboard.css'; // Import your CSS for styling
import { useState } from 'react';
import { getAllvendor } from '../Service/Api';

function VendorDash() {
  const[details,setDetails]=useState([]);
  useEffect(()=>{
    getAllVendor();
  },[])
  async function getAllVendor()
  {
    try{
        await getAllvendor().then((res)=>
        {
          setDetails(res.data)
        })
    }
    catch(error){
      console.log("error");
    }
  }
  console.log(details);
  return (
    <>
      <nav className="sidebardash">
        <ul className="nav-menu">
          {SidebarData.map((item, index) => (
            <li key={index} className="nav-item">
              <a href={item.path} className="nav-link">
                {item.icon}
                <span className="nav-text">{item.title}</span>
              </a>
            </li>
          ))}
        </ul>
      </nav>
      <div id='navbarcard'>


      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid">
          <a className="navbar-brand" href="#">Navbar</a>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">Link</a>
              </li>
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a className="dropdown-item" href="#">Action</a></li>
                  <li><a className="dropdown-item" href="#">Another action</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li className="nav-item">
                <a className="nav-link disabled" href="#" tabIndex="-1" aria-disabled="true">Disabled</a>
              </li>
            </ul>
            <form className="d-flex">
              <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
              <div id='searchbtn'>
              <button className="btn btn-outline-success" type="submit">Search</button>
              </div>
            </form>
          </div>
        </div>
      </nav>
      <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th>Vendor ID</th>
                                    <th>Farm Name</th>
                                    <th>Farm Desc</th>
                                    <th>Vendor Num</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    details.map(
                                      (current) => {
                                        return(

                                        <tr key = {current.vendor_id}>
                                            <td> {current.vendor_id}</td>
                                             <td> { current.farmname} </td>   
                                             <td> {current.farmdesc}</td>
                                             <td> {current.vendornum}</td>
                                             {/* <td> {current.prod.price}</td>  */}
                                             <td>
                                                 <button onClick={ () => {}} className="btn btn-info">Update </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => {}} className="btn btn-danger">Delete </button>
                                                 <button style={{marginLeft: "10px"}} onClick={ () => {}} className="btn btn-info">View </button>
                                             </td>
                                        </tr>
                                        )
                                      }
                                    )
                                }
                            </tbody>

                            
                        </table>
                 </div>
      </div>
    </>
  );
}

export default VendorDash;
