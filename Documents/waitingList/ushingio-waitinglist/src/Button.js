import React from 'react';
import { Link } from 'react-router-dom'
import "./styles/header.css"

export default function Button() {
  return <div className="header-button">
      <Link 
      to="/commuters"
      className="button"> JOIN OUR WAITLIST </Link>
  </div>;
}

 
