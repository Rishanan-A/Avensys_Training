import React, { useContext } from 'react';
import { CartContext } from './CartContext';

function Cart() {
  const { cartItems } = useContext(CartContext);

  const groupedItems = cartItems.reduce((grouped, item) => {
    if (!grouped[item.id]) {
      grouped[item.id] = { ...item, quantity: 0 };
    }
    grouped[item.id].quantity += 1;
    return grouped;
  }, {});

  const itemsArray = Object.values(groupedItems);

  return (
    <div>
      <h2>Your Cart</h2>
      {itemsArray.length === 0 ? (
        <p>Your cart is empty.</p>
      ) : (
        <ul className="list-group">
          {itemsArray.map((item, index) => (
            <li key={`${item.id}-${index}`} className="list-group-item">
              <div className="row align-items-center">
                <div className="col-6 col-md-3">
                  <img src={item.image} alt={item.title} className="img-fluid square-image" />
                </div>
                <div className="col-6 col-md-4">
                  <h3>{item.title}</h3>
                  <p>{item.description}</p>
                  <h3><div className="badge bg-primary">{item.quantity}x</div></h3>
                </div>
              </div>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default Cart;
