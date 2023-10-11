import React from "react"
import { AiFillTwitterCircle, AiFillLinkedin } from "react-icons/ai"
import { BsFacebook } from "react-icons/bs"
import { RiInstagramFill } from "react-icons/ri"
import './footer.css';

export const Footer = () => {
  return (
    <>
      <footer className='boxItems'>
        <div className="footerhome">

        <div className='container flex'>
          
        <div className='textfooter'>
          <div className="textsize">

              <h3>CONTACT US</h3>
              <h4>
                <span>ADDRESS: </span>8638 Amarica Stranfod Mailbon Star, California, TX 70240
              </h4>
              <h4>
                <span>MAIL: </span>support@example.com
              </h4>
              <h4>
                <span>PHONE: </span>+7464 0187 3535 645
              </h4>
              <h4>
                <span>FAX ID: </span>+9 659459 49594
              </h4>
            </div>
          </div>
        
        <p className="textpara">Local Farmer's Market Online platform - All right reserved </p>

          <div className='social'>
    
          <a href={"https://accountscenter.instagram.com/"} target="_blank" rel="noopener noreferrer">
         <BsFacebook className='icon' />
         </a>
         <a href={"https://www.facebook.com/login.php"} target="_blank" rel="noopener noreferrer">
         <RiInstagramFill className='icon' />
         </a>
         <a href={"https://twitter.com/i/flow/login"} target="_blank" rel="noopener noreferrer">
         <AiFillTwitterCircle className='icon' />
         </a>
         <a href={"https://in.linkedin.com/"} target="_blank" rel="noopener noreferrer">
         <AiFillLinkedin className='icon' />
         </a>
        </div>
          </div>
          </div>
      </footer>
    </>
  )
}
