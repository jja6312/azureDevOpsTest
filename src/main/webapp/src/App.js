import "./App.css";
import { BrowserRouter } from "react-router-dom";
import Header from "./components/header/Header";
import "./index.css";
import Main from "./components/Main";

function App() {
  return (
    <div className="App text-white">
      <BrowserRouter>
        <Header></Header>
        <div className="flex flex-col justify-center items-center min-h-screen bg-dark">
          <Main></Main>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
