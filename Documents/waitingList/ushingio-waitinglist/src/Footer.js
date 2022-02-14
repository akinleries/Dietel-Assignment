import React from "react";
import { AiOutlineTwitter } from "react-icons/ai";
import { FaFacebookF } from "react-icons/fa";
import { RiLinkedinFill } from "react-icons/ri";
import { AiFillInstagram } from "react-icons/ai";
import { BsApple } from "react-icons/bs";
import Image from "./Images/appStore.png";
import GooglePlay from "./Images/google-play.png";

export default function Footer() {
  return (
    <div className="footer">
      <div className="d-flex justify-content-between px-5">
        <div>
          <h4 className="footer-header">cheetrr</h4>
          <p className="footer-para">Easy, Fast and Convenient</p>
          <div className="d-flex gap-2 par-app-store">
            <div className="card google-play p-1">
              <img src={GooglePlay} alt="google" />
            </div>
            <div className="card d-flex p-2">
              <img src={Image} alt="img" />
            </div>
          </div>
        </div>

        <div>
          <h4 className="footer-header">Connect with us</h4>
          <div className="d-flex gap-2 footer-icons justify-content-end">
            <div className="card p-2 ">
              <AiOutlineTwitter />
            </div>
            <div className="card p-2 footer-icon">
              <AiFillInstagram />
            </div>
            <div className="card p-2 footer-icon">
              <RiLinkedinFill />
            </div>
            <div className="card p-2 footer-icon">
              <FaFacebookF />
            </div>
          </div>
        </div>
      </div>
      <p className="footer-copyright">
        Copyright &copy; 2022 Cheetrr Inc. All rights reserved.
      </p>
    </div>
  );
}
