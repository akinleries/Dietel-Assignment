import Header from "./Header";
import LandingPage from "./LandingPage";
import CommutersFormPage from "./CommutersFormPage";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import "./App.css";
export default function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/" element={<LandingPage />}/>    
  
          <Route exact path="/commuters" element={<CommutersFormPage />}/>
        </Routes>
      </Router>
    </div>
  );
}
