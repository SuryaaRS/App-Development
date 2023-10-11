import axios from "axios"

let jwtToken = localStorage.getItem('token');
let uid = localStorage.getItem('id');
let authHeader = `Bearer ${jwtToken}`;

export const HEADER = {
    'Authorization' : authHeader,
    'Content-Type' : "application/json"
}

const baseURL = 'http://localhost:8080';
export const getAllvendor = async()=>await axios.get(`${baseURL}/vendor/getAllVendor`,{headers:HEADER})
export const getAllProduct = async()=>await axios.get(`${baseURL}/product/getAllproduct`,{headers:HEADER})