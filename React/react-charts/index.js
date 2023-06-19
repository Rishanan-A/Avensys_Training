import { render } from "react-dom";
import { MyChart } from "./myChart";

function App() {
  return (
    <div>
      <MyChart />
    </div>
  );
}

render(<App />, document.getElementById("root"));
