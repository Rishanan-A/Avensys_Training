import { render, screen, cleanup, fireEvent } from "@testing-library/react";
import App from "./App";

afterEach(cleanup);

//Test suite 1
describe("Testing app component", function(){
//Test case 1
test("Checking if app component returns testing code", async function () {
  render(<App />);
  const myData = await screen.findByText("Testing react code");

  expect(myData).toBeInTheDocument();

});

//Test case 2
test("Checking if app component returns hello", async function () {
  render(<App />);

  const myData1 = await screen.findByText("Hello");

  expect(myData1).toBeInTheDocument();
});

})

// Test suite 2
describe("App Component", () => {
  // Test case 1
  test("renders the initial count as 0", () => {
    render(<App />);
    const countElement = screen.getByText(/Count:/);
    expect(countElement).toHaveTextContent("Count: 0");
  });

  // Test case 2
  test("increases the count when the increase button is clicked", () => {
    render(<App />);
    const increaseButton = screen.getByText("Increase");
    fireEvent.click(increaseButton);
    const countElement = screen.getByText(/Count:/);
    expect(countElement).toHaveTextContent("Count: 1");
  });

  
});

