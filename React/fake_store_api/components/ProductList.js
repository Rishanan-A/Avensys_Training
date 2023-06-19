import React, { useContext, useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { CartContext } from './CartContext';

function ProductList() {
  const [products, setProducts] = useState([]);
  const { addToCart } = useContext(CartContext);

  useEffect(() => {
    fetch('https://fakestoreapi.com/products')
      .then((res) => res.json())
      .then(setProducts);
  }, []);

  return (
    <div className="row">
      {products.map((product) => (
        <div key={product.id} className="col-md-4 mb-4">
          <div className="card">
            <img src={product.image} alt={product.title} className="card-img-top square-image" />
            <div className="card-body">
              <h5 className="card-title">{product.title}</h5>
              <Link to={`/product/${product.id}`} className="btn btn-primary mr-2">View Details</Link>
              <button onClick={() => addToCart(product)} className="btn btn-success">Add to Cart</button>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
}

export default ProductList;
