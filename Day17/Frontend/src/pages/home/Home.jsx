import React from "react"
import { Category } from "../../components/category/Category"
import { Order } from "../../components/hero/Order"
import { Slider } from "../../components/hero/Slider"
import { Product } from "../../components/product/Product"
import { Header } from "../../components/header/Header"
import { Footer } from "../../components/footer/Footer"

export const Home = () => {
  return (
    <>
    <Header/>
      <Slider />
      <Order />
      <Category />
      <Product />
      <Footer/>
    </>
  )
}
