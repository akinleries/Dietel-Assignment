import React, { useState, useEffect } from "react";
import Button from "./Button";
import Image from "./Images/bike-man.png";
import ThoughImage from "./Images/new-though.png";
import Arrow from "./Images/arrow.png";
import Undraw from "./Images/undraw.png";
import Header from "./Header";
import Aos from "aos";

export default function Content() {
  const [active, setActive] = useState("reduce");

  useEffect(() => {
    Aos.init({ duration: 1000 });
  }, []);

  return (
    <div className="content">
      <div className="content-box">
        <div className="header-layer mt-3">
          <p className="header-text">Cheetrr</p>
          <Button />
        </div>
        <div className="d-flex mt-5 justify-content-between">
          <div data-aos="fade-right">
            <h6 className="pa-text">
              <span className="eco-friendly">Eco-friendly</span> mobility for
              <br /> the urban commuters.
            </h6>
            <p className="content-para">
              Cheetrr your way through the city; one city at a time, your ride
              is
              <br />
              much more friendly than a gas-powered bike or scooter.
              <br />
              <br />
              <br />
              <br />
              <Button />
            </p>
          </div>
          {/* <div data-aos="fade-left"> */}
          {/* <img src={Image} className="bike-man" alt="alt" /> */}
          {/* <img src={ThoughImage} className="image" alt="alt" /> */}
          {/* </div> */}
        </div>
      </div>

      <div className="layer-two">
        <div data-aos="fade-right" className="layer-two-header">
          <p>
            <span className="mobility">Mobility </span>
            couldn’t be <br /> easier! See why.
            <img src={Arrow} className="m-3" alt="arrow" />
          </p>
        </div>

        <div className="d-flex justify-content-around">
          <div data-aos="fade-up" className="change">
            <ul className="ultimate-change">
              <li
                className={`${active === "reduce" ? "active" : ""}`}
                onClick={() => setActive("reduce")}
              >
                <span className="carbon-3">Reduced carbon emissions</span>
                <p className={`${active !== "reduce" ? "d-none" : "carbon-2"}`}>
                  Riding our electric scooter won’t just reduce emissions by an
                  <br />
                  insignificant amount, it will reduce carbon emissions <br />
                  drastically.
                </p>
              </li>
              <li
                className={`${active === "energy" ? "active" : ""}`}
                onClick={() => setActive("energy")}
              >
                <span className="carbon-3 mt-5"> Energy saving technology</span>
                <p className={`${active !== "energy" ? "d-none" : "carbon-2"}`}>
                  Our scooters are eco-friendly products that also use <br />
                  energy-saving technology with less maintenance and lower
                  <br />
                  environmental impact.
                </p>
              </li>
              <li
                className={`${active === "improve" ? "active" : ""}`}
                onClick={() => setActive("improve")}
              >
                <span className="carbon-3 mt-5">Improved urban environs</span>
                <p
                  className={`${active !== "improve" ? "d-none" : "carbon-2"}`}
                >
                  Our scooters are quiet, which means they do not contribute to
                  <br />
                  noise pollution in cities. Great riding experience and better
                  <br />
                  connected to locals.
                </p>
              </li>
            </ul>
          </div>
          <div data-aos="fade-left">
            <img
              src={Undraw}
              alt="Undraw"
              className="d-flex align-items-center mt-5"
            />
          </div>
        </div>
      </div>
    </div>
  );
}
