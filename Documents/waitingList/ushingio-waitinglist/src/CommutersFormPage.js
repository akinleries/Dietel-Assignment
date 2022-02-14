import React from "react";
import { Form, Spinner } from "react-bootstrap";

export default function WaitingListFormPage() {
  return (
    <div className="d-flex">
      <div className="col-6 form-de">
        <p className="header-text p-5">Cheetrr</p>

        <h6 className="label-text">
          <span className="label-eco-friendly">Eco-friendly</span>
          <br /> mobility for the <br /> urban commuters.
        </h6>
        <p className="label-content-para">
          Cheetrr your way through the city; one city at a time, your ride is
          <br />
          much more friendly than a gas-powered bike or scooter.
        </p>
      </div>

      <div className="col-6 form">
        <p id="form-header">Join our waitlist</p>
        <p id="form-content-para">
          Cheetrr your way through the city; one city at a time, your ride is
          <br />
          much more friendly than a gas-powered bike or scooter.
        </p>


        <div>
          <span>commuters</span>
        </div>

        <div className="px-md-2 px-0 form-field justify-content-center">
          <form action="">
            <div className="row p-md-4 px-0 py-3">
              <div className="col-lg-8">
                <Form.Group className="mb-3" controlId="formBasicEmail">
                  <Form.Label>Business Name</Form.Label> <br />
                  <Form.Control
                    className="text-field"
                    type="text"
                    name="businessName"
                    placeholder="your business name"
                  />
                </Form.Group>
              </div>

              <div className="col-lg-8">
                <Form.Group className="mb-3" controlId="formBasicEmail">
                  <Form.Label>First Name</Form.Label> <br />
                  <Form.Control
                    type="text"
                    name="firstName"
                    placeholder="Enter first name"
                  />
                </Form.Group>
              </div>

              <div className="col-lg-8">
                <Form.Group className="mb-3" controlId="formBasicEmail">
                  <Form.Label>Last Name</Form.Label> <br />
                  <Form.Control
                    type="text"
                    name="lastName"
                    placeholder="Enter last name"
                  />
                </Form.Group>
              </div>

              <div className="col-lg-8">
                <Form.Group className="mb-3" controlId="formBasicEmail">
                  <Form.Label>Phone Number</Form.Label> <br />
                  <Form.Control
                    type="text"
                    name="sku"
                    placeholder=" Enter phone number"
                  />
                </Form.Group>
              </div>

              <div className="mt-3">
                <button
                  className="btn secondary px-4 col-8 text-button"
                  type="submit"
                >
                  Join
                </button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}
