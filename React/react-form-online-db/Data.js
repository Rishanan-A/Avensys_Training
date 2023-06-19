import React from 'react'
import {useState, useEffect} from "react"
import {db} from "./firebase.js"

function Data() {

    const [myTitle, setMyTitle] = useState("");
    const [myDescription, setMyDescription] = useState("");
    const [dataList, setDataList] = useState([]);
    
    function collectTitle(event){
        setMyTitle(event.target.value)
    }
    function collectDescription(event){
        setMyDescription(event.target.value)
    }

    function saveTheData(){
        try{
            db.collection("myData").add({"title": myTitle, "description": myDescription})
            setMyTitle("");
            setMyDescription("");
            alert("Data saved successfully.");
        }
        catch(e){
            alert("Failed to save data. Error: " + e.message);
        }
    }

    useEffect(function () {
        db.collection("myData").onSnapshot(function (snapshotData) {
          const newDataList = snapshotData.docs.map(function (doc) {
            return doc.data();
          });
          setDataList(newDataList); 
        })
      },[])

    

  return (
    <div>
        Enter the title: <input type="text" value={myTitle} onChange={collectTitle}/><br/><br/>
        Enter Description: <textarea rows={10} cols={25} value={myDescription}  onChange={collectDescription}></textarea><br/><br/>
        <button onClick={saveTheData}>Save</button>

      <h2>DB Data:</h2>
      <table>
        <thead>
          <tr>
            <th>Title</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody>
          {dataList.map((data, index) => (
            <tr key={index}>
              <td>{data.title}</td>
              <td>{data.description}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default Data