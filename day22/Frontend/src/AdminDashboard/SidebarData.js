// import React from 'react';
// import HomeIcon from '@mui/icons-material/Home';
// import ContactMailIcon from '@mui/icons-material/ContactMail';
// import DashboardIcon from '@mui/icons-material/Dashboard';
// import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
// import AnalyticsIcon from '@mui/icons-material/Analytics';
// import PersonTwoToneIcon from '@mui/icons-material/PersonTwoTone';


// export const SidebarData =[

//     {
//         title:"Home",
//         icon:<HomeIcon/>,
//         link:"/home"
//     },
//     {
//         title:"MailBox",
//         icon:<ContactMailIcon/>,
//         link:"/mailbox"
//     },
//     {
//         title:"Dashboard",
//         icon:<DashboardIcon/>,
//         link:"/dashboard"
//     },
//     {
//         title:"ShoppingCart",
//         icon:<ShoppingCartIcon/>,
//         link:"/shoppingcart"
//     },
//     {
//         title:"Analytics",
//         icon:<AnalyticsIcon/>,
//         link:"/analytics"
//     },
//     {
//         title:"Person",
//         icon:<PersonTwoToneIcon/>,
//         link:"/person"
//     }
// ]
import React from 'react';
import * as FaIcons from 'react-icons/fa';
import * as AiIcons from 'react-icons/ai';
import * as IoIcons from 'react-icons/io';

export const SidebarData = [
  {
    title: 'Home',
    path: '/home',
    icon: <AiIcons.AiFillHome />,
    cName: 'nav-text'
  },
  {
    title: 'Reports',
    path: '/reports',
    icon: <IoIcons.IoIosPaper />,
    cName: 'nav-text'
  },
  {
    title: 'Manage Product',
    path: '/Productdash',
    icon: <FaIcons.FaCartPlus />,
    cName: 'nav-text'
  },
  {
    title: 'Manage Vendors',
    path: '/Vendordash',
    icon: <IoIcons.IoMdPeople />,
    cName: 'nav-text'
  },
  {
    title: 'Messages',
    path: '/messages',
    icon: <FaIcons.FaEnvelopeOpenText />,
    cName: 'nav-text'
  },
  {
    title: 'Support',
    path: '/support',
    icon: <IoIcons.IoMdHelpCircle />,
    cName: 'nav-text'
  }
];