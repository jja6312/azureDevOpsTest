import axios from "axios";
import React, { useEffect, useRef, useState } from "react";

const Main = () => {
  const inputRef = useRef(null);
  const [value, setValue] = useState("");
  const [data, setData] = useState([]);

  const handleInput = () => {
    setValue(inputRef.current.value);
  };

  useEffect(() => {
    if (value === "") return;
    alert(value);
    console.log(value);
    axios
      .post("https://azuredemobe.azurewebsites.net/input/save", {
        value: value,
      })
      .then((res) => {
        console.log(res);
        setData(res.data);
      });
  }, [value]);

  useEffect(() => {
    axios
      .get("https://azuredemobe.azurewebsites.net/input/getValue")
      .then((res) => {
        console.log(res.data);
        setData(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, [value]);

  return (
    <div className="w-2/3 h-screen flex flex-col justify-center items-center">
      <div className="w-full m-3 flex">
        <input ref={inputRef} className="w-10/12 h-10 text-black"></input>
        <button className="ml-4 h-10 w-2/12 flex justify-center bg-slate-800 hover:opacity-50 items-center">
          <span onClick={handleInput}>등록</span>
        </button>
      </div>
      <div className="m-3 w-full h-min-40 bg-slate-600 flex flex-col justify-center items-center">
        {data.length !== 0 &&
          data.map((item, index) => {
            return (
              <div key={index} className="m-2">
                {item.value}
              </div>
            );
          })}
      </div>
      <span>CI/CD로 바뀌고있니?</span>
    </div>
  );
};

export default Main;
